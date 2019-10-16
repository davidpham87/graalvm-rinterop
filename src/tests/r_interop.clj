(ns tests.r-interop
  (:require [r-interop.core :as rc :refer (eval-r defn-r value->clj)]))

(defn-r qnorm)

;; Equivalent calls
;; include this as test
(= (qnorm [0.975, 0.99] 0 3)
   (let [m (rc/elipsis->kw qnorm [[0.975, 0.99] 0 3])]
     ;; ugly but works
     (qnorm :** m))
   (apply qnorm [[0.975, 0.99] 0 3])
   (qnorm [0.975 0.99] :** {:sd 3})
   (qnorm :** {:p [0.975 0.99] :sd 3}))

(rc/doc qnorm)
(rc/argslists qnorm)
;; (-> pnorm meta :doc println)
;; (-> pnorm meta :argslists)

(defn-r round)
(round [1 2] 2)

;; check thread
(->
 (qnorm [0.95 0.975, 0.99] :** {:mean 0})
 (round 4))

(defn-r qnorm)
(defn-r round)
(= (-> [0.95 0.975, 0.99]
       (qnorm :** {:sd 2})
       (round 2))
   [3.29 3.92 4.65])

(defn-r dnorm)
(defn-r plot)
(defn-r sqrt)
(defn-r round)
(defn-r variance var)
(->  (sqrt 0.666667) (round 4))
(defn-r summary)
(defn-r binom-test binom.test)

(binom-test :** {:x 75 :n 124})

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
    (rc/reify-ifn-kw (eval-r r-code))))

(def x-lm (lm
           {:formula "as.formula(Sepal.Length~Sepal.Width)"
            :data (eval-r "iris")}))

(let [z (eval-r "formals(binom.test)")]
  (-> (.getMember z "alternative") (.getMemberKeys)))


(comment
  (rc/value->clj (eval-r "formals(binom.test)"))
  (def f (rc/reify-ifn-kw (eval-r "function(m) {
f <- function(a , ...) {
   args <- list(...)
   print(args$`...`[['b']])
   # lapply(args, function(x) 2*x)
}
do.call(f, as.list(m))}")))
  (defn-r formals)
  (defn-r t-test "t.test")
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
