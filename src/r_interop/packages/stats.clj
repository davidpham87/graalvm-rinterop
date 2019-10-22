(ns r-interop.packages.stats
  (:require [r-interop.core :as rc :refer
             (eval-r defn-r value->clj add-package-to-this-ns)]))


(add-package-to-this-ns "stats")

(defn-r arma-acf ARMAacf)
(defn-r arma-to-ma ARMAtoMA)


(comment

  (def setter?  #(.endsWith % "<-"))
  (let [f-symbols (rc/dir-package "stats")]
    (-> (group-by setter? f-symbols) (get true)))

  )
