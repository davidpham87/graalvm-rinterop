(ns r-interop.core
  (:require
   [clojure.string :as str]
   [clojure.set]
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

(defmacro reify-ifn-r
  "Convenience macro for reifying IFn for executable polyglot Values."
  [v signature]
  (let [invoke-arity
        (fn [n]
          (let [args (map #(symbol (str "arg" (inc %))) (range n))]
            ;; TODO test edge case for final `invoke` arity w/varargs
            (if (seq args)
              `(~'invoke [this# ~@args]
                (value->clj (execute-kw ~v (args->kwargs ~signature ~@args))
                            {:keywordize-keys? true}))
              `(~'invoke [this# ~@args]
                (value->clj (execute ~v ~@args) {:keywordize-keys? true})))))]
    `(reify IFn
       ~@(map invoke-arity (range 22))
       (~'applyTo [this# args#]
        (value->clj (execute-kw ~v (zipmap ~signature args#)))))))

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
     (.canExecute v) (reify-ifn v)

     (and (.hasMembers v) (seq (.getMemberKeys v))) ;; bug of polyglot, sometimes the hasMembers returns an empty set
     (let [ks (.getMemberKeys v)]
       (into (array-map) (for [k ks]
                           [(if keywordize-keys? (keyword k) k)
                            (value->clj (.getMember v k) opts)])))

     (.hasArrayElements v)
     (into [] (for [i (range (.getArraySize v))] (value->clj (.getArrayElement v i) opts)))

     :else (when warnings? (println "Unsupported value:" (str v)))
     ;; (throw (Exception. "Unsupported value"))
     ))
  ([^Value v]
   (value->clj v nil)))

(def r->clj (comp value->clj eval-r))

(defmacro defn-r-raw
  "Simple macros for getting object/functions"
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
  "Attach a R function accepting a map for keywords arguments"
  [& [id code]]
  `(def ~(symbol id) ~(->clj-kw-fn (or code id))))

(defn r-help [f]
  (-> (with-out-str
        (eval-r (str "capture.output(help(" (symbol f) ", help_type=\"text\"))")))
      (clojure.string/replace #"_" "")))

(defn ->clj-pos-kw-fn
  [id]
  (let [template-r-do-call "function(m) {
  do.call(%s, as.list(m))
}"
        docstring (r-help id)
        args (formals (str id))
        f (cond
            (seq args) (reify-ifn-r
                        (eval-r (format template-r-do-call (str id))) (keys args))
            :else (reify-ifn (eval-r (str id))))]
    (with-meta f {:name-r id :doc docstring :argslists (list args)})))

(defmacro defn-r
  "Attach a R function accepting positional and keyword arguments.
  e.g. (qnorm [0.95 0.975] :** {:sd 3})"
  [& [id code]]
  `(def ~(symbol id) ~(->clj-pos-kw-fn (or code id))))

(defn doc [f]
  (-> f meta :doc println))

(defn argslists [f]
  (-> f meta :argslists))

(defn elipsis->kw [f args]
  (zipmap (keys (first (argslists f))) args))

(def dir-package-raw
  (value->clj
   (eval-r "function(package_name) as.character(unlist(lsf.str(paste0('package:', package_name))))")))

(defn ->clj-function-name [s]
  (csk/->kebab-case-string (str/replace s #"\." "-")))

(defn dir-package
  "Provide the r function names inside an R package" [package]
  (->> (dir-package-raw package)
       (filter #(re-matches #"[A-Za-z][A-Za-z\\.\\_].*" %))))

(def forbidden-functions #{"eval"})
(def setter?  #(.endsWith % "<-"))

;; TOOD(how to manage setters?)
(defn add-package-to-this-ns
  ([packages] (add-package-to-this-ns packages #{}))
  ([package excludes]
   (let [fs (dir-package package)
         clj+fs-ids (->> fs
                         (remove setter?)
                         (mapv #(vector (->clj-function-name %) %)))
         clj+setters-ids (filter setter? fs)]
     (doseq  [[clj-id r-id] clj+fs-ids]
       (println clj-id r-id)
       (eval (list 'def (symbol clj-id) (->clj-pos-kw-fn r-id)))))))

;; javascript interop
#_(defn ^Value eval-js [code]
    (.eval ^Context ctx "js" code))
#_(def js->clj (comp value->clj eval-js))

(comment
  (def s (->
          (with-out-str
            (eval-r "capture.output(help(qnorm, help_type ='text'))"))
          (clojure.string/replace #"_" "")))

  (def s-clearn
    (with-out-str
      (println (clojure.string/replace s  #"_" ""))))

  (defn-r pnorm)
  (-> pnorm meta :doc println)
  (-> pnorm meta :argslists)
  (pnorm :** {:q 1.95 :sd 2})
  (defn-r r-list list)

  (defn-r qnorm)
  (qnorm {:p [0.975, 0.99] :sd 1})

  (defn-r qnorm)
  (qnorm [0.975, 0.99] 1 3)
  (qnorm [0.95 0.975, 0.99] :** {:sd 3})
  (qnorm :** {:p [0.975, 0.99] :sd 2})

  (defn-r round)
  (round [1 2] 2)
  (->
   (qnorm [0.95 0.975, 0.99] :** {:mean 0})
   (round 4))

  (defn-r qnorm)
  (defn-r round)
  (-> [0.95 0.975, 0.99]
      (qnorm :** {:sd 2})
      (round 2))
  [3.29 3.92 4.65]

  (defn-r dnorm)
  (defn-r plot)
  (defn-r sqrt)
  (defn-r round)
  (defn-r variance var)
  (->  (sqrt 0.666667) (round 4))
  (defn-r summary)
  (defn-r binom-test binom.test)

  (-> (pnorm :** {:q 16.5 :mean 20 :sd (/ 5.2 (Math/sqrt 15))})
      (round 4))

  (binom-test :** {:x 75 :n 124})

  (defn mean [xs]
    (let [n (count xs)]
      (/ (apply + xs) n)))

  (let [x [-0.2 0.6 1.1 -0.9 0.1 -1.2 1.1]
        n (count x)]
    (Math/abs (* (sqrt n) (mean x))))

  (def lm
    (let [r-code "function(m) {
x.lm <- do.call(lm, as.list(m));
list(lm = x.lm, summary = summary(x.lm))}"]
      (reify-ifn-kw (eval-r r-code))))

  (def x-lm (lm
             {:formula "as.formula(Sepal.Length~Sepal.Width)"
              :data (eval-r "iris")}))

  (let [z (eval-r "formals(binom.test)")]
    (-> (.getMember z "alternative") (.getMemberKeys)))

  (value->clj (eval-r "formals(binom.test)"))
  (def f (reify-ifn-kw (eval-r "function(m) {
f <- function(a , ...) {
   args <- list(...)
   print(args$`...`[['b']])
   # lapply(args, function(x) 2*x)
}
do.call(f, as.list(m))}")))
  (formals "t.test")
  (defn square [x] (* x x))
  (defn-r sqrt)
  (let [x 257
        x-sd 39
        y 260
        y-sd 38
        n 1000
        t (* (sqrt 1000) (/ (- x y) (sqrt (+ (square 39) (square 38)))))]
    (-> (* 2 (pnorm {:q t})) (round 4))
    )

  (let [n 200
        m 106
        sigma 0.5
        mu 0.5
        d (* (/ (- (/ m n) mu) sigma) (sqrt n))]
    (println (round d 4))
    (println (- 1 (pnorm {:q d}))))
  (defn-r mean)
  (defn-r round)
  (defn-r sd)
  (let [x [0.5 1.8 -2.3 0.9]]
    #_(sd x)
    (round (sqrt (- (mean (map square x))
                    (square (mean x)))) 4))
  )
