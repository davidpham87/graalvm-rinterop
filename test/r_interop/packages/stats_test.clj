(ns r-interop.packages.stats-test
  (:require
   [clojure.test :refer (deftest testing is)]
   [r-interop.core :as rc :refer (defn-r)]
   [r-interop.packages.base :as r-base :refer (lchoose)]
   [r-interop.packages.stats :as st]))

(defn-r round)

(deftest qnorm-test
  (testing "qnorm"
    (is (= (round (st/qnorm [0.95 0.975]) 3) [1.645 1.96]))))

(def data
  (let [y (into (vec (repeat 35 0)) [1 2 0 6 8 16 43])
        beta (range 42 0 -1)
        cst (lchoose 42 (range 42 0 -1))
        tau (map #(-> (* % % 0.5)) beta) ;; still have to check how to handle clojure rational numbers.
        data [y beta cst tau]]
    {:y y :beta beta :cst cst :tau tau}))


(st/glm :** {:data (rc/->r-data-frame data) :formula "as.formula(Y ~ offset(cst) + beta + tau')"})

(rc/eval-r "lapply(as.list(clj_data), print)")


(comment

  " Y <- c(rep(0,35),1,2,0,6,8,16,43)
  beta <- 42:1
  cst <- lchoose(42, beta)
  tau <- (beta^2)/2
  fit <- glm(formula = Y ~ offset(cst) + beta + tau, family = poisson)")
