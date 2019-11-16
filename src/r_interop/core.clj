(ns r-interop.core
  (:require
   [clojure.string :as str]
   [clojure.set]
   [clojure.pprint]
   [camel-snake-kebab.core :as csk]
   [camel-snake-kebab.extras :as cske])
  (:import (clojure.lang IFn)
           (org.graalvm.polyglot Context Value)
           (org.graalvm.polyglot.proxy ProxyArray ProxyExecutable ProxyObject)))

;; Make sure that keywords are converted to string before sending them to
;; ProxyObject/fromMap
;; Add cske symbols and automatically check variable that already exist in Clojure.

(defn ->proxy-object [m]
  (->> m (cske/transform-keys name) ProxyObject/fromMap))

(defn proxy-obj->hash-map
  ([v] (proxy-obj->hash-map v {}))
  ([v opts]
   (let [ks (mapv #(.get (.getMemberKeys v) %) (range (.getSize (.getMemberKeys v))))]
     (into {} (for [k ks] [(if (:keywordize-keys? opts) (keyword k) k)
                           (.getMember v k)])))))

(defn ->column-view
  "Switch from a `array of maps` view to `maps of array`"
  ([ms]
   (let [ks (apply clojure.set/union (map #(set (keys %)) ms))]
     (->column-view ms ks)))
  ([ms ks]
   (into (sorted-map) (for [k ks] [k (mapv #(get % k) ms)]))))

(defn execute
  [^Value execable & args]
  (.execute execable (object-array args)))

(defn execute-kw
  ([^Value execable] (.execute execable))
  ([^Value execable args]
   (let [args (into-array Object [(->proxy-object args)])]
     (.execute execable args))))

(declare value->clj)

(defmacro reify-ifn
  "Convenience macro for reifying IFn for executable polyglot Values."
  [v]
  (let [invoke-arity
        (fn [n]
          (let [args (map #(symbol (str "arg" (inc %))) (range n))]
            (if (seq args)
              ;; TODO test edge case for final `invoke` arity w/varargs
              `(~'invoke [this# ~@args] (value->clj (execute ~v ~@args)))
              `(~'invoke [this#] (value->clj (execute ~v))))))]
    `(reify IFn
       ~@(map invoke-arity (range 22))
       (~'applyTo [this# args#] (value->clj (apply execute ~v args#))))))

(defmacro reify-ifn-kw
  "Convenience macro for reifying IFn for executable polyglot Values."
  ([v]
   `(reify IFn
      (~'invoke [this#] (value->clj (execute-kw ~v)))
      (~'invoke [this# args#]
       (value->clj (execute-kw ~v args#) {:keywordize-keys? true}))
      (~'applyTo [this# args#] (value->clj (apply execute-kw ~v args#))))))

;; Force user to have :** only at beforelast or anywhere?
#_(->> (partition 2 1 args)
       (reduce (fn [m [k v]] (assoc m k v)) {})
       :**) ;; extract keyword arguments
(defn args->kwargs [signature & args]
  (let [kw?  (= (last (butlast args)) :**)
        kw (when kw? (last args))
        args (if kw? (take (- (count args) 2) args) args)]
    ;; need to put args into array otherwise it does not create the correct
    ;; argument maps
    (merge (zipmap signature args) kw)))

;; In order to call R functions, we need to convert Clojure variables to R
;; representation.
(defmacro reify-ifn-polyglot
  "Convenience macro for reifying IFn for executable polyglot Values."
  [v]
  (let [invoke-arity
        (fn [n]
          (let [args (map #(symbol (str "arg" (inc %))) (range n))]
            (if (seq args)
              ;; TODO test edge case for final `invoke` arity w/varargs
              `(~'invoke [this# ~@args] (execute ~v ~@args))
              `(~'invoke [this#] (execute ~v)))))]
    `(reify IFn
       ~@(map invoke-arity (range 22))
       (~'applyTo [this# args#] (apply execute ~v args#)))))

(defmacro reify-ifn-r-polyglot
  "Convenience macro for reifying IFn for executable polyglot Values but does not
  convert the final result."
  [v signature]
  (let [invoke-arity
        (fn [n]
          (let [args (map #(symbol (str "arg" (inc %))) (range n))]
            ;; TODO test edge case for final `invoke` arity w/varargs
            (if (seq args)
              `(~'invoke [this# ~@args]
                (execute-kw ~v (args->kwargs ~signature ~@args)))
              `(~'invoke [this# ~@args]
                (execute ~v ~@args)))))]
    `(reify IFn
       ~@(map invoke-arity (range 22))
       (~'applyTo [this# args#]
        (execute-kw ~v (zipmap ~signature args#))))))

(defn value->clj
  "Returns a Clojure (or Java) value for given polyglot Value if possible,
   otherwise throws."
  ([^Value v {:keys [warnings? keywordize-keys?] :or {keywordize-keys? true} :as opts}]
   (cond
     (.isNull v) nil
     (.isHostObject v) (.asHostObject v)
     (.isBoolean v) (.asBoolean v)
     (.isString v) (.asString v)
     (.isNumber v) (.as v Number)
     (.canExecute v) (reify-ifn-polyglot v)

     ;; bug of polyglot, sometimes the hasMembers returns an empty set and the members might be duplicates, wtf?!
     (and (.hasMembers v) #_(seq (.getMemberKeys v)))
     (let [ks (.getMemberKeys v)]
       (into
        (array-map)
        (for [k ks]
          ;; some keys are empty string, so we need to provide them
          [(if keywordize-keys? (keyword (if (seq k) k "empty-key")) k)
           (value->clj (.getMember v k) opts)])))

     (.hasArrayElements v)
     (into [] (for [i (range (.getArraySize v))] (value->clj (.getArrayElement v i) opts)))

     :else (when warnings? (println "Unsupported value:" (str v)))
     ;; (throw (Exception. "Unsupported value"))
     ))
  ([^Value v]
   (value->clj v nil)))

(defn proxy-fn
  "Returns a ProxyExecutable instance for given function, allowing it to be
   invoked from polyglot contexts."
  [f]
  (reify ProxyExecutable
    (execute [_this args]
      (apply f (map value->clj args)))))

(defn make-context []
  (.. (Context/newBuilder (into-array ["R" "js"])) (allowAllAccess true)
      (build)))
(def ctx-default (make-context))
(defn ^Value eval-r
  ([code] (eval-r code ctx-default))
  ([code {:keys [ctx] :or {ctx ctx-default}}]
   (.eval ^Context ctx "R" code)))

(def ->clj value->clj)
(def r->clj (comp value->clj eval-r))

(defmacro defn-r-raw
  "Define R function bindings with simple positional argument calls.

  ``` clojure
  (defn-r-raw qnorm 'qnorm)
  (qnorm [0.95 0.975] 0 3)
  ```

  Contrasts with defn-r which support kwargs call as well.
  "
  [& [id code]]
  `(def ~(symbol id) (r->clj ~(str (or code id)))))

(defn-r-raw formals)

(defn ->clj-kw-fn
  [id]
  (let [template-r-do-call "function(m) {
  do.call(%s, as.list(m))
}"
        f (reify-ifn-kw (eval-r (format template-r-do-call (str id))))
        args (formals (str id))]
    (with-meta f {:args args})))

(defmacro defn-r-kw
  "Attach a R function accepting a map for keywords arguments.

  ``` clojure
  (defn-r-kw qnorm qnorm)
  (qnorm {:p [0.95 0.975] :sd 3})
  ```
  "
  [& [id code]]
  `(def ~(symbol id) ~(->clj-kw-fn (or code id))))

(defn r-help
  "Display R help from the R function name"
  [f]
  (-> (with-out-str
        (->clj (eval-r (str "capture.output(help(" (symbol f) ", help_type=\"text\"))"))))
      (clojure.string/replace #"_" "")))

(defn ->clj-pos-kw-fn
  [id]
  (let [template-r-do-call "function(m) {
  do.call(%s, as.list(m))
}"
        args (->clj (formals (str id)))
        f (cond
            (seq args) (reify-ifn-r-polyglot
                        (eval-r (format template-r-do-call (str id))) (keys args))
            ;; use only the positional arguments, if no arguments from formals
            :else (reify-ifn-polyglot (eval-r (str id))))]
    (with-meta f {:name-r id :argslists (list args)})))


(defmacro defn-r
  "Attach a R function accepting positional and keyword arguments as maps.
  e.g. `(qnorm [0.95 0.975] :** {:sd 3})`.
  The double start keyword (`:**`) must be in the before last position and the optionals arguments at the end.
  The kwargs map supports the key `:...` to add variadic arguments.
  "
  [& [id code]]
  `(def ~(symbol id) ~(->clj-pos-kw-fn (or code id))))

(defn rdoc
  "Retrieve help from a r function."
  [f]
  (-> f meta :name-r r-help))

(defn argslists
  "Show argument list of a the function."
  [f]
  (-> f meta :argslists))

(defn elipsis->kw
  "Converts a list of arguments of a function to their keyword equivalent.
  e.g.
  ```
  (r-interop.core/elipsis->kw qnorm [[0.95 0.975] 0 3]) => {:p [0.95 0.975], :mean 0, :sd 3}
  ```
  "
  [f args]
  (zipmap (keys (first (argslists f))) args))

;; Facilities to create wrappers in clojure namespaces and files. See
;; r-interop.gen-packages.mgcv and r-interop.package-generator for example.

(def dir-package-raw
  "Retrieve members of a package"
  (->clj
   (eval-r "function(package_name) as.character(unlist(lsf.str(paste0('package:', package_name))))")))

(defn ->clj-function-name
  "Converts r function name to Clojure function names.
  This is not totally reliable because PascalCase or dot-case (e.g. data.frame)
  are not totally enforced, see stats::ARMAacf."
  [s]
  (csk/->kebab-case-string (str/replace s #"\." "-")))

(defn dir-package
  "Provide the r function names inside an R package"
  [package]
  (->> (dir-package-raw package) ->clj
       (filter #(re-matches #"[A-Za-z][A-Za-z\\.\\_].*" %))))

(def setter?
  "R defines setters functions through the symbol `<-` in the function
  name. This library decided to not support this feature because we can't
  convert them with formals.'"
  #(.contains % "<-"))

(defn check-package-names
  "Checks the name in the packages to verify for non automatic name conversion
  and avoid any collisions."
  ([package] (check-package-names package #{}))
  ([package excludes]
   (let [fs (dir-package package)
         clj+fs-ids (->> fs
                         (remove #(or (setter? %) (excludes %)))
                         (mapv #(vector (->clj-function-name %) %)))]
     (mapv #(zipmap [:clj :r] %) clj+fs-ids))))

(defn generate-package-bindings
  ([package] (generate-package-bindings package #{}))
  ([package excludes]
   (let [fs (dir-package package)
         clj+fs-ids (->> fs
                         (remove #(or (setter? %) (excludes %)))
                         (mapv #(vector (->clj-function-name %) %)))]
     (doseq  [[clj-id r-id] clj+fs-ids]
       (let [;; docstring (r-help r-id)
             args (->clj (formals (str r-id)))]
         (println "")
         ;; ugly way of doing it, but we need to generate code as string.
         (clojure.pprint/pprint
          (list 'def (symbol clj-id)
                (symbol "^") {:name-r r-id :doc "" :argslists (list args)}
                `(->clj-pos-kw-fn ~r-id))))))))

(defn dump-package-bindings
  ([filename package] (dump-package-bindings filename package #{}))
  ([filename package excludes]
   (let [s (-> (with-out-str
                 (generate-package-bindings package excludes))
               (clojure.string/replace #"\^\n\s*" "^")
               (clojure.string/replace #"def\n" "def"))]
     (spit filename s :append true))))

(defn create-package-bindings
  "Create package namespaces. The `root-ns` and `root-filepath` keys set the
  resulting file location and file namespace. The `load`? key will load the
  package through libraries in the package file."
  [{:keys [package excluded-fns aliases load? root-ns root-filepath]
    :or {excluded-fns #{}
         root-ns "r-interop.packages"
         root-filepath "r_interop/packages"}}]
  (when load? (eval-r (str "library(" package ")")))
  (let [namespace-name (str root-ns "." (->clj-function-name package))
        filepath
        (str root-filepath "/"
             (str/replace (->clj-function-name package) #"-" "_") ".clj")
        output-file (str "src/" filepath)
        newline #(spit output-file "\n" :append true)]
    (spit output-file
          (str "(ns " namespace-name "\n (:require [r-interop.core :refer (defn-r eval-r)]))"))
    (newline)
    (newline)
    (when load?
      (spit output-file (str "(eval-r \"library(" package ")\")") :append true))
    (spit output-file (clojure.string/join "\n" (map str aliases)) :append true)
    (newline)
    (dump-package-bindings output-file package excluded-fns)))

;; Convenience function for interop clojure and R.
;; Useful for interop with regression functions expecting structures.

(def ->r-list
  "Function converting a clojure associative structure into a R list"
  (comp (->clj-pos-kw-fn 'list) ->proxy-object))

(def ->r-data-frame
  "Function converting a clojure sequence of maps into a R dataframe. "
  (comp (->clj-pos-kw-fn 'as.data.frame) ->proxy-object))

(def ->r-matrix
  "Conversion of clojure arrays into R matrices"
  (comp (->clj-pos-kw-fn 'as.matrix) ->proxy-object))

;; javascript interop
#_(defn ^Value eval-js [code]
    (.eval ^Context ctx "js" code))
#_(def js->clj (comp value->clj eval-js))
