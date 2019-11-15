(ns exo.class-test
  (:require
   [r-interop.core :as rc]
   [r-interop.packages.base :as r-base]
   [r-interop.packages.stats :as st]))

(def iris-raw (rc/eval-r "iris"))
(def iris (rc/value->clj (rc/eval-r "iris")))

(let [x-lm (st/lm :** {:formula "as.formula(Petal.Width ~ Sepal.Length + Species)"
                       :data iris-raw})]
  (def y x-lm))

(def set-class
  (rc/reify-ifn-polyglot (rc/eval-r "function(m, cl) {
  # print(m)
  print(as.list(m))
  m <- as.list(m)
  class(m) <- cl
  m}")))

(def iris-lm (rc/eval-r "lm(Petal.Width ~ Sepal.Length + Species, data=iris)"))
(def y-lm (set-class (rc/->proxy-object y) "lm"))
