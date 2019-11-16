(ns r-interop.packages.nlme
 (:require [r-interop.core :refer (defn-r eval-r)]))

(eval-r "library(nlme)")(defn-r lde-sys-mat LDEsysMat)

(def acf
 ^{:name-r "ACF",
  :doc "",
  :argslists ({:object nil, :maxLag nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "ACF"))

(def all-coef
 ^{:name-r "allCoef", :doc "", :argslists ({:... nil, :extract nil})}
 (r-interop.core/->clj-pos-kw-fn "allCoef"))

(def anova-lme
 ^{:name-r "anova.lme",
  :doc "",
  :argslists
  ({:object nil,
    :... nil,
    :test true,
    :type {},
    :adjustSigma true,
    :Terms nil,
    :L nil,
    :verbose false})}
 (r-interop.core/->clj-pos-kw-fn "anova.lme"))

(def as-one-formula
 ^{:name-r "asOneFormula", :doc "", :argslists ({:... nil, :omit {}})}
 (r-interop.core/->clj-pos-kw-fn "asOneFormula"))

(def as-table
 ^{:name-r "asTable", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "asTable"))

(def aug-pred
 ^{:name-r "augPred",
  :doc "",
  :argslists
  ({:object nil,
    :primary nil,
    :minimum {},
    :maximum {},
    :length.out 51,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "augPred"))

(def balanced-grouped
 ^{:name-r "balancedGrouped",
  :doc "",
  :argslists ({:form nil, :data nil, :labels nil, :units nil})}
 (r-interop.core/->clj-pos-kw-fn "balancedGrouped"))

(def collapse
 ^{:name-r "collapse", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "collapse"))

(def compare-fits
 ^{:name-r "compareFits",
  :doc "",
  :argslists ({:object1 nil, :object2 nil, :which {}})}
 (r-interop.core/->clj-pos-kw-fn "compareFits"))

(def compare-pred
 ^{:name-r "comparePred",
  :doc "",
  :argslists
  ({:object1 nil,
    :object2 nil,
    :primary nil,
    :minimum {},
    :maximum {},
    :length.out 51,
    :level nil,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "comparePred"))

(def cor-ar-1
 ^{:name-r "corAR1",
  :doc "",
  :argslists ({:value 0, :form {}, :fixed false})}
 (r-interop.core/->clj-pos-kw-fn "corAR1"))

(def cor-arma
 ^{:name-r "corARMA",
  :doc "",
  :argslists ({:value {}, :form {}, :p 0, :q 0, :fixed false})}
 (r-interop.core/->clj-pos-kw-fn "corARMA"))

(def cor-car-1
 ^{:name-r "corCAR1",
  :doc "",
  :argslists ({:value 0.2, :form {}, :fixed false})}
 (r-interop.core/->clj-pos-kw-fn "corCAR1"))

(def cor-comp-symm
 ^{:name-r "corCompSymm",
  :doc "",
  :argslists ({:value 0, :form {}, :fixed false})}
 (r-interop.core/->clj-pos-kw-fn "corCompSymm"))

(def cor-exp
 ^{:name-r "corExp",
  :doc "",
  :argslists
  ({:value {}, :form {}, :nugget false, :metric {}, :fixed false})}
 (r-interop.core/->clj-pos-kw-fn "corExp"))

(def cor-factor
 ^{:name-r "corFactor", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "corFactor"))

(def cor-gaus
 ^{:name-r "corGaus",
  :doc "",
  :argslists
  ({:value {}, :form {}, :nugget false, :metric {}, :fixed false})}
 (r-interop.core/->clj-pos-kw-fn "corGaus"))

(def cor-ident
 ^{:name-r "corIdent", :doc "", :argslists ({:form nil})}
 (r-interop.core/->clj-pos-kw-fn "corIdent"))

(def cor-lin
 ^{:name-r "corLin",
  :doc "",
  :argslists
  ({:value {}, :form {}, :nugget false, :metric {}, :fixed false})}
 (r-interop.core/->clj-pos-kw-fn "corLin"))

(def cor-matrix
 ^{:name-r "corMatrix", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "corMatrix"))

(def cor-natural
 ^{:name-r "corNatural",
  :doc "",
  :argslists ({:value {}, :form {}, :fixed false})}
 (r-interop.core/->clj-pos-kw-fn "corNatural"))

(def cor-ratio
 ^{:name-r "corRatio",
  :doc "",
  :argslists
  ({:value {}, :form {}, :nugget false, :metric {}, :fixed false})}
 (r-interop.core/->clj-pos-kw-fn "corRatio"))

(def cor-spatial
 ^{:name-r "corSpatial",
  :doc "",
  :argslists
  ({:value {},
    :form {},
    :nugget false,
    :type {},
    :metric {},
    :fixed false})}
 (r-interop.core/->clj-pos-kw-fn "corSpatial"))

(def cor-spher
 ^{:name-r "corSpher",
  :doc "",
  :argslists
  ({:value {}, :form {}, :nugget false, :metric {}, :fixed false})}
 (r-interop.core/->clj-pos-kw-fn "corSpher"))

(def cor-symm
 ^{:name-r "corSymm",
  :doc "",
  :argslists ({:value {}, :form {}, :fixed false})}
 (r-interop.core/->clj-pos-kw-fn "corSymm"))

(def dim
 ^{:name-r "Dim", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "Dim"))

(def fd-hess
 ^{:name-r "fdHess",
  :doc "",
  :argslists
  ({:pars nil, :fun nil, :... nil, :.relStep {}, :minAbsPar 0})}
 (r-interop.core/->clj-pos-kw-fn "fdHess"))

(def fixed-effects
 ^{:name-r "fixed.effects",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "fixed.effects"))

(def fixef
 ^{:name-r "fixef", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "fixef"))

(def gapply
 ^{:name-r "gapply",
  :doc "",
  :argslists
  ({:object nil,
    :which nil,
    :FUN nil,
    :form {},
    :level nil,
    :groups {},
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "gapply"))

(def get-covariate
 ^{:name-r "getCovariate",
  :doc "",
  :argslists ({:object nil, :form {}, :data nil})}
 (r-interop.core/->clj-pos-kw-fn "getCovariate"))

(def get-covariate-formula
 ^{:name-r "getCovariateFormula", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "getCovariateFormula"))

(def get-data
 ^{:name-r "getData", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "getData"))

(def get-groups
 ^{:name-r "getGroups",
  :doc "",
  :argslists
  ({:object nil, :form {}, :level nil, :data nil, :sep "/"})}
 (r-interop.core/->clj-pos-kw-fn "getGroups"))

(def get-groups-formula
 ^{:name-r "getGroupsFormula",
  :doc "",
  :argslists ({:object nil, :asList false, :sep "/"})}
 (r-interop.core/->clj-pos-kw-fn "getGroupsFormula"))

(def get-response
 ^{:name-r "getResponse", :doc "", :argslists ({:object nil, :form {}})}
 (r-interop.core/->clj-pos-kw-fn "getResponse"))

(def get-response-formula
 ^{:name-r "getResponseFormula", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "getResponseFormula"))

(def get-var-cov
 ^{:name-r "getVarCov", :doc "", :argslists ({:obj nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "getVarCov"))

(def gls
 ^{:name-r "gls",
  :doc "",
  :argslists
  ({:subset nil,
    :method {},
    :correlation nil,
    :na.action nil,
    :weights nil,
    :verbose false,
    :control {},
    :data {},
    :model nil})}
 (r-interop.core/->clj-pos-kw-fn "gls"))

(def gls-ap-var
 ^{:name-r "glsApVar",
  :doc "",
  :argslists
  ({:glsSt nil,
    :sigma nil,
    :conLin {},
    :.relStep {},
    :minAbsPar 0,
    :natural true})}
 (r-interop.core/->clj-pos-kw-fn "glsApVar"))

(def gls-control
 ^{:name-r "glsControl",
  :doc "",
  :argslists
  ({:singular.ok false,
    :apVar true,
    :maxIter 50,
    :sigma nil,
    :msTol 1.0E-7,
    :tolerance 1.0E-6,
    :natural true,
    :returnObject false,
    :msMaxIter 200,
    :minAbsParApVar 0.05,
    :msVerbose false,
    :optimMethod "BFGS",
    :.relStep {},
    :opt {}})}
 (r-interop.core/->clj-pos-kw-fn "glsControl"))

(def gls-estimate
 ^{:name-r "glsEstimate",
  :doc "",
  :argslists
  ({:object nil,
    :conLin {},
    :control {:empty-key nil, :singular.ok false}})}
 (r-interop.core/->clj-pos-kw-fn "glsEstimate"))

(def gls-struct
 ^{:name-r "glsStruct",
  :doc "",
  :argslists ({:corStruct nil, :varStruct nil})}
 (r-interop.core/->clj-pos-kw-fn "glsStruct"))

(def gnls
 ^{:name-r "gnls",
  :doc "",
  :argslists
  ({:naPattern nil,
    :subset nil,
    :correlation nil,
    :na.action nil,
    :start nil,
    :weights nil,
    :params nil,
    :verbose false,
    :control {},
    :data {},
    :model nil})}
 (r-interop.core/->clj-pos-kw-fn "gnls"))

(def gnls-control
 ^{:name-r "gnlsControl",
  :doc "",
  :argslists
  ({:nlsTol 0.001,
    :apVar true,
    :maxIter 50,
    :sigma nil,
    :msTol 1.0E-7,
    :tolerance 1.0E-6,
    :minScale 0.001,
    :returnObject false,
    :msMaxIter 50,
    :nlsMaxIter 7,
    :minAbsParApVar 0.05,
    :msVerbose false,
    :optimMethod "BFGS",
    :.relStep {},
    :opt {}})}
 (r-interop.core/->clj-pos-kw-fn "gnlsControl"))

(def gnls-struct
 ^{:name-r "gnlsStruct",
  :doc "",
  :argslists ({:corStruct nil, :varStruct nil})}
 (r-interop.core/->clj-pos-kw-fn "gnlsStruct"))

(def grouped-data
 ^{:name-r "groupedData",
  :doc "",
  :argslists
  ({:formula nil,
    :data {},
    :order.groups true,
    :FUN {},
    :outer nil,
    :inner nil,
    :labels nil,
    :units nil})}
 (r-interop.core/->clj-pos-kw-fn "groupedData"))

(def gsummary
 ^{:name-r "gsummary",
  :doc "",
  :argslists
  ({:object nil,
    :FUN {},
    :omitGroupingFactor false,
    :form {},
    :level nil,
    :groups {},
    :invariantsOnly false,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "gsummary"))

(def initialize
 ^{:name-r "Initialize",
  :doc "",
  :argslists ({:object nil, :data nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "Initialize"))

(def intervals
 ^{:name-r "intervals",
  :doc "",
  :argslists ({:object nil, :level 0.95, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "intervals"))

(def is-balanced
 ^{:name-r "isBalanced",
  :doc "",
  :argslists ({:object nil, :countOnly false, :level nil})}
 (r-interop.core/->clj-pos-kw-fn "isBalanced"))

(def is-initialized
 ^{:name-r "isInitialized", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "isInitialized"))

(def lme
 ^{:name-r "lme",
  :doc "",
  :argslists
  ({:keep.data true,
    :subset nil,
    :method {},
    :correlation nil,
    :contrasts nil,
    :na.action nil,
    :weights nil,
    :control {},
    :random nil,
    :fixed nil,
    :data {}})}
 (r-interop.core/->clj-pos-kw-fn "lme"))

(def lme-formula
 ^{:name-r "lme.formula",
  :doc "",
  :argslists
  ({:keep.data true,
    :subset nil,
    :method {},
    :correlation nil,
    :contrasts nil,
    :na.action nil,
    :weights nil,
    :control {},
    :random {},
    :fixed nil,
    :data {}})}
 (r-interop.core/->clj-pos-kw-fn "lme.formula"))

(def lme-lm-list
 ^{:name-r "lme.lmList",
  :doc "",
  :argslists
  ({:keep.data true,
    :subset nil,
    :method {},
    :correlation nil,
    :contrasts nil,
    :na.action nil,
    :weights nil,
    :control {},
    :random nil,
    :fixed nil,
    :data {}})}
 (r-interop.core/->clj-pos-kw-fn "lme.lmList"))

(def lme-control
 ^{:name-r "lmeControl",
  :doc "",
  :argslists
  ({:msMaxEval 200,
    :niterEM 25,
    :apVar true,
    :maxIter 50,
    :sigma nil,
    :msTol 1.0E-7,
    :tolerance 1.0E-6,
    :natural true,
    :returnObject false,
    :msMaxIter 50,
    :... nil,
    :minAbsParApVar 0.05,
    :msVerbose false,
    :optimMethod "BFGS",
    :.relStep {},
    :opt {},
    :gradHess true})}
 (r-interop.core/->clj-pos-kw-fn "lmeControl"))

(def lme-struct
 ^{:name-r "lmeStruct",
  :doc "",
  :argslists ({:reStruct nil, :corStruct nil, :varStruct nil})}
 (r-interop.core/->clj-pos-kw-fn "lmeStruct"))

(def lm-list
 ^{:name-r "lmList",
  :doc "",
  :argslists
  ({:object nil,
    :data nil,
    :level nil,
    :subset nil,
    :na.action nil,
    :pool true,
    :warn.lm true})}
 (r-interop.core/->clj-pos-kw-fn "lmList"))

(def lm-list-formula
 ^{:name-r "lmList.formula",
  :doc "",
  :argslists
  ({:object nil,
    :data nil,
    :level nil,
    :subset nil,
    :na.action nil,
    :pool true,
    :warn.lm true})}
 (r-interop.core/->clj-pos-kw-fn "lmList.formula"))

(def log-det
 ^{:name-r "logDet", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "logDet"))

(def names
 ^{:name-r "Names", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "Names"))

(def need-update
 ^{:name-r "needUpdate", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "needUpdate"))

(def nf-grouped-data
 ^{:name-r "nfGroupedData",
  :doc "",
  :argslists
  ({:formula nil,
    :data {},
    :order.groups true,
    :FUN {},
    :outer nil,
    :inner nil,
    :labels nil,
    :units nil})}
 (r-interop.core/->clj-pos-kw-fn "nfGroupedData"))

(def nlme
 ^{:name-r "nlme",
  :doc "",
  :argslists
  ({:naPattern nil,
    :subset nil,
    :method {},
    :correlation nil,
    :na.action nil,
    :start nil,
    :weights nil,
    :verbose false,
    :control {},
    :random nil,
    :groups nil,
    :fixed nil,
    :data {},
    :model nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme"))

(def nlme-formula
 ^{:name-r "nlme.formula",
  :doc "",
  :argslists
  ({:naPattern nil,
    :subset nil,
    :method {},
    :correlation nil,
    :na.action nil,
    :start nil,
    :weights nil,
    :verbose false,
    :control {},
    :random nil,
    :groups nil,
    :fixed nil,
    :data {},
    :model nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme.formula"))

(def nlme-nls-list
 ^{:name-r "nlme.nlsList",
  :doc "",
  :argslists
  ({:naPattern nil,
    :subset nil,
    :method {},
    :correlation nil,
    :na.action nil,
    :start nil,
    :weights nil,
    :verbose false,
    :control {},
    :random nil,
    :groups nil,
    :fixed nil,
    :data {},
    :model nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme.nlsList"))

(def nlme-control
 ^{:name-r "nlmeControl",
  :doc "",
  :argslists
  ({:niterEM 25,
    :apVar true,
    :maxIter 50,
    :sigma nil,
    :msTol 1.0E-6,
    :tolerance 1.0E-5,
    :natural true,
    :minScale 0.001,
    :returnObject false,
    :pnlsMaxIter 7,
    :msMaxIter 50,
    :... nil,
    :minAbsParApVar 0.05,
    :msWarnNoConv true,
    :pnlsTol 0.001,
    :msVerbose false,
    :.relStep {},
    :opt {},
    :gradHess true})}
 (r-interop.core/->clj-pos-kw-fn "nlmeControl"))

(def nlme-struct
 ^{:name-r "nlmeStruct",
  :doc "",
  :argslists ({:reStruct nil, :corStruct nil, :varStruct nil})}
 (r-interop.core/->clj-pos-kw-fn "nlmeStruct"))

(def nls-list
 ^{:name-r "nlsList",
  :doc "",
  :argslists
  ({:pool true,
    :subset nil,
    :na.action nil,
    :start nil,
    :warn.nls [nil],
    :level nil,
    :control nil,
    :data nil,
    :model nil})}
 (r-interop.core/->clj-pos-kw-fn "nlsList"))

(def nls-list-formula
 ^{:name-r "nlsList.formula",
  :doc "",
  :argslists
  ({:pool true,
    :subset nil,
    :na.action nil,
    :start nil,
    :warn.nls [nil],
    :level nil,
    :control nil,
    :data nil,
    :model nil})}
 (r-interop.core/->clj-pos-kw-fn "nlsList.formula"))

(def nm-grouped-data
 ^{:name-r "nmGroupedData",
  :doc "",
  :argslists
  ({:formula nil,
    :data {},
    :order.groups true,
    :FUN {},
    :outer nil,
    :inner nil,
    :labels nil,
    :units nil})}
 (r-interop.core/->clj-pos-kw-fn "nmGroupedData"))

(def pd-blocked
 ^{:name-r "pdBlocked",
  :doc "",
  :argslists
  ({:value {}, :form nil, :nam nil, :data {}, :pdClass "pdSymm"})}
 (r-interop.core/->clj-pos-kw-fn "pdBlocked"))

(def pd-comp-symm
 ^{:name-r "pdCompSymm",
  :doc "",
  :argslists ({:value {}, :form nil, :nam nil, :data {}})}
 (r-interop.core/->clj-pos-kw-fn "pdCompSymm"))

(def pd-construct
 ^{:name-r "pdConstruct",
  :doc "",
  :argslists
  ({:object nil,
    :value nil,
    :form nil,
    :nam nil,
    :data nil,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "pdConstruct"))

(def pd-diag
 ^{:name-r "pdDiag",
  :doc "",
  :argslists ({:value {}, :form nil, :nam nil, :data {}})}
 (r-interop.core/->clj-pos-kw-fn "pdDiag"))

(def pd-factor
 ^{:name-r "pdFactor", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "pdFactor"))

(def pd-ident
 ^{:name-r "pdIdent",
  :doc "",
  :argslists ({:value {}, :form nil, :nam nil, :data {}})}
 (r-interop.core/->clj-pos-kw-fn "pdIdent"))

(def pd-log-chol
 ^{:name-r "pdLogChol",
  :doc "",
  :argslists ({:value {}, :form nil, :nam nil, :data {}})}
 (r-interop.core/->clj-pos-kw-fn "pdLogChol"))

(def pd-mat
 ^{:name-r "pdMat",
  :doc "",
  :argslists
  ({:value {}, :form nil, :nam nil, :data {}, :pdClass "pdSymm"})}
 (r-interop.core/->clj-pos-kw-fn "pdMat"))

(def pd-matrix
 ^{:name-r "pdMatrix",
  :doc "",
  :argslists ({:object nil, :factor false})}
 (r-interop.core/->clj-pos-kw-fn "pdMatrix"))

(def pd-natural
 ^{:name-r "pdNatural",
  :doc "",
  :argslists ({:value {}, :form nil, :nam nil, :data {}})}
 (r-interop.core/->clj-pos-kw-fn "pdNatural"))

(def pd-symm
 ^{:name-r "pdSymm",
  :doc "",
  :argslists ({:value {}, :form nil, :nam nil, :data {}})}
 (r-interop.core/->clj-pos-kw-fn "pdSymm"))

(def pheno-model
 ^{:name-r "phenoModel",
  :doc "",
  :argslists ({:Subject nil, :time nil, :dose nil, :lCl nil, :lV nil})}
 (r-interop.core/->clj-pos-kw-fn "phenoModel"))

(def plot-lme
 ^{:name-r "plot.lme",
  :doc "",
  :argslists
  ({:x nil,
    :form {},
    :abline nil,
    :id nil,
    :idLabels nil,
    :idResType {},
    :grid nil,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "plot.lme"))

(def pooled-sd
 ^{:name-r "pooledSD", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "pooledSD"))

(def quin-model
 ^{:name-r "quinModel",
  :doc "",
  :argslists
  ({:Subject nil,
    :time nil,
    :conc nil,
    :dose nil,
    :interval nil,
    :lV nil,
    :lKa nil,
    :lCl nil})}
 (r-interop.core/->clj-pos-kw-fn "quinModel"))

(def random-effects
 ^{:name-r "random.effects",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "random.effects"))

(def ranef
 ^{:name-r "ranef", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "ranef"))

(def recalc
 ^{:name-r "recalc",
  :doc "",
  :argslists ({:object nil, :conLin nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "recalc"))

(def re-struct
 ^{:name-r "reStruct",
  :doc "",
  :argslists
  ({:object nil, :pdClass "pdLogChol", :REML false, :data {}})}
 (r-interop.core/->clj-pos-kw-fn "reStruct"))

(def simulate-lme
 ^{:name-r "simulate.lme",
  :doc "",
  :argslists
  ({:object nil,
    :nsim 1,
    :seed {},
    :m2 nil,
    :method {},
    :niterEM {},
    :useGen nil,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "simulate.lme"))

(def split-formula
 ^{:name-r "splitFormula", :doc "", :argslists ({:form nil, :sep "/"})}
 (r-interop.core/->clj-pos-kw-fn "splitFormula"))

(def var-comb
 ^{:name-r "varComb", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "varComb"))

(def var-const-power
 ^{:name-r "varConstPower",
  :doc "",
  :argslists ({:const {}, :power {}, :form {}, :fixed nil})}
 (r-interop.core/->clj-pos-kw-fn "varConstPower"))

(def var-corr
 ^{:name-r "VarCorr",
  :doc "",
  :argslists ({:x nil, :sigma 1, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "VarCorr"))

(def var-exp
 ^{:name-r "varExp",
  :doc "",
  :argslists ({:value {}, :form {}, :fixed nil})}
 (r-interop.core/->clj-pos-kw-fn "varExp"))

(def var-fixed
 ^{:name-r "varFixed", :doc "", :argslists ({:value {}})}
 (r-interop.core/->clj-pos-kw-fn "varFixed"))

(def var-func
 ^{:name-r "varFunc", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "varFunc"))

(def var-ident
 ^{:name-r "varIdent",
  :doc "",
  :argslists ({:value {}, :form {}, :fixed nil})}
 (r-interop.core/->clj-pos-kw-fn "varIdent"))

(def variogram
 ^{:name-r "Variogram",
  :doc "",
  :argslists ({:object nil, :distance nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "Variogram"))

(def var-power
 ^{:name-r "varPower",
  :doc "",
  :argslists ({:value {}, :form {}, :fixed nil})}
 (r-interop.core/->clj-pos-kw-fn "varPower"))

(def var-weights
 ^{:name-r "varWeights", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "varWeights"))
