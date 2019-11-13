(ns exo.stats
  (:require [r-interop.core :as rc]
            [r-interop.packages.base :as r-base]
            [r-interop.packages.stats :as st]
            [uncomplicate.neanderthal.core :as core]
            [uncomplicate.neanderthal.native :as native]
            [uncomplicate.commons.core :refer [info with-release]]
            ;; [uncomplicate.clojurecl.core :as opencl]
            ;; [uncomplicate.neanderthal.opencl :as opencl]
            [uncomplicate.clojurecuda.core :refer (with-default)]
            [uncomplicate.neanderthal.cuda :as cuda]))

(st/qchisq 0.975 2)

(def data [0.2 -0.1 -1.9 -0.4 -1.8])
(def n (count data))
(def v (-> (* (dec n) (st/var [0.2 -0.1 -1.9 -0.4 -1.8])) (/ n)))
(let [y [(r-base/mean [0.2 -0.1 -1.9 -0.4 -1.8]) (dec v)]]
  (r-base/tcrossprod y))

(mapv * [v (* 2 (* v v))] [0.640000 0.052])

(let [n 100
      mu 2.41
      sigma-square 5.2]
  (-> (* (Math/sqrt n)
         (/ (- mu (Math/sqrt sigma-square))
            (Math/sqrt (* 1.5 sigma-square))))
      (st/pnorm)))

(let [n 100
      mu 3.28
      sigma-square 15.95]
  (-> (* (Math/sqrt n)
         (/ (- mu (Math/sqrt sigma-square))
            (Math/sqrt (* 1.5 sigma-square))))
      (st/pnorm)))

(let [x 6.2
      y 6
      var-x 0.1
      var-y 0.2
      n 50
      m 50
      square #(* % %)
      N (/ (square (+ (/ var-x n) (/ var-y m)))
           (+ (/ (square var-x) (* n n (dec n)))
              (/ (square var-y) (* m m (dec m)))))]
  [N (-> (/ (- x y)
            (Math/sqrt (+ (/ var-x n) (/ var-y m))))
         (st/pt 88)
         (dec)
         (* -1)
         (r-base/round 6))])

(let [T 1.03
      hat-a (inc (/ T (* 2 100)))]
  (* -1 (dec (st/pexp (dec hat-a) 100))))

(let [x 0.83
      n 100
      square #(* % %)]
  (square (* (Math/sqrt n) (- 1 x))))

(st/qnorm 0.95)
(st/qchisq 0.95 1)

(let [x (->> (group-by identity [1 3 1 2 2 2 1 1 3 1 1 2]) vals (mapv count))]
  (st/chisq-test x :** {:p (mapv double [1/3 1/3 1/3])}))

(r-base/round 0.36787944117144233 5)
(-> (st/qchisq 0.95 2) (r-base/round 4))

;; x (->> (group-by identity [5 6 1 6 4 1 2 4 6 6 1 6 6 3 5]) vals (mapv count))
(let [x [20 30 50]
      p (->> [1/10 4/10 5/10] (mapv double))]
  (-> (st/chisq-test x :** {:p p}) :p.value (r-base/round 7)))

(let [y [339 455 180 26]
      z (reduce-kv (fn [m k v] (+ m (* k v))) 0 (zipmap (range) y))
      p (float (/ z 1000 3))
      p-test (st/dbinom :** {:x (range 4) :size 3 :prob p})]
  (st/chisq-test :** {:x y :p p-test}))

(let [x (native/dv [339 455 180 26])]
  (seq (core/ax (/ 1 1000 ) x)))

(let [x (native/dge 2 2 [339 455 180 26])]
  (seq (core/ax (/ 1 1000) x)))

(with-default
   (cuda/with-default-engine
     (with-release [x (cuda/cuge 2 2 [339 455 180 26])]
       (core/asum x))))

(let [x (native/dv (sort [0.8 0.7 0.4 0.7 0.2]))
      y (core/ax (/ 1 5) (native/dv [1.0 2 3 4 5]))
      y-dec (core/axpy -1 (core/ax (/ 1 5) (native/dv (repeat 5 (double 1.0)))) y)
      z (native/dv (repeat 5 (double 1.0)))
      n (core/dim x)]
  [(core/axpy -1 y x) (core/axpy -1 y-dec x)])

(let [x [0.28 0.2 0.01 0.8 0.1]
      empirical-df (st/ecdf x)]
  (comment (rc/eval-r "svg()")
           (st/qqplot (sort x) (st/qunif (map #(-> % (/  (inc 5)) float) (range 1 6))))
           (st/qqline x)
           (rc/eval-r "dev.off()"))
  [(r-base/mean x) (r-base/round (st/var x) 5)]
  #_((st/ecdf x) [0.5 0.1 1]))

(let [x (native/dv (sort [0.28 0.2 0.01 0.8 0.1]))
      y (core/ax (/ 1 5) (native/dv [1.0 2 3 4 5]))
      y-dec (core/axpy -1 (core/ax (/ 1 5) (native/dv (repeat 5 (double 1.0)))) y)
      z (native/dv (repeat 5 (double 1.0)))
      n (core/dim x)]
  [(core/axpy -1 y x) (core/axpy -1 y-dec x)])

(let [x [205 26 25 19]
      y (mapv #(-> % (/ 275)) x)
      p [0.72 0.07 0.12 0.09]]
  (st/chisq-test :** {:x x :p p}))
