(ns r-interop.core
  (:require
   [clojure.string :as str]
   [clojure.set]
   [camel-snake-kebab.core :as csk]
   [camel-snake-kebab.extras :as cske])
  (:import (clojure.lang IFn)
           (org.graalvm.polyglot Context Value)
           (org.graalvm.polyglot.proxy ProxyArray ProxyExecutable ProxyObject)))

;; Make sure that keywords are converted to string before sending them to ProxyObject/fromMap

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

(defn- execute
  [^Value execable & args]
  (.execute execable (object-array args)))

(defn- execute-kw
  ([^Value execable] (.execute execable))
  ([^Value execable args]
   (let [args (into-array Object [(->proxy-object args)])]
     (.execute execable args))))

(declare value->clj)

(defmacro ^:private reify-ifn
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

(defmacro ^:private reify-ifn-kw
  "Convenience macro for reifying IFn for executable polyglot Values."
  ([v]
  `(reify IFn
     (~'invoke [this#] (value->clj (execute-kw ~v)))
     (~'invoke [this# args#]
      (value->clj (execute-kw ~v args#) {:keywordize-keys? true}))
     (~'applyTo [this# args#] (value->clj (apply execute-kw ~v args#))))))

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
       (into {} (for [k ks]
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

(defn ->clj-kw-fn
  [id]
  (let [template-r-do-call "function(m) {
  do.call(%s, as.list(m))
}"]
    (reify-ifn-kw (eval-r (format template-r-do-call (str id))))))

(defmacro defn-r-kw
  "Attach a R function accepting a map for keywords arguments"
  [& [id code]]
  `(def ~(symbol id) ~(->clj-kw-fn (or code id))))

(defmacro defn-r
  "Simple macros for getting object/functions"
  [& [id code]]
  `(def ~(symbol id) (r->clj ~(str (or code id)))))

(defmacro r-help [f]
  (eval-r (str "help(" (symbol f) ", help_type=\"text\")")))

(defn-r formals)

;; javascript interop
#_(defn ^Value eval-js [code]
    (.eval ^Context ctx "js" code))
#_(def js->clj (comp value->clj eval-js))

(comment

  (defn-r-kw pnorm)
  (pnorm {:q 1.95 :sd 2})

  (defn-r-kw qnorm)

  (qnorm {:p [0.975, 0.99] :sd 1})
  (qnorm {:p [0.975, 0.99] :sd 2})

  (defn-r-kw dnorm)
  (defn-r-kw plot)
  (defn-r sqrt)
  (defn-r round)
  (defn-r-kw summary)
  (defn-r-kw binom-test binom.test)

  (-> (pnorm {:q 16.5 :mean 20 :sd (/ 5.2 (Math/sqrt 15))}) (round 4))

  (binom-test {:x 75 :n 124})

  (defn mean [xs]
    (let [n (count xs)]
      (/ (apply + xs) n)))

  #_[-0.2 0.6 1.1 -0.9 0.1 -1.2 1.1]
  #_[-1.7 -0.1 -0.2 0.3 0.3 -0.9 -0.03] #_[-1.0 -0.8 -2.9 1.4 0.3 -0.8 1.4]
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
    #_(.hasMembers z)
    (-> (.getMember z "alternative") (.getMemberKeys))
    #_(bean (.getArrayElement (.getMember z "alternative") 1)))

  (value->clj (eval-r "formals(binom.test)"))

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
    (println (- 1 (pnorm {:q d})))))
