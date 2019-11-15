(ns r-interop.packages.boot
 (:require [r-interop.core :refer (defn-r eval-r)]))

(eval-r "library(boot)")

(def abc-ci
 ^{:name-r "abc.ci",
  :doc "",
  :argslists
  ({:data nil,
    :statistic nil,
    :index 1,
    :strata {},
    :conf 0.95,
    :eps {},
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "abc.ci"))

(def boot
 ^{:name-r "boot",
  :doc "",
  :argslists
  ({:L nil,
    :statistic nil,
    :mle nil,
    :ran.gen {},
    :cl nil,
    :R nil,
    :parallel {},
    :m 0,
    :simple false,
    :weights nil,
    :stype {},
    :ncpus {},
    :... nil,
    :strata {},
    :sim "ordinary",
    :data nil})}
 (r-interop.core/->clj-pos-kw-fn "boot"))

(def boot-array
 ^{:name-r "boot.array",
  :doc "",
  :argslists ({:boot.out nil, :indices false})}
 (r-interop.core/->clj-pos-kw-fn "boot.array"))

(def boot-ci
 ^{:name-r "boot.ci",
  :doc "",
  :argslists
  ({:L nil,
    :index {},
    :t0 nil,
    :boot.out nil,
    :type "all",
    :var.t nil,
    :hdot {},
    :h {},
    :... nil,
    :hinv {},
    :var.t0 nil,
    :t nil,
    :conf 0.95})}
 (r-interop.core/->clj-pos-kw-fn "boot.ci"))

(def censboot
 ^{:name-r "censboot",
  :doc "",
  :argslists
  ({:statistic nil,
    :cl nil,
    :R nil,
    :index {},
    :parallel {},
    :ncpus {},
    :... nil,
    :F.surv nil,
    :G.surv nil,
    :cox nil,
    :strata {},
    :sim "ordinary",
    :data nil})}
 (r-interop.core/->clj-pos-kw-fn "censboot"))

(def control
 ^{:name-r "control",
  :doc "",
  :argslists
  ({:L nil,
    :index 1,
    :t0 nil,
    :boot.out nil,
    :bias.adj false,
    :... nil,
    :alpha nil,
    :t nil,
    :distn nil})}
 (r-interop.core/->clj-pos-kw-fn "control"))

(def corr
 ^{:name-r "corr", :doc "", :argslists ({:d nil, :w {}})}
 (r-interop.core/->clj-pos-kw-fn "corr"))

(def cum-3
 ^{:name-r "cum3",
  :doc "",
  :argslists ({:a nil, :b nil, :c nil, :unbiased true})}
 (r-interop.core/->clj-pos-kw-fn "cum3"))

(def cv-glm
 ^{:name-r "cv.glm",
  :doc "",
  :argslists ({:data nil, :glmfit nil, :cost {}, :K nil})}
 (r-interop.core/->clj-pos-kw-fn "cv.glm"))

(def eef-profile
 ^{:name-r "EEF.profile",
  :doc "",
  :argslists ({:y nil, :tmin {}, :tmax {}, :n.t 25, :u {}})}
 (r-interop.core/->clj-pos-kw-fn "EEF.profile"))

(def el-profile
 ^{:name-r "EL.profile",
  :doc "",
  :argslists ({:y nil, :tmin {}, :tmax {}, :n.t 25, :u {}})}
 (r-interop.core/->clj-pos-kw-fn "EL.profile"))

(def empinf
 ^{:name-r "empinf",
  :doc "",
  :argslists
  ({:statistic nil,
    :index 1,
    :boot.out nil,
    :type nil,
    :stype nil,
    :... nil,
    :t nil,
    :strata {},
    :eps 0.001,
    :data nil})}
 (r-interop.core/->clj-pos-kw-fn "empinf"))

(def envelope
 ^{:name-r "envelope",
  :doc "",
  :argslists ({:boot.out nil, :mat nil, :level 0.95, :index {}})}
 (r-interop.core/->clj-pos-kw-fn "envelope"))

(def exp-tilt
 ^{:name-r "exp.tilt",
  :doc "",
  :argslists ({:L nil, :theta nil, :t0 0, :lambda nil, :strata {}})}
 (r-interop.core/->clj-pos-kw-fn "exp.tilt"))

(def freq-array
 ^{:name-r "freq.array", :doc "", :argslists ({:i.array nil})}
 (r-interop.core/->clj-pos-kw-fn "freq.array"))

(def glm-diag
 ^{:name-r "glm.diag", :doc "", :argslists ({:glmfit nil})}
 (r-interop.core/->clj-pos-kw-fn "glm.diag"))

(def glm-diag-plots
 ^{:name-r "glm.diag.plots",
  :doc "",
  :argslists
  ({:glmfit nil,
    :glmdiag {},
    :subset nil,
    :iden false,
    :labels nil,
    :ret false})}
 (r-interop.core/->clj-pos-kw-fn "glm.diag.plots"))

(def imp-moments
 ^{:name-r "imp.moments",
  :doc "",
  :argslists
  ({:boot.out nil, :index 1, :t {}, :w nil, :def true, :q nil})}
 (r-interop.core/->clj-pos-kw-fn "imp.moments"))

(def imp-prob
 ^{:name-r "imp.prob",
  :doc "",
  :argslists
  ({:boot.out nil,
    :index 1,
    :t0 {},
    :t {},
    :w nil,
    :def true,
    :q nil})}
 (r-interop.core/->clj-pos-kw-fn "imp.prob"))

(def imp-quantile
 ^{:name-r "imp.quantile",
  :doc "",
  :argslists
  ({:boot.out nil,
    :alpha nil,
    :index 1,
    :t {},
    :w nil,
    :def true,
    :q nil})}
 (r-interop.core/->clj-pos-kw-fn "imp.quantile"))

(def imp-weights
 ^{:name-r "imp.weights",
  :doc "",
  :argslists ({:boot.out nil, :def true, :q nil})}
 (r-interop.core/->clj-pos-kw-fn "imp.weights"))

(def inv-logit
 ^{:name-r "inv.logit", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "inv.logit"))

(def jack-after-boot
 ^{:name-r "jack.after.boot",
  :doc "",
  :argslists
  ({:L nil,
    :stinf true,
    :ylab nil,
    :index 1,
    :boot.out nil,
    :useJ true,
    :... nil,
    :alpha nil,
    :t nil,
    :main ""})}
 (r-interop.core/->clj-pos-kw-fn "jack.after.boot"))

(def lik-ci
 ^{:name-r "lik.CI", :doc "", :argslists ({:like nil, :lim nil})}
 (r-interop.core/->clj-pos-kw-fn "lik.CI"))

(def linear-approx
 ^{:name-r "linear.approx",
  :doc "",
  :argslists
  ({:boot.out nil,
    :L nil,
    :index 1,
    :type nil,
    :t0 nil,
    :t nil,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "linear.approx"))

(def logit
 ^{:name-r "logit", :doc "", :argslists ({:p nil})}
 (r-interop.core/->clj-pos-kw-fn "logit"))

(def nested-corr
 ^{:name-r "nested.corr",
  :doc "",
  :argslists ({:data nil, :w nil, :t0 nil, :M nil})}
 (r-interop.core/->clj-pos-kw-fn "nested.corr"))

(def norm-ci
 ^{:name-r "norm.ci",
  :doc "",
  :argslists
  ({:L nil,
    :index 1,
    :t0 nil,
    :boot.out nil,
    :hdot {},
    :h {},
    :hinv {},
    :var.t0 nil,
    :t nil,
    :conf 0.95})}
 (r-interop.core/->clj-pos-kw-fn "norm.ci"))

(def saddle
 ^{:name-r "saddle",
  :doc "",
  :argslists
  ({:d1 1,
    :init {},
    :A nil,
    :LR false,
    :K2 nil,
    :type "simp",
    :wdist "m",
    :K.adj nil,
    :d nil,
    :mu {},
    :strata nil,
    :u nil})}
 (r-interop.core/->clj-pos-kw-fn "saddle"))

(def saddle-distn
 ^{:name-r "saddle.distn",
  :doc "",
  :argslists
  ({:init {},
    :A nil,
    :t0 nil,
    :LR false,
    :type "simp",
    :npts 20,
    :wdist "m",
    :... nil,
    :alpha nil,
    :t nil,
    :mu {},
    :strata nil,
    :u nil})}
 (r-interop.core/->clj-pos-kw-fn "saddle.distn"))

(def simplex
 ^{:name-r "simplex",
  :doc "",
  :argslists
  ({:b2 nil,
    :b1 nil,
    :A2 nil,
    :A3 nil,
    :maxi false,
    :n.iter {},
    :b3 nil,
    :A1 nil,
    :a nil,
    :eps 1.0E-10})}
 (r-interop.core/->clj-pos-kw-fn "simplex"))

(def smooth-f
 ^{:name-r "smooth.f",
  :doc "",
  :argslists
  ({:theta nil, :boot.out nil, :index 1, :t {}, :width 0.5})}
 (r-interop.core/->clj-pos-kw-fn "smooth.f"))

(def tilt-boot
 ^{:name-r "tilt.boot",
  :doc "",
  :argslists
  ({:L nil,
    :statistic nil,
    :R nil,
    :index 1,
    :width 0.5,
    :tilt true,
    :stype "i",
    :theta nil,
    :... nil,
    :alpha {},
    :strata {},
    :sim "ordinary",
    :data nil})}
 (r-interop.core/->clj-pos-kw-fn "tilt.boot"))

(def tsboot
 ^{:name-r "tsboot",
  :doc "",
  :argslists
  ({:statistic nil,
    :ran.gen {},
    :cl nil,
    :R nil,
    :parallel {},
    :norm true,
    :l nil,
    :ncpus {},
    :tseries nil,
    :... nil,
    :orig.t true,
    :ran.args nil,
    :n.sim {},
    :endcorr true,
    :sim "model"})}
 (r-interop.core/->clj-pos-kw-fn "tsboot"))

(def var-linear
 ^{:name-r "var.linear", :doc "", :argslists ({:L nil, :strata nil})}
 (r-interop.core/->clj-pos-kw-fn "var.linear"))
