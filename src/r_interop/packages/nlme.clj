(ns r-interop.packages.nlme
 (:require [r-interop.core :refer (defn-r eval-r)]))

(eval-r "library(nlme)")(defn-r lde-sys-mat LDEsysMat)

(def acf
 ^{:name-r "ACF",
  :doc "",
  :argslists ({:object nil, :maxLag nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "ACF"))

(def all-coef
 ^{:name-r "allCoef", :doc "", :argslists ({:... nil, :extract nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "allCoef"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "anova.lme"))

(def as-one-formula
 ^{:name-r "asOneFormula", :doc "", :argslists ({:... nil, :omit {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "asOneFormula"))

(def as-table
 ^{:name-r "asTable", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "asTable"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "augPred"))

(def balanced-grouped
 ^{:name-r "balancedGrouped",
  :doc "",
  :argslists ({:form nil, :data nil, :labels nil, :units nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "balancedGrouped"))

(def collapse
 ^{:name-r "collapse", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "collapse"))

(def compare-fits
 ^{:name-r "compareFits",
  :doc "",
  :argslists ({:object1 nil, :object2 nil, :which {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "compareFits"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "comparePred"))

(def cor-ar-1
 ^{:name-r "corAR1",
  :doc "",
  :argslists ({:value 0, :form {}, :fixed false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "corAR1"))

(def cor-arma
 ^{:name-r "corARMA",
  :doc "",
  :argslists ({:value {}, :form {}, :p 0, :q 0, :fixed false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "corARMA"))

(def cor-car-1
 ^{:name-r "corCAR1",
  :doc "",
  :argslists ({:value 0.2, :form {}, :fixed false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "corCAR1"))

(def cor-comp-symm
 ^{:name-r "corCompSymm",
  :doc "",
  :argslists ({:value 0, :form {}, :fixed false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "corCompSymm"))

(def cor-exp
 ^{:name-r "corExp",
  :doc "",
  :argslists
  ({:value {}, :form {}, :nugget false, :metric {}, :fixed false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "corExp"))

(def cor-factor
 ^{:name-r "corFactor", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "corFactor"))

(def cor-gaus
 ^{:name-r "corGaus",
  :doc "",
  :argslists
  ({:value {}, :form {}, :nugget false, :metric {}, :fixed false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "corGaus"))

(def cor-ident
 ^{:name-r "corIdent", :doc "", :argslists ({:form nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "corIdent"))

(def cor-lin
 ^{:name-r "corLin",
  :doc "",
  :argslists
  ({:value {}, :form {}, :nugget false, :metric {}, :fixed false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "corLin"))

(def cor-matrix
 ^{:name-r "corMatrix", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "corMatrix"))

(def cor-natural
 ^{:name-r "corNatural",
  :doc "",
  :argslists ({:value {}, :form {}, :fixed false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "corNatural"))

(def cor-ratio
 ^{:name-r "corRatio",
  :doc "",
  :argslists
  ({:value {}, :form {}, :nugget false, :metric {}, :fixed false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "corRatio"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "corSpatial"))

(def cor-spher
 ^{:name-r "corSpher",
  :doc "",
  :argslists
  ({:value {}, :form {}, :nugget false, :metric {}, :fixed false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "corSpher"))

(def cor-symm
 ^{:name-r "corSymm",
  :doc "",
  :argslists ({:value {}, :form {}, :fixed false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "corSymm"))

(def dim
 ^{:name-r "Dim", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Dim"))

(def fd-hess
 ^{:name-r "fdHess",
  :doc "",
  :argslists
  ({:pars nil, :fun nil, :... nil, :.relStep {}, :minAbsPar 0})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "fdHess"))

(def fixed-effects
 ^{:name-r "fixed.effects",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "fixed.effects"))

(def fixef
 ^{:name-r "fixef", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "fixef"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "gapply"))

(def get-covariate
 ^{:name-r "getCovariate",
  :doc "",
  :argslists ({:object nil, :form {}, :data nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "getCovariate"))

(def get-covariate-formula
 ^{:name-r "getCovariateFormula", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "getCovariateFormula"))

(def get-data
 ^{:name-r "getData", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "getData"))

(def get-groups
 ^{:name-r "getGroups",
  :doc "",
  :argslists
  ({:object nil, :form {}, :level nil, :data nil, :sep "/"})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "getGroups"))

(def get-groups-formula
 ^{:name-r "getGroupsFormula",
  :doc "",
  :argslists ({:object nil, :asList false, :sep "/"})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "getGroupsFormula"))

(def get-response
 ^{:name-r "getResponse", :doc "", :argslists ({:object nil, :form {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "getResponse"))

(def get-response-formula
 ^{:name-r "getResponseFormula", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "getResponseFormula"))

(def get-var-cov
 ^{:name-r "getVarCov", :doc "", :argslists ({:obj nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "getVarCov"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "gls"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "glsApVar"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "glsControl"))

(def gls-estimate
 ^{:name-r "glsEstimate",
  :doc "",
  :argslists
  ({:object nil,
    :conLin {},
    :control {:empty-key nil, :singular.ok false}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "glsEstimate"))

(def gls-struct
 ^{:name-r "glsStruct",
  :doc "",
  :argslists ({:corStruct nil, :varStruct nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "glsStruct"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "gnls"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "gnlsControl"))

(def gnls-struct
 ^{:name-r "gnlsStruct",
  :doc "",
  :argslists ({:corStruct nil, :varStruct nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "gnlsStruct"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "groupedData"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "gsummary"))

(def initialize
 ^{:name-r "Initialize",
  :doc "",
  :argslists ({:object nil, :data nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Initialize"))

(def intervals
 ^{:name-r "intervals",
  :doc "",
  :argslists ({:object nil, :level 0.95, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "intervals"))

(def is-balanced
 ^{:name-r "isBalanced",
  :doc "",
  :argslists ({:object nil, :countOnly false, :level nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "isBalanced"))

(def is-initialized
 ^{:name-r "isInitialized", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "isInitialized"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "lme"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "lme.formula"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "lme.lmList"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "lmeControl"))

(def lme-struct
 ^{:name-r "lmeStruct",
  :doc "",
  :argslists ({:reStruct nil, :corStruct nil, :varStruct nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "lmeStruct"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "lmList"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "lmList.formula"))

(def log-det
 ^{:name-r "logDet", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "logDet"))

(def names
 ^{:name-r "Names", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Names"))

(def need-update
 ^{:name-r "needUpdate", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "needUpdate"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "nfGroupedData"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "nlme"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "nlme.formula"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "nlme.nlsList"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "nlmeControl"))

(def nlme-struct
 ^{:name-r "nlmeStruct",
  :doc "",
  :argslists ({:reStruct nil, :corStruct nil, :varStruct nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "nlmeStruct"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "nlsList"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "nlsList.formula"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "nmGroupedData"))

(def pd-blocked
 ^{:name-r "pdBlocked",
  :doc "",
  :argslists
  ({:value {}, :form nil, :nam nil, :data {}, :pdClass "pdSymm"})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "pdBlocked"))

(def pd-comp-symm
 ^{:name-r "pdCompSymm",
  :doc "",
  :argslists ({:value {}, :form nil, :nam nil, :data {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "pdCompSymm"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "pdConstruct"))

(def pd-diag
 ^{:name-r "pdDiag",
  :doc "",
  :argslists ({:value {}, :form nil, :nam nil, :data {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "pdDiag"))

(def pd-factor
 ^{:name-r "pdFactor", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "pdFactor"))

(def pd-ident
 ^{:name-r "pdIdent",
  :doc "",
  :argslists ({:value {}, :form nil, :nam nil, :data {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "pdIdent"))

(def pd-log-chol
 ^{:name-r "pdLogChol",
  :doc "",
  :argslists ({:value {}, :form nil, :nam nil, :data {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "pdLogChol"))

(def pd-mat
 ^{:name-r "pdMat",
  :doc "",
  :argslists
  ({:value {}, :form nil, :nam nil, :data {}, :pdClass "pdSymm"})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "pdMat"))

(def pd-matrix
 ^{:name-r "pdMatrix",
  :doc "",
  :argslists ({:object nil, :factor false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "pdMatrix"))

(def pd-natural
 ^{:name-r "pdNatural",
  :doc "",
  :argslists ({:value {}, :form nil, :nam nil, :data {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "pdNatural"))

(def pd-symm
 ^{:name-r "pdSymm",
  :doc "",
  :argslists ({:value {}, :form nil, :nam nil, :data {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "pdSymm"))

(def pheno-model
 ^{:name-r "phenoModel",
  :doc "",
  :argslists ({:Subject nil, :time nil, :dose nil, :lCl nil, :lV nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "phenoModel"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "plot.lme"))

(def pooled-sd
 ^{:name-r "pooledSD", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "pooledSD"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "quinModel"))

(def random-effects
 ^{:name-r "random.effects",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "random.effects"))

(def ranef
 ^{:name-r "ranef", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "ranef"))

(def recalc
 ^{:name-r "recalc",
  :doc "",
  :argslists ({:object nil, :conLin nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "recalc"))

(def re-struct
 ^{:name-r "reStruct",
  :doc "",
  :argslists
  ({:object nil, :pdClass "pdLogChol", :REML false, :data {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "reStruct"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "simulate.lme"))

(def split-formula
 ^{:name-r "splitFormula", :doc "", :argslists ({:form nil, :sep "/"})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "splitFormula"))

(def var-comb
 ^{:name-r "varComb", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "varComb"))

(def var-const-power
 ^{:name-r "varConstPower",
  :doc "",
  :argslists ({:const {}, :power {}, :form {}, :fixed nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "varConstPower"))

(def var-corr
 ^{:name-r "VarCorr",
  :doc "",
  :argslists ({:x nil, :sigma 1, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "VarCorr"))

(def var-exp
 ^{:name-r "varExp",
  :doc "",
  :argslists ({:value {}, :form {}, :fixed nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "varExp"))

(def var-fixed
 ^{:name-r "varFixed", :doc "", :argslists ({:value {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "varFixed"))

(def var-func
 ^{:name-r "varFunc", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "varFunc"))

(def var-ident
 ^{:name-r "varIdent",
  :doc "",
  :argslists ({:value {}, :form {}, :fixed nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "varIdent"))

(def variogram
 ^{:name-r "Variogram",
  :doc "",
  :argslists ({:object nil, :distance nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Variogram"))

(def var-power
 ^{:name-r "varPower",
  :doc "",
  :argslists ({:value {}, :form {}, :fixed nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "varPower"))

(def var-weights
 ^{:name-r "varWeights", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "varWeights"))
