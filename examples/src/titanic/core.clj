(ns titanic.core
  (:require
   [r-interop.core :as rc]
   [r-interop.packages.base :as r-base]
   [r-interop.packages.stats :as st]
   [uncomplicate.neanderthal.core :as core]
   [uncomplicate.neanderthal.native :as native]
   [uncomplicate.commons.core :refer [info with-release]]
   [r-interop.core :as rc :refer (eval-r defn-r value->clj)]))

;; Don't try this, you will wait forever, launch a REPL with fastR and install the library
;; (rc/eval-r "install.packages(c('ggplot2', 'ggthemes', 'scales', 'mice', 'randomForest'))")

(r-base/library "ggplot2")
(r-base/library "randomForest")
(r-base/library "ggthemes")
(r-base/library "mice")
(r-base/library "scales")

(def data {:train  (slurp "train.csv")})
