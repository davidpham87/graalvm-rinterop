(ns r-interop.gen-packages.stats
  (:require [r-interop.core :refer (dump-package-bindings)]))

(def excluded-fns
  #{"ARMAacf"
    "ARMAtoMA"
    "cov2cor"
    "NLSstAsymptotic"
    "NLSstClosestX"
    "NLSstLfAsymptote"
    "NLSstRtAsymptote"
    "SSasymp"
    "SSasympOff"
    "SSasympOrig"
    "SSbiexp"
    "SSfol"
    "SSfpl"
    "SSgompertz"
    "SSlogis"
    "SSmicmen"
    "SSweibull"})

(def aliases
  '(
    (defn-r acf->ar acf2AR)
    (defn-r arma->ma ARMAtoMA)
    (defn-r arma-acf ARMAacf)
    (defn-r arma-to-ma ARMAtoMA)
    (defn-r cov-2-cor cov2cor)
    (defn-r cov->cor cov2cor)
    (defn-r nls-st-asymptotic NLSstAsymptotic)
    (defn-r nls-st-closest-x NLSstClosestX)
    (defn-r nls-st-lf-asymptote NLSstLfAsymptote)
    (defn-r nls-st-rt-asymptote NLSstRtAsymptote)
    (defn-r ss-asymp SSasymp)
    (defn-r ss-asymp-off SSasympOff)
    (defn-r ss-asymp-orig SSasympOrig)
    (defn-r ss-biexp SSbiexp)
    (defn-r ss-fol SSfol)
    (defn-r ss-fpl SSfpl)
    (defn-r ss-gompertz SSgompertz)
    (defn-r ss-logis SSlogis)
    (defn-r ss-micmen SSmicmen)
    (defn-r ss-weibull SSweibull)))



(def config {:package "stats" :excluded-fns excluded-fns :aliases aliases})

(comment

  (def setter?  #(.endsWith % "<-"))
  (let [f-symbols (rc/dir-package "stats")]
    (-> (group-by setter? f-symbols) (get true))))
