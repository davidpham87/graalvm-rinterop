(ns r-interop.core-test
  "Test core interop functionalities"
  (:require
   [clojure.test :as ct :refer (deftest testing is)]
   [r-interop.core :as rc :refer (eval-r defn-r value->clj)]))

(defn-r qnorm)
(defn-r round)
(defn-r dnorm)
(defn-r plot)
(defn-r sqrt)
(defn-r round)
(defn-r variance var)
(defn-r rnorm)
(defn-r binom-test binom.test)

(deftest simple-calls
  (is (binom-test :** {:x 75 :n 124}))
  (is (variance (rnorm 100)))
  (is (dnorm [0 1.96])))

(deftest equivalent-calls
  (testing "Equivalent calls"
    (is
     (= (qnorm [0.975, 0.99] 0 3)
        (let [m (rc/elipsis->kw qnorm [[0.975, 0.99] 0 3])]
          ;; ugly but works
          (qnorm :** m))
        (apply qnorm [[0.975, 0.99] 0 3])
        (qnorm [0.975 0.99] :** {:sd 3})
        (qnorm :** {:p [0.975 0.99] :sd 3})))))

(deftest helpers
  (testing "Helper functions"
    (is (let [s (rc/rdoc qnorm)] (and (string? s) (seq s))))
    (is (= (rc/argslists qnorm)
           '({:p nil, :mean 0, :sd 1, :lower.tail true, :log.p false})))))

(deftest rounding
  (testing "Rounding"
    (is (= (round [1 2] 2) [1.0 2.0]))))

;; check thread
(deftest threading
  (testing "Threads"
    (is (= (->
            (qnorm [0.95 0.975, 0.99] :** {:mean 0})
            (round 4))
           [1.6449 1.96 2.3263]))
    (is (= (-> [0.95 0.975, 0.99]
               (qnorm :** {:sd 2})
               (round 2))
           [3.29 3.92 4.65]))
    (is (-> 100 rnorm variance))))

(deftest linear-models
  (testing "Creating of linear models"
    (def lm
      (let [r-code "function(m) {
x.lm <- do.call(lm, as.list(m));
list(lm = x.lm, summary = summary(x.lm))}"]
        (rc/reify-ifn-kw (eval-r r-code))))
    (is (lm {:formula "as.formula(Sepal.Length~Sepal.Width)" :data (eval-r "iris")}))))


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
