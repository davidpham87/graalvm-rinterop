(ns r-interop.packages.stats
  (:require [r-interop.core :as rc :refer
             (eval-r defn-r value->clj add-package-to-this-ns)]))

(defn-r arma-acf ARMAacf)
(defn-r arma-to-ma ARMAtoMA)

(add-package-to-this-ns "stats")
