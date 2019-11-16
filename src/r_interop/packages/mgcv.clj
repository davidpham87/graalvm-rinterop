(ns r-interop.packages.mgcv
 (:require [r-interop.core :refer (defn-r eval-r)]))

(eval-r "library(mgcv)")(defn-r ff-des FFdes)
(defn-r smooth->random smooth2random)
(defn-r gam->derivative gam2derivative)
(defn-r gam->objective gam2objective)

(def anova-gam
 ^{:name-r "anova.gam",
  :doc "",
  :argslists
  ({:object nil, :... nil, :dispersion nil, :test nil, :freq false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "anova.gam"))

(def bam
 ^{:name-r "bam",
  :doc "",
  :argslists
  ({:drop.unused.levels true,
    :drop.intercept nil,
    :AR.start nil,
    :discrete false,
    :family {},
    :cluster nil,
    :subset nil,
    :coef nil,
    :sp nil,
    :offset nil,
    :fit true,
    :scale 0,
    :method "fREML",
    :rho 0,
    :chunk.size 10000,
    :na.action nil,
    :nthreads 1,
    :weights nil,
    :samfrac 1,
    :knots nil,
    :G nil,
    :... nil,
    :control {},
    :gamma 1,
    :paraPen nil,
    :formula nil,
    :use.chol false,
    :gc.level 1,
    :min.sp nil,
    :select false,
    :data {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "bam"))

(def bam-update
 ^{:name-r "bam.update",
  :doc "",
  :argslists ({:b nil, :data nil, :chunk.size 10000})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "bam.update"))

(def bandchol
 ^{:name-r "bandchol", :doc "", :argslists ({:B nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "bandchol"))

(def betar
 ^{:name-r "betar",
  :doc "",
  :argslists ({:theta nil, :link "logit", :eps {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "betar"))

(def choldrop
 ^{:name-r "choldrop", :doc "", :argslists ({:R nil, :k nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "choldrop"))

(def cholup
 ^{:name-r "cholup", :doc "", :argslists ({:R nil, :u nil, :up true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "cholup"))

(def concurvity
 ^{:name-r "concurvity", :doc "", :argslists ({:b nil, :full true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "concurvity"))

(def cox-ph
 ^{:name-r "cox.ph", :doc "", :argslists ({:link "identity"})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "cox.ph"))

(def c-spline-des
 ^{:name-r "cSplineDes",
  :doc "",
  :argslists ({:x nil, :knots nil, :ord 4, :derivs 0})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "cSplineDes"))

(def d-deta
 ^{:name-r "dDeta",
  :doc "",
  :argslists
  ({:y nil, :mu nil, :wt nil, :theta nil, :fam nil, :deriv 0})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "dDeta"))

(def exclude-too-far
 ^{:name-r "exclude.too.far",
  :doc "",
  :argslists ({:g1 nil, :g2 nil, :d1 nil, :d2 nil, :dist nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "exclude.too.far"))

(def extract-lme-cov
 ^{:name-r "extract.lme.cov",
  :doc "",
  :argslists ({:b nil, :data nil, :start.level 1})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "extract.lme.cov"))

(def extract-lme-cov-2
 ^{:name-r "extract.lme.cov2",
  :doc "",
  :argslists ({:b nil, :data nil, :start.level 1})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "extract.lme.cov2"))

(def fix-family-link
 ^{:name-r "fix.family.link", :doc "", :argslists ({:fam nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "fix.family.link"))

(def fix-family-ls
 ^{:name-r "fix.family.ls", :doc "", :argslists ({:fam nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "fix.family.ls"))

(def fix-family-qf
 ^{:name-r "fix.family.qf", :doc "", :argslists ({:fam nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "fix.family.qf"))

(def fix-family-rd
 ^{:name-r "fix.family.rd", :doc "", :argslists ({:fam nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "fix.family.rd"))

(def fix-family-var
 ^{:name-r "fix.family.var", :doc "", :argslists ({:fam nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "fix.family.var"))

(def fix-dependence
 ^{:name-r "fixDependence",
  :doc "",
  :argslists ({:X1 nil, :X2 nil, :tol {}, :rank.def 0, :strict false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "fixDependence"))

(def formula-gam
 ^{:name-r "formula.gam", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "formula.gam"))

(def form-xt-vi-x
 ^{:name-r "formXtViX", :doc "", :argslists ({:V nil, :X nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "formXtViX"))

(def fs-boundary
 ^{:name-r "fs.boundary",
  :doc "",
  :argslists ({:r0 0.1, :r 0.5, :l 3, :n.theta 20})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "fs.boundary"))

(def fs-test
 ^{:name-r "fs.test",
  :doc "",
  :argslists
  ({:x nil, :y nil, :r0 0.1, :r 0.5, :l 3, :b 1, :exclude true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "fs.test"))

(def full-score
 ^{:name-r "full.score",
  :doc "",
  :argslists
  ({:sp nil, :G nil, :family nil, :control nil, :gamma nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "full.score"))

(def gam
 ^{:name-r "gam",
  :doc "",
  :argslists
  ({:drop.unused.levels true,
    :drop.intercept nil,
    :family {},
    :subset nil,
    :sp nil,
    :offset nil,
    :fit true,
    :scale 0,
    :method "GCV.Cp",
    :na.action nil,
    :weights nil,
    :knots nil,
    :G nil,
    :optimizer {},
    :... nil,
    :control {},
    :gamma 1,
    :paraPen nil,
    :formula nil,
    :H nil,
    :min.sp nil,
    :in.out nil,
    :select false,
    :data {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "gam"))

(def gam-check
 ^{:name-r "gam.check",
  :doc "",
  :argslists
  ({:k.sample 5000,
    :rep 0,
    :type {},
    :k.rep 200,
    :level 0.9,
    :... nil,
    :b nil,
    :rep.col "gray80",
    :rl.col 2,
    :old.style false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "gam.check"))

(def gam-control
 ^{:name-r "gam.control",
  :doc "",
  :argslists
  ({:rank.tol {},
    :mgcv.half 15,
    :edge.correct false,
    :efs.tol 0.1,
    :scalePenalty true,
    :idLinksBases true,
    :outerPIsteps 0,
    :maxit 200,
    :trace false,
    :newton {},
    :nthreads 1,
    :optim {},
    :irls.reg 0,
    :epsilon 1.0E-7,
    :efs.lspmax 15,
    :scale.est "fletcher",
    :keepData false,
    :mgcv.tol 1.0E-7,
    :nlm {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "gam.control"))

(def gam-fit
 ^{:name-r "gam.fit",
  :doc "",
  :argslists
  ({:family {},
    :etastart nil,
    :mustart nil,
    :start nil,
    :G nil,
    :... nil,
    :control {},
    :gamma 1,
    :fixedSteps {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "gam.fit"))

(def gam-fit-3
 ^{:name-r "gam.fit3",
  :doc "",
  :argslists
  ({:y nil,
    :Sl nil,
    :null.coef {},
    :scoreType "REML",
    :n.true {},
    :family {},
    :intercept true,
    :etastart nil,
    :mustart nil,
    :sp nil,
    :offset {},
    :scale 1,
    :Mp {},
    :deriv 2,
    :start nil,
    :weights {},
    :UrS {},
    :Eb nil,
    :... nil,
    :U1 {},
    :control {},
    :pearson.extra 0,
    :gamma 1,
    :printWarn true,
    :x nil,
    :dev.extra 0})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "gam.fit3"))

(def gam-fit-5-post-proc
 ^{:name-r "gam.fit5.post.proc",
  :doc "",
  :argslists
  ({:object nil, :Sl nil, :L nil, :lsp0 nil, :S nil, :off nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "gam.fit5.post.proc"))

(def gam-outer
 ^{:name-r "gam.outer",
  :doc "",
  :argslists
  ({:family nil,
    :scale nil,
    :method nil,
    :lsp nil,
    :start nil,
    :G nil,
    :optimizer nil,
    :... nil,
    :control nil,
    :gamma nil,
    :fscale nil,
    :criterion nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "gam.outer"))

(def gam-reparam
 ^{:name-r "gam.reparam",
  :doc "",
  :argslists ({:rS nil, :lsp nil, :deriv nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "gam.reparam"))

(def gam-side
 ^{:name-r "gam.side",
  :doc "",
  :argslists ({:sm nil, :Xp nil, :tol {}, :with.pen false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "gam.side"))

(def gam-vcomp
 ^{:name-r "gam.vcomp",
  :doc "",
  :argslists ({:x nil, :rescale true, :conf.lev 0.95})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "gam.vcomp"))

(def gamlss-etamu
 ^{:name-r "gamlss.etamu",
  :doc "",
  :argslists
  ({:l4 nil,
    :l1 nil,
    :i4 nil,
    :deriv 0,
    :g4 nil,
    :g2 nil,
    :i3 nil,
    :g3 nil,
    :l2 nil,
    :l3 nil,
    :i2 nil,
    :ig1 nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "gamlss.etamu"))

(def gamlss-g-h
 ^{:name-r "gamlss.gH",
  :doc "",
  :argslists
  ({:l4 0,
    :l1 nil,
    :i4 0,
    :deriv 0,
    :D nil,
    :jj nil,
    :i3 0,
    :d2b 0,
    :l2 nil,
    :d1b 0,
    :l3 0,
    :i2 nil,
    :X nil,
    :fh nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "gamlss.gH"))

(def gamm
 ^{:name-r "gamm",
  :doc "",
  :argslists
  ({:drop.unused.levels true,
    :family {},
    :subset nil,
    :method "ML",
    :correlation nil,
    :na.action nil,
    :weights nil,
    :knots nil,
    :... nil,
    :control {:empty-key nil, :niterEM 0, :optimMethod "L-BFGS-B"},
    :niterPQL 20,
    :random nil,
    :formula nil,
    :verbosePQL true,
    :data {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "gamm"))

(def gam-sim
 ^{:name-r "gamSim",
  :doc "",
  :argslists
  ({:eg 1, :n 400, :dist "normal", :scale 2, :verbose true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "gamSim"))

(def gaulss
 ^{:name-r "gaulss", :doc "", :argslists ({:link {}, :b 0.01})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "gaulss"))

(def get-var
 ^{:name-r "get.var",
  :doc "",
  :argslists ({:txt nil, :data nil, :vecMat true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "get.var"))

(def gevlss
 ^{:name-r "gevlss", :doc "", :argslists ({:link {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "gevlss"))

(def ginla
 ^{:name-r "ginla",
  :doc "",
  :argslists
  ({:G nil,
    :A nil,
    :nk 16,
    :nb 100,
    :J 1,
    :interactive false,
    :int 0,
    :approx 0})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "ginla"))

(def in-out
 ^{:name-r "in.out", :doc "", :argslists ({:bnd nil, :x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "in.out"))

(def influence-gam
 ^{:name-r "influence.gam",
  :doc "",
  :argslists ({:model nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "influence.gam"))

(def initial-sp
 ^{:name-r "initial.sp",
  :doc "",
  :argslists ({:X nil, :S nil, :off nil, :expensive false, :XX false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "initial.sp"))

(def in-side
 ^{:name-r "inSide", :doc "", :argslists ({:bnd nil, :x nil, :y nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "inSide"))

(def interpret-gam
 ^{:name-r "interpret.gam",
  :doc "",
  :argslists ({:gf nil, :extra.special nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "interpret.gam"))

(def jagam
 ^{:name-r "jagam",
  :doc "",
  :argslists
  ({:drop.unused.levels true,
    :diagonalize false,
    :family nil,
    :centred true,
    :sp nil,
    :offset nil,
    :sp.prior "gamma",
    :file nil,
    :na.action nil,
    :weights nil,
    :knots nil,
    :control {},
    :formula nil,
    :data {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "jagam"))

(def k-check
 ^{:name-r "k.check",
  :doc "",
  :argslists ({:b nil, :subsample 5000, :n.rep 400})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "k.check"))

(def ldet-s
 ^{:name-r "ldetS",
  :doc "",
  :argslists
  ({:Sl nil,
    :rho nil,
    :fixed nil,
    :np nil,
    :root false,
    :repara true,
    :nt 1})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "ldetS"))

(def ld-tweedie
 ^{:name-r "ldTweedie",
  :doc "",
  :argslists
  ({:phi 1,
    :y nil,
    :all.derivs false,
    :rho [nil],
    :theta [nil],
    :b 1.999,
    :mu nil,
    :p 1.5,
    :a 1.001})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "ldTweedie"))

(def log-lik-gam
 ^{:name-r "logLik.gam", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "logLik.gam"))

(def ls-size
 ^{:name-r "ls.size", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "ls.size"))

(def magic
 ^{:name-r "magic",
  :doc "",
  :argslists
  ({:y nil,
    :n.score {},
    :L nil,
    :ridge.parameter nil,
    :sp nil,
    :scale 1,
    :w nil,
    :gcv true,
    :rank nil,
    :nthreads 1,
    :C nil,
    :control
    {:empty-key nil, :tol 1.0E-6, :step.half 25, :rank.tol {}},
    :off nil,
    :gamma 1,
    :X nil,
    :H nil,
    :S nil,
    :lsp0 nil,
    :extra.rss 0})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "magic"))

(def magic-post-proc
 ^{:name-r "magic.post.proc",
  :doc "",
  :argslists ({:X nil, :object nil, :w nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "magic.post.proc"))

(def mini-roots
 ^{:name-r "mini.roots",
  :doc "",
  :argslists ({:S nil, :off nil, :np nil, :rank nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "mini.roots"))

(def model-matrix-gam
 ^{:name-r "model.matrix.gam",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "model.matrix.gam"))

(def mono-con
 ^{:name-r "mono.con",
  :doc "",
  :argslists ({:x nil, :up true, :lower [nil], :upper [nil]})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "mono.con"))

(def mroot
 ^{:name-r "mroot",
  :doc "",
  :argslists ({:A nil, :rank nil, :method "chol"})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "mroot"))

(def multinom
 ^{:name-r "multinom", :doc "", :argslists ({:K 1})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "multinom"))

(def mvn
 ^{:name-r "mvn", :doc "", :argslists ({:d 2})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "mvn"))

(def nb
 ^{:name-r "nb", :doc "", :argslists ({:theta nil, :link "log"})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "nb"))

(def negbin
 ^{:name-r "negbin", :doc "", :argslists ({:theta {}, :link "log"})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "negbin"))

(def new-name
 ^{:name-r "new.name",
  :doc "",
  :argslists ({:proposed nil, :old.names nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "new.name"))

(def not-exp
 ^{:name-r "notExp", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "notExp"))

(def not-exp-2
 ^{:name-r "notExp2", :doc "", :argslists ({:x nil, :d {}, :b {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "notExp2"))

(def not-log
 ^{:name-r "notLog", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "notLog"))

(def not-log-2
 ^{:name-r "notLog2", :doc "", :argslists ({:x nil, :d {}, :b {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "notLog2"))

(def null-space-dimension
 ^{:name-r "null.space.dimension",
  :doc "",
  :argslists ({:d nil, :m nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "null.space.dimension"))

(def ocat
 ^{:name-r "ocat",
  :doc "",
  :argslists ({:theta nil, :link "identity", :R nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "ocat"))

(def pcls
 ^{:name-r "pcls", :doc "", :argslists ({:M nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "pcls"))

(def pd-idnot
 ^{:name-r "pdIdnot",
  :doc "",
  :argslists ({:value {}, :form nil, :nam nil, :data {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "pdIdnot"))

(def pd-tens
 ^{:name-r "pdTens",
  :doc "",
  :argslists ({:value {}, :form nil, :nam nil, :data {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "pdTens"))

(def pen-edf
 ^{:name-r "pen.edf", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "pen.edf"))

(def place-knots
 ^{:name-r "place.knots", :doc "", :argslists ({:x nil, :nk nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "place.knots"))

(def plot-gam
 ^{:name-r "plot.gam",
  :doc "",
  :argslists
  ({:phi 30,
    :ylim nil,
    :shift 0,
    :by.resids false,
    :n3 3,
    :pers false,
    :ylab nil,
    :scale {},
    :n 100,
    :seWithMean false,
    :n2 40,
    :theta 30,
    :residuals false,
    :shade.col "gray80",
    :pages 0,
    :xlim nil,
    :xlab nil,
    :... nil,
    :too.far 0.1,
    :trans nil,
    :se true,
    :all.terms false,
    :unconditional false,
    :x nil,
    :main nil,
    :scheme 0,
    :jit false,
    :shade false,
    :select nil,
    :rug nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "plot.gam"))

(def polys-plot
 ^{:name-r "polys.plot",
  :doc "",
  :argslists ({:pc nil, :z nil, :scheme "heat", :lab "", :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "polys.plot"))

(def predict-bam
 ^{:name-r "predict.bam",
  :doc "",
  :argslists
  ({:exclude nil,
    :discrete true,
    :cluster nil,
    :terms nil,
    :na.action nil,
    :type "link",
    :block.size 50000,
    :newdata nil,
    :newdata.guaranteed false,
    :... nil,
    :n.threads 1,
    :se.fit false,
    :object nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "predict.bam"))

(def predict-gam
 ^{:name-r "predict.gam",
  :doc "",
  :argslists
  ({:exclude nil,
    :terms nil,
    :iterms.type nil,
    :na.action nil,
    :type "link",
    :block.size nil,
    :newdata nil,
    :newdata.guaranteed false,
    :... nil,
    :unconditional false,
    :se.fit false,
    :object nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "predict.gam"))

(def predict-matrix
 ^{:name-r "Predict.matrix",
  :doc "",
  :argslists ({:object nil, :data nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Predict.matrix"))

(def predict-matrix-bspline-smooth
 ^{:name-r "Predict.matrix.Bspline.smooth",
  :doc "",
  :argslists ({:object nil, :data nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "Predict.matrix.Bspline.smooth"))

(def predict-matrix-cr-smooth
 ^{:name-r "Predict.matrix.cr.smooth",
  :doc "",
  :argslists ({:object nil, :data nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Predict.matrix.cr.smooth"))

(def predict-matrix-cs-smooth
 ^{:name-r "Predict.matrix.cs.smooth",
  :doc "",
  :argslists ({:object nil, :data nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Predict.matrix.cs.smooth"))

(def predict-matrix-cyclic-smooth
 ^{:name-r "Predict.matrix.cyclic.smooth",
  :doc "",
  :argslists ({:object nil, :data nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "Predict.matrix.cyclic.smooth"))

(def predict-matrix-duchon-spline
 ^{:name-r "Predict.matrix.duchon.spline",
  :doc "",
  :argslists ({:object nil, :data nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "Predict.matrix.duchon.spline"))

(def predict-matrix-gp-smooth
 ^{:name-r "Predict.matrix.gp.smooth",
  :doc "",
  :argslists ({:object nil, :data nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Predict.matrix.gp.smooth"))

(def predict-matrix-mrf-smooth
 ^{:name-r "Predict.matrix.mrf.smooth",
  :doc "",
  :argslists ({:object nil, :data nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Predict.matrix.mrf.smooth"))

(def predict-matrix-pspline-smooth
 ^{:name-r "Predict.matrix.pspline.smooth",
  :doc "",
  :argslists ({:object nil, :data nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "Predict.matrix.pspline.smooth"))

(def predict-matrix-random-effect
 ^{:name-r "Predict.matrix.random.effect",
  :doc "",
  :argslists ({:object nil, :data nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "Predict.matrix.random.effect"))

(def predict-matrix-sf
 ^{:name-r "Predict.matrix.sf",
  :doc "",
  :argslists ({:object nil, :data nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Predict.matrix.sf"))

(def predict-matrix-soap-film
 ^{:name-r "Predict.matrix.soap.film",
  :doc "",
  :argslists ({:object nil, :data nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Predict.matrix.soap.film"))

(def predict-matrix-sos-smooth
 ^{:name-r "Predict.matrix.sos.smooth",
  :doc "",
  :argslists ({:object nil, :data nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Predict.matrix.sos.smooth"))

(def predict-matrix-sw
 ^{:name-r "Predict.matrix.sw",
  :doc "",
  :argslists ({:object nil, :data nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Predict.matrix.sw"))

(def predict-matrix-t-2-smooth
 ^{:name-r "Predict.matrix.t2.smooth",
  :doc "",
  :argslists ({:object nil, :data nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Predict.matrix.t2.smooth"))

(def predict-matrix-tensor-smooth
 ^{:name-r "Predict.matrix.tensor.smooth",
  :doc "",
  :argslists ({:object nil, :data nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "Predict.matrix.tensor.smooth"))

(def predict-matrix-tprs-smooth
 ^{:name-r "Predict.matrix.tprs.smooth",
  :doc "",
  :argslists ({:object nil, :data nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Predict.matrix.tprs.smooth"))

(def predict-matrix-ts-smooth
 ^{:name-r "Predict.matrix.ts.smooth",
  :doc "",
  :argslists ({:object nil, :data nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Predict.matrix.ts.smooth"))

(def predict-matrix-2
 ^{:name-r "Predict.matrix2",
  :doc "",
  :argslists ({:object nil, :data nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Predict.matrix2"))

(def predict-mat
 ^{:name-r "PredictMat",
  :doc "",
  :argslists ({:object nil, :data nil, :n {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "PredictMat"))

(def print-anova-gam
 ^{:name-r "print.anova.gam",
  :doc "",
  :argslists ({:x nil, :digits {}, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.anova.gam"))

(def print-gam
 ^{:name-r "print.gam", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.gam"))

(def print-summary-gam
 ^{:name-r "print.summary.gam",
  :doc "",
  :argslists ({:x nil, :digits {}, :signif.stars {}, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.summary.gam"))

(def qq-gam
 ^{:name-r "qq.gam",
  :doc "",
  :argslists
  ({:s.rep 10,
    :rep 0,
    :type {},
    :level 0.9,
    :... nil,
    :pch ".",
    :rep.col "gray80",
    :rl.col 2,
    :object nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "qq.gam"))

(def residuals-gam
 ^{:name-r "residuals.gam",
  :doc "",
  :argslists ({:object nil, :type "deviance", :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "residuals.gam"))

(def rig
 ^{:name-r "rig", :doc "", :argslists ({:n nil, :mean nil, :scale nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "rig"))

(def rmvn
 ^{:name-r "rmvn", :doc "", :argslists ({:n nil, :mu nil, :V nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "rmvn"))

(def rrank
 ^{:name-r "Rrank", :doc "", :argslists ({:R nil, :tol {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Rrank"))

(def r-tweedie
 ^{:name-r "rTweedie", :doc "", :argslists ({:mu nil, :p 1.5, :phi 1})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "rTweedie"))

(def scat
 ^{:name-r "scat",
  :doc "",
  :argslists ({:theta nil, :link "identity", :min.df 3})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "scat"))

(def sdiag
 ^{:name-r "sdiag", :doc "", :argslists ({:A nil, :k 0})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sdiag"))

(def sim-2jam
 ^{:name-r "sim2jam",
  :doc "",
  :argslists ({:sam nil, :pregam nil, :edf.type 2, :burnin 0})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sim2jam"))

(def sl-initial-repara
 ^{:name-r "Sl.initial.repara",
  :doc "",
  :argslists
  ({:Sl nil,
    :X nil,
    :inverse false,
    :both.sides true,
    :cov true,
    :nt 1})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Sl.initial.repara"))

(def sl-repara
 ^{:name-r "Sl.repara",
  :doc "",
  :argslists ({:rp nil, :X nil, :inverse false, :both.sides true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Sl.repara"))

(def sl-setup
 ^{:name-r "Sl.setup", :doc "", :argslists ({:G nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Sl.setup"))

(def slanczos
 ^{:name-r "slanczos",
  :doc "",
  :argslists ({:A nil, :k 10, :kl {}, :tol {}, :nt 1})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "slanczos"))

(def smooth-construct
 ^{:name-r "smooth.construct",
  :doc "",
  :argslists ({:object nil, :data nil, :knots nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "smooth.construct"))

(def smooth-construct-ad-smooth-spec
 ^{:name-r "smooth.construct.ad.smooth.spec",
  :doc "",
  :argslists ({:object nil, :data nil, :knots nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "smooth.construct.ad.smooth.spec"))

(def smooth-construct-bs-smooth-spec
 ^{:name-r "smooth.construct.bs.smooth.spec",
  :doc "",
  :argslists ({:object nil, :data nil, :knots nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "smooth.construct.bs.smooth.spec"))

(def smooth-construct-cc-smooth-spec
 ^{:name-r "smooth.construct.cc.smooth.spec",
  :doc "",
  :argslists ({:object nil, :data nil, :knots nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "smooth.construct.cc.smooth.spec"))

(def smooth-construct-cp-smooth-spec
 ^{:name-r "smooth.construct.cp.smooth.spec",
  :doc "",
  :argslists ({:object nil, :data nil, :knots nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "smooth.construct.cp.smooth.spec"))

(def smooth-construct-cr-smooth-spec
 ^{:name-r "smooth.construct.cr.smooth.spec",
  :doc "",
  :argslists ({:object nil, :data nil, :knots nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "smooth.construct.cr.smooth.spec"))

(def smooth-construct-cs-smooth-spec
 ^{:name-r "smooth.construct.cs.smooth.spec",
  :doc "",
  :argslists ({:object nil, :data nil, :knots nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "smooth.construct.cs.smooth.spec"))

(def smooth-construct-ds-smooth-spec
 ^{:name-r "smooth.construct.ds.smooth.spec",
  :doc "",
  :argslists ({:object nil, :data nil, :knots nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "smooth.construct.ds.smooth.spec"))

(def smooth-construct-gp-smooth-spec
 ^{:name-r "smooth.construct.gp.smooth.spec",
  :doc "",
  :argslists ({:object nil, :data nil, :knots nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "smooth.construct.gp.smooth.spec"))

(def smooth-construct-mrf-smooth-spec
 ^{:name-r "smooth.construct.mrf.smooth.spec",
  :doc "",
  :argslists ({:object nil, :data nil, :knots nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "smooth.construct.mrf.smooth.spec"))

(def smooth-construct-ps-smooth-spec
 ^{:name-r "smooth.construct.ps.smooth.spec",
  :doc "",
  :argslists ({:object nil, :data nil, :knots nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "smooth.construct.ps.smooth.spec"))

(def smooth-construct-re-smooth-spec
 ^{:name-r "smooth.construct.re.smooth.spec",
  :doc "",
  :argslists ({:object nil, :data nil, :knots nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "smooth.construct.re.smooth.spec"))

(def smooth-construct-sf-smooth-spec
 ^{:name-r "smooth.construct.sf.smooth.spec",
  :doc "",
  :argslists ({:object nil, :data nil, :knots nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "smooth.construct.sf.smooth.spec"))

(def smooth-construct-so-smooth-spec
 ^{:name-r "smooth.construct.so.smooth.spec",
  :doc "",
  :argslists ({:object nil, :data nil, :knots nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "smooth.construct.so.smooth.spec"))

(def smooth-construct-sos-smooth-spec
 ^{:name-r "smooth.construct.sos.smooth.spec",
  :doc "",
  :argslists ({:object nil, :data nil, :knots nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "smooth.construct.sos.smooth.spec"))

(def smooth-construct-sw-smooth-spec
 ^{:name-r "smooth.construct.sw.smooth.spec",
  :doc "",
  :argslists ({:object nil, :data nil, :knots nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "smooth.construct.sw.smooth.spec"))

(def smooth-construct-t-2-smooth-spec
 ^{:name-r "smooth.construct.t2.smooth.spec",
  :doc "",
  :argslists ({:object nil, :data nil, :knots nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "smooth.construct.t2.smooth.spec"))

(def smooth-construct-tensor-smooth-spec
 ^{:name-r "smooth.construct.tensor.smooth.spec",
  :doc "",
  :argslists ({:object nil, :data nil, :knots nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "smooth.construct.tensor.smooth.spec"))

(def smooth-construct-tp-smooth-spec
 ^{:name-r "smooth.construct.tp.smooth.spec",
  :doc "",
  :argslists ({:object nil, :data nil, :knots nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "smooth.construct.tp.smooth.spec"))

(def smooth-construct-ts-smooth-spec
 ^{:name-r "smooth.construct.ts.smooth.spec",
  :doc "",
  :argslists ({:object nil, :data nil, :knots nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "smooth.construct.ts.smooth.spec"))

(def smooth-construct-2
 ^{:name-r "smooth.construct2",
  :doc "",
  :argslists ({:object nil, :data nil, :knots nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "smooth.construct2"))

(def smooth-con
 ^{:name-r "smoothCon",
  :doc "",
  :argslists
  ({:diagonal.penalty false,
    :null.space.penalty false,
    :scale.penalty true,
    :n {},
    :sparse.cons 0,
    :apply.by true,
    :modCon 0,
    :knots nil,
    :absorb.cons false,
    :object nil,
    :dataX nil,
    :data nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "smoothCon"))

(def sp-vcov
 ^{:name-r "sp.vcov",
  :doc "",
  :argslists ({:x nil, :edge.correct true, :reg 0.001})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sp.vcov"))

(def spasm-construct
 ^{:name-r "spasm.construct",
  :doc "",
  :argslists ({:object nil, :data nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "spasm.construct"))

(def spasm-smooth
 ^{:name-r "spasm.smooth",
  :doc "",
  :argslists ({:object nil, :X nil, :residual false, :block 0})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "spasm.smooth"))

(def spasm-sp
 ^{:name-r "spasm.sp",
  :doc "",
  :argslists
  ({:object nil,
    :sp nil,
    :w {},
    :get.trH true,
    :block 0,
    :centre false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "spasm.sp"))

(def summary-gam
 ^{:name-r "summary.gam",
  :doc "",
  :argslists
  ({:object nil,
    :dispersion nil,
    :freq false,
    :re.test true,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "summary.gam"))

(def te
 ^{:name-r "te",
  :doc "",
  :argslists
  ({:sp nil,
    :m [nil],
    :pc nil,
    :k [nil],
    :np true,
    :... nil,
    :id nil,
    :xt nil,
    :bs "cr",
    :d [nil],
    :by [nil],
    :fx false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "te"))

(def tensor-prod-model-matrix
 ^{:name-r "tensor.prod.model.matrix", :doc "", :argslists ({:X nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "tensor.prod.model.matrix"))

(def tensor-prod-penalties
 ^{:name-r "tensor.prod.penalties", :doc "", :argslists ({:S nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "tensor.prod.penalties"))

(def ti
 ^{:name-r "ti",
  :doc "",
  :argslists
  ({:sp nil,
    :m [nil],
    :pc nil,
    :k [nil],
    :np true,
    :... nil,
    :id nil,
    :xt nil,
    :bs "cr",
    :d [nil],
    :by [nil],
    :mc nil,
    :fx false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "ti"))

(def total-penalty-space
 ^{:name-r "totalPenaltySpace",
  :doc "",
  :argslists ({:S nil, :H nil, :off nil, :p nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "totalPenaltySpace"))

(def trichol
 ^{:name-r "trichol", :doc "", :argslists ({:ld nil, :sd nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "trichol"))

(def trind-generator
 ^{:name-r "trind.generator", :doc "", :argslists ({:K 2})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "trind.generator"))

(def tw
 ^{:name-r "tw",
  :doc "",
  :argslists ({:theta nil, :link "log", :a 1.01, :b 1.99})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "tw"))

(def tweedie
 ^{:name-r "Tweedie", :doc "", :argslists ({:p 1, :link {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Tweedie"))

(def twlss
 ^{:name-r "twlss", :doc "", :argslists ({:link {}, :a 1.01, :b 1.99})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "twlss"))

(def uniquecombs
 ^{:name-r "uniquecombs",
  :doc "",
  :argslists ({:x nil, :ordered false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "uniquecombs"))

(def vcov-gam
 ^{:name-r "vcov.gam",
  :doc "",
  :argslists
  ({:object nil,
    :freq false,
    :dispersion nil,
    :unconditional false,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "vcov.gam"))

(def vis-gam
 ^{:name-r "vis.gam",
  :doc "",
  :argslists
  ({:zlim nil,
    :color "heat",
    :nCol 50,
    :type "link",
    :plot.type "persp",
    :contour.col nil,
    :cond {},
    :... nil,
    :col [nil],
    :too.far 0,
    :se {},
    :x nil,
    :n.grid 30,
    :view nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "vis.gam"))

(def zi-p
 ^{:name-r "ziP",
  :doc "",
  :argslists ({:theta nil, :link "identity", :b 0})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "ziP"))

(def ziplss
 ^{:name-r "ziplss", :doc "", :argslists ({:link {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "ziplss"))
