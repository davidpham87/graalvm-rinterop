(ns titanic.core
  (:require
   [r-interop.core :as rc]
   [r-interop.packages.base :as r-base]
   [r-interop.packages.stats :as st]
   [clojure.data.csv :as csv]
   [camel-snake-kebab.core :as csk]
   [uncomplicate.neanderthal.core :as core]
   [uncomplicate.neanderthal.native :as native]
   [uncomplicate.commons.core :refer [info with-release]]
   [r-interop.core :as rc :refer (eval-r defn-r value->clj)]))

;; Libraries

;; Don't try this, you will wait forever, launch a REPL with fastR and install the library
;; (rc/eval-r "install.packages(c('ggplot2', 'ggthemes', 'scales', 'mice', 'randomForest'))")

(r-base/library "ggplot2")
(r-base/library "randomForest")
(r-base/library "ggthemes")
(r-base/library "mice")
(r-base/library "scales")

;; load data

(defn csv-data->maps [csv-data]
  (map zipmap
       (->> (first csv-data) ;; First row is the header
            (map csk/->kebab-case-keyword) ;; Drop if you want string keys instead
            repeat)
       (rest csv-data)))

(def load-data #(-> % slurp csv/read-csv csv-data->maps))

(def data {:train (load-data "assets/train.csv")
           :test (load-data "assets/test.csv")})

;; alternatively we can call R functions

;; Data check
