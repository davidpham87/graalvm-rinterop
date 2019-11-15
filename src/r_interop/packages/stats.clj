(ns r-interop.packages.stats
 (:require [r-interop.core :refer (defn-r eval-r)]))

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
(defn-r ss-weibull SSweibull)

(def acf
 ^{:name-r "acf",
  :doc "",
  :argslists
  ({:x nil,
    :lag.max nil,
    :type {},
    :plot true,
    :na.action nil,
    :demean true,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "acf"))

(def acf-2-ar
 ^{:name-r "acf2AR", :doc "", :argslists ({:acf nil})}
 (r-interop.core/->clj-pos-kw-fn "acf2AR"))

(def add-scope
 ^{:name-r "add.scope",
  :doc "",
  :argslists ({:terms1 nil, :terms2 nil})}
 (r-interop.core/->clj-pos-kw-fn "add.scope"))

(def add-1
 ^{:name-r "add1",
  :doc "",
  :argslists ({:object nil, :scope nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "add1"))

(def addmargins
 ^{:name-r "addmargins",
  :doc "",
  :argslists ({:A nil, :margin {}, :FUN nil, :quiet false})}
 (r-interop.core/->clj-pos-kw-fn "addmargins"))

(def aggregate
 ^{:name-r "aggregate", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "aggregate"))

(def aggregate-data-frame
 ^{:name-r "aggregate.data.frame",
  :doc "",
  :argslists
  ({:x nil, :by nil, :FUN nil, :... nil, :simplify true, :drop true})}
 (r-interop.core/->clj-pos-kw-fn "aggregate.data.frame"))

(def aggregate-ts
 ^{:name-r "aggregate.ts",
  :doc "",
  :argslists
  ({:x nil,
    :nfrequency 1,
    :FUN nil,
    :ndeltat 1,
    :ts.eps {},
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "aggregate.ts"))

(def aic
 ^{:name-r "AIC", :doc "", :argslists ({:object nil, :... nil, :k 2})}
 (r-interop.core/->clj-pos-kw-fn "AIC"))

(def alias
 ^{:name-r "alias", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "alias"))

(def anova
 ^{:name-r "anova", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "anova"))

(def ansari-test
 ^{:name-r "ansari.test", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "ansari.test"))

(def aov
 ^{:name-r "aov",
  :doc "",
  :argslists
  ({:formula nil,
    :data nil,
    :projections false,
    :qr true,
    :contrasts nil,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "aov"))

(def approx
 ^{:name-r "approx",
  :doc "",
  :argslists
  ({:y nil,
    :ties nil,
    :method "linear",
    :n 50,
    :rule 1,
    :yright nil,
    :xout nil,
    :f 0,
    :x nil,
    :yleft nil})}
 (r-interop.core/->clj-pos-kw-fn "approx"))

(def approxfun
 ^{:name-r "approxfun",
  :doc "",
  :argslists
  ({:x nil,
    :y nil,
    :method "linear",
    :yleft nil,
    :yright nil,
    :rule 1,
    :f 0,
    :ties nil})}
 (r-interop.core/->clj-pos-kw-fn "approxfun"))

(def ar
 ^{:name-r "ar",
  :doc "",
  :argslists
  ({:x nil,
    :aic true,
    :order.max nil,
    :method {},
    :na.action nil,
    :series {},
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "ar"))

(def ar-burg
 ^{:name-r "ar.burg", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "ar.burg"))

(def ar-mle
 ^{:name-r "ar.mle",
  :doc "",
  :argslists
  ({:x nil,
    :aic true,
    :order.max nil,
    :na.action nil,
    :demean true,
    :series nil,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "ar.mle"))

(def ar-ols
 ^{:name-r "ar.ols",
  :doc "",
  :argslists
  ({:x nil,
    :aic true,
    :order.max nil,
    :na.action nil,
    :demean true,
    :intercept nil,
    :series nil,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "ar.ols"))

(def ar-yw
 ^{:name-r "ar.yw", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "ar.yw"))

(def arima
 ^{:name-r "arima",
  :doc "",
  :argslists
  ({:init nil,
    :SSinit {},
    :method {},
    :xreg nil,
    :include.mean true,
    :seasonal {:empty-key nil, :order {}, :period [nil]},
    :n.cond nil,
    :order {},
    :x nil,
    :kappa 1000000,
    :fixed nil,
    :optim.control {},
    :transform.pars true,
    :optim.method "BFGS"})}
 (r-interop.core/->clj-pos-kw-fn "arima"))

(def arima-sim
 ^{:name-r "arima.sim",
  :doc "",
  :argslists
  ({:model nil,
    :n nil,
    :rand.gen nil,
    :innov {},
    :n.start [nil],
    :start.innov {},
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "arima.sim"))

(def arima-0
 ^{:name-r "arima0",
  :doc "",
  :argslists
  ({:init nil,
    :method {},
    :xreg nil,
    :include.mean true,
    :seasonal {:empty-key nil, :order {}, :period [nil]},
    :n.cond nil,
    :delta 0.01,
    :order {},
    :x nil,
    :fixed nil,
    :optim.control {},
    :transform.pars true})}
 (r-interop.core/->clj-pos-kw-fn "arima0"))

(def arima-0-diag
 ^{:name-r "arima0.diag", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "arima0.diag"))

(def as-dendrogram
 ^{:name-r "as.dendrogram",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.dendrogram"))

(def as-dist
 ^{:name-r "as.dist",
  :doc "",
  :argslists ({:m nil, :diag false, :upper false})}
 (r-interop.core/->clj-pos-kw-fn "as.dist"))

(def as-formula
 ^{:name-r "as.formula", :doc "", :argslists ({:object nil, :env {}})}
 (r-interop.core/->clj-pos-kw-fn "as.formula"))

(def as-hclust
 ^{:name-r "as.hclust", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.hclust"))

(def as-stepfun
 ^{:name-r "as.stepfun", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.stepfun"))

(def as-ts
 ^{:name-r "as.ts", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.ts"))

(def as-one-sided-formula
 ^{:name-r "asOneSidedFormula", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "asOneSidedFormula"))

(def ave
 ^{:name-r "ave", :doc "", :argslists ({:x nil, :... nil, :FUN nil})}
 (r-interop.core/->clj-pos-kw-fn "ave"))

(def bandwidth-kernel
 ^{:name-r "bandwidth.kernel", :doc "", :argslists ({:k nil})}
 (r-interop.core/->clj-pos-kw-fn "bandwidth.kernel"))

(def bartlett-test
 ^{:name-r "bartlett.test", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "bartlett.test"))

(def bic
 ^{:name-r "BIC", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "BIC"))

(def binom-test
 ^{:name-r "binom.test",
  :doc "",
  :argslists
  ({:x nil, :n nil, :p 0.5, :alternative {}, :conf.level 0.95})}
 (r-interop.core/->clj-pos-kw-fn "binom.test"))

(def binomial
 ^{:name-r "binomial", :doc "", :argslists ({:link "logit"})}
 (r-interop.core/->clj-pos-kw-fn "binomial"))

(def biplot
 ^{:name-r "biplot", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "biplot"))

(def box-test
 ^{:name-r "Box.test",
  :doc "",
  :argslists ({:x nil, :lag 1, :type {}, :fitdf 0})}
 (r-interop.core/->clj-pos-kw-fn "Box.test"))

(def bw-bcv
 ^{:name-r "bw.bcv",
  :doc "",
  :argslists ({:x nil, :nb 1000, :lower {}, :upper nil, :tol {}})}
 (r-interop.core/->clj-pos-kw-fn "bw.bcv"))

(def bw-nrd
 ^{:name-r "bw.nrd", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "bw.nrd"))

(def bw-nrd-0
 ^{:name-r "bw.nrd0", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "bw.nrd0"))

(def bw-sj
 ^{:name-r "bw.SJ",
  :doc "",
  :argslists
  ({:x nil, :nb 1000, :lower {}, :upper nil, :method {}, :tol {}})}
 (r-interop.core/->clj-pos-kw-fn "bw.SJ"))

(def bw-ucv
 ^{:name-r "bw.ucv",
  :doc "",
  :argslists ({:x nil, :nb 1000, :lower {}, :upper nil, :tol {}})}
 (r-interop.core/->clj-pos-kw-fn "bw.ucv"))

(def cancor
 ^{:name-r "cancor",
  :doc "",
  :argslists ({:x nil, :y nil, :xcenter true, :ycenter true})}
 (r-interop.core/->clj-pos-kw-fn "cancor"))

(def case-names
 ^{:name-r "case.names", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "case.names"))

(def ccf
 ^{:name-r "ccf",
  :doc "",
  :argslists
  ({:x nil,
    :y nil,
    :lag.max nil,
    :type {},
    :plot true,
    :na.action nil,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "ccf"))

(def chisq-test
 ^{:name-r "chisq.test",
  :doc "",
  :argslists
  ({:x nil,
    :y nil,
    :correct true,
    :p {},
    :rescale.p false,
    :simulate.p.value false,
    :B 2000})}
 (r-interop.core/->clj-pos-kw-fn "chisq.test"))

(def cmdscale
 ^{:name-r "cmdscale",
  :doc "",
  :argslists
  ({:d nil, :k 2, :eig false, :add false, :x.ret false, :list. {}})}
 (r-interop.core/->clj-pos-kw-fn "cmdscale"))

(def coef
 ^{:name-r "coef", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "coef"))

(def coefficients
 ^{:name-r "coefficients",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "coefficients"))

(def complete-cases
 ^{:name-r "complete.cases", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "complete.cases"))

(def confint
 ^{:name-r "confint",
  :doc "",
  :argslists ({:object nil, :parm nil, :level 0.95, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "confint"))

(def confint-default
 ^{:name-r "confint.default",
  :doc "",
  :argslists ({:object nil, :parm nil, :level 0.95, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "confint.default"))

(def confint-lm
 ^{:name-r "confint.lm",
  :doc "",
  :argslists ({:object nil, :parm nil, :level 0.95, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "confint.lm"))

(def constr-optim
 ^{:name-r "constrOptim",
  :doc "",
  :argslists
  ({:outer.eps 1.0E-5,
    :method {},
    :ci nil,
    :theta nil,
    :hessian false,
    :ui nil,
    :... nil,
    :control {},
    :f nil,
    :mu 1.0E-4,
    :grad nil,
    :outer.iterations 100})}
 (r-interop.core/->clj-pos-kw-fn "constrOptim"))

(def contr-helmert
 ^{:name-r "contr.helmert",
  :doc "",
  :argslists ({:n nil, :contrasts true, :sparse false})}
 (r-interop.core/->clj-pos-kw-fn "contr.helmert"))

(def contr-poly
 ^{:name-r "contr.poly",
  :doc "",
  :argslists ({:n nil, :scores {}, :contrasts true, :sparse false})}
 (r-interop.core/->clj-pos-kw-fn "contr.poly"))

(def contr-sas
 ^{:name-r "contr.SAS",
  :doc "",
  :argslists ({:n nil, :contrasts true, :sparse false})}
 (r-interop.core/->clj-pos-kw-fn "contr.SAS"))

(def contr-sum
 ^{:name-r "contr.sum",
  :doc "",
  :argslists ({:n nil, :contrasts true, :sparse false})}
 (r-interop.core/->clj-pos-kw-fn "contr.sum"))

(def contr-treatment
 ^{:name-r "contr.treatment",
  :doc "",
  :argslists ({:n nil, :base 1, :contrasts true, :sparse false})}
 (r-interop.core/->clj-pos-kw-fn "contr.treatment"))

(def contrasts
 ^{:name-r "contrasts",
  :doc "",
  :argslists ({:x nil, :contrasts true, :sparse false})}
 (r-interop.core/->clj-pos-kw-fn "contrasts"))

(def convolve
 ^{:name-r "convolve",
  :doc "",
  :argslists ({:x nil, :y nil, :conj true, :type {}})}
 (r-interop.core/->clj-pos-kw-fn "convolve"))

(def cooks-distance
 ^{:name-r "cooks.distance",
  :doc "",
  :argslists ({:model nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "cooks.distance"))

(def cophenetic
 ^{:name-r "cophenetic", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "cophenetic"))

(def cor
 ^{:name-r "cor",
  :doc "",
  :argslists ({:x nil, :y nil, :use "everything", :method {}})}
 (r-interop.core/->clj-pos-kw-fn "cor"))

(def cor-test
 ^{:name-r "cor.test", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "cor.test"))

(def cov
 ^{:name-r "cov",
  :doc "",
  :argslists ({:x nil, :y nil, :use "everything", :method {}})}
 (r-interop.core/->clj-pos-kw-fn "cov"))

(def cov-wt
 ^{:name-r "cov.wt",
  :doc "",
  :argslists ({:x nil, :wt {}, :cor false, :center true, :method {}})}
 (r-interop.core/->clj-pos-kw-fn "cov.wt"))

(def covratio
 ^{:name-r "covratio",
  :doc "",
  :argslists
  ({:model nil, :infl {:empty-key nil, :do.coef false}, :res {}})}
 (r-interop.core/->clj-pos-kw-fn "covratio"))

(def cpgram
 ^{:name-r "cpgram",
  :doc "",
  :argslists ({:ts nil, :taper 0.1, :main {}, :ci.col "blue"})}
 (r-interop.core/->clj-pos-kw-fn "cpgram"))

(def cutree
 ^{:name-r "cutree", :doc "", :argslists ({:tree nil, :k nil, :h nil})}
 (r-interop.core/->clj-pos-kw-fn "cutree"))

(def cycle
 ^{:name-r "cycle", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "cycle"))

(def dbeta
 ^{:name-r "dbeta",
  :doc "",
  :argslists ({:x nil, :shape1 nil, :shape2 nil, :ncp 0, :log false})}
 (r-interop.core/->clj-pos-kw-fn "dbeta"))

(def dbinom
 ^{:name-r "dbinom",
  :doc "",
  :argslists ({:x nil, :size nil, :prob nil, :log false})}
 (r-interop.core/->clj-pos-kw-fn "dbinom"))

(def dcauchy
 ^{:name-r "dcauchy",
  :doc "",
  :argslists ({:x nil, :location 0, :scale 1, :log false})}
 (r-interop.core/->clj-pos-kw-fn "dcauchy"))

(def dchisq
 ^{:name-r "dchisq",
  :doc "",
  :argslists ({:x nil, :df nil, :ncp 0, :log false})}
 (r-interop.core/->clj-pos-kw-fn "dchisq"))

(def decompose
 ^{:name-r "decompose",
  :doc "",
  :argslists ({:x nil, :type {}, :filter nil})}
 (r-interop.core/->clj-pos-kw-fn "decompose"))

(def delete-response
 ^{:name-r "delete.response", :doc "", :argslists ({:termobj nil})}
 (r-interop.core/->clj-pos-kw-fn "delete.response"))

(def deltat
 ^{:name-r "deltat", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "deltat"))

(def dendrapply
 ^{:name-r "dendrapply",
  :doc "",
  :argslists ({:X nil, :FUN nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "dendrapply"))

(def density
 ^{:name-r "density", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "density"))

(def density-default
 ^{:name-r "density.default",
  :doc "",
  :argslists
  ({:na.rm false,
    :give.Rkern false,
    :n 512,
    :width nil,
    :weights nil,
    :adjust 1,
    :window nil,
    :from nil,
    :... nil,
    :kernel {},
    :bw "nrd0",
    :x nil,
    :cut 3,
    :to nil})}
 (r-interop.core/->clj-pos-kw-fn "density.default"))

(def deriv
 ^{:name-r "deriv", :doc "", :argslists ({:expr nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "deriv"))

(def deriv-3
 ^{:name-r "deriv3", :doc "", :argslists ({:expr nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "deriv3"))

(def deviance
 ^{:name-r "deviance", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "deviance"))

(def dexp
 ^{:name-r "dexp", :doc "", :argslists ({:x nil, :rate 1, :log false})}
 (r-interop.core/->clj-pos-kw-fn "dexp"))

(def df
 ^{:name-r "df",
  :doc "",
  :argslists ({:x nil, :df1 nil, :df2 nil, :ncp nil, :log false})}
 (r-interop.core/->clj-pos-kw-fn "df"))

(def df-kernel
 ^{:name-r "df.kernel", :doc "", :argslists ({:k nil})}
 (r-interop.core/->clj-pos-kw-fn "df.kernel"))

(def df-residual
 ^{:name-r "df.residual", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "df.residual"))

(def dfbeta
 ^{:name-r "dfbeta", :doc "", :argslists ({:model nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "dfbeta"))

(def dfbetas
 ^{:name-r "dfbetas", :doc "", :argslists ({:model nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "dfbetas"))

(def dffits
 ^{:name-r "dffits",
  :doc "",
  :argslists
  ({:model nil, :infl {:empty-key nil, :do.coef false}, :res {}})}
 (r-interop.core/->clj-pos-kw-fn "dffits"))

(def dgamma
 ^{:name-r "dgamma",
  :doc "",
  :argslists ({:x nil, :shape nil, :rate 1, :scale {}, :log false})}
 (r-interop.core/->clj-pos-kw-fn "dgamma"))

(def dgeom
 ^{:name-r "dgeom",
  :doc "",
  :argslists ({:x nil, :prob nil, :log false})}
 (r-interop.core/->clj-pos-kw-fn "dgeom"))

(def dhyper
 ^{:name-r "dhyper",
  :doc "",
  :argslists ({:x nil, :m nil, :n nil, :k nil, :log false})}
 (r-interop.core/->clj-pos-kw-fn "dhyper"))

(def diffinv
 ^{:name-r "diffinv", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "diffinv"))

(def dist
 ^{:name-r "dist",
  :doc "",
  :argslists
  ({:x nil, :method "euclidean", :diag false, :upper false, :p 2})}
 (r-interop.core/->clj-pos-kw-fn "dist"))

(def dlnorm
 ^{:name-r "dlnorm",
  :doc "",
  :argslists ({:x nil, :meanlog 0, :sdlog 1, :log false})}
 (r-interop.core/->clj-pos-kw-fn "dlnorm"))

(def dlogis
 ^{:name-r "dlogis",
  :doc "",
  :argslists ({:x nil, :location 0, :scale 1, :log false})}
 (r-interop.core/->clj-pos-kw-fn "dlogis"))

(def dmultinom
 ^{:name-r "dmultinom",
  :doc "",
  :argslists ({:x nil, :size nil, :prob nil, :log false})}
 (r-interop.core/->clj-pos-kw-fn "dmultinom"))

(def dnbinom
 ^{:name-r "dnbinom",
  :doc "",
  :argslists ({:x nil, :size nil, :prob nil, :mu nil, :log false})}
 (r-interop.core/->clj-pos-kw-fn "dnbinom"))

(def dnorm
 ^{:name-r "dnorm",
  :doc "",
  :argslists ({:x nil, :mean 0, :sd 1, :log false})}
 (r-interop.core/->clj-pos-kw-fn "dnorm"))

(def dpois
 ^{:name-r "dpois",
  :doc "",
  :argslists ({:x nil, :lambda nil, :log false})}
 (r-interop.core/->clj-pos-kw-fn "dpois"))

(def drop-scope
 ^{:name-r "drop.scope",
  :doc "",
  :argslists ({:terms1 nil, :terms2 nil})}
 (r-interop.core/->clj-pos-kw-fn "drop.scope"))

(def drop-terms
 ^{:name-r "drop.terms",
  :doc "",
  :argslists ({:termobj nil, :dropx nil, :keep.response false})}
 (r-interop.core/->clj-pos-kw-fn "drop.terms"))

(def drop-1
 ^{:name-r "drop1",
  :doc "",
  :argslists ({:object nil, :scope nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "drop1"))

(def dsignrank
 ^{:name-r "dsignrank",
  :doc "",
  :argslists ({:x nil, :n nil, :log false})}
 (r-interop.core/->clj-pos-kw-fn "dsignrank"))

(def dt
 ^{:name-r "dt",
  :doc "",
  :argslists ({:x nil, :df nil, :ncp nil, :log false})}
 (r-interop.core/->clj-pos-kw-fn "dt"))

(def dummy-coef
 ^{:name-r "dummy.coef", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "dummy.coef"))

(def dummy-coef-lm
 ^{:name-r "dummy.coef.lm",
  :doc "",
  :argslists ({:object nil, :use.na false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "dummy.coef.lm"))

(def dunif
 ^{:name-r "dunif",
  :doc "",
  :argslists ({:x nil, :min 0, :max 1, :log false})}
 (r-interop.core/->clj-pos-kw-fn "dunif"))

(def dweibull
 ^{:name-r "dweibull",
  :doc "",
  :argslists ({:x nil, :shape nil, :scale 1, :log false})}
 (r-interop.core/->clj-pos-kw-fn "dweibull"))

(def dwilcox
 ^{:name-r "dwilcox",
  :doc "",
  :argslists ({:x nil, :m nil, :n nil, :log false})}
 (r-interop.core/->clj-pos-kw-fn "dwilcox"))

(def ecdf
 ^{:name-r "ecdf", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "ecdf"))

(def eff-aovlist
 ^{:name-r "eff.aovlist", :doc "", :argslists ({:aovlist nil})}
 (r-interop.core/->clj-pos-kw-fn "eff.aovlist"))

(def effects
 ^{:name-r "effects", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "effects"))

(def embed
 ^{:name-r "embed", :doc "", :argslists ({:x nil, :dimension 1})}
 (r-interop.core/->clj-pos-kw-fn "embed"))

(def end
 ^{:name-r "end", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "end"))

(def est-var
 ^{:name-r "estVar", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "estVar"))

(def expand-model-frame
 ^{:name-r "expand.model.frame",
  :doc "",
  :argslists ({:model nil, :extras nil, :envir {}, :na.expand false})}
 (r-interop.core/->clj-pos-kw-fn "expand.model.frame"))

(def extract-aic
 ^{:name-r "extractAIC",
  :doc "",
  :argslists ({:fit nil, :scale nil, :k 2, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "extractAIC"))

(def factanal
 ^{:name-r "factanal",
  :doc "",
  :argslists
  ({:rotation "varimax",
    :factors nil,
    :subset nil,
    :na.action nil,
    :start nil,
    :n.obs [nil],
    :... nil,
    :control nil,
    :covmat nil,
    :scores {},
    :x nil,
    :data nil})}
 (r-interop.core/->clj-pos-kw-fn "factanal"))

(def factor-scope
 ^{:name-r "factor.scope",
  :doc "",
  :argslists ({:factor nil, :scope nil})}
 (r-interop.core/->clj-pos-kw-fn "factor.scope"))

(def family
 ^{:name-r "family", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "family"))

(def fft
 ^{:name-r "fft", :doc "", :argslists ({:z nil, :inverse false})}
 (r-interop.core/->clj-pos-kw-fn "fft"))

(def filter
 ^{:name-r "filter",
  :doc "",
  :argslists
  ({:x nil,
    :filter nil,
    :method {},
    :sides 2,
    :circular false,
    :init nil})}
 (r-interop.core/->clj-pos-kw-fn "filter"))

(def fisher-test
 ^{:name-r "fisher.test",
  :doc "",
  :argslists
  ({:y nil,
    :conf.int true,
    :hybrid false,
    :workspace 200000,
    :alternative "two.sided",
    :simulate.p.value false,
    :or 1,
    :conf.level 0.95,
    :B 2000,
    :control {},
    :x nil,
    :hybridPars {:empty-key nil, :expect 5, :percent 80, :Emin 1}})}
 (r-interop.core/->clj-pos-kw-fn "fisher.test"))

(def fitted
 ^{:name-r "fitted", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "fitted"))

(def fitted-values
 ^{:name-r "fitted.values",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "fitted.values"))

(def fivenum
 ^{:name-r "fivenum", :doc "", :argslists ({:x nil, :na.rm true})}
 (r-interop.core/->clj-pos-kw-fn "fivenum"))

(def fligner-test
 ^{:name-r "fligner.test", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "fligner.test"))

(def formula
 ^{:name-r "formula", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "formula"))

(def frequency
 ^{:name-r "frequency", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "frequency"))

(def friedman-test
 ^{:name-r "friedman.test", :doc "", :argslists ({:y nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "friedman.test"))

(def ftable
 ^{:name-r "ftable", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "ftable"))

(def gamma
 ^{:name-r "Gamma", :doc "", :argslists ({:link "inverse"})}
 (r-interop.core/->clj-pos-kw-fn "Gamma"))

(def gaussian
 ^{:name-r "gaussian", :doc "", :argslists ({:link "identity"})}
 (r-interop.core/->clj-pos-kw-fn "gaussian"))

(def get-all-vars
 ^{:name-r "get_all_vars",
  :doc "",
  :argslists ({:formula nil, :data nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "get_all_vars"))

(def get-call
 ^{:name-r "getCall", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "getCall"))

(def get-initial
 ^{:name-r "getInitial",
  :doc "",
  :argslists ({:object nil, :data nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "getInitial"))

(def glm
 ^{:name-r "glm",
  :doc "",
  :argslists
  ({:y true,
    :singular.ok true,
    :family nil,
    :etastart nil,
    :mustart nil,
    :subset nil,
    :offset nil,
    :method "glm.fit",
    :contrasts nil,
    :na.action nil,
    :start nil,
    :weights nil,
    :... nil,
    :control {},
    :formula nil,
    :x false,
    :data nil,
    :model true})}
 (r-interop.core/->clj-pos-kw-fn "glm"))

(def glm-control
 ^{:name-r "glm.control",
  :doc "",
  :argslists ({:epsilon 1.0E-8, :maxit 25, :trace false})}
 (r-interop.core/->clj-pos-kw-fn "glm.control"))

(def glm-fit
 ^{:name-r "glm.fit",
  :doc "",
  :argslists
  ({:y nil,
    :singular.ok true,
    :family {},
    :intercept true,
    :etastart nil,
    :mustart nil,
    :offset {},
    :start nil,
    :weights {},
    :control {},
    :x nil})}
 (r-interop.core/->clj-pos-kw-fn "glm.fit"))

(def has-tsp
 ^{:name-r "hasTsp", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "hasTsp"))

(def hat
 ^{:name-r "hat", :doc "", :argslists ({:x nil, :intercept true})}
 (r-interop.core/->clj-pos-kw-fn "hat"))

(def hatvalues
 ^{:name-r "hatvalues", :doc "", :argslists ({:model nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "hatvalues"))

(def hclust
 ^{:name-r "hclust",
  :doc "",
  :argslists ({:d nil, :method "complete", :members nil})}
 (r-interop.core/->clj-pos-kw-fn "hclust"))

(def heatmap
 ^{:name-r "heatmap",
  :doc "",
  :argslists
  ({:symm false,
    :na.rm true,
    :Colv {},
    :ColSideColors nil,
    :ylab nil,
    :scale {},
    :cexRow {},
    :reorderfun {},
    :labRow nil,
    :verbose {},
    :RowSideColors nil,
    :add.expr nil,
    :revC {},
    :xlab nil,
    :distfun nil,
    :... nil,
    :labCol nil,
    :margins {},
    :hclustfun nil,
    :x nil,
    :cexCol {},
    :Rowv nil,
    :main nil,
    :keep.dendro false})}
 (r-interop.core/->clj-pos-kw-fn "heatmap"))

(def holt-winters
 ^{:name-r "HoltWinters",
  :doc "",
  :argslists
  ({:beta nil,
    :s.start nil,
    :b.start nil,
    :start.periods 2,
    :seasonal {},
    :optim.start {:empty-key nil, :alpha 0.3, :beta 0.1, :gamma 0.1},
    :gamma nil,
    :alpha nil,
    :x nil,
    :l.start nil,
    :optim.control {}})}
 (r-interop.core/->clj-pos-kw-fn "HoltWinters"))

(def influence
 ^{:name-r "influence", :doc "", :argslists ({:model nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "influence"))

(def influence-measures
 ^{:name-r "influence.measures", :doc "", :argslists ({:model nil})}
 (r-interop.core/->clj-pos-kw-fn "influence.measures"))

(def integrate
 ^{:name-r "integrate",
  :doc "",
  :argslists
  ({:aux nil,
    :stop.on.error true,
    :upper nil,
    :abs.tol nil,
    :keep.xy false,
    :... nil,
    :lower nil,
    :subdivisions 100,
    :f nil,
    :rel.tol {}})}
 (r-interop.core/->clj-pos-kw-fn "integrate"))

(def interaction-plot
 ^{:name-r "interaction.plot",
  :doc "",
  :argslists
  ({:response nil,
    :ylim {:empty-key nil, :na.rm true},
    :trace.label {},
    :fun nil,
    :xaxt {},
    :ylab nil,
    :lty {},
    :xtick false,
    :axes true,
    :xpd nil,
    :leg.bg {},
    :legend true,
    :type {},
    :xlab {},
    :... nil,
    :col 1,
    :pch {},
    :fixed false,
    :trace.factor nil,
    :x.factor nil,
    :leg.bty "n"})}
 (r-interop.core/->clj-pos-kw-fn "interaction.plot"))

(def inverse-gaussian
 ^{:name-r "inverse.gaussian", :doc "", :argslists ({:link "1/mu^2"})}
 (r-interop.core/->clj-pos-kw-fn "inverse.gaussian"))

(def iqr
 ^{:name-r "IQR", :doc "", :argslists ({:x nil, :na.rm false, :type 7})}
 (r-interop.core/->clj-pos-kw-fn "IQR"))

(def is-empty-model
 ^{:name-r "is.empty.model", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "is.empty.model"))

(def is-leaf
 ^{:name-r "is.leaf", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "is.leaf"))

(def is-mts
 ^{:name-r "is.mts", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "is.mts"))

(def is-stepfun
 ^{:name-r "is.stepfun", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "is.stepfun"))

(def is-ts
 ^{:name-r "is.ts", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "is.ts"))

(def is-tskernel
 ^{:name-r "is.tskernel", :doc "", :argslists ({:k nil})}
 (r-interop.core/->clj-pos-kw-fn "is.tskernel"))

(def isoreg
 ^{:name-r "isoreg", :doc "", :argslists ({:x nil, :y nil})}
 (r-interop.core/->clj-pos-kw-fn "isoreg"))

(def kalman-forecast
 ^{:name-r "KalmanForecast",
  :doc "",
  :argslists ({:n.ahead 10, :mod nil, :update false})}
 (r-interop.core/->clj-pos-kw-fn "KalmanForecast"))

(def kalman-like
 ^{:name-r "KalmanLike",
  :doc "",
  :argslists ({:y nil, :mod nil, :nit 0, :update false})}
 (r-interop.core/->clj-pos-kw-fn "KalmanLike"))

(def kalman-run
 ^{:name-r "KalmanRun",
  :doc "",
  :argslists ({:y nil, :mod nil, :nit 0, :update false})}
 (r-interop.core/->clj-pos-kw-fn "KalmanRun"))

(def kalman-smooth
 ^{:name-r "KalmanSmooth",
  :doc "",
  :argslists ({:y nil, :mod nil, :nit 0})}
 (r-interop.core/->clj-pos-kw-fn "KalmanSmooth"))

(def kernapply
 ^{:name-r "kernapply", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "kernapply"))

(def kernel
 ^{:name-r "kernel",
  :doc "",
  :argslists ({:coef nil, :m 2, :r nil, :name "unknown"})}
 (r-interop.core/->clj-pos-kw-fn "kernel"))

(def kmeans
 ^{:name-r "kmeans",
  :doc "",
  :argslists
  ({:x nil,
    :centers nil,
    :iter.max 10,
    :nstart 1,
    :algorithm {},
    :trace false})}
 (r-interop.core/->clj-pos-kw-fn "kmeans"))

(def knots
 ^{:name-r "knots", :doc "", :argslists ({:Fn nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "knots"))

(def kruskal-test
 ^{:name-r "kruskal.test", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "kruskal.test"))

(def ks-test
 ^{:name-r "ks.test",
  :doc "",
  :argslists ({:x nil, :y nil, :... nil, :alternative {}, :exact nil})}
 (r-interop.core/->clj-pos-kw-fn "ks.test"))

(def ksmooth
 ^{:name-r "ksmooth",
  :doc "",
  :argslists
  ({:x nil,
    :y nil,
    :kernel {},
    :bandwidth 0.5,
    :range.x {},
    :n.points {},
    :x.points nil})}
 (r-interop.core/->clj-pos-kw-fn "ksmooth"))

(def lag
 ^{:name-r "lag", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "lag"))

(def lag-plot
 ^{:name-r "lag.plot",
  :doc "",
  :argslists
  ({:set.lags {},
    :labels nil,
    :diag.col "gray",
    :do.lines {},
    :layout nil,
    :type "p",
    :... nil,
    :asp 1,
    :oma nil,
    :x nil,
    :main nil,
    :lags 1,
    :ask nil,
    :diag true})}
 (r-interop.core/->clj-pos-kw-fn "lag.plot"))

(def line
 ^{:name-r "line", :doc "", :argslists ({:x nil, :y nil, :iter 1})}
 (r-interop.core/->clj-pos-kw-fn "line"))

(def lm
 ^{:name-r "lm",
  :doc "",
  :argslists
  ({:y false,
    :singular.ok true,
    :qr true,
    :subset nil,
    :offset nil,
    :method "qr",
    :contrasts nil,
    :na.action nil,
    :weights nil,
    :... nil,
    :formula nil,
    :x false,
    :data nil,
    :model true})}
 (r-interop.core/->clj-pos-kw-fn "lm"))

(def lm-fit
 ^{:name-r "lm.fit",
  :doc "",
  :argslists
  ({:x nil,
    :y nil,
    :offset nil,
    :method "qr",
    :tol 1.0E-7,
    :singular.ok true,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "lm.fit"))

(def lm-influence
 ^{:name-r "lm.influence",
  :doc "",
  :argslists ({:model nil, :do.coef true})}
 (r-interop.core/->clj-pos-kw-fn "lm.influence"))

(def lm-wfit
 ^{:name-r "lm.wfit",
  :doc "",
  :argslists
  ({:x nil,
    :y nil,
    :w nil,
    :offset nil,
    :method "qr",
    :tol 1.0E-7,
    :singular.ok true,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "lm.wfit"))

(def loadings
 ^{:name-r "loadings", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "loadings"))

(def loess
 ^{:name-r "loess",
  :doc "",
  :argslists
  ({:family {},
    :subset nil,
    :enp.target nil,
    :method {},
    :drop.square false,
    :na.action nil,
    :weights nil,
    :... nil,
    :control {},
    :degree 2,
    :formula nil,
    :parametric false,
    :normalize true,
    :span 0.75,
    :data nil,
    :model false})}
 (r-interop.core/->clj-pos-kw-fn "loess"))

(def loess-control
 ^{:name-r "loess.control",
  :doc "",
  :argslists
  ({:surface {},
    :statistics {},
    :trace.hat {},
    :cell 0.2,
    :iterations 4,
    :iterTrace false,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "loess.control"))

(def loess-smooth
 ^{:name-r "loess.smooth",
  :doc "",
  :argslists
  ({:x nil,
    :y nil,
    :span {},
    :degree 1,
    :family {},
    :evaluation 50,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "loess.smooth"))

(def log-lik
 ^{:name-r "logLik", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "logLik"))

(def loglin
 ^{:name-r "loglin",
  :doc "",
  :argslists
  ({:table nil,
    :margin nil,
    :start {},
    :fit false,
    :eps 0.1,
    :iter 20,
    :param false,
    :print true})}
 (r-interop.core/->clj-pos-kw-fn "loglin"))

(def lowess
 ^{:name-r "lowess",
  :doc "",
  :argslists ({:x nil, :y nil, :f {}, :iter 3, :delta {}})}
 (r-interop.core/->clj-pos-kw-fn "lowess"))

(def ls-diag
 ^{:name-r "ls.diag", :doc "", :argslists ({:ls.out nil})}
 (r-interop.core/->clj-pos-kw-fn "ls.diag"))

(def ls-print
 ^{:name-r "ls.print",
  :doc "",
  :argslists ({:ls.out nil, :digits 4, :print.it true})}
 (r-interop.core/->clj-pos-kw-fn "ls.print"))

(def lsfit
 ^{:name-r "lsfit",
  :doc "",
  :argslists
  ({:x nil,
    :y nil,
    :wt nil,
    :intercept true,
    :tolerance 1.0E-7,
    :yname nil})}
 (r-interop.core/->clj-pos-kw-fn "lsfit"))

(def mad
 ^{:name-r "mad",
  :doc "",
  :argslists
  ({:x nil,
    :center {},
    :constant 1.4826,
    :na.rm false,
    :low false,
    :high false})}
 (r-interop.core/->clj-pos-kw-fn "mad"))

(def mahalanobis
 ^{:name-r "mahalanobis",
  :doc "",
  :argslists
  ({:x nil, :center nil, :cov nil, :inverted false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "mahalanobis"))

(def make-link
 ^{:name-r "make.link", :doc "", :argslists ({:link nil})}
 (r-interop.core/->clj-pos-kw-fn "make.link"))

(def make-arima
 ^{:name-r "makeARIMA",
  :doc "",
  :argslists
  ({:phi nil,
    :theta nil,
    :Delta nil,
    :kappa 1000000,
    :SSinit {},
    :tol {}})}
 (r-interop.core/->clj-pos-kw-fn "makeARIMA"))

(def makepredictcall
 ^{:name-r "makepredictcall",
  :doc "",
  :argslists ({:var nil, :call nil})}
 (r-interop.core/->clj-pos-kw-fn "makepredictcall"))

(def manova
 ^{:name-r "manova", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "manova"))

(def mantelhaen-test
 ^{:name-r "mantelhaen.test",
  :doc "",
  :argslists
  ({:x nil,
    :y nil,
    :z nil,
    :alternative {},
    :correct true,
    :exact false,
    :conf.level 0.95})}
 (r-interop.core/->clj-pos-kw-fn "mantelhaen.test"))

(def mauchly-test
 ^{:name-r "mauchly.test",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "mauchly.test"))

(def mcnemar-test
 ^{:name-r "mcnemar.test",
  :doc "",
  :argslists ({:x nil, :y nil, :correct true})}
 (r-interop.core/->clj-pos-kw-fn "mcnemar.test"))

(def median
 ^{:name-r "median",
  :doc "",
  :argslists ({:x nil, :na.rm false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "median"))

(def median-default
 ^{:name-r "median.default",
  :doc "",
  :argslists ({:x nil, :na.rm false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "median.default"))

(def medpolish
 ^{:name-r "medpolish",
  :doc "",
  :argslists
  ({:x nil, :eps 0.01, :maxiter 10, :trace.iter true, :na.rm false})}
 (r-interop.core/->clj-pos-kw-fn "medpolish"))

(def model-extract
 ^{:name-r "model.extract",
  :doc "",
  :argslists ({:frame nil, :component nil})}
 (r-interop.core/->clj-pos-kw-fn "model.extract"))

(def model-frame
 ^{:name-r "model.frame",
  :doc "",
  :argslists ({:formula nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "model.frame"))

(def model-frame-default
 ^{:name-r "model.frame.default",
  :doc "",
  :argslists
  ({:formula nil,
    :data nil,
    :subset nil,
    :na.action nil,
    :drop.unused.levels false,
    :xlev nil,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "model.frame.default"))

(def model-matrix
 ^{:name-r "model.matrix",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "model.matrix"))

(def model-matrix-default
 ^{:name-r "model.matrix.default",
  :doc "",
  :argslists
  ({:object nil, :data {}, :contrasts.arg nil, :xlev nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "model.matrix.default"))

(def model-matrix-lm
 ^{:name-r "model.matrix.lm",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "model.matrix.lm"))

(def model-offset
 ^{:name-r "model.offset", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "model.offset"))

(def model-response
 ^{:name-r "model.response",
  :doc "",
  :argslists ({:data nil, :type "any"})}
 (r-interop.core/->clj-pos-kw-fn "model.response"))

(def model-tables
 ^{:name-r "model.tables", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "model.tables"))

(def model-weights
 ^{:name-r "model.weights", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "model.weights"))

(def monthplot
 ^{:name-r "monthplot", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "monthplot"))

(def mood-test
 ^{:name-r "mood.test", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "mood.test"))

(def mvfft
 ^{:name-r "mvfft", :doc "", :argslists ({:z nil, :inverse false})}
 (r-interop.core/->clj-pos-kw-fn "mvfft"))

(def na-action
 ^{:name-r "na.action", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "na.action"))

(def na-contiguous
 ^{:name-r "na.contiguous",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "na.contiguous"))

(def na-exclude
 ^{:name-r "na.exclude", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "na.exclude"))

(def na-fail
 ^{:name-r "na.fail", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "na.fail"))

(def na-omit
 ^{:name-r "na.omit", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "na.omit"))

(def na-pass
 ^{:name-r "na.pass", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "na.pass"))

(def napredict
 ^{:name-r "napredict",
  :doc "",
  :argslists ({:omit nil, :x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "napredict"))

(def naprint
 ^{:name-r "naprint", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "naprint"))

(def naresid
 ^{:name-r "naresid",
  :doc "",
  :argslists ({:omit nil, :x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "naresid"))

(def nextn
 ^{:name-r "nextn", :doc "", :argslists ({:n nil, :factors {}})}
 (r-interop.core/->clj-pos-kw-fn "nextn"))

(def nlm
 ^{:name-r "nlm",
  :doc "",
  :argslists
  ({:stepmax {},
    :steptol 1.0E-6,
    :check.analyticals true,
    :gradtol 1.0E-6,
    :typsize {},
    :ndigit 12,
    :hessian false,
    :... nil,
    :f nil,
    :fscale 1,
    :iterlim 100,
    :p nil,
    :print.level 0})}
 (r-interop.core/->clj-pos-kw-fn "nlm"))

(def nlminb
 ^{:name-r "nlminb",
  :doc "",
  :argslists
  ({:upper ##Inf,
    :scale 1,
    :start nil,
    :hessian nil,
    :... nil,
    :control {},
    :lower {},
    :gradient nil,
    :objective nil})}
 (r-interop.core/->clj-pos-kw-fn "nlminb"))

(def nls
 ^{:name-r "nls",
  :doc "",
  :argslists
  ({:upper ##Inf,
    :algorithm {},
    :subset nil,
    :trace false,
    :na.action nil,
    :start nil,
    :weights nil,
    :... nil,
    :control {},
    :lower {},
    :formula nil,
    :data {},
    :model false})}
 (r-interop.core/->clj-pos-kw-fn "nls"))

(def nls-control
 ^{:name-r "nls.control",
  :doc "",
  :argslists
  ({:maxiter 50,
    :tol 1.0E-5,
    :minFactor {},
    :printEval false,
    :warnOnly false})}
 (r-interop.core/->clj-pos-kw-fn "nls.control"))

(def nobs
 ^{:name-r "nobs", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "nobs"))

(def numeric-deriv
 ^{:name-r "numericDeriv",
  :doc "",
  :argslists ({:expr nil, :theta nil, :rho {}, :dir 1})}
 (r-interop.core/->clj-pos-kw-fn "numericDeriv"))

(def offset
 ^{:name-r "offset", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "offset"))

(def oneway-test
 ^{:name-r "oneway.test",
  :doc "",
  :argslists
  ({:formula nil,
    :data nil,
    :subset nil,
    :na.action nil,
    :var.equal false})}
 (r-interop.core/->clj-pos-kw-fn "oneway.test"))

(def optim
 ^{:name-r "optim",
  :doc "",
  :argslists
  ({:upper ##Inf,
    :fn nil,
    :par nil,
    :method {},
    :hessian false,
    :gr nil,
    :... nil,
    :control {},
    :lower {}})}
 (r-interop.core/->clj-pos-kw-fn "optim"))

(def optim-hess
 ^{:name-r "optimHess",
  :doc "",
  :argslists ({:par nil, :fn nil, :gr nil, :... nil, :control {}})}
 (r-interop.core/->clj-pos-kw-fn "optimHess"))

(def optimise
 ^{:name-r "optimise",
  :doc "",
  :argslists
  ({:f nil,
    :interval nil,
    :... nil,
    :lower {},
    :upper {},
    :maximum false,
    :tol {}})}
 (r-interop.core/->clj-pos-kw-fn "optimise"))

(def optimize
 ^{:name-r "optimize",
  :doc "",
  :argslists
  ({:f nil,
    :interval nil,
    :... nil,
    :lower {},
    :upper {},
    :maximum false,
    :tol {}})}
 (r-interop.core/->clj-pos-kw-fn "optimize"))

(def order-dendrogram
 ^{:name-r "order.dendrogram", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "order.dendrogram"))

(def p-adjust
 ^{:name-r "p.adjust",
  :doc "",
  :argslists ({:p nil, :method nil, :n {}})}
 (r-interop.core/->clj-pos-kw-fn "p.adjust"))

(def pacf
 ^{:name-r "pacf",
  :doc "",
  :argslists
  ({:x nil, :lag.max nil, :plot nil, :na.action nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "pacf"))

(def pairwise-prop-test
 ^{:name-r "pairwise.prop.test",
  :doc "",
  :argslists ({:x nil, :n nil, :p.adjust.method nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "pairwise.prop.test"))

(def pairwise-t-test
 ^{:name-r "pairwise.t.test",
  :doc "",
  :argslists
  ({:x nil,
    :g nil,
    :p.adjust.method nil,
    :pool.sd {},
    :paired false,
    :alternative {},
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "pairwise.t.test"))

(def pairwise-table
 ^{:name-r "pairwise.table",
  :doc "",
  :argslists
  ({:compare.levels nil, :level.names nil, :p.adjust.method nil})}
 (r-interop.core/->clj-pos-kw-fn "pairwise.table"))

(def pairwise-wilcox-test
 ^{:name-r "pairwise.wilcox.test",
  :doc "",
  :argslists
  ({:x nil, :g nil, :p.adjust.method nil, :paired false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "pairwise.wilcox.test"))

(def pbeta
 ^{:name-r "pbeta",
  :doc "",
  :argslists
  ({:q nil,
    :shape1 nil,
    :shape2 nil,
    :ncp 0,
    :lower.tail true,
    :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "pbeta"))

(def pbinom
 ^{:name-r "pbinom",
  :doc "",
  :argslists
  ({:q nil, :size nil, :prob nil, :lower.tail true, :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "pbinom"))

(def pbirthday
 ^{:name-r "pbirthday",
  :doc "",
  :argslists ({:n nil, :classes 365, :coincident 2})}
 (r-interop.core/->clj-pos-kw-fn "pbirthday"))

(def pcauchy
 ^{:name-r "pcauchy",
  :doc "",
  :argslists
  ({:q nil, :location 0, :scale 1, :lower.tail true, :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "pcauchy"))

(def pchisq
 ^{:name-r "pchisq",
  :doc "",
  :argslists
  ({:q nil, :df nil, :ncp 0, :lower.tail true, :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "pchisq"))

(def pexp
 ^{:name-r "pexp",
  :doc "",
  :argslists ({:q nil, :rate 1, :lower.tail true, :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "pexp"))

(def pf
 ^{:name-r "pf",
  :doc "",
  :argslists
  ({:q nil,
    :df1 nil,
    :df2 nil,
    :ncp nil,
    :lower.tail true,
    :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "pf"))

(def pgamma
 ^{:name-r "pgamma",
  :doc "",
  :argslists
  ({:q nil,
    :shape nil,
    :rate 1,
    :scale {},
    :lower.tail true,
    :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "pgamma"))

(def pgeom
 ^{:name-r "pgeom",
  :doc "",
  :argslists ({:q nil, :prob nil, :lower.tail true, :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "pgeom"))

(def phyper
 ^{:name-r "phyper",
  :doc "",
  :argslists
  ({:q nil, :m nil, :n nil, :k nil, :lower.tail true, :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "phyper"))

(def plclust
 ^{:name-r "plclust",
  :doc "",
  :argslists
  ({:labels nil,
    :tree nil,
    :ylab "Height",
    :unit false,
    :ann true,
    :sub nil,
    :axes true,
    :hmin 0,
    :level false,
    :xlab nil,
    :hang 0.1,
    :square true,
    :main "",
    :plot. true,
    :frame.plot false})}
 (r-interop.core/->clj-pos-kw-fn "plclust"))

(def plnorm
 ^{:name-r "plnorm",
  :doc "",
  :argslists
  ({:q nil, :meanlog 0, :sdlog 1, :lower.tail true, :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "plnorm"))

(def plogis
 ^{:name-r "plogis",
  :doc "",
  :argslists
  ({:q nil, :location 0, :scale 1, :lower.tail true, :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "plogis"))

(def plot-ecdf
 ^{:name-r "plot.ecdf",
  :doc "",
  :argslists
  ({:x nil,
    :... nil,
    :ylab "Fn(x)",
    :verticals false,
    :col.01line "gray70",
    :pch 19})}
 (r-interop.core/->clj-pos-kw-fn "plot.ecdf"))

(def plot-spec-coherency
 ^{:name-r "plot.spec.coherency",
  :doc "",
  :argslists
  ({:ylim {},
    :ci.col "blue",
    :ylab "squared coherency",
    :ci 0.95,
    :type "l",
    :ci.lty 3,
    :xlab "frequency",
    :... nil,
    :x nil,
    :main nil})}
 (r-interop.core/->clj-pos-kw-fn "plot.spec.coherency"))

(def plot-spec-phase
 ^{:name-r "plot.spec.phase",
  :doc "",
  :argslists
  ({:ylim {},
    :ci.col "blue",
    :ylab "phase",
    :ci 0.95,
    :type "l",
    :ci.lty 3,
    :xlab "frequency",
    :... nil,
    :x nil,
    :main nil})}
 (r-interop.core/->clj-pos-kw-fn "plot.spec.phase"))

(def plot-stepfun
 ^{:name-r "plot.stepfun",
  :doc "",
  :argslists
  ({:col.points nil,
    :ylim {},
    :ylab "f(x)",
    :lty {},
    :col.vert nil,
    :cex.points {},
    :verticals true,
    :xlim nil,
    :xlab "x",
    :col.hor nil,
    :... nil,
    :col {},
    :pch {},
    :x nil,
    :xval nil,
    :add false,
    :main nil,
    :lwd {},
    :do.points {}})}
 (r-interop.core/->clj-pos-kw-fn "plot.stepfun"))

(def plot-ts
 ^{:name-r "plot.ts",
  :doc "",
  :argslists
  ({:y nil,
    :xy.labels nil,
    :mar.multi {},
    :oma.multi {},
    :axes true,
    :nc nil,
    :plot.type {},
    :panel nil,
    :xy.lines nil,
    :... nil,
    :yax.flip false,
    :x nil})}
 (r-interop.core/->clj-pos-kw-fn "plot.ts"))

(def pnbinom
 ^{:name-r "pnbinom",
  :doc "",
  :argslists
  ({:q nil,
    :size nil,
    :prob nil,
    :mu nil,
    :lower.tail true,
    :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "pnbinom"))

(def pnorm
 ^{:name-r "pnorm",
  :doc "",
  :argslists
  ({:q nil, :mean 0, :sd 1, :lower.tail true, :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "pnorm"))

(def poisson
 ^{:name-r "poisson", :doc "", :argslists ({:link "log"})}
 (r-interop.core/->clj-pos-kw-fn "poisson"))

(def poisson-test
 ^{:name-r "poisson.test",
  :doc "",
  :argslists ({:x nil, :T 1, :r 1, :alternative {}, :conf.level 0.95})}
 (r-interop.core/->clj-pos-kw-fn "poisson.test"))

(def poly
 ^{:name-r "poly",
  :doc "",
  :argslists
  ({:x nil,
    :... nil,
    :degree 1,
    :coefs nil,
    :raw false,
    :simple false})}
 (r-interop.core/->clj-pos-kw-fn "poly"))

(def polym
 ^{:name-r "polym",
  :doc "",
  :argslists ({:... nil, :degree 1, :coefs nil, :raw false})}
 (r-interop.core/->clj-pos-kw-fn "polym"))

(def power
 ^{:name-r "power", :doc "", :argslists ({:lambda 1})}
 (r-interop.core/->clj-pos-kw-fn "power"))

(def power-anova-test
 ^{:name-r "power.anova.test",
  :doc "",
  :argslists
  ({:groups nil,
    :n nil,
    :between.var nil,
    :within.var nil,
    :sig.level 0.05,
    :power nil})}
 (r-interop.core/->clj-pos-kw-fn "power.anova.test"))

(def power-prop-test
 ^{:name-r "power.prop.test",
  :doc "",
  :argslists
  ({:n nil,
    :p1 nil,
    :p2 nil,
    :sig.level 0.05,
    :power nil,
    :alternative {},
    :strict false,
    :tol {}})}
 (r-interop.core/->clj-pos-kw-fn "power.prop.test"))

(def power-t-test
 ^{:name-r "power.t.test",
  :doc "",
  :argslists
  ({:strict false,
    :tol {},
    :alternative {},
    :n nil,
    :type {},
    :power nil,
    :sig.level 0.05,
    :delta nil,
    :sd 1})}
 (r-interop.core/->clj-pos-kw-fn "power.t.test"))

(def pp-test
 ^{:name-r "PP.test", :doc "", :argslists ({:x nil, :lshort true})}
 (r-interop.core/->clj-pos-kw-fn "PP.test"))

(def ppoints
 ^{:name-r "ppoints", :doc "", :argslists ({:n nil, :a {}})}
 (r-interop.core/->clj-pos-kw-fn "ppoints"))

(def ppois
 ^{:name-r "ppois",
  :doc "",
  :argslists ({:q nil, :lambda nil, :lower.tail true, :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "ppois"))

(def ppr
 ^{:name-r "ppr", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "ppr"))

(def prcomp
 ^{:name-r "prcomp", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "prcomp"))

(def predict
 ^{:name-r "predict", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "predict"))

(def predict-glm
 ^{:name-r "predict.glm",
  :doc "",
  :argslists
  ({:object nil,
    :newdata nil,
    :type {},
    :se.fit false,
    :dispersion nil,
    :terms nil,
    :na.action nil,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "predict.glm"))

(def predict-lm
 ^{:name-r "predict.lm",
  :doc "",
  :argslists
  ({:terms nil,
    :scale nil,
    :na.action nil,
    :weights 1,
    :df ##Inf,
    :type {},
    :level 0.95,
    :newdata nil,
    :... nil,
    :interval {},
    :se.fit false,
    :object nil,
    :pred.var {}})}
 (r-interop.core/->clj-pos-kw-fn "predict.lm"))

(def preplot
 ^{:name-r "preplot", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "preplot"))

(def princomp
 ^{:name-r "princomp", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "princomp"))

(def print-coefmat
 ^{:name-r "printCoefmat",
  :doc "",
  :argslists
  ({:signif.stars {},
    :signif.legend nil,
    :digits {},
    :P.values nil,
    :zap.ind {},
    :quote false,
    :... nil,
    :has.Pvalue {},
    :right true,
    :cs.ind {},
    :dig.tst {},
    :x nil,
    :tst.ind {},
    :eps.Pvalue {},
    :na.print "NA"})}
 (r-interop.core/->clj-pos-kw-fn "printCoefmat"))

(def profile
 ^{:name-r "profile", :doc "", :argslists ({:fitted nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "profile"))

(def proj
 ^{:name-r "proj", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "proj"))

(def promax
 ^{:name-r "promax", :doc "", :argslists ({:x nil, :m 4})}
 (r-interop.core/->clj-pos-kw-fn "promax"))

(def prop-test
 ^{:name-r "prop.test",
  :doc "",
  :argslists
  ({:x nil,
    :n nil,
    :p nil,
    :alternative {},
    :conf.level 0.95,
    :correct true})}
 (r-interop.core/->clj-pos-kw-fn "prop.test"))

(def prop-trend-test
 ^{:name-r "prop.trend.test",
  :doc "",
  :argslists ({:x nil, :n nil, :score {}})}
 (r-interop.core/->clj-pos-kw-fn "prop.trend.test"))

(def psignrank
 ^{:name-r "psignrank",
  :doc "",
  :argslists ({:q nil, :n nil, :lower.tail true, :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "psignrank"))

(def pt
 ^{:name-r "pt",
  :doc "",
  :argslists
  ({:q nil, :df nil, :ncp nil, :lower.tail true, :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "pt"))

(def ptukey
 ^{:name-r "ptukey",
  :doc "",
  :argslists
  ({:q nil,
    :nmeans nil,
    :df nil,
    :nranges 1,
    :lower.tail true,
    :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "ptukey"))

(def punif
 ^{:name-r "punif",
  :doc "",
  :argslists
  ({:q nil, :min 0, :max 1, :lower.tail true, :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "punif"))

(def pweibull
 ^{:name-r "pweibull",
  :doc "",
  :argslists
  ({:q nil, :shape nil, :scale 1, :lower.tail true, :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "pweibull"))

(def pwilcox
 ^{:name-r "pwilcox",
  :doc "",
  :argslists
  ({:q nil, :m nil, :n nil, :lower.tail true, :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "pwilcox"))

(def qbeta
 ^{:name-r "qbeta",
  :doc "",
  :argslists
  ({:p nil,
    :shape1 nil,
    :shape2 nil,
    :ncp 0,
    :lower.tail true,
    :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "qbeta"))

(def qbinom
 ^{:name-r "qbinom",
  :doc "",
  :argslists
  ({:p nil, :size nil, :prob nil, :lower.tail true, :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "qbinom"))

(def qbirthday
 ^{:name-r "qbirthday",
  :doc "",
  :argslists ({:prob 0.5, :classes 365, :coincident 2})}
 (r-interop.core/->clj-pos-kw-fn "qbirthday"))

(def qcauchy
 ^{:name-r "qcauchy",
  :doc "",
  :argslists
  ({:p nil, :location 0, :scale 1, :lower.tail true, :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "qcauchy"))

(def qchisq
 ^{:name-r "qchisq",
  :doc "",
  :argslists
  ({:p nil, :df nil, :ncp 0, :lower.tail true, :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "qchisq"))

(def qexp
 ^{:name-r "qexp",
  :doc "",
  :argslists ({:p nil, :rate 1, :lower.tail true, :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "qexp"))

(def qf
 ^{:name-r "qf",
  :doc "",
  :argslists
  ({:p nil,
    :df1 nil,
    :df2 nil,
    :ncp nil,
    :lower.tail true,
    :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "qf"))

(def qgamma
 ^{:name-r "qgamma",
  :doc "",
  :argslists
  ({:p nil,
    :shape nil,
    :rate 1,
    :scale {},
    :lower.tail true,
    :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "qgamma"))

(def qgeom
 ^{:name-r "qgeom",
  :doc "",
  :argslists ({:p nil, :prob nil, :lower.tail true, :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "qgeom"))

(def qhyper
 ^{:name-r "qhyper",
  :doc "",
  :argslists
  ({:p nil, :m nil, :n nil, :k nil, :lower.tail true, :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "qhyper"))

(def qlnorm
 ^{:name-r "qlnorm",
  :doc "",
  :argslists
  ({:p nil, :meanlog 0, :sdlog 1, :lower.tail true, :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "qlnorm"))

(def qlogis
 ^{:name-r "qlogis",
  :doc "",
  :argslists
  ({:p nil, :location 0, :scale 1, :lower.tail true, :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "qlogis"))

(def qnbinom
 ^{:name-r "qnbinom",
  :doc "",
  :argslists
  ({:p nil,
    :size nil,
    :prob nil,
    :mu nil,
    :lower.tail true,
    :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "qnbinom"))

(def qnorm
 ^{:name-r "qnorm",
  :doc "",
  :argslists
  ({:p nil, :mean 0, :sd 1, :lower.tail true, :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "qnorm"))

(def qpois
 ^{:name-r "qpois",
  :doc "",
  :argslists ({:p nil, :lambda nil, :lower.tail true, :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "qpois"))

(def qqline
 ^{:name-r "qqline",
  :doc "",
  :argslists
  ({:y nil,
    :datax false,
    :distribution nil,
    :probs {},
    :qtype 7,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "qqline"))

(def qqnorm
 ^{:name-r "qqnorm", :doc "", :argslists ({:y nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "qqnorm"))

(def qqplot
 ^{:name-r "qqplot",
  :doc "",
  :argslists
  ({:x nil, :y nil, :plot.it true, :xlab {}, :ylab {}, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "qqplot"))

(def qsignrank
 ^{:name-r "qsignrank",
  :doc "",
  :argslists ({:p nil, :n nil, :lower.tail true, :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "qsignrank"))

(def qt
 ^{:name-r "qt",
  :doc "",
  :argslists
  ({:p nil, :df nil, :ncp nil, :lower.tail true, :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "qt"))

(def qtukey
 ^{:name-r "qtukey",
  :doc "",
  :argslists
  ({:p nil,
    :nmeans nil,
    :df nil,
    :nranges 1,
    :lower.tail true,
    :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "qtukey"))

(def quade-test
 ^{:name-r "quade.test", :doc "", :argslists ({:y nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "quade.test"))

(def quantile
 ^{:name-r "quantile", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "quantile"))

(def quasi
 ^{:name-r "quasi",
  :doc "",
  :argslists ({:link "identity", :variance "constant"})}
 (r-interop.core/->clj-pos-kw-fn "quasi"))

(def quasibinomial
 ^{:name-r "quasibinomial", :doc "", :argslists ({:link "logit"})}
 (r-interop.core/->clj-pos-kw-fn "quasibinomial"))

(def quasipoisson
 ^{:name-r "quasipoisson", :doc "", :argslists ({:link "log"})}
 (r-interop.core/->clj-pos-kw-fn "quasipoisson"))

(def qunif
 ^{:name-r "qunif",
  :doc "",
  :argslists
  ({:p nil, :min 0, :max 1, :lower.tail true, :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "qunif"))

(def qweibull
 ^{:name-r "qweibull",
  :doc "",
  :argslists
  ({:p nil, :shape nil, :scale 1, :lower.tail true, :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "qweibull"))

(def qwilcox
 ^{:name-r "qwilcox",
  :doc "",
  :argslists
  ({:p nil, :m nil, :n nil, :lower.tail true, :log.p false})}
 (r-interop.core/->clj-pos-kw-fn "qwilcox"))

(def rbeta
 ^{:name-r "rbeta",
  :doc "",
  :argslists ({:n nil, :shape1 nil, :shape2 nil, :ncp 0})}
 (r-interop.core/->clj-pos-kw-fn "rbeta"))

(def rbinom
 ^{:name-r "rbinom",
  :doc "",
  :argslists ({:n nil, :size nil, :prob nil})}
 (r-interop.core/->clj-pos-kw-fn "rbinom"))

(def rcauchy
 ^{:name-r "rcauchy",
  :doc "",
  :argslists ({:n nil, :location 0, :scale 1})}
 (r-interop.core/->clj-pos-kw-fn "rcauchy"))

(def rchisq
 ^{:name-r "rchisq", :doc "", :argslists ({:n nil, :df nil, :ncp 0})}
 (r-interop.core/->clj-pos-kw-fn "rchisq"))

(def read-ftable
 ^{:name-r "read.ftable",
  :doc "",
  :argslists
  ({:file nil,
    :sep "",
    :quote "\"",
    :row.var.names nil,
    :col.vars nil,
    :skip 0})}
 (r-interop.core/->clj-pos-kw-fn "read.ftable"))

(def rect-hclust
 ^{:name-r "rect.hclust",
  :doc "",
  :argslists
  ({:tree nil,
    :k nil,
    :which nil,
    :x nil,
    :h nil,
    :border 2,
    :cluster nil})}
 (r-interop.core/->clj-pos-kw-fn "rect.hclust"))

(def reformulate
 ^{:name-r "reformulate",
  :doc "",
  :argslists ({:termlabels nil, :response nil, :intercept true})}
 (r-interop.core/->clj-pos-kw-fn "reformulate"))

(def relevel
 ^{:name-r "relevel",
  :doc "",
  :argslists ({:x nil, :ref nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "relevel"))

(def reorder
 ^{:name-r "reorder", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "reorder"))

(def replications
 ^{:name-r "replications",
  :doc "",
  :argslists ({:formula nil, :data nil, :na.action nil})}
 (r-interop.core/->clj-pos-kw-fn "replications"))

(def reshape
 ^{:name-r "reshape",
  :doc "",
  :argslists
  ({:idvar "id",
    :sep ".",
    :times {},
    :drop nil,
    :ids {},
    :new.row.names nil,
    :split {},
    :varying nil,
    :v.names nil,
    :timevar "time",
    :direction nil,
    :data nil})}
 (r-interop.core/->clj-pos-kw-fn "reshape"))

(def resid
 ^{:name-r "resid", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "resid"))

(def residuals
 ^{:name-r "residuals", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "residuals"))

(def residuals-glm
 ^{:name-r "residuals.glm",
  :doc "",
  :argslists ({:object nil, :type {}, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "residuals.glm"))

(def residuals-lm
 ^{:name-r "residuals.lm",
  :doc "",
  :argslists ({:object nil, :type {}, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "residuals.lm"))

(def rexp
 ^{:name-r "rexp", :doc "", :argslists ({:n nil, :rate 1})}
 (r-interop.core/->clj-pos-kw-fn "rexp"))

(def rf
 ^{:name-r "rf",
  :doc "",
  :argslists ({:n nil, :df1 nil, :df2 nil, :ncp nil})}
 (r-interop.core/->clj-pos-kw-fn "rf"))

(def rgamma
 ^{:name-r "rgamma",
  :doc "",
  :argslists ({:n nil, :shape nil, :rate 1, :scale {}})}
 (r-interop.core/->clj-pos-kw-fn "rgamma"))

(def rgeom
 ^{:name-r "rgeom", :doc "", :argslists ({:n nil, :prob nil})}
 (r-interop.core/->clj-pos-kw-fn "rgeom"))

(def rhyper
 ^{:name-r "rhyper",
  :doc "",
  :argslists ({:nn nil, :m nil, :n nil, :k nil})}
 (r-interop.core/->clj-pos-kw-fn "rhyper"))

(def rlnorm
 ^{:name-r "rlnorm",
  :doc "",
  :argslists ({:n nil, :meanlog 0, :sdlog 1})}
 (r-interop.core/->clj-pos-kw-fn "rlnorm"))

(def rlogis
 ^{:name-r "rlogis",
  :doc "",
  :argslists ({:n nil, :location 0, :scale 1})}
 (r-interop.core/->clj-pos-kw-fn "rlogis"))

(def rmultinom
 ^{:name-r "rmultinom",
  :doc "",
  :argslists ({:n nil, :size nil, :prob nil})}
 (r-interop.core/->clj-pos-kw-fn "rmultinom"))

(def rnbinom
 ^{:name-r "rnbinom",
  :doc "",
  :argslists ({:n nil, :size nil, :prob nil, :mu nil})}
 (r-interop.core/->clj-pos-kw-fn "rnbinom"))

(def rnorm
 ^{:name-r "rnorm", :doc "", :argslists ({:n nil, :mean 0, :sd 1})}
 (r-interop.core/->clj-pos-kw-fn "rnorm"))

(def rpois
 ^{:name-r "rpois", :doc "", :argslists ({:n nil, :lambda nil})}
 (r-interop.core/->clj-pos-kw-fn "rpois"))

(def rsignrank
 ^{:name-r "rsignrank", :doc "", :argslists ({:nn nil, :n nil})}
 (r-interop.core/->clj-pos-kw-fn "rsignrank"))

(def rstandard
 ^{:name-r "rstandard", :doc "", :argslists ({:model nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "rstandard"))

(def rstudent
 ^{:name-r "rstudent", :doc "", :argslists ({:model nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "rstudent"))

(def rt
 ^{:name-r "rt", :doc "", :argslists ({:n nil, :df nil, :ncp nil})}
 (r-interop.core/->clj-pos-kw-fn "rt"))

(def runif
 ^{:name-r "runif", :doc "", :argslists ({:n nil, :min 0, :max 1})}
 (r-interop.core/->clj-pos-kw-fn "runif"))

(def runmed
 ^{:name-r "runmed",
  :doc "",
  :argslists
  ({:x nil, :k nil, :endrule {}, :algorithm nil, :print.level 0})}
 (r-interop.core/->clj-pos-kw-fn "runmed"))

(def rweibull
 ^{:name-r "rweibull",
  :doc "",
  :argslists ({:n nil, :shape nil, :scale 1})}
 (r-interop.core/->clj-pos-kw-fn "rweibull"))

(def rwilcox
 ^{:name-r "rwilcox", :doc "", :argslists ({:nn nil, :m nil, :n nil})}
 (r-interop.core/->clj-pos-kw-fn "rwilcox"))

(def r-wishart
 ^{:name-r "rWishart",
  :doc "",
  :argslists ({:n nil, :df nil, :Sigma nil})}
 (r-interop.core/->clj-pos-kw-fn "rWishart"))

(def scatter-smooth
 ^{:name-r "scatter.smooth",
  :doc "",
  :argslists
  ({:y nil,
    :ylim {:empty-key nil, :na.rm true},
    :lpars {},
    :family {},
    :ylab nil,
    :evaluation 50,
    :xlab nil,
    :... nil,
    :degree 1,
    :x nil,
    :span {}})}
 (r-interop.core/->clj-pos-kw-fn "scatter.smooth"))

(def screeplot
 ^{:name-r "screeplot", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "screeplot"))

(def sd
 ^{:name-r "sd", :doc "", :argslists ({:x nil, :na.rm false})}
 (r-interop.core/->clj-pos-kw-fn "sd"))

(def se-contrast
 ^{:name-r "se.contrast", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "se.contrast"))

(def self-start
 ^{:name-r "selfStart",
  :doc "",
  :argslists
  ({:model nil, :initial nil, :parameters nil, :template nil})}
 (r-interop.core/->clj-pos-kw-fn "selfStart"))

(def set-names
 ^{:name-r "setNames", :doc "", :argslists ({:object nil, :nm nil})}
 (r-interop.core/->clj-pos-kw-fn "setNames"))

(def shapiro-test
 ^{:name-r "shapiro.test", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "shapiro.test"))

(def sigma
 ^{:name-r "sigma", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "sigma"))

(def simulate
 ^{:name-r "simulate",
  :doc "",
  :argslists ({:object nil, :nsim 1, :seed nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "simulate"))

(def smooth
 ^{:name-r "smooth",
  :doc "",
  :argslists
  ({:x nil, :kind {}, :twiceit false, :endrule {}, :do.ends false})}
 (r-interop.core/->clj-pos-kw-fn "smooth"))

(def smooth-spline
 ^{:name-r "smooth.spline",
  :doc "",
  :argslists
  ({:y nil,
    :penalty 1,
    :nknots nil,
    :tol {},
    :keep.data true,
    :cv false,
    :lambda nil,
    :w nil,
    :df nil,
    :control.spar {},
    :spar nil,
    :x nil,
    :df.offset 0,
    :keep.stuff false,
    :all.knots false})}
 (r-interop.core/->clj-pos-kw-fn "smooth.spline"))

(def smooth-ends
 ^{:name-r "smoothEnds", :doc "", :argslists ({:y nil, :k 3})}
 (r-interop.core/->clj-pos-kw-fn "smoothEnds"))

(def sorted-xy-data
 ^{:name-r "sortedXyData",
  :doc "",
  :argslists ({:x nil, :y nil, :data nil})}
 (r-interop.core/->clj-pos-kw-fn "sortedXyData"))

(def spec-ar
 ^{:name-r "spec.ar",
  :doc "",
  :argslists
  ({:x nil,
    :n.freq nil,
    :order nil,
    :plot true,
    :na.action nil,
    :method "yule-walker",
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "spec.ar"))

(def spec-pgram
 ^{:name-r "spec.pgram",
  :doc "",
  :argslists
  ({:plot true,
    :fast true,
    :demean false,
    :spans nil,
    :na.action nil,
    :pad 0,
    :... nil,
    :taper 0.1,
    :detrend true,
    :kernel nil,
    :x nil})}
 (r-interop.core/->clj-pos-kw-fn "spec.pgram"))

(def spec-taper
 ^{:name-r "spec.taper", :doc "", :argslists ({:x nil, :p 0.1})}
 (r-interop.core/->clj-pos-kw-fn "spec.taper"))

(def spectrum
 ^{:name-r "spectrum",
  :doc "",
  :argslists ({:x nil, :... nil, :method {}})}
 (r-interop.core/->clj-pos-kw-fn "spectrum"))

(def spline
 ^{:name-r "spline",
  :doc "",
  :argslists
  ({:x nil,
    :y nil,
    :n {},
    :method "fmm",
    :xmin {},
    :xmax {},
    :xout nil,
    :ties nil})}
 (r-interop.core/->clj-pos-kw-fn "spline"))

(def splinefun
 ^{:name-r "splinefun",
  :doc "",
  :argslists ({:x nil, :y nil, :method {}, :ties nil})}
 (r-interop.core/->clj-pos-kw-fn "splinefun"))

(def splinefun-h
 ^{:name-r "splinefunH", :doc "", :argslists ({:x nil, :y nil, :m nil})}
 (r-interop.core/->clj-pos-kw-fn "splinefunH"))

(def ssd
 ^{:name-r "SSD", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "SSD"))

(def start
 ^{:name-r "start", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "start"))

(def stat-anova
 ^{:name-r "stat.anova",
  :doc "",
  :argslists
  ({:table nil, :test {}, :scale nil, :df.scale nil, :n nil})}
 (r-interop.core/->clj-pos-kw-fn "stat.anova"))

(def step
 ^{:name-r "step",
  :doc "",
  :argslists
  ({:scale 0,
    :trace 1,
    :steps 1000,
    :scope nil,
    :k 2,
    :... nil,
    :object nil,
    :direction {},
    :keep nil})}
 (r-interop.core/->clj-pos-kw-fn "step"))

(def stepfun
 ^{:name-r "stepfun",
  :doc "",
  :argslists ({:x nil, :y nil, :f {}, :ties "ordered", :right false})}
 (r-interop.core/->clj-pos-kw-fn "stepfun"))

(def stl
 ^{:name-r "stl",
  :doc "",
  :argslists
  ({:l.window {},
    :s.jump {},
    :na.action nil,
    :s.window nil,
    :t.window nil,
    :inner {},
    :robust false,
    :t.jump {},
    :l.jump {},
    :x nil,
    :l.degree nil,
    :s.degree 0,
    :outer {},
    :t.degree 1})}
 (r-interop.core/->clj-pos-kw-fn "stl"))

(def struct-ts
 ^{:name-r "StructTS",
  :doc "",
  :argslists
  ({:x nil, :type {}, :init nil, :fixed nil, :optim.control nil})}
 (r-interop.core/->clj-pos-kw-fn "StructTS"))

(def summary-aov
 ^{:name-r "summary.aov",
  :doc "",
  :argslists
  ({:object nil,
    :intercept false,
    :split nil,
    :expand.split true,
    :keep.zero.df true,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "summary.aov"))

(def summary-glm
 ^{:name-r "summary.glm",
  :doc "",
  :argslists
  ({:object nil,
    :dispersion nil,
    :correlation false,
    :symbolic.cor false,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "summary.glm"))

(def summary-lm
 ^{:name-r "summary.lm",
  :doc "",
  :argslists
  ({:object nil, :correlation false, :symbolic.cor false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "summary.lm"))

(def summary-manova
 ^{:name-r "summary.manova",
  :doc "",
  :argslists
  ({:object nil, :test {}, :intercept false, :tol 1.0E-7, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "summary.manova"))

(def summary-stepfun
 ^{:name-r "summary.stepfun",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "summary.stepfun"))

(def supsmu
 ^{:name-r "supsmu",
  :doc "",
  :argslists
  ({:x nil,
    :y nil,
    :wt {},
    :span "cv",
    :periodic false,
    :bass 0,
    :trace false})}
 (r-interop.core/->clj-pos-kw-fn "supsmu"))

(def symnum
 ^{:name-r "symnum",
  :doc "",
  :argslists
  ({:abbr.colnames nil,
    :corr {},
    :lower.triangular {},
    :numeric.x {},
    :legend {},
    :diag.lower.tri {},
    :cutpoints {},
    :na "?",
    :show.max {},
    :show.min nil,
    :x nil,
    :symbols {},
    :eps 1.0E-5})}
 (r-interop.core/->clj-pos-kw-fn "symnum"))

(def t-test
 ^{:name-r "t.test", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "t.test"))

(def termplot
 ^{:name-r "termplot",
  :doc "",
  :argslists
  ({:col.res "gray",
    :ylim "common",
    :plot true,
    :smooth nil,
    :envir {},
    :terms nil,
    :col.se "orange",
    :ylabs nil,
    :col.smth "darkred",
    :partial.resid false,
    :transform.x false,
    :col.term 2,
    :span.smth {},
    :xlabs nil,
    :use.factor.levels true,
    :... nil,
    :cex 1,
    :lty.se 2,
    :se false,
    :pch {},
    :lty.smth 2,
    :lwd.se 1,
    :lwd.term 1.5,
    :main nil,
    :ask {},
    :rug false,
    :data nil,
    :model nil})}
 (r-interop.core/->clj-pos-kw-fn "termplot"))

(def terms
 ^{:name-r "terms", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "terms"))

(def terms-formula
 ^{:name-r "terms.formula",
  :doc "",
  :argslists
  ({:neg.out true,
    :simplify false,
    :abb nil,
    :keep.order false,
    :... nil,
    :specials nil,
    :allowDotAsName false,
    :x nil,
    :data nil})}
 (r-interop.core/->clj-pos-kw-fn "terms.formula"))

(def time
 ^{:name-r "time", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "time"))

(def toeplitz
 ^{:name-r "toeplitz", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "toeplitz"))

(def ts
 ^{:name-r "ts",
  :doc "",
  :argslists
  ({:data [nil],
    :start 1,
    :end {},
    :frequency 1,
    :deltat 1,
    :ts.eps {},
    :class {},
    :names {}})}
 (r-interop.core/->clj-pos-kw-fn "ts"))

(def ts-intersect
 ^{:name-r "ts.intersect",
  :doc "",
  :argslists ({:... nil, :dframe false})}
 (r-interop.core/->clj-pos-kw-fn "ts.intersect"))

(def ts-plot
 ^{:name-r "ts.plot", :doc "", :argslists ({:... nil, :gpars {}})}
 (r-interop.core/->clj-pos-kw-fn "ts.plot"))

(def ts-union
 ^{:name-r "ts.union", :doc "", :argslists ({:... nil, :dframe false})}
 (r-interop.core/->clj-pos-kw-fn "ts.union"))

(def tsdiag
 ^{:name-r "tsdiag",
  :doc "",
  :argslists ({:object nil, :gof.lag nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "tsdiag"))

(def tsp
 ^{:name-r "tsp", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "tsp"))

(def ts-smooth
 ^{:name-r "tsSmooth", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "tsSmooth"))

(def tukey-hsd
 ^{:name-r "TukeyHSD",
  :doc "",
  :argslists
  ({:x nil, :which nil, :ordered false, :conf.level 0.95, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "TukeyHSD"))

(def uniroot
 ^{:name-r "uniroot",
  :doc "",
  :argslists
  ({:upper {},
    :extendInt {},
    :tol {},
    :trace 0,
    :f.upper {},
    :... nil,
    :lower {},
    :maxiter 1000,
    :check.conv false,
    :f nil,
    :f.lower {},
    :interval nil})}
 (r-interop.core/->clj-pos-kw-fn "uniroot"))

(def update
 ^{:name-r "update", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "update"))

(def update-default
 ^{:name-r "update.default",
  :doc "",
  :argslists ({:object nil, :formula. nil, :... nil, :evaluate true})}
 (r-interop.core/->clj-pos-kw-fn "update.default"))

(def update-formula
 ^{:name-r "update.formula",
  :doc "",
  :argslists ({:old nil, :new nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "update.formula"))

(def var
 ^{:name-r "var",
  :doc "",
  :argslists ({:x nil, :y nil, :na.rm false, :use nil})}
 (r-interop.core/->clj-pos-kw-fn "var"))

(def var-test
 ^{:name-r "var.test", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "var.test"))

(def variable-names
 ^{:name-r "variable.names",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "variable.names"))

(def varimax
 ^{:name-r "varimax",
  :doc "",
  :argslists ({:x nil, :normalize true, :eps 1.0E-5})}
 (r-interop.core/->clj-pos-kw-fn "varimax"))

(def vcov
 ^{:name-r "vcov", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "vcov"))

(def weighted-mean
 ^{:name-r "weighted.mean",
  :doc "",
  :argslists ({:x nil, :w nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "weighted.mean"))

(def weighted-residuals
 ^{:name-r "weighted.residuals",
  :doc "",
  :argslists ({:obj nil, :drop0 true})}
 (r-interop.core/->clj-pos-kw-fn "weighted.residuals"))

(def weights
 ^{:name-r "weights", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "weights"))

(def wilcox-test
 ^{:name-r "wilcox.test", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "wilcox.test"))

(def window
 ^{:name-r "window", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "window"))

(def write-ftable
 ^{:name-r "write.ftable",
  :doc "",
  :argslists
  ({:x nil,
    :file "",
    :quote true,
    :append false,
    :digits {},
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "write.ftable"))

(def xtabs
 ^{:name-r "xtabs",
  :doc "",
  :argslists
  ({:formula {},
    :data {},
    :subset nil,
    :sparse false,
    :na.action nil,
    :addNA false,
    :exclude {},
    :drop.unused.levels false})}
 (r-interop.core/->clj-pos-kw-fn "xtabs"))
