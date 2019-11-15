(ns r-interop.packages.boot
 (:require [r-interop.core :refer (defn-r)]))



(def abc-ci
 ^{:name-r "abc.ci",
  :doc "",
  :argslists
  ({:data nil,
    :statistic nil,
    :index 1,
    :strata [nil 1 nil],
    :conf 0.95,
    :eps [nil 0.001 nil],
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "boot::abc.ci"))

(def boot
 ^{:name-r "boot",
  :doc "",
  :argslists
  ({:L nil,
    :statistic nil,
    :mle nil,
    :ran.gen [nil {:d nil, :p nil} nil nil],
    :cl nil,
    :R nil,
    :parallel [nil "no" "multicore" "snow"],
    :m 0,
    :simple false,
    :weights nil,
    :stype [nil "i" "f" "w"],
    :ncpus [nil "boot.ncpus" 1],
    :... nil,
    :strata [nil 1 nil],
    :sim "ordinary",
    :data nil})}
 (r-interop.core/->clj-pos-kw-fn "boot::boot"))

(def boot-array
 ^{:name-r "boot.array",
  :doc "",
  :argslists ({:boot.out nil, :indices false})}
 (r-interop.core/->clj-pos-kw-fn "boot::boot.array"))

(def boot-ci
 ^{:name-r "boot.ci",
  :doc "",
  :argslists
  ({:L nil,
    :index [nil 1 [nil 2 [nil [nil nil nil]]]],
    :t0 nil,
    :boot.out nil,
    :type "all",
    :var.t nil,
    :hdot [nil {:t nil} [nil 1 [nil nil]] nil],
    :h [nil {:t nil} nil nil],
    :... nil,
    :hinv [nil {:t nil} nil nil],
    :var.t0 nil,
    :t nil,
    :conf 0.95})}
 (r-interop.core/->clj-pos-kw-fn "boot::boot.ci"))

(def censboot
 ^{:name-r "censboot",
  :doc "",
  :argslists
  ({:statistic nil,
    :cl nil,
    :R nil,
    :index [nil 1 2],
    :parallel [nil "no" "multicore" "snow"],
    :ncpus [nil "boot.ncpus" 1],
    :... nil,
    :F.surv nil,
    :G.surv nil,
    :cox nil,
    :strata [nil 1 nil 2],
    :sim "ordinary",
    :data nil})}
 (r-interop.core/->clj-pos-kw-fn "boot::censboot"))

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
 (r-interop.core/->clj-pos-kw-fn "boot::control"))

(def corr
 ^{:name-r "corr",
  :doc "",
  :argslists ({:d nil, :w [nil [nil 1 [nil nil]] [nil nil]]})}
 (r-interop.core/->clj-pos-kw-fn "boot::corr"))

(def cum-3
 ^{:name-r "cum3",
  :doc "",
  :argslists ({:a nil, :b nil, :c nil, :unbiased true})}
 (r-interop.core/->clj-pos-kw-fn "boot::cum3"))

(def cv-glm
 ^{:name-r "cv.glm",
  :doc "",
  :argslists
  ({:data nil,
    :glmfit nil,
    :cost
    [nil {:y nil, :yhat nil} [nil [nil [nil [nil nil nil]] 2]] nil],
    :K nil})}
 (r-interop.core/->clj-pos-kw-fn "boot::cv.glm"))

(def eef-profile
 ^{:name-r "EEF.profile",
  :doc "",
  :argslists
  ({:y nil,
    :tmin [nil [nil nil] 0.1],
    :tmax [nil [nil nil] 0.1],
    :n.t 25,
    :u [nil {:y nil, :t nil} [nil nil nil] nil]})}
 (r-interop.core/->clj-pos-kw-fn "boot::EEF.profile"))

(def el-profile
 ^{:name-r "EL.profile",
  :doc "",
  :argslists
  ({:y nil,
    :tmin [nil [nil nil] 0.1],
    :tmax [nil [nil nil] 0.1],
    :n.t 25,
    :u [nil {:y nil, :t nil} [nil nil nil] nil]})}
 (r-interop.core/->clj-pos-kw-fn "boot::EL.profile"))

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
    :strata [nil 1 nil],
    :eps 0.001,
    :data nil})}
 (r-interop.core/->clj-pos-kw-fn "boot::empinf"))

(def envelope
 ^{:name-r "envelope",
  :doc "",
  :argslists
  ({:boot.out nil, :mat nil, :level 0.95, :index [nil 1 [nil nil]]})}
 (r-interop.core/->clj-pos-kw-fn "boot::envelope"))

(def exp-tilt
 ^{:name-r "exp.tilt",
  :doc "",
  :argslists
  ({:L nil,
    :theta nil,
    :t0 0,
    :lambda nil,
    :strata [nil 1 [nil nil]]})}
 (r-interop.core/->clj-pos-kw-fn "boot::exp.tilt"))

(def freq-array
 ^{:name-r "freq.array", :doc "", :argslists ({:i.array nil})}
 (r-interop.core/->clj-pos-kw-fn "boot::freq.array"))

(def glm-diag
 ^{:name-r "glm.diag", :doc "", :argslists ({:glmfit nil})}
 (r-interop.core/->clj-pos-kw-fn "boot::glm.diag"))

(def glm-diag-plots
 ^{:name-r "glm.diag.plots",
  :doc "",
  :argslists
  ({:glmfit nil,
    :glmdiag [nil nil],
    :subset nil,
    :iden false,
    :labels nil,
    :ret false})}
 (r-interop.core/->clj-pos-kw-fn "boot::glm.diag.plots"))

(def imp-moments
 ^{:name-r "imp.moments",
  :doc "",
  :argslists
  ({:boot.out nil,
    :index 1,
    :t [nil [nil nil nil] nil nil],
    :w nil,
    :def true,
    :q nil})}
 (r-interop.core/->clj-pos-kw-fn "boot::imp.moments"))

(def imp-prob
 ^{:name-r "imp.prob",
  :doc "",
  :argslists
  ({:boot.out nil,
    :index 1,
    :t0 [nil [nil nil nil] nil],
    :t [nil [nil nil nil] nil nil],
    :w nil,
    :def true,
    :q nil})}
 (r-interop.core/->clj-pos-kw-fn "boot::imp.prob"))

(def imp-quantile
 ^{:name-r "imp.quantile",
  :doc "",
  :argslists
  ({:boot.out nil,
    :alpha nil,
    :index 1,
    :t [nil [nil nil nil] nil nil],
    :w nil,
    :def true,
    :q nil})}
 (r-interop.core/->clj-pos-kw-fn "boot::imp.quantile"))

(def imp-weights
 ^{:name-r "imp.weights",
  :doc "",
  :argslists ({:boot.out nil, :def true, :q nil})}
 (r-interop.core/->clj-pos-kw-fn "boot::imp.weights"))

(def inv-logit
 ^{:name-r "inv.logit", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "boot::inv.logit"))

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
 (r-interop.core/->clj-pos-kw-fn "boot::jack.after.boot"))

(def lik-ci
 ^{:name-r "lik.CI", :doc "", :argslists ({:like nil, :lim nil})}
 (r-interop.core/->clj-pos-kw-fn "boot::lik.CI"))

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
 (r-interop.core/->clj-pos-kw-fn "boot::linear.approx"))

(def logit
 ^{:name-r "logit", :doc "", :argslists ({:p nil})}
 (r-interop.core/->clj-pos-kw-fn "boot::logit"))

(def nested-corr
 ^{:name-r "nested.corr",
  :doc "",
  :argslists ({:data nil, :w nil, :t0 nil, :M nil})}
 (r-interop.core/->clj-pos-kw-fn "boot::nested.corr"))

(def norm-ci
 ^{:name-r "norm.ci",
  :doc "",
  :argslists
  ({:L nil,
    :index 1,
    :t0 nil,
    :boot.out nil,
    :hdot [nil {:t nil} 1 nil],
    :h [nil {:t nil} nil nil],
    :hinv [nil {:t nil} nil nil],
    :var.t0 nil,
    :t nil,
    :conf 0.95})}
 (r-interop.core/->clj-pos-kw-fn "boot::norm.ci"))

(def saddle
 ^{:name-r "saddle",
  :doc "",
  :argslists
  ({:d1 1,
    :init [nil 0.1 nil],
    :A nil,
    :LR false,
    :K2 nil,
    :type "simp",
    :wdist "m",
    :K.adj nil,
    :d nil,
    :mu [nil 0.5 nil],
    :strata nil,
    :u nil})}
 (r-interop.core/->clj-pos-kw-fn "boot::saddle"))

(def saddle-distn
 ^{:name-r "saddle.distn",
  :doc "",
  :argslists
  ({:init [nil 0.1 nil],
    :A nil,
    :t0 nil,
    :LR false,
    :type "simp",
    :npts 20,
    :wdist "m",
    :... nil,
    :alpha nil,
    :t nil,
    :mu [nil 0.5 nil],
    :strata nil,
    :u nil})}
 (r-interop.core/->clj-pos-kw-fn "boot::saddle.distn"))

(def simplex
 ^{:name-r "simplex",
  :doc "",
  :argslists
  ({:b2 nil,
    :b1 nil,
    :A2 nil,
    :A3 nil,
    :maxi false,
    :n.iter [nil nil [nil 2 nil]],
    :b3 nil,
    :A1 nil,
    :a nil,
    :eps 1.0E-10})}
 (r-interop.core/->clj-pos-kw-fn "boot::simplex"))

(def smooth-f
 ^{:name-r "smooth.f",
  :doc "",
  :argslists
  ({:theta nil,
    :boot.out nil,
    :index 1,
    :t [nil [nil nil nil] nil nil],
    :width 0.5})}
 (r-interop.core/->clj-pos-kw-fn "boot::smooth.f"))

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
    :alpha [nil 0.025 0.975],
    :strata [nil 1 nil],
    :sim "ordinary",
    :data nil})}
 (r-interop.core/->clj-pos-kw-fn "boot::tilt.boot"))

(def tsboot
 ^{:name-r "tsboot",
  :doc "",
  :argslists
  ({:statistic nil,
    :ran.gen [nil {:tser nil, :n.sim nil, :args nil} nil nil],
    :cl nil,
    :R nil,
    :parallel [nil "no" "multicore" "snow"],
    :norm true,
    :l nil,
    :ncpus [nil "boot.ncpus" 1],
    :tseries nil,
    :... nil,
    :orig.t true,
    :ran.args nil,
    :n.sim [nil nil],
    :endcorr true,
    :sim "model"})}
 (r-interop.core/->clj-pos-kw-fn "boot::tsboot"))

(def var-linear
 ^{:name-r "var.linear", :doc "", :argslists ({:L nil, :strata nil})}
 (r-interop.core/->clj-pos-kw-fn "boot::var.linear"))
