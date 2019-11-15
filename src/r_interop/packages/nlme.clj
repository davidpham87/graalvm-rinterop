(ns r-interop.packages.nlme
 (:require [r-interop.core :refer (defn-r)]))

(defn-r lde-sys-mat LDEsysMat)

(def acf
 ^{:name-r "ACF",
  :doc "",
  :argslists ({:object nil, :maxLag nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::ACF"))

(def all-coef
 ^{:name-r "allCoef", :doc "", :argslists ({:... nil, :extract nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::allCoef"))

(def anova-lme
 ^{:name-r "anova.lme",
  :doc "",
  :argslists
  ({:object nil,
    :... nil,
    :test true,
    :type [nil "sequential" "marginal"],
    :adjustSigma true,
    :Terms nil,
    :L nil,
    :verbose false})}
 (r-interop.core/->clj-pos-kw-fn "nlme::anova.lme"))

(def as-one-formula
 ^{:name-r "asOneFormula",
  :doc "",
  :argslists ({:... nil, :omit [nil "." "pi"]})}
 (r-interop.core/->clj-pos-kw-fn "nlme::asOneFormula"))

(def as-table
 ^{:name-r "asTable", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::asTable"))

(def aug-pred
 ^{:name-r "augPred",
  :doc "",
  :argslists
  ({:object nil,
    :primary nil,
    :minimum [nil nil],
    :maximum [nil nil],
    :length.out 51,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::augPred"))

(def balanced-grouped
 ^{:name-r "balancedGrouped",
  :doc "",
  :argslists ({:form nil, :data nil, :labels nil, :units nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::balancedGrouped"))

(def collapse
 ^{:name-r "collapse", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::collapse"))

(def compare-fits
 ^{:name-r "compareFits",
  :doc "",
  :argslists ({:object1 nil, :object2 nil, :which [nil 1 [nil nil]]})}
 (r-interop.core/->clj-pos-kw-fn "nlme::compareFits"))

(def compare-pred
 ^{:name-r "comparePred",
  :doc "",
  :argslists
  ({:object1 nil,
    :object2 nil,
    :primary nil,
    :minimum [nil nil],
    :maximum [nil nil],
    :length.out 51,
    :level nil,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::comparePred"))

(def cor-ar-1
 ^{:name-r "corAR1",
  :doc "",
  :argslists ({:value 0, :form [nil 1], :fixed false})}
 (r-interop.core/->clj-pos-kw-fn "nlme::corAR1"))

(def cor-arma
 ^{:name-r "corARMA",
  :doc "",
  :argslists
  ({:value [nil [nil nil nil]],
    :form [nil 1],
    :p 0,
    :q 0,
    :fixed false})}
 (r-interop.core/->clj-pos-kw-fn "nlme::corARMA"))

(def cor-car-1
 ^{:name-r "corCAR1",
  :doc "",
  :argslists ({:value 0.2, :form [nil 1], :fixed false})}
 (r-interop.core/->clj-pos-kw-fn "nlme::corCAR1"))

(def cor-comp-symm
 ^{:name-r "corCompSymm",
  :doc "",
  :argslists ({:value 0, :form [nil 1], :fixed false})}
 (r-interop.core/->clj-pos-kw-fn "nlme::corCompSymm"))

(def cor-exp
 ^{:name-r "corExp",
  :doc "",
  :argslists
  ({:value [nil 0],
    :form [nil 1],
    :nugget false,
    :metric [nil "euclidean" "maximum" "manhattan"],
    :fixed false})}
 (r-interop.core/->clj-pos-kw-fn "nlme::corExp"))

(def cor-factor
 ^{:name-r "corFactor", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::corFactor"))

(def cor-gaus
 ^{:name-r "corGaus",
  :doc "",
  :argslists
  ({:value [nil 0],
    :form [nil 1],
    :nugget false,
    :metric [nil "euclidean" "maximum" "manhattan"],
    :fixed false})}
 (r-interop.core/->clj-pos-kw-fn "nlme::corGaus"))

(def cor-ident
 ^{:name-r "corIdent", :doc "", :argslists ({:form nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::corIdent"))

(def cor-lin
 ^{:name-r "corLin",
  :doc "",
  :argslists
  ({:value [nil 0],
    :form [nil 1],
    :nugget false,
    :metric [nil "euclidean" "maximum" "manhattan"],
    :fixed false})}
 (r-interop.core/->clj-pos-kw-fn "nlme::corLin"))

(def cor-matrix
 ^{:name-r "corMatrix", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::corMatrix"))

(def cor-natural
 ^{:name-r "corNatural",
  :doc "",
  :argslists ({:value [nil 0], :form [nil 1], :fixed false})}
 (r-interop.core/->clj-pos-kw-fn "nlme::corNatural"))

(def cor-ratio
 ^{:name-r "corRatio",
  :doc "",
  :argslists
  ({:value [nil 0],
    :form [nil 1],
    :nugget false,
    :metric [nil "euclidean" "maximum" "manhattan"],
    :fixed false})}
 (r-interop.core/->clj-pos-kw-fn "nlme::corRatio"))

(def cor-spatial
 ^{:name-r "corSpatial",
  :doc "",
  :argslists
  ({:value [nil 0],
    :form [nil 1],
    :nugget false,
    :type
    [nil "spherical" "exponential" "gaussian" "linear" "rational"],
    :metric [nil "euclidean" "maximum" "manhattan"],
    :fixed false})}
 (r-interop.core/->clj-pos-kw-fn "nlme::corSpatial"))

(def cor-spher
 ^{:name-r "corSpher",
  :doc "",
  :argslists
  ({:value [nil 0],
    :form [nil 1],
    :nugget false,
    :metric [nil "euclidean" "maximum" "manhattan"],
    :fixed false})}
 (r-interop.core/->clj-pos-kw-fn "nlme::corSpher"))

(def cor-symm
 ^{:name-r "corSymm",
  :doc "",
  :argslists ({:value [nil 0], :form [nil 1], :fixed false})}
 (r-interop.core/->clj-pos-kw-fn "nlme::corSymm"))

(def dim
 ^{:name-r "Dim", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::Dim"))

(def fd-hess
 ^{:name-r "fdHess",
  :doc "",
  :argslists
  ({:pars nil,
    :fun nil,
    :... nil,
    :.relStep [nil [nil nil nil] [nil [nil 1 3]]],
    :minAbsPar 0})}
 (r-interop.core/->clj-pos-kw-fn "nlme::fdHess"))

(def fixed-effects
 ^{:name-r "fixed.effects",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::fixed.effects"))

(def fixef
 ^{:name-r "fixef", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::fixef"))

(def gapply
 ^{:name-r "gapply",
  :doc "",
  :argslists
  ({:object nil,
    :which nil,
    :FUN nil,
    :form [nil nil],
    :level nil,
    :groups [nil nil nil nil],
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::gapply"))

(def get-covariate
 ^{:name-r "getCovariate",
  :doc "",
  :argslists ({:object nil, :form [nil nil], :data nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::getCovariate"))

(def get-covariate-formula
 ^{:name-r "getCovariateFormula", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::getCovariateFormula"))

(def get-data
 ^{:name-r "getData", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::getData"))

(def get-groups
 ^{:name-r "getGroups",
  :doc "",
  :argslists
  ({:object nil, :form [nil nil], :level nil, :data nil, :sep "/"})}
 (r-interop.core/->clj-pos-kw-fn "nlme::getGroups"))

(def get-groups-formula
 ^{:name-r "getGroupsFormula",
  :doc "",
  :argslists ({:object nil, :asList false, :sep "/"})}
 (r-interop.core/->clj-pos-kw-fn "nlme::getGroupsFormula"))

(def get-response
 ^{:name-r "getResponse",
  :doc "",
  :argslists ({:object nil, :form [nil nil]})}
 (r-interop.core/->clj-pos-kw-fn "nlme::getResponse"))

(def get-response-formula
 ^{:name-r "getResponseFormula", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::getResponseFormula"))

(def get-var-cov
 ^{:name-r "getVarCov", :doc "", :argslists ({:obj nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::getVarCov"))

(def gls
 ^{:name-r "gls",
  :doc "",
  :argslists
  ({:subset nil,
    :method [nil "REML" "ML"],
    :correlation nil,
    :na.action nil,
    :weights nil,
    :verbose false,
    :control [nil],
    :data [nil [nil]],
    :model nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::gls"))

(def gls-ap-var
 ^{:name-r "glsApVar",
  :doc "",
  :argslists
  ({:glsSt nil,
    :sigma nil,
    :conLin [nil nil "conLin"],
    :.relStep [nil [nil nil nil] [nil [nil 1 3]]],
    :minAbsPar 0,
    :natural true})}
 (r-interop.core/->clj-pos-kw-fn "nlme::glsApVar"))

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
    :.relStep [nil [nil nil nil] [nil [nil 1 3]]],
    :opt [nil "nlminb" "optim"]})}
 (r-interop.core/->clj-pos-kw-fn "nlme::glsControl"))

(def gls-estimate
 ^{:name-r "glsEstimate",
  :doc "",
  :argslists
  ({:object nil,
    :conLin [nil nil "conLin"],
    :control {:empty-key nil, :singular.ok false}})}
 (r-interop.core/->clj-pos-kw-fn "nlme::glsEstimate"))

(def gls-struct
 ^{:name-r "glsStruct",
  :doc "",
  :argslists ({:corStruct nil, :varStruct nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::glsStruct"))

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
    :control [nil],
    :data [nil [nil]],
    :model nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::gnls"))

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
    :.relStep [nil [nil nil nil] [nil [nil 1 3]]],
    :opt [nil "nlminb" "optim"]})}
 (r-interop.core/->clj-pos-kw-fn "nlme::gnlsControl"))

(def gnls-struct
 ^{:name-r "gnlsStruct",
  :doc "",
  :argslists ({:corStruct nil, :varStruct nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::gnlsStruct"))

(def grouped-data
 ^{:name-r "groupedData",
  :doc "",
  :argslists
  ({:formula nil,
    :data [nil 1],
    :order.groups true,
    :FUN [nil {:x nil} {:empty-key nil, :na.rm true} nil],
    :outer nil,
    :inner nil,
    :labels nil,
    :units nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::groupedData"))

(def gsummary
 ^{:name-r "gsummary",
  :doc "",
  :argslists
  ({:object nil,
    :FUN [nil {:x nil} {:empty-key nil, :na.rm true} nil],
    :omitGroupingFactor false,
    :form [nil nil],
    :level nil,
    :groups [nil nil nil nil],
    :invariantsOnly false,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::gsummary"))

(def initialize
 ^{:name-r "Initialize",
  :doc "",
  :argslists ({:object nil, :data nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::Initialize"))

(def intervals
 ^{:name-r "intervals",
  :doc "",
  :argslists ({:object nil, :level 0.95, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::intervals"))

(def is-balanced
 ^{:name-r "isBalanced",
  :doc "",
  :argslists ({:object nil, :countOnly false, :level nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::isBalanced"))

(def is-initialized
 ^{:name-r "isInitialized", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::isInitialized"))

(def lme
 ^{:name-r "lme",
  :doc "",
  :argslists
  ({:keep.data true,
    :subset nil,
    :method [nil "REML" "ML"],
    :correlation nil,
    :contrasts nil,
    :na.action nil,
    :weights nil,
    :control [nil],
    :random nil,
    :fixed nil,
    :data [nil [nil]]})}
 (r-interop.core/->clj-pos-kw-fn "nlme::lme"))

(def lme-formula
 ^{:name-r "lme.formula",
  :doc "",
  :argslists
  ({:keep.data true,
    :subset nil,
    :method [nil "REML" "ML"],
    :correlation nil,
    :contrasts nil,
    :na.action nil,
    :weights nil,
    :control [nil],
    :random [nil [nil [nil [nil nil [nil 2]]]]],
    :fixed nil,
    :data [nil [nil]]})}
 (r-interop.core/->clj-pos-kw-fn "nlme::lme.formula"))

(def lme-lm-list
 ^{:name-r "lme.lmList",
  :doc "",
  :argslists
  ({:keep.data true,
    :subset nil,
    :method [nil "REML" "ML"],
    :correlation nil,
    :contrasts nil,
    :na.action nil,
    :weights nil,
    :control [nil],
    :random nil,
    :fixed nil,
    :data [nil [nil]]})}
 (r-interop.core/->clj-pos-kw-fn "nlme::lme.lmList"))

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
    :.relStep [nil [nil nil nil] [nil [nil 1 3]]],
    :opt [nil "nlminb" "optim"],
    :gradHess true})}
 (r-interop.core/->clj-pos-kw-fn "nlme::lmeControl"))

(def lme-struct
 ^{:name-r "lmeStruct",
  :doc "",
  :argslists ({:reStruct nil, :corStruct nil, :varStruct nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::lmeStruct"))

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
 (r-interop.core/->clj-pos-kw-fn "nlme::lmList"))

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
 (r-interop.core/->clj-pos-kw-fn "nlme::lmList.formula"))

(def log-det
 ^{:name-r "logDet", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::logDet"))

(def names
 ^{:name-r "Names", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::Names"))

(def need-update
 ^{:name-r "needUpdate", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::needUpdate"))

(def nf-grouped-data
 ^{:name-r "nfGroupedData",
  :doc "",
  :argslists
  ({:formula nil,
    :data [nil 1],
    :order.groups true,
    :FUN [nil {:x nil} {:empty-key nil, :na.rm true} nil],
    :outer nil,
    :inner nil,
    :labels nil,
    :units nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::nfGroupedData"))

(def nlme
 ^{:name-r "nlme",
  :doc "",
  :argslists
  ({:naPattern nil,
    :subset nil,
    :method [nil "ML" "REML"],
    :correlation nil,
    :na.action nil,
    :start nil,
    :weights nil,
    :verbose false,
    :control [nil],
    :random nil,
    :groups nil,
    :fixed nil,
    :data [nil [nil]],
    :model nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::nlme"))

(def nlme-formula
 ^{:name-r "nlme.formula",
  :doc "",
  :argslists
  ({:naPattern nil,
    :subset nil,
    :method [nil "ML" "REML"],
    :correlation nil,
    :na.action nil,
    :start nil,
    :weights nil,
    :verbose false,
    :control [nil],
    :random nil,
    :groups nil,
    :fixed nil,
    :data [nil [nil]],
    :model nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::nlme.formula"))

(def nlme-nls-list
 ^{:name-r "nlme.nlsList",
  :doc "",
  :argslists
  ({:naPattern nil,
    :subset nil,
    :method [nil "ML" "REML"],
    :correlation nil,
    :na.action nil,
    :start nil,
    :weights nil,
    :verbose false,
    :control [nil],
    :random nil,
    :groups nil,
    :fixed nil,
    :data [nil [nil]],
    :model nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::nlme.nlsList"))

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
    :.relStep [nil [nil nil nil] [nil [nil 1 3]]],
    :opt [nil "nlminb" "nlm"],
    :gradHess true})}
 (r-interop.core/->clj-pos-kw-fn "nlme::nlmeControl"))

(def nlme-struct
 ^{:name-r "nlmeStruct",
  :doc "",
  :argslists ({:reStruct nil, :corStruct nil, :varStruct nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::nlmeStruct"))

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
 (r-interop.core/->clj-pos-kw-fn "nlme::nlsList"))

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
 (r-interop.core/->clj-pos-kw-fn "nlme::nlsList.formula"))

(def nm-grouped-data
 ^{:name-r "nmGroupedData",
  :doc "",
  :argslists
  ({:formula nil,
    :data [nil 1],
    :order.groups true,
    :FUN [nil {:x nil} {:empty-key nil, :na.rm true} nil],
    :outer nil,
    :inner nil,
    :labels nil,
    :units nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::nmGroupedData"))

(def pd-blocked
 ^{:name-r "pdBlocked",
  :doc "",
  :argslists
  ({:value [nil 0],
    :form nil,
    :nam nil,
    :data [nil [nil]],
    :pdClass "pdSymm"})}
 (r-interop.core/->clj-pos-kw-fn "nlme::pdBlocked"))

(def pd-comp-symm
 ^{:name-r "pdCompSymm",
  :doc "",
  :argslists
  ({:value [nil 0], :form nil, :nam nil, :data [nil [nil]]})}
 (r-interop.core/->clj-pos-kw-fn "nlme::pdCompSymm"))

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
 (r-interop.core/->clj-pos-kw-fn "nlme::pdConstruct"))

(def pd-diag
 ^{:name-r "pdDiag",
  :doc "",
  :argslists
  ({:value [nil 0], :form nil, :nam nil, :data [nil [nil]]})}
 (r-interop.core/->clj-pos-kw-fn "nlme::pdDiag"))

(def pd-factor
 ^{:name-r "pdFactor", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::pdFactor"))

(def pd-ident
 ^{:name-r "pdIdent",
  :doc "",
  :argslists
  ({:value [nil 0], :form nil, :nam nil, :data [nil [nil]]})}
 (r-interop.core/->clj-pos-kw-fn "nlme::pdIdent"))

(def pd-log-chol
 ^{:name-r "pdLogChol",
  :doc "",
  :argslists ({:value [nil 0], :form nil, :nam nil, :data [nil]})}
 (r-interop.core/->clj-pos-kw-fn "nlme::pdLogChol"))

(def pd-mat
 ^{:name-r "pdMat",
  :doc "",
  :argslists
  ({:value [nil 0],
    :form nil,
    :nam nil,
    :data [nil [nil]],
    :pdClass "pdSymm"})}
 (r-interop.core/->clj-pos-kw-fn "nlme::pdMat"))

(def pd-matrix
 ^{:name-r "pdMatrix",
  :doc "",
  :argslists ({:object nil, :factor false})}
 (r-interop.core/->clj-pos-kw-fn "nlme::pdMatrix"))

(def pd-natural
 ^{:name-r "pdNatural",
  :doc "",
  :argslists
  ({:value [nil 0], :form nil, :nam nil, :data [nil [nil]]})}
 (r-interop.core/->clj-pos-kw-fn "nlme::pdNatural"))

(def pd-symm
 ^{:name-r "pdSymm",
  :doc "",
  :argslists ({:value [nil 0], :form nil, :nam nil, :data [nil]})}
 (r-interop.core/->clj-pos-kw-fn "nlme::pdSymm"))

(def pheno-model
 ^{:name-r "phenoModel",
  :doc "",
  :argslists ({:Subject nil, :time nil, :dose nil, :lCl nil, :lV nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::phenoModel"))

(def plot-lme
 ^{:name-r "plot.lme",
  :doc "",
  :argslists
  ({:x nil,
    :form [nil {:empty-key nil, :type "pearson"} [nil nil]],
    :abline nil,
    :id nil,
    :idLabels nil,
    :idResType [nil "pearson" "normalized"],
    :grid nil,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::plot.lme"))

(def pooled-sd
 ^{:name-r "pooledSD", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::pooledSD"))

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
 (r-interop.core/->clj-pos-kw-fn "nlme::quinModel"))

(def random-effects
 ^{:name-r "random.effects",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::random.effects"))

(def ranef
 ^{:name-r "ranef", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::ranef"))

(def recalc
 ^{:name-r "recalc",
  :doc "",
  :argslists ({:object nil, :conLin nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::recalc"))

(def re-struct
 ^{:name-r "reStruct",
  :doc "",
  :argslists
  ({:object nil,
    :pdClass "pdLogChol",
    :REML false,
    :data [nil [nil]]})}
 (r-interop.core/->clj-pos-kw-fn "nlme::reStruct"))

(def simulate-lme
 ^{:name-r "simulate.lme",
  :doc "",
  :argslists
  ({:object nil,
    :nsim 1,
    :seed [nil [nil 1 0 [nil nil nil]]],
    :m2 nil,
    :method [nil "REML" "ML"],
    :niterEM [nil 40 200],
    :useGen nil,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::simulate.lme"))

(def split-formula
 ^{:name-r "splitFormula", :doc "", :argslists ({:form nil, :sep "/"})}
 (r-interop.core/->clj-pos-kw-fn "nlme::splitFormula"))

(def var-comb
 ^{:name-r "varComb", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::varComb"))

(def var-const-power
 ^{:name-r "varConstPower",
  :doc "",
  :argslists
  ({:const [nil 0],
    :power [nil 0],
    :form [nil [nil nil]],
    :fixed nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::varConstPower"))

(def var-corr
 ^{:name-r "VarCorr",
  :doc "",
  :argslists ({:x nil, :sigma 1, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::VarCorr"))

(def var-exp
 ^{:name-r "varExp",
  :doc "",
  :argslists ({:value [nil 0], :form [nil [nil nil]], :fixed nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::varExp"))

(def var-fixed
 ^{:name-r "varFixed", :doc "", :argslists ({:value [nil 1]})}
 (r-interop.core/->clj-pos-kw-fn "nlme::varFixed"))

(def var-func
 ^{:name-r "varFunc", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::varFunc"))

(def var-ident
 ^{:name-r "varIdent",
  :doc "",
  :argslists ({:value [nil 0], :form [nil 1], :fixed nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::varIdent"))

(def variogram
 ^{:name-r "Variogram",
  :doc "",
  :argslists ({:object nil, :distance nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::Variogram"))

(def var-power
 ^{:name-r "varPower",
  :doc "",
  :argslists ({:value [nil 0], :form [nil [nil nil]], :fixed nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::varPower"))

(def var-weights
 ^{:name-r "varWeights", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "nlme::varWeights"))
