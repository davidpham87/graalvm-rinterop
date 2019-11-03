(ns r-interop.packages.base
 (:require [r-interop.core :refer (defn-r)]))

(defn-r all-equal-posix-t all.equal.POSIXt)
(defn-r any-na-posix-lt anyNA.POSIXlt)
(defn-r as-character-posix-t as.character.POSIXt)
(defn-r as-data-frame-posix-ct as.data.frame.POSIXct)
(defn-r as-data-frame-posix-lt as.data.frame.POSIXlt)
(defn-r as-date-posix-ct as.Date.POSIXct)
(defn-r as-date-posix-lt as.Date.POSIXlt)
(defn-r as-double-posix-lt as.double.POSIXlt)
(defn-r as-list-posix-ct as.list.POSIXct)
(defn-r as-list-posix-lt as.list.POSIXlt)
(defn-r as-matrix-posix-lt as.matrix.POSIXlt)
(defn-r as-posix-ct as.POSIXct)
(defn-r as-posix-ct-date as.POSIXct.Date)
(defn-r as-posix-ct-default as.POSIXct.default)
(defn-r as-posix-ct-numeric as.POSIXct.numeric)
(defn-r as-posix-ct-posix-lt as.POSIXct.POSIXlt)
(defn-r as-posix-lt as.POSIXlt)
(defn-r as-posix-lt-character as.POSIXlt.character)
(defn-r as-posix-lt-date as.POSIXlt.Date)
(defn-r as-posix-lt-default as.POSIXlt.default)
(defn-r as-posix-lt-factor as.POSIXlt.factor)
(defn-r as-posix-lt-numeric as.POSIXlt.numeric)
(defn-r as-posix-lt-posix-ct as.POSIXlt.POSIXct)
(defn-r c-posix-ct c.POSIXct)
(defn-r c-posix-lt c.POSIXlt)
(defn-r cut-posix-t cut.POSIXt)
(defn-r diff-posix-t diff.POSIXt)
(defn-r duplicated-posix-lt duplicated.POSIXlt)
(defn-r format-posix-ct format.POSIXct)
(defn-r format-posix-lt format.POSIXlt)
(defn-r is-na-posix-lt is.na.POSIXlt)
(defn-r is-numeric-posix-t is.numeric.POSIXt)
(defn-r julian-posix-t julian.POSIXt)
(defn-r length-posix-lt length.POSIXlt)
(defn-r math-posix-t Math.POSIXt)
(defn-r mean-posix-ct mean.POSIXct)
(defn-r mean-posix-lt mean.POSIXlt)
(defn-r months-posix-t months.POSIXt)
(defn-r names-posix-lt names.POSIXlt)
(defn-r ops-posix-t Ops.POSIXt)
(defn-r print-posix-ct print.POSIXct)
(defn-r print-posix-lt print.POSIXlt)
(defn-r quarters-posix-t quarters.POSIXt)
(defn-r rep-posix-ct rep.POSIXct)
(defn-r rep-posix-lt rep.POSIXlt)
(defn-r round-posix-t round.POSIXt)
(defn-r seq-posix-t seq.POSIXt)
(defn-r sort-posix-lt sort.POSIXlt)
(defn-r split-posix-ct split.POSIXct)
(defn-r summary-posix-ct summary.POSIXct)
(defn-r summary-posix-ct Summary.POSIXct)
(defn-r summary-posix-lt summary.POSIXlt)
(defn-r summary-posix-lt Summary.POSIXlt)
(defn-r trunc-posix-t trunc.POSIXt)
(defn-r unique-posix-lt unique.POSIXlt)
(defn-r weekdays-posix-t weekdays.POSIXt)
(defn-r xtfrm-posix-ct xtfrm.POSIXct)
(defn-r xtfrm-posix-lt xtfrm.POSIXlt)

(def abbreviate
 ^{:name-r "abbreviate",
  :doc "",
  :argslists
  ({:names.arg nil,
    :minlength 4,
    :use.classes true,
    :dot false,
    :strict false,
    :method [nil "left.kept" "both.sides"],
    :named true})}
 (r-interop.core/->clj-pos-kw-fn "abbreviate"))

(def abs
 ^{:name-r "abs", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "abs"))

(def acos
 ^{:name-r "acos", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "acos"))

(def acosh
 ^{:name-r "acosh", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "acosh"))

(def add-na
 ^{:name-r "addNA", :doc "", :argslists ({:x nil, :ifany false})}
 (r-interop.core/->clj-pos-kw-fn "addNA"))

(def add-task-callback
 ^{:name-r "addTaskCallback",
  :doc "",
  :argslists ({:f nil, :data nil, :name [nil]})}
 (r-interop.core/->clj-pos-kw-fn "addTaskCallback"))

(def agrep
 ^{:name-r "agrep",
  :doc "",
  :argslists
  ({:pattern nil,
    :x nil,
    :max.distance 0.1,
    :costs nil,
    :ignore.case false,
    :value false,
    :fixed true,
    :useBytes false})}
 (r-interop.core/->clj-pos-kw-fn "agrep"))

(def agrepl
 ^{:name-r "agrepl",
  :doc "",
  :argslists
  ({:pattern nil,
    :x nil,
    :max.distance 0.1,
    :costs nil,
    :ignore.case false,
    :fixed true,
    :useBytes false})}
 (r-interop.core/->clj-pos-kw-fn "agrepl"))

(def alist
 ^{:name-r "alist", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "alist"))

(def all
 ^{:name-r "all", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "all"))

(def all-equal
 ^{:name-r "all.equal",
  :doc "",
  :argslists ({:target nil, :current nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "all.equal"))

(def all-equal-character
 ^{:name-r "all.equal.character",
  :doc "",
  :argslists
  ({:target nil, :current nil, :... nil, :check.attributes true})}
 (r-interop.core/->clj-pos-kw-fn "all.equal.character"))

(def all-equal-default
 ^{:name-r "all.equal.default",
  :doc "",
  :argslists ({:target nil, :current nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "all.equal.default"))

(def all-equal-environment
 ^{:name-r "all.equal.environment",
  :doc "",
  :argslists ({:target nil, :current nil, :all.names true, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "all.equal.environment"))

(def all-equal-env-ref-class
 ^{:name-r "all.equal.envRefClass",
  :doc "",
  :argslists ({:target nil, :current nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "all.equal.envRefClass"))

(def all-equal-factor
 ^{:name-r "all.equal.factor",
  :doc "",
  :argslists
  ({:target nil, :current nil, :... nil, :check.attributes true})}
 (r-interop.core/->clj-pos-kw-fn "all.equal.factor"))

(def all-equal-formula
 ^{:name-r "all.equal.formula",
  :doc "",
  :argslists ({:target nil, :current nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "all.equal.formula"))

(def all-equal-language
 ^{:name-r "all.equal.language",
  :doc "",
  :argslists ({:target nil, :current nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "all.equal.language"))

(def all-equal-list
 ^{:name-r "all.equal.list",
  :doc "",
  :argslists
  ({:target nil,
    :current nil,
    :... nil,
    :check.attributes true,
    :use.names true})}
 (r-interop.core/->clj-pos-kw-fn "all.equal.list"))

(def all-equal-numeric
 ^{:name-r "all.equal.numeric",
  :doc "",
  :argslists
  ({:target nil,
    :current nil,
    :tolerance [nil [nil nil nil]],
    :scale nil,
    :... nil,
    :check.attributes true})}
 (r-interop.core/->clj-pos-kw-fn "all.equal.numeric"))

(def all-equal-raw
 ^{:name-r "all.equal.raw",
  :doc "",
  :argslists
  ({:target nil, :current nil, :... nil, :check.attributes true})}
 (r-interop.core/->clj-pos-kw-fn "all.equal.raw"))

(def all-names
 ^{:name-r "all.names",
  :doc "",
  :argslists
  ({:expr nil, :functions true, :max.names [nil 1], :unique false})}
 (r-interop.core/->clj-pos-kw-fn "all.names"))

(def all-vars
 ^{:name-r "all.vars",
  :doc "",
  :argslists
  ({:expr nil, :functions false, :max.names [nil 1], :unique true})}
 (r-interop.core/->clj-pos-kw-fn "all.vars"))

(def allow-interrupts
 ^{:name-r "allowInterrupts", :doc "", :argslists ({:expr nil})}
 (r-interop.core/->clj-pos-kw-fn "allowInterrupts"))

(def any
 ^{:name-r "any", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "any"))

(def any-duplicated
 ^{:name-r "anyDuplicated",
  :doc "",
  :argslists ({:x nil, :incomparables false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "anyDuplicated"))

(def any-duplicated-array
 ^{:name-r "anyDuplicated.array",
  :doc "",
  :argslists
  ({:x nil,
    :incomparables false,
    :MARGIN 1,
    :fromLast false,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "anyDuplicated.array"))

(def any-duplicated-data-frame
 ^{:name-r "anyDuplicated.data.frame",
  :doc "",
  :argslists
  ({:x nil, :incomparables false, :fromLast false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "anyDuplicated.data.frame"))

(def any-duplicated-default
 ^{:name-r "anyDuplicated.default",
  :doc "",
  :argslists
  ({:x nil, :incomparables false, :fromLast false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "anyDuplicated.default"))

(def any-duplicated-matrix
 ^{:name-r "anyDuplicated.matrix",
  :doc "",
  :argslists
  ({:x nil,
    :incomparables false,
    :MARGIN 1,
    :fromLast false,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "anyDuplicated.matrix"))

(def any-na
 ^{:name-r "anyNA", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "anyNA"))

(def any-na-numeric-version
 ^{:name-r "anyNA.numeric_version",
  :doc "",
  :argslists ({:x nil, :recursive false})}
 (r-interop.core/->clj-pos-kw-fn "anyNA.numeric_version"))

(def aperm
 ^{:name-r "aperm", :doc "", :argslists ({:a nil, :perm nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "aperm"))

(def aperm-default
 ^{:name-r "aperm.default",
  :doc "",
  :argslists ({:a nil, :perm nil, :resize true, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "aperm.default"))

(def aperm-table
 ^{:name-r "aperm.table",
  :doc "",
  :argslists
  ({:a nil, :perm nil, :resize true, :keep.class true, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "aperm.table"))

(def append
 ^{:name-r "append",
  :doc "",
  :argslists ({:x nil, :values nil, :after [nil nil]})}
 (r-interop.core/->clj-pos-kw-fn "append"))

(def apply
 ^{:name-r "apply",
  :doc "",
  :argslists ({:X nil, :MARGIN nil, :FUN nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "apply"))

(def arg
 ^{:name-r "Arg", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "Arg"))

(def args
 ^{:name-r "args", :doc "", :argslists ({:name nil})}
 (r-interop.core/->clj-pos-kw-fn "args"))

(def array
 ^{:name-r "array",
  :doc "",
  :argslists ({:data [nil], :dim [nil nil], :dimnames nil})}
 (r-interop.core/->clj-pos-kw-fn "array"))

(def array-ind
 ^{:name-r "arrayInd",
  :doc "",
  :argslists ({:ind nil, :.dim nil, :.dimnames nil, :useNames false})}
 (r-interop.core/->clj-pos-kw-fn "arrayInd"))

(def as-array
 ^{:name-r "as.array", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.array"))

(def as-array-default
 ^{:name-r "as.array.default", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.array.default"))

(def as-array-polyglot-value
 ^{:name-r "as.array.polyglot.value",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.array.polyglot.value"))

(def as-call
 ^{:name-r "as.call", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "as.call"))

(def as-character
 ^{:name-r "as.character", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "as.character"))

(def as-character-condition
 ^{:name-r "as.character.condition",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.character.condition"))

(def as-character-date
 ^{:name-r "as.character.Date",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.character.Date"))

(def as-character-default
 ^{:name-r "as.character.default",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.character.default"))

(def as-character-error
 ^{:name-r "as.character.error",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.character.error"))

(def as-character-factor
 ^{:name-r "as.character.factor",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.character.factor"))

(def as-character-hexmode
 ^{:name-r "as.character.hexmode",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.character.hexmode"))

(def as-character-numeric-version
 ^{:name-r "as.character.numeric_version",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.character.numeric_version"))

(def as-character-octmode
 ^{:name-r "as.character.octmode",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.character.octmode"))

(def as-character-srcref
 ^{:name-r "as.character.srcref",
  :doc "",
  :argslists ({:x nil, :useSource true, :to nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.character.srcref"))

(def as-complex
 ^{:name-r "as.complex", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "as.complex"))

(def as-data-frame
 ^{:name-r "as.data.frame",
  :doc "",
  :argslists ({:x nil, :row.names nil, :optional false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.data.frame"))

(def as-data-frame-array
 ^{:name-r "as.data.frame.array",
  :doc "",
  :argslists ({:x nil, :row.names nil, :optional false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.data.frame.array"))

(def as-data-frame-as-is
 ^{:name-r "as.data.frame.AsIs",
  :doc "",
  :argslists ({:x nil, :row.names nil, :optional false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.data.frame.AsIs"))

(def as-data-frame-character
 ^{:name-r "as.data.frame.character",
  :doc "",
  :argslists ({:x nil, :... nil, :stringsAsFactors [nil]})}
 (r-interop.core/->clj-pos-kw-fn "as.data.frame.character"))

(def as-data-frame-complex
 ^{:name-r "as.data.frame.complex",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :... nil,
    :nm {:empty-key nil, :collapse " "}})}
 (r-interop.core/->clj-pos-kw-fn "as.data.frame.complex"))

(def as-data-frame-data-frame
 ^{:name-r "as.data.frame.data.frame",
  :doc "",
  :argslists ({:x nil, :row.names nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.data.frame.data.frame"))

(def as-data-frame-date
 ^{:name-r "as.data.frame.Date",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :... nil,
    :nm {:empty-key nil, :collapse " "}})}
 (r-interop.core/->clj-pos-kw-fn "as.data.frame.Date"))

(def as-data-frame-default
 ^{:name-r "as.data.frame.default",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.data.frame.default"))

(def as-data-frame-difftime
 ^{:name-r "as.data.frame.difftime",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :... nil,
    :nm {:empty-key nil, :collapse " "}})}
 (r-interop.core/->clj-pos-kw-fn "as.data.frame.difftime"))

(def as-data-frame-factor
 ^{:name-r "as.data.frame.factor",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :... nil,
    :nm {:empty-key nil, :collapse " "}})}
 (r-interop.core/->clj-pos-kw-fn "as.data.frame.factor"))

(def as-data-frame-integer
 ^{:name-r "as.data.frame.integer",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :... nil,
    :nm {:empty-key nil, :collapse " "}})}
 (r-interop.core/->clj-pos-kw-fn "as.data.frame.integer"))

(def as-data-frame-list
 ^{:name-r "as.data.frame.list",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :... nil,
    :cut.names false,
    :col.names [nil nil],
    :fix.empty.names true,
    :stringsAsFactors [nil]})}
 (r-interop.core/->clj-pos-kw-fn "as.data.frame.list"))

(def as-data-frame-logical
 ^{:name-r "as.data.frame.logical",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :... nil,
    :nm {:empty-key nil, :collapse " "}})}
 (r-interop.core/->clj-pos-kw-fn "as.data.frame.logical"))

(def as-data-frame-matrix
 ^{:name-r "as.data.frame.matrix",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :make.names true,
    :... nil,
    :stringsAsFactors [nil]})}
 (r-interop.core/->clj-pos-kw-fn "as.data.frame.matrix"))

(def as-data-frame-model-matrix
 ^{:name-r "as.data.frame.model.matrix",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :make.names true,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.data.frame.model.matrix"))

(def as-data-frame-noquote
 ^{:name-r "as.data.frame.noquote",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :... nil,
    :nm {:empty-key nil, :collapse " "}})}
 (r-interop.core/->clj-pos-kw-fn "as.data.frame.noquote"))

(def as-data-frame-numeric
 ^{:name-r "as.data.frame.numeric",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :... nil,
    :nm {:empty-key nil, :collapse " "}})}
 (r-interop.core/->clj-pos-kw-fn "as.data.frame.numeric"))

(def as-data-frame-numeric-version
 ^{:name-r "as.data.frame.numeric_version",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :... nil,
    :nm {:empty-key nil, :collapse " "}})}
 (r-interop.core/->clj-pos-kw-fn "as.data.frame.numeric_version"))

(def as-data-frame-ordered
 ^{:name-r "as.data.frame.ordered",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :... nil,
    :nm {:empty-key nil, :collapse " "}})}
 (r-interop.core/->clj-pos-kw-fn "as.data.frame.ordered"))

(def as-data-frame-polyglot-value
 ^{:name-r "as.data.frame.polyglot.value",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :... nil,
    :nm {:empty-key nil, :collapse " "}})}
 (r-interop.core/->clj-pos-kw-fn "as.data.frame.polyglot.value"))

(def as-data-frame-raw
 ^{:name-r "as.data.frame.raw",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :... nil,
    :nm {:empty-key nil, :collapse " "}})}
 (r-interop.core/->clj-pos-kw-fn "as.data.frame.raw"))

(def as-data-frame-table
 ^{:name-r "as.data.frame.table",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :... nil,
    :responseName "Freq",
    :stringsAsFactors true,
    :sep "",
    :base [nil nil]})}
 (r-interop.core/->clj-pos-kw-fn "as.data.frame.table"))

(def as-data-frame-ts
 ^{:name-r "as.data.frame.ts", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.data.frame.ts"))

(def as-data-frame-vector
 ^{:name-r "as.data.frame.vector",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :... nil,
    :nm {:empty-key nil, :collapse " "}})}
 (r-interop.core/->clj-pos-kw-fn "as.data.frame.vector"))

(def as-date
 ^{:name-r "as.Date", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.Date"))

(def as-date-character
 ^{:name-r "as.Date.character",
  :doc "",
  :argslists
  ({:x nil,
    :format nil,
    :tryFormats [nil "%Y-%m-%d" "%Y/%m/%d"],
    :optional false,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.Date.character"))

(def as-date-default
 ^{:name-r "as.Date.default", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.Date.default"))

(def as-date-factor
 ^{:name-r "as.Date.factor", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.Date.factor"))

(def as-date-numeric
 ^{:name-r "as.Date.numeric",
  :doc "",
  :argslists ({:x nil, :origin nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.Date.numeric"))

(def as-difftime
 ^{:name-r "as.difftime",
  :doc "",
  :argslists ({:tim nil, :format "%X", :units "auto"})}
 (r-interop.core/->clj-pos-kw-fn "as.difftime"))

(def as-double
 ^{:name-r "as.double", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "as.double"))

(def as-double-difftime
 ^{:name-r "as.double.difftime",
  :doc "",
  :argslists ({:x nil, :units "auto", :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.double.difftime"))

(def as-environment
 ^{:name-r "as.environment", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "as.environment"))

(def as-expression
 ^{:name-r "as.expression", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.expression"))

(def as-expression-default
 ^{:name-r "as.expression.default",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.expression.default"))

(def as-factor
 ^{:name-r "as.factor", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "as.factor"))

(def as-function
 ^{:name-r "as.function", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.function"))

(def as-function-default
 ^{:name-r "as.function.default",
  :doc "",
  :argslists ({:x nil, :envir [nil], :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.function.default"))

(def as-hexmode
 ^{:name-r "as.hexmode", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "as.hexmode"))

(def as-integer
 ^{:name-r "as.integer", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "as.integer"))

(def as-list
 ^{:name-r "as.list", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.list"))

(def as-list-data-frame
 ^{:name-r "as.list.data.frame",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.list.data.frame"))

(def as-list-date
 ^{:name-r "as.list.Date", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.list.Date"))

(def as-list-default
 ^{:name-r "as.list.default", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.list.default"))

(def as-list-environment
 ^{:name-r "as.list.environment",
  :doc "",
  :argslists ({:x nil, :all.names false, :sorted false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.list.environment"))

(def as-list-factor
 ^{:name-r "as.list.factor", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.list.factor"))

(def as-list-function
 ^{:name-r "as.list.function", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.list.function"))

(def as-list-numeric-version
 ^{:name-r "as.list.numeric_version",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.list.numeric_version"))

(def as-logical
 ^{:name-r "as.logical", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "as.logical"))

(def as-logical-factor
 ^{:name-r "as.logical.factor",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.logical.factor"))

(def as-matrix
 ^{:name-r "as.matrix", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.matrix"))

(def as-matrix-data-frame
 ^{:name-r "as.matrix.data.frame",
  :doc "",
  :argslists ({:x nil, :rownames.force [nil], :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.matrix.data.frame"))

(def as-matrix-default
 ^{:name-r "as.matrix.default",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.matrix.default"))

(def as-matrix-noquote
 ^{:name-r "as.matrix.noquote",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.matrix.noquote"))

(def as-matrix-polyglot-value
 ^{:name-r "as.matrix.polyglot.value",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.matrix.polyglot.value"))

(def as-name
 ^{:name-r "as.name", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "as.name"))

(def as-null
 ^{:name-r "as.null", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.null"))

(def as-null-default
 ^{:name-r "as.null.default", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.null.default"))

(def as-numeric
 ^{:name-r "as.numeric", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "as.numeric"))

(def as-numeric-version
 ^{:name-r "as.numeric_version", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "as.numeric_version"))

(def as-octmode
 ^{:name-r "as.octmode", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "as.octmode"))

(def as-ordered
 ^{:name-r "as.ordered", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "as.ordered"))

(def as-package-version
 ^{:name-r "as.package_version", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "as.package_version"))

(def as-pairlist
 ^{:name-r "as.pairlist", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "as.pairlist"))

(def as-qr
 ^{:name-r "as.qr", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "as.qr"))

(def as-raw
 ^{:name-r "as.raw", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "as.raw"))

(def as-single
 ^{:name-r "as.single", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.single"))

(def as-single-default
 ^{:name-r "as.single.default",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.single.default"))

(def as-symbol
 ^{:name-r "as.symbol", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "as.symbol"))

(def as-table
 ^{:name-r "as.table", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.table"))

(def as-table-default
 ^{:name-r "as.table.default", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.table.default"))

(def as-vector
 ^{:name-r "as.vector", :doc "", :argslists ({:x nil, :mode "any"})}
 (r-interop.core/->clj-pos-kw-fn "as.vector"))

(def as-vector-factor
 ^{:name-r "as.vector.factor",
  :doc "",
  :argslists ({:x nil, :mode "any"})}
 (r-interop.core/->clj-pos-kw-fn "as.vector.factor"))

(def asin
 ^{:name-r "asin", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "asin"))

(def asinh
 ^{:name-r "asinh", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "asinh"))

(def as-namespace
 ^{:name-r "asNamespace",
  :doc "",
  :argslists ({:ns nil, :base.OK true})}
 (r-interop.core/->clj-pos-kw-fn "asNamespace"))

(def as-s-3
 ^{:name-r "asS3",
  :doc "",
  :argslists ({:object nil, :flag true, :complete true})}
 (r-interop.core/->clj-pos-kw-fn "asS3"))

(def as-s-4
 ^{:name-r "asS4",
  :doc "",
  :argslists ({:object nil, :flag true, :complete true})}
 (r-interop.core/->clj-pos-kw-fn "asS4"))

(def assign
 ^{:name-r "assign",
  :doc "",
  :argslists
  ({:x nil,
    :value nil,
    :pos [nil 1],
    :envir [nil nil],
    :inherits false,
    :immediate true})}
 (r-interop.core/->clj-pos-kw-fn "assign"))

(def atan
 ^{:name-r "atan", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "atan"))

(def atan-2
 ^{:name-r "atan2", :doc "", :argslists ({:y nil, :x nil})}
 (r-interop.core/->clj-pos-kw-fn "atan2"))

(def atanh
 ^{:name-r "atanh", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "atanh"))

(def attach
 ^{:name-r "attach",
  :doc "",
  :argslists
  ({:what nil,
    :pos 2,
    :name {:empty-key nil, :backtick false},
    :warn.conflicts true})}
 (r-interop.core/->clj-pos-kw-fn "attach"))

(def attach-namespace
 ^{:name-r "attachNamespace",
  :doc "",
  :argslists ({:ns nil, :pos 2, :depends nil})}
 (r-interop.core/->clj-pos-kw-fn "attachNamespace"))

(def attr
 ^{:name-r "attr", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "attr"))

(def attr-all-equal
 ^{:name-r "attr.all.equal",
  :doc "",
  :argslists
  ({:target nil,
    :current nil,
    :... nil,
    :check.attributes true,
    :check.names true})}
 (r-interop.core/->clj-pos-kw-fn "attr.all.equal"))

(def attributes
 ^{:name-r "attributes", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "attributes"))

(def autoload
 ^{:name-r "autoload",
  :doc "",
  :argslists ({:name nil, :package nil, :reset false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "autoload"))

(def autoloader
 ^{:name-r "autoloader",
  :doc "",
  :argslists ({:name nil, :package nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "autoloader"))

(def backsolve
 ^{:name-r "backsolve",
  :doc "",
  :argslists
  ({:r nil, :x nil, :k [nil nil], :upper.tri true, :transpose false})}
 (r-interop.core/->clj-pos-kw-fn "backsolve"))

(def baseenv
 ^{:name-r "baseenv", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "baseenv"))

(def basename
 ^{:name-r "basename", :doc "", :argslists ({:path nil})}
 (r-interop.core/->clj-pos-kw-fn "basename"))

(def bessel-i
 ^{:name-r "besselI",
  :doc "",
  :argslists ({:x nil, :nu nil, :expon.scaled false})}
 (r-interop.core/->clj-pos-kw-fn "besselI"))

(def bessel-j
 ^{:name-r "besselJ", :doc "", :argslists ({:x nil, :nu nil})}
 (r-interop.core/->clj-pos-kw-fn "besselJ"))

(def bessel-k
 ^{:name-r "besselK",
  :doc "",
  :argslists ({:x nil, :nu nil, :expon.scaled false})}
 (r-interop.core/->clj-pos-kw-fn "besselK"))

(def bessel-y
 ^{:name-r "besselY", :doc "", :argslists ({:x nil, :nu nil})}
 (r-interop.core/->clj-pos-kw-fn "besselY"))

(def beta
 ^{:name-r "beta", :doc "", :argslists ({:a nil, :b nil})}
 (r-interop.core/->clj-pos-kw-fn "beta"))

(def binding-is-active
 ^{:name-r "bindingIsActive",
  :doc "",
  :argslists ({:sym nil, :env nil})}
 (r-interop.core/->clj-pos-kw-fn "bindingIsActive"))

(def binding-is-locked
 ^{:name-r "bindingIsLocked",
  :doc "",
  :argslists ({:sym nil, :env nil})}
 (r-interop.core/->clj-pos-kw-fn "bindingIsLocked"))

(def bindtextdomain
 ^{:name-r "bindtextdomain", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "bindtextdomain"))

(def bitw-and
 ^{:name-r "bitwAnd", :doc "", :argslists ({:a nil, :b nil})}
 (r-interop.core/->clj-pos-kw-fn "bitwAnd"))

(def bitw-not
 ^{:name-r "bitwNot", :doc "", :argslists ({:a nil})}
 (r-interop.core/->clj-pos-kw-fn "bitwNot"))

(def bitw-or
 ^{:name-r "bitwOr", :doc "", :argslists ({:a nil, :b nil})}
 (r-interop.core/->clj-pos-kw-fn "bitwOr"))

(def bitw-shift-l
 ^{:name-r "bitwShiftL", :doc "", :argslists ({:a nil, :n nil})}
 (r-interop.core/->clj-pos-kw-fn "bitwShiftL"))

(def bitw-shift-r
 ^{:name-r "bitwShiftR", :doc "", :argslists ({:a nil, :n nil})}
 (r-interop.core/->clj-pos-kw-fn "bitwShiftR"))

(def bitw-xor
 ^{:name-r "bitwXor", :doc "", :argslists ({:a nil, :b nil})}
 (r-interop.core/->clj-pos-kw-fn "bitwXor"))

(def body
 ^{:name-r "body", :doc "", :argslists ({:fun [nil [nil]]})}
 (r-interop.core/->clj-pos-kw-fn "body"))

(def bquote
 ^{:name-r "bquote", :doc "", :argslists ({:expr nil, :where [nil]})}
 (r-interop.core/->clj-pos-kw-fn "bquote"))

(def browser
 ^{:name-r "browser", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "browser"))

(def browser-condition
 ^{:name-r "browserCondition", :doc "", :argslists ({:n 1})}
 (r-interop.core/->clj-pos-kw-fn "browserCondition"))

(def browser-set-debug
 ^{:name-r "browserSetDebug", :doc "", :argslists ({:n 1})}
 (r-interop.core/->clj-pos-kw-fn "browserSetDebug"))

(def browser-text
 ^{:name-r "browserText", :doc "", :argslists ({:n 1})}
 (r-interop.core/->clj-pos-kw-fn "browserText"))

(def builtins
 ^{:name-r "builtins", :doc "", :argslists ({:internal false})}
 (r-interop.core/->clj-pos-kw-fn "builtins"))

(def by
 ^{:name-r "by",
  :doc "",
  :argslists
  ({:data nil, :INDICES nil, :FUN nil, :... nil, :simplify true})}
 (r-interop.core/->clj-pos-kw-fn "by"))

(def by-data-frame
 ^{:name-r "by.data.frame",
  :doc "",
  :argslists
  ({:data nil, :INDICES nil, :FUN nil, :... nil, :simplify true})}
 (r-interop.core/->clj-pos-kw-fn "by.data.frame"))

(def by-default
 ^{:name-r "by.default",
  :doc "",
  :argslists
  ({:data nil, :INDICES nil, :FUN nil, :... nil, :simplify true})}
 (r-interop.core/->clj-pos-kw-fn "by.default"))

(def bzfile
 ^{:name-r "bzfile",
  :doc "",
  :argslists
  ({:description nil,
    :open "",
    :encoding [nil "encoding"],
    :compression 9})}
 (r-interop.core/->clj-pos-kw-fn "bzfile"))

(def c-date
 ^{:name-r "c.Date", :doc "", :argslists ({:... nil, :recursive false})}
 (r-interop.core/->clj-pos-kw-fn "c.Date"))

(def c-difftime
 ^{:name-r "c.difftime",
  :doc "",
  :argslists ({:... nil, :recursive false})}
 (r-interop.core/->clj-pos-kw-fn "c.difftime"))

(def c-noquote
 ^{:name-r "c.noquote",
  :doc "",
  :argslists ({:... nil, :recursive false})}
 (r-interop.core/->clj-pos-kw-fn "c.noquote"))

(def c-numeric-version
 ^{:name-r "c.numeric_version",
  :doc "",
  :argslists ({:... nil, :recursive false})}
 (r-interop.core/->clj-pos-kw-fn "c.numeric_version"))

(def c-warnings
 ^{:name-r "c.warnings",
  :doc "",
  :argslists ({:... nil, :recursive false})}
 (r-interop.core/->clj-pos-kw-fn "c.warnings"))

(def call
 ^{:name-r "call", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "call"))

(def call-cc
 ^{:name-r "callCC", :doc "", :argslists ({:fun nil})}
 (r-interop.core/->clj-pos-kw-fn "callCC"))

(def capabilities
 ^{:name-r "capabilities", :doc "", :argslists ({:what nil})}
 (r-interop.core/->clj-pos-kw-fn "capabilities"))

(def casefold
 ^{:name-r "casefold", :doc "", :argslists ({:x nil, :upper false})}
 (r-interop.core/->clj-pos-kw-fn "casefold"))

(def cat
 ^{:name-r "cat",
  :doc "",
  :argslists
  ({:... nil,
    :file "",
    :sep " ",
    :fill false,
    :labels nil,
    :append false})}
 (r-interop.core/->clj-pos-kw-fn "cat"))

(def cbind
 ^{:name-r "cbind", :doc "", :argslists ({:... nil, :deparse.level 1})}
 (r-interop.core/->clj-pos-kw-fn "cbind"))

(def cbind-data-frame
 ^{:name-r "cbind.data.frame",
  :doc "",
  :argslists ({:... nil, :deparse.level 1})}
 (r-interop.core/->clj-pos-kw-fn "cbind.data.frame"))

(def ceiling
 ^{:name-r "ceiling", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "ceiling"))

(def char-expand
 ^{:name-r "char.expand",
  :doc "",
  :argslists ({:input nil, :target nil, :nomatch [nil "no match"]})}
 (r-interop.core/->clj-pos-kw-fn "char.expand"))

(def character
 ^{:name-r "character", :doc "", :argslists ({:length 0})}
 (r-interop.core/->clj-pos-kw-fn "character"))

(def charmatch
 ^{:name-r "charmatch",
  :doc "",
  :argslists ({:x nil, :table nil, :nomatch [nil]})}
 (r-interop.core/->clj-pos-kw-fn "charmatch"))

(def char-to-raw
 ^{:name-r "charToRaw", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "charToRaw"))

(def chartr
 ^{:name-r "chartr", :doc "", :argslists ({:old nil, :new nil, :x nil})}
 (r-interop.core/->clj-pos-kw-fn "chartr"))

(def check-tzones
 ^{:name-r "check_tzones", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "check_tzones"))

(def chk-dots
 ^{:name-r "chkDots",
  :doc "",
  :argslists ({:... nil, :which.call [nil 1], :allowed [nil 0]})}
 (r-interop.core/->clj-pos-kw-fn "chkDots"))

(def chol
 ^{:name-r "chol", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "chol"))

(def chol-default
 ^{:name-r "chol.default",
  :doc "",
  :argslists
  ({:x nil, :pivot false, :LINPACK false, :tol [nil 1], :... nil})}
 (r-interop.core/->clj-pos-kw-fn "chol.default"))

(def chol-2inv
 ^{:name-r "chol2inv",
  :doc "",
  :argslists ({:x nil, :size [nil nil], :LINPACK false})}
 (r-interop.core/->clj-pos-kw-fn "chol2inv"))

(def choose
 ^{:name-r "choose", :doc "", :argslists ({:n nil, :k nil})}
 (r-interop.core/->clj-pos-kw-fn "choose"))

(def class
 ^{:name-r "class", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "class"))

(def clear-push-back
 ^{:name-r "clearPushBack", :doc "", :argslists ({:connection nil})}
 (r-interop.core/->clj-pos-kw-fn "clearPushBack"))

(def close
 ^{:name-r "close", :doc "", :argslists ({:con nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "close"))

(def close-connection
 ^{:name-r "close.connection",
  :doc "",
  :argslists ({:con nil, :type "rw", :... nil})}
 (r-interop.core/->clj-pos-kw-fn "close.connection"))

(def close-srcfile
 ^{:name-r "close.srcfile", :doc "", :argslists ({:con nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "close.srcfile"))

(def close-srcfilealias
 ^{:name-r "close.srcfilealias",
  :doc "",
  :argslists ({:con nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "close.srcfilealias"))

(def close-all-connections
 ^{:name-r "closeAllConnections", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "closeAllConnections"))

(def col
 ^{:name-r "col", :doc "", :argslists ({:x nil, :as.factor false})}
 (r-interop.core/->clj-pos-kw-fn "col"))

(def col-means
 ^{:name-r "colMeans",
  :doc "",
  :argslists ({:x nil, :na.rm false, :dims 1})}
 (r-interop.core/->clj-pos-kw-fn "colMeans"))

(def colnames
 ^{:name-r "colnames",
  :doc "",
  :argslists ({:x nil, :do.NULL true, :prefix "col"})}
 (r-interop.core/->clj-pos-kw-fn "colnames"))

(def col-sums
 ^{:name-r "colSums",
  :doc "",
  :argslists ({:x nil, :na.rm false, :dims 1})}
 (r-interop.core/->clj-pos-kw-fn "colSums"))

(def command-args
 ^{:name-r "commandArgs", :doc "", :argslists ({:trailingOnly false})}
 (r-interop.core/->clj-pos-kw-fn "commandArgs"))

(def comment
 ^{:name-r "comment", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "comment"))

(def complex
 ^{:name-r "complex",
  :doc "",
  :argslists
  ({:length.out 0,
    :real [nil],
    :imaginary [nil],
    :modulus 1,
    :argument 0})}
 (r-interop.core/->clj-pos-kw-fn "complex"))

(def compute-restarts
 ^{:name-r "computeRestarts", :doc "", :argslists ({:cond nil})}
 (r-interop.core/->clj-pos-kw-fn "computeRestarts"))

(def condition-call
 ^{:name-r "conditionCall", :doc "", :argslists ({:c nil})}
 (r-interop.core/->clj-pos-kw-fn "conditionCall"))

(def condition-call-condition
 ^{:name-r "conditionCall.condition", :doc "", :argslists ({:c nil})}
 (r-interop.core/->clj-pos-kw-fn "conditionCall.condition"))

(def condition-message
 ^{:name-r "conditionMessage", :doc "", :argslists ({:c nil})}
 (r-interop.core/->clj-pos-kw-fn "conditionMessage"))

(def condition-message-condition
 ^{:name-r "conditionMessage.condition", :doc "", :argslists ({:c nil})}
 (r-interop.core/->clj-pos-kw-fn "conditionMessage.condition"))

(def conflicts
 ^{:name-r "conflicts",
  :doc "",
  :argslists ({:where [nil], :detail false})}
 (r-interop.core/->clj-pos-kw-fn "conflicts"))

(def conj
 ^{:name-r "Conj", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "Conj"))

(def contributors
 ^{:name-r "contributors", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "contributors"))

(def cos
 ^{:name-r "cos", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "cos"))

(def cosh
 ^{:name-r "cosh", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "cosh"))

(def cospi
 ^{:name-r "cospi", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "cospi"))

(def crossprod
 ^{:name-r "crossprod", :doc "", :argslists ({:x nil, :y nil})}
 (r-interop.core/->clj-pos-kw-fn "crossprod"))

(def cstack-info
 ^{:name-r "Cstack_info", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "Cstack_info"))

(def cummax
 ^{:name-r "cummax", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "cummax"))

(def cummin
 ^{:name-r "cummin", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "cummin"))

(def cumprod
 ^{:name-r "cumprod", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "cumprod"))

(def cumsum
 ^{:name-r "cumsum", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "cumsum"))

(def curl-get-headers
 ^{:name-r "curlGetHeaders",
  :doc "",
  :argslists ({:url nil, :redirect true, :verify true})}
 (r-interop.core/->clj-pos-kw-fn "curlGetHeaders"))

(def cut
 ^{:name-r "cut", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "cut"))

(def cut-date
 ^{:name-r "cut.Date",
  :doc "",
  :argslists
  ({:x nil,
    :breaks nil,
    :labels nil,
    :start.on.monday true,
    :right false,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "cut.Date"))

(def cut-default
 ^{:name-r "cut.default",
  :doc "",
  :argslists
  ({:x nil,
    :breaks nil,
    :labels nil,
    :include.lowest false,
    :right true,
    :dig.lab 3,
    :ordered_result false,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "cut.default"))

(def data-class
 ^{:name-r "data.class", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "data.class"))

(def data-frame
 ^{:name-r "data.frame",
  :doc "",
  :argslists
  ({:... nil,
    :row.names nil,
    :check.rows false,
    :check.names true,
    :fix.empty.names true,
    :stringsAsFactors [nil]})}
 (r-interop.core/->clj-pos-kw-fn "data.frame"))

(def data-matrix
 ^{:name-r "data.matrix",
  :doc "",
  :argslists ({:frame nil, :rownames.force [nil]})}
 (r-interop.core/->clj-pos-kw-fn "data.matrix"))

(def date
 ^{:name-r "date", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "date"))

(def debug
 ^{:name-r "debug",
  :doc "",
  :argslists ({:fun nil, :text "", :condition nil, :signature nil})}
 (r-interop.core/->clj-pos-kw-fn "debug"))

(def debugging-state
 ^{:name-r "debuggingState", :doc "", :argslists ({:on nil})}
 (r-interop.core/->clj-pos-kw-fn "debuggingState"))

(def debugonce
 ^{:name-r "debugonce",
  :doc "",
  :argslists ({:fun nil, :text "", :condition nil, :signature nil})}
 (r-interop.core/->clj-pos-kw-fn "debugonce"))

(def default-strings-as-factors
 ^{:name-r "default.stringsAsFactors", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "default.stringsAsFactors"))

(def delayed-assign
 ^{:name-r "delayedAssign",
  :doc "",
  :argslists
  ({:x nil, :value nil, :eval.env [nil 1], :assign.env [nil 1]})}
 (r-interop.core/->clj-pos-kw-fn "delayedAssign"))

(def deparse
 ^{:name-r "deparse",
  :doc "",
  :argslists
  ({:expr nil,
    :width.cutoff 60,
    :backtick [nil [nil nil] [nil "call" "expression" "(" "function"]],
    :control [nil "keepNA" "keepInteger" "niceNames" "showAttributes"],
    :nlines [nil 1]})}
 (r-interop.core/->clj-pos-kw-fn "deparse"))

(def det
 ^{:name-r "det", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "det"))

(def detach
 ^{:name-r "detach",
  :doc "",
  :argslists
  ({:name nil,
    :pos 2,
    :unload false,
    :character.only false,
    :force false})}
 (r-interop.core/->clj-pos-kw-fn "detach"))

(def determinant
 ^{:name-r "determinant",
  :doc "",
  :argslists ({:x nil, :logarithm true, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "determinant"))

(def determinant-matrix
 ^{:name-r "determinant.matrix",
  :doc "",
  :argslists ({:x nil, :logarithm true, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "determinant.matrix"))

(def dget
 ^{:name-r "dget",
  :doc "",
  :argslists ({:file nil, :keep.source false})}
 (r-interop.core/->clj-pos-kw-fn "dget"))

(def diag
 ^{:name-r "diag",
  :doc "",
  :argslists ({:x 1, :nrow nil, :ncol nil, :names true})}
 (r-interop.core/->clj-pos-kw-fn "diag"))

(def diff
 ^{:name-r "diff", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "diff"))

(def diff-date
 ^{:name-r "diff.Date",
  :doc "",
  :argslists ({:x nil, :lag 1, :differences 1, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "diff.Date"))

(def diff-default
 ^{:name-r "diff.default",
  :doc "",
  :argslists ({:x nil, :lag 1, :differences 1, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "diff.default"))

(def diff-difftime
 ^{:name-r "diff.difftime", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "diff.difftime"))

(def difftime
 ^{:name-r "difftime",
  :doc "",
  :argslists
  ({:time1 nil,
    :time2 nil,
    :tz nil,
    :units [nil "auto" "secs" "mins" "hours" "days" "weeks"]})}
 (r-interop.core/->clj-pos-kw-fn "difftime"))

(def digamma
 ^{:name-r "digamma", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "digamma"))

(def dim
 ^{:name-r "dim", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "dim"))

(def dim-data-frame
 ^{:name-r "dim.data.frame", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "dim.data.frame"))

(def dimnames
 ^{:name-r "dimnames", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "dimnames"))

(def dimnames-data-frame
 ^{:name-r "dimnames.data.frame", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "dimnames.data.frame"))

(def dir
 ^{:name-r "dir",
  :doc "",
  :argslists
  ({:path ".",
    :pattern nil,
    :all.files false,
    :full.names false,
    :recursive false,
    :ignore.case false,
    :include.dirs false,
    :no.. false})}
 (r-interop.core/->clj-pos-kw-fn "dir"))

(def dir-create
 ^{:name-r "dir.create",
  :doc "",
  :argslists
  ({:path nil, :showWarnings true, :recursive false, :mode "0777"})}
 (r-interop.core/->clj-pos-kw-fn "dir.create"))

(def dir-exists
 ^{:name-r "dir.exists", :doc "", :argslists ({:paths nil})}
 (r-interop.core/->clj-pos-kw-fn "dir.exists"))

(def dirname
 ^{:name-r "dirname", :doc "", :argslists ({:path nil})}
 (r-interop.core/->clj-pos-kw-fn "dirname"))

(def do-call
 ^{:name-r "do.call",
  :doc "",
  :argslists ({:what nil, :args nil, :quote false, :envir [nil]})}
 (r-interop.core/->clj-pos-kw-fn "do.call"))

(def dont-check
 ^{:name-r "dontCheck", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "dontCheck"))

(def double
 ^{:name-r "double", :doc "", :argslists ({:length 0})}
 (r-interop.core/->clj-pos-kw-fn "double"))

(def dput
 ^{:name-r "dput",
  :doc "",
  :argslists
  ({:x nil,
    :file "",
    :control
    [nil "keepNA" "keepInteger" "niceNames" "showAttributes"]})}
 (r-interop.core/->clj-pos-kw-fn "dput"))

(def d-quote
 ^{:name-r "dQuote", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "dQuote"))

(def drop
 ^{:name-r "drop", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "drop"))

(def droplevels
 ^{:name-r "droplevels", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "droplevels"))

(def droplevels-data-frame
 ^{:name-r "droplevels.data.frame",
  :doc "",
  :argslists ({:x nil, :except nil, :exclude nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "droplevels.data.frame"))

(def droplevels-factor
 ^{:name-r "droplevels.factor",
  :doc "",
  :argslists
  ({:x nil, :exclude [nil [nil [nil nil]] nil [nil]], :... nil})}
 (r-interop.core/->clj-pos-kw-fn "droplevels.factor"))

(def dump
 ^{:name-r "dump",
  :doc "",
  :argslists
  ({:list nil,
    :file "dumpdata.R",
    :append false,
    :control "all",
    :envir [nil],
    :evaluate true})}
 (r-interop.core/->clj-pos-kw-fn "dump"))

(def duplicated
 ^{:name-r "duplicated",
  :doc "",
  :argslists ({:x nil, :incomparables false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "duplicated"))

(def duplicated-array
 ^{:name-r "duplicated.array",
  :doc "",
  :argslists
  ({:x nil,
    :incomparables false,
    :MARGIN 1,
    :fromLast false,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "duplicated.array"))

(def duplicated-data-frame
 ^{:name-r "duplicated.data.frame",
  :doc "",
  :argslists
  ({:x nil, :incomparables false, :fromLast false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "duplicated.data.frame"))

(def duplicated-default
 ^{:name-r "duplicated.default",
  :doc "",
  :argslists
  ({:x nil,
    :incomparables false,
    :fromLast false,
    :nmax [nil],
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "duplicated.default"))

(def duplicated-matrix
 ^{:name-r "duplicated.matrix",
  :doc "",
  :argslists
  ({:x nil,
    :incomparables false,
    :MARGIN 1,
    :fromLast false,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "duplicated.matrix"))

(def duplicated-numeric-version
 ^{:name-r "duplicated.numeric_version",
  :doc "",
  :argslists ({:x nil, :incomparables false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "duplicated.numeric_version"))

(def duplicated-warnings
 ^{:name-r "duplicated.warnings",
  :doc "",
  :argslists ({:x nil, :incomparables false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "duplicated.warnings"))

(def dyn-load
 ^{:name-r "dyn.load",
  :doc "",
  :argslists ({:x nil, :local true, :now true, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "dyn.load"))

(def dyn-unload
 ^{:name-r "dyn.unload", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "dyn.unload"))

(def dyn-get
 ^{:name-r "dynGet",
  :doc "",
  :argslists
  ({:x nil,
    :ifnotfound {:empty-key nil, :domain [nil]},
    :minframe 1,
    :inherits false})}
 (r-interop.core/->clj-pos-kw-fn "dynGet"))

(def eapply
 ^{:name-r "eapply",
  :doc "",
  :argslists
  ({:env nil, :FUN nil, :... nil, :all.names false, :USE.NAMES true})}
 (r-interop.core/->clj-pos-kw-fn "eapply"))

(def eigen
 ^{:name-r "eigen",
  :doc "",
  :argslists
  ({:x nil, :symmetric nil, :only.values false, :EISPACK false})}
 (r-interop.core/->clj-pos-kw-fn "eigen"))

(def emptyenv
 ^{:name-r "emptyenv", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "emptyenv"))

(def enc-2native
 ^{:name-r "enc2native", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "enc2native"))

(def enc-2utf-8
 ^{:name-r "enc2utf8", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "enc2utf8"))

(def encode-string
 ^{:name-r "encodeString",
  :doc "",
  :argslists
  ({:x nil,
    :width 0,
    :quote "",
    :na.encode true,
    :justify [nil "left" "right" "centre" "none"]})}
 (r-interop.core/->clj-pos-kw-fn "encodeString"))

(def encoding
 ^{:name-r "Encoding", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "Encoding"))

(def ends-with
 ^{:name-r "endsWith", :doc "", :argslists ({:x nil, :suffix nil})}
 (r-interop.core/->clj-pos-kw-fn "endsWith"))

(def enquote
 ^{:name-r "enquote", :doc "", :argslists ({:cl nil})}
 (r-interop.core/->clj-pos-kw-fn "enquote"))

(def env-profile
 ^{:name-r "env.profile", :doc "", :argslists ({:env nil})}
 (r-interop.core/->clj-pos-kw-fn "env.profile"))

(def environment
 ^{:name-r "environment", :doc "", :argslists ({:fun nil})}
 (r-interop.core/->clj-pos-kw-fn "environment"))

(def environment-is-locked
 ^{:name-r "environmentIsLocked", :doc "", :argslists ({:env nil})}
 (r-interop.core/->clj-pos-kw-fn "environmentIsLocked"))

(def environment-name
 ^{:name-r "environmentName", :doc "", :argslists ({:env nil})}
 (r-interop.core/->clj-pos-kw-fn "environmentName"))

(def eval-parent
 ^{:name-r "eval.parent", :doc "", :argslists ({:expr nil, :n 1})}
 (r-interop.core/->clj-pos-kw-fn "eval.parent"))

(def eval-polyglot
 ^{:name-r "eval.polyglot", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "eval.polyglot"))

(def evalq
 ^{:name-r "evalq",
  :doc "",
  :argslists
  ({:expr nil,
    :envir [nil],
    :enclos [nil [nil [nil nil] [nil nil]] [nil] [nil]]})}
 (r-interop.core/->clj-pos-kw-fn "evalq"))

(def exists
 ^{:name-r "exists",
  :doc "",
  :argslists
  ({:x nil,
    :where [nil 1],
    :envir [nil [nil nil] [nil nil] [nil nil]],
    :frame nil,
    :mode "any",
    :inherits true})}
 (r-interop.core/->clj-pos-kw-fn "exists"))

(def exp
 ^{:name-r "exp", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "exp"))

(def expand-grid
 ^{:name-r "expand.grid",
  :doc "",
  :argslists
  ({:... nil, :KEEP.OUT.ATTRS true, :stringsAsFactors true})}
 (r-interop.core/->clj-pos-kw-fn "expand.grid"))

(def expm-1
 ^{:name-r "expm1", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "expm1"))

(def export
 ^{:name-r "export", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "export"))

(def expression
 ^{:name-r "expression", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "expression"))

(def ext-soft-version
 ^{:name-r "extSoftVersion", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "extSoftVersion"))

(def factor
 ^{:name-r "factor",
  :doc "",
  :argslists
  ({:x [nil],
    :levels nil,
    :labels nil,
    :exclude [nil],
    :ordered [nil nil],
    :nmax [nil]})}
 (r-interop.core/->clj-pos-kw-fn "factor"))

(def factorial
 ^{:name-r "factorial", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "factorial"))

(def fifo
 ^{:name-r "fifo",
  :doc "",
  :argslists
  ({:description nil,
    :open "",
    :blocking false,
    :encoding [nil "encoding"]})}
 (r-interop.core/->clj-pos-kw-fn "fifo"))

(def file
 ^{:name-r "file",
  :doc "",
  :argslists
  ({:description "",
    :open "",
    :blocking true,
    :encoding [nil "encoding"],
    :raw false,
    :method [nil "url.method" "default"]})}
 (r-interop.core/->clj-pos-kw-fn "file"))

(def file-access
 ^{:name-r "file.access", :doc "", :argslists ({:names nil, :mode 0})}
 (r-interop.core/->clj-pos-kw-fn "file.access"))

(def file-append
 ^{:name-r "file.append",
  :doc "",
  :argslists ({:file1 nil, :file2 nil})}
 (r-interop.core/->clj-pos-kw-fn "file.append"))

(def file-choose
 ^{:name-r "file.choose", :doc "", :argslists ({:new false})}
 (r-interop.core/->clj-pos-kw-fn "file.choose"))

(def file-copy
 ^{:name-r "file.copy",
  :doc "",
  :argslists
  ({:from nil,
    :to nil,
    :overwrite nil,
    :recursive false,
    :copy.mode true,
    :copy.date false})}
 (r-interop.core/->clj-pos-kw-fn "file.copy"))

(def file-create
 ^{:name-r "file.create",
  :doc "",
  :argslists ({:... nil, :showWarnings true})}
 (r-interop.core/->clj-pos-kw-fn "file.create"))

(def file-exists
 ^{:name-r "file.exists", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "file.exists"))

(def file-info
 ^{:name-r "file.info",
  :doc "",
  :argslists ({:... nil, :extra_cols true})}
 (r-interop.core/->clj-pos-kw-fn "file.info"))

(def file-link
 ^{:name-r "file.link", :doc "", :argslists ({:from nil, :to nil})}
 (r-interop.core/->clj-pos-kw-fn "file.link"))

(def file-mode
 ^{:name-r "file.mode", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "file.mode"))

(def file-mtime
 ^{:name-r "file.mtime", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "file.mtime"))

(def file-path
 ^{:name-r "file.path",
  :doc "",
  :argslists ({:... nil, :fsep [nil nil nil]})}
 (r-interop.core/->clj-pos-kw-fn "file.path"))

(def file-remove
 ^{:name-r "file.remove", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "file.remove"))

(def file-rename
 ^{:name-r "file.rename", :doc "", :argslists ({:from nil, :to nil})}
 (r-interop.core/->clj-pos-kw-fn "file.rename"))

(def file-show
 ^{:name-r "file.show",
  :doc "",
  :argslists
  ({:... nil,
    :header [nil "" nil],
    :title "R Information",
    :delete.file false,
    :pager [nil "pager"],
    :encoding ""})}
 (r-interop.core/->clj-pos-kw-fn "file.show"))

(def file-size
 ^{:name-r "file.size", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "file.size"))

(def file-symlink
 ^{:name-r "file.symlink", :doc "", :argslists ({:from nil, :to nil})}
 (r-interop.core/->clj-pos-kw-fn "file.symlink"))

(def filter
 ^{:name-r "Filter", :doc "", :argslists ({:f nil, :x nil})}
 (r-interop.core/->clj-pos-kw-fn "Filter"))

(def find
 ^{:name-r "Find",
  :doc "",
  :argslists ({:f nil, :x nil, :right false, :nomatch nil})}
 (r-interop.core/->clj-pos-kw-fn "Find"))

(def find-package
 ^{:name-r "find.package",
  :doc "",
  :argslists
  ({:package nil,
    :lib.loc nil,
    :quiet false,
    :verbose [nil "verbose"]})}
 (r-interop.core/->clj-pos-kw-fn "find.package"))

(def find-interval
 ^{:name-r "findInterval",
  :doc "",
  :argslists
  ({:x nil,
    :vec nil,
    :rightmost.closed false,
    :all.inside false,
    :left.open false})}
 (r-interop.core/->clj-pos-kw-fn "findInterval"))

(def find-package-env
 ^{:name-r "findPackageEnv", :doc "", :argslists ({:info nil})}
 (r-interop.core/->clj-pos-kw-fn "findPackageEnv"))

(def find-restart
 ^{:name-r "findRestart", :doc "", :argslists ({:name nil, :cond nil})}
 (r-interop.core/->clj-pos-kw-fn "findRestart"))

(def floor
 ^{:name-r "floor", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "floor"))

(def flush
 ^{:name-r "flush", :doc "", :argslists ({:con nil})}
 (r-interop.core/->clj-pos-kw-fn "flush"))

(def flush-connection
 ^{:name-r "flush.connection", :doc "", :argslists ({:con nil})}
 (r-interop.core/->clj-pos-kw-fn "flush.connection"))

(def force
 ^{:name-r "force", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "force"))

(def force-and-call
 ^{:name-r "forceAndCall", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "forceAndCall"))

(def formals
 ^{:name-r "formals", :doc "", :argslists ({:fun [nil [nil]]})}
 (r-interop.core/->clj-pos-kw-fn "formals"))

(def format
 ^{:name-r "format", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "format"))

(def format-as-is
 ^{:name-r "format.AsIs",
  :doc "",
  :argslists ({:x nil, :width 12, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "format.AsIs"))

(def format-data-frame
 ^{:name-r "format.data.frame",
  :doc "",
  :argslists ({:x nil, :... nil, :justify "none"})}
 (r-interop.core/->clj-pos-kw-fn "format.data.frame"))

(def format-date
 ^{:name-r "format.Date", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "format.Date"))

(def format-default
 ^{:name-r "format.default",
  :doc "",
  :argslists
  ({:justify [nil "left" "right" "centre" "none"],
    :big.interval 3,
    :width nil,
    :digits nil,
    :scientific [nil],
    :na.encode true,
    :big.mark "",
    :... nil,
    :trim false,
    :x nil,
    :small.interval 5,
    :decimal.mark [nil "OutDec"],
    :nsmall 0,
    :small.mark "",
    :zero.print nil,
    :drop0trailing false})}
 (r-interop.core/->clj-pos-kw-fn "format.default"))

(def format-difftime
 ^{:name-r "format.difftime", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "format.difftime"))

(def format-factor
 ^{:name-r "format.factor", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "format.factor"))

(def format-hexmode
 ^{:name-r "format.hexmode",
  :doc "",
  :argslists ({:x nil, :width nil, :upper.case false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "format.hexmode"))

(def format-info
 ^{:name-r "format.info",
  :doc "",
  :argslists ({:x nil, :digits nil, :nsmall 0})}
 (r-interop.core/->clj-pos-kw-fn "format.info"))

(def format-library-iqr
 ^{:name-r "format.libraryIQR",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "format.libraryIQR"))

(def format-numeric-version
 ^{:name-r "format.numeric_version",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "format.numeric_version"))

(def format-octmode
 ^{:name-r "format.octmode",
  :doc "",
  :argslists ({:x nil, :width nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "format.octmode"))

(def format-package-info
 ^{:name-r "format.packageInfo",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "format.packageInfo"))

(def format-pval
 ^{:name-r "format.pval",
  :doc "",
  :argslists
  ({:pv nil,
    :digits [nil 1 [nil [nil "digits"] 2]],
    :eps [nil nil nil],
    :na.form "NA",
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "format.pval"))

(def format-summary-default
 ^{:name-r "format.summaryDefault",
  :doc "",
  :argslists
  ({:x nil, :digits [nil 3 [nil [nil "digits"] 3]], :... nil})}
 (r-interop.core/->clj-pos-kw-fn "format.summaryDefault"))

(def format-c
 ^{:name-r "formatC",
  :doc "",
  :argslists
  ({:format nil,
    :preserve.width "individual",
    :flag "",
    :big.interval 3,
    :mode nil,
    :width nil,
    :digits nil,
    :big.mark "",
    :x nil,
    :small.interval 5,
    :decimal.mark [nil "OutDec"],
    :small.mark "",
    :zero.print nil,
    :drop0trailing false})}
 (r-interop.core/->clj-pos-kw-fn "formatC"))

(def format-dl
 ^{:name-r "formatDL",
  :doc "",
  :argslists
  ({:x nil,
    :y nil,
    :style [nil "table" "list"],
    :width [nil 0.9 [nil "width"]],
    :indent nil})}
 (r-interop.core/->clj-pos-kw-fn "formatDL"))

(def forwardsolve
 ^{:name-r "forwardsolve",
  :doc "",
  :argslists
  ({:l nil, :x nil, :k [nil nil], :upper.tri false, :transpose false})}
 (r-interop.core/->clj-pos-kw-fn "forwardsolve"))

(def gamma
 ^{:name-r "gamma", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "gamma"))

(def gc
 ^{:name-r "gc",
  :doc "",
  :argslists ({:verbose [nil "verbose"], :reset false, :full true})}
 (r-interop.core/->clj-pos-kw-fn "gc"))

(def gcinfo
 ^{:name-r "gcinfo", :doc "", :argslists ({:verbose nil})}
 (r-interop.core/->clj-pos-kw-fn "gcinfo"))

(def gctorture
 ^{:name-r "gctorture", :doc "", :argslists ({:on true})}
 (r-interop.core/->clj-pos-kw-fn "gctorture"))

(def gctorture-2
 ^{:name-r "gctorture2",
  :doc "",
  :argslists ({:step nil, :wait nil, :inhibit_release false})}
 (r-interop.core/->clj-pos-kw-fn "gctorture2"))

(def get
 ^{:name-r "get",
  :doc "",
  :argslists
  ({:x nil,
    :pos [nil 1],
    :envir [nil nil],
    :mode "any",
    :inherits true})}
 (r-interop.core/->clj-pos-kw-fn "get"))

(def get-0
 ^{:name-r "get0",
  :doc "",
  :argslists
  ({:x nil,
    :envir [nil [nil 1]],
    :mode "any",
    :inherits true,
    :ifnotfound nil})}
 (r-interop.core/->clj-pos-kw-fn "get0"))

(def get-all-connections
 ^{:name-r "getAllConnections", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "getAllConnections"))

(def get-calling-dll
 ^{:name-r "getCallingDLL",
  :doc "",
  :argslists ({:f [nil [nil 1]], :doStop false})}
 (r-interop.core/->clj-pos-kw-fn "getCallingDLL"))

(def get-calling-dl-le
 ^{:name-r "getCallingDLLe", :doc "", :argslists ({:e nil})}
 (r-interop.core/->clj-pos-kw-fn "getCallingDLLe"))

(def get-connection
 ^{:name-r "getConnection", :doc "", :argslists ({:what nil})}
 (r-interop.core/->clj-pos-kw-fn "getConnection"))

(def get-dll-registered-routines
 ^{:name-r "getDLLRegisteredRoutines",
  :doc "",
  :argslists ({:dll nil, :addNames true})}
 (r-interop.core/->clj-pos-kw-fn "getDLLRegisteredRoutines"))

(def get-dll-registered-routines-character
 ^{:name-r "getDLLRegisteredRoutines.character",
  :doc "",
  :argslists ({:dll nil, :addNames true})}
 (r-interop.core/->clj-pos-kw-fn "getDLLRegisteredRoutines.character"))

(def get-dll-registered-routines-dll-info
 ^{:name-r "getDLLRegisteredRoutines.DLLInfo",
  :doc "",
  :argslists ({:dll nil, :addNames true})}
 (r-interop.core/->clj-pos-kw-fn "getDLLRegisteredRoutines.DLLInfo"))

(def get-element
 ^{:name-r "getElement", :doc "", :argslists ({:object nil, :name nil})}
 (r-interop.core/->clj-pos-kw-fn "getElement"))

(def geterrmessage
 ^{:name-r "geterrmessage", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "geterrmessage"))

(def get-exported-value
 ^{:name-r "getExportedValue",
  :doc "",
  :argslists ({:ns nil, :name nil})}
 (r-interop.core/->clj-pos-kw-fn "getExportedValue"))

(def get-hook
 ^{:name-r "getHook", :doc "", :argslists ({:hookName nil})}
 (r-interop.core/->clj-pos-kw-fn "getHook"))

(def get-loaded-dl-ls
 ^{:name-r "getLoadedDLLs", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "getLoadedDLLs"))

(def get-namespace
 ^{:name-r "getNamespace", :doc "", :argslists ({:name nil})}
 (r-interop.core/->clj-pos-kw-fn "getNamespace"))

(def get-namespace-exports
 ^{:name-r "getNamespaceExports", :doc "", :argslists ({:ns nil})}
 (r-interop.core/->clj-pos-kw-fn "getNamespaceExports"))

(def get-namespace-imports
 ^{:name-r "getNamespaceImports", :doc "", :argslists ({:ns nil})}
 (r-interop.core/->clj-pos-kw-fn "getNamespaceImports"))

(def get-namespace-info
 ^{:name-r "getNamespaceInfo",
  :doc "",
  :argslists ({:ns nil, :which nil})}
 (r-interop.core/->clj-pos-kw-fn "getNamespaceInfo"))

(def get-namespace-name
 ^{:name-r "getNamespaceName", :doc "", :argslists ({:ns nil})}
 (r-interop.core/->clj-pos-kw-fn "getNamespaceName"))

(def get-namespace-users
 ^{:name-r "getNamespaceUsers", :doc "", :argslists ({:ns nil})}
 (r-interop.core/->clj-pos-kw-fn "getNamespaceUsers"))

(def get-namespace-version
 ^{:name-r "getNamespaceVersion", :doc "", :argslists ({:ns nil})}
 (r-interop.core/->clj-pos-kw-fn "getNamespaceVersion"))

(def get-native-symbol-info
 ^{:name-r "getNativeSymbolInfo",
  :doc "",
  :argslists
  ({:name nil,
    :PACKAGE nil,
    :unlist true,
    :withRegistrationInfo false})}
 (r-interop.core/->clj-pos-kw-fn "getNativeSymbolInfo"))

(def get-option
 ^{:name-r "getOption", :doc "", :argslists ({:x nil, :default nil})}
 (r-interop.core/->clj-pos-kw-fn "getOption"))

(def get-rversion
 ^{:name-r "getRversion", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "getRversion"))

(def get-src-lines
 ^{:name-r "getSrcLines",
  :doc "",
  :argslists ({:srcfile nil, :first nil, :last nil})}
 (r-interop.core/->clj-pos-kw-fn "getSrcLines"))

(def get-task-callback-names
 ^{:name-r "getTaskCallbackNames", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "getTaskCallbackNames"))

(def gettext
 ^{:name-r "gettext", :doc "", :argslists ({:... nil, :domain nil})}
 (r-interop.core/->clj-pos-kw-fn "gettext"))

(def gettextf
 ^{:name-r "gettextf",
  :doc "",
  :argslists ({:fmt nil, :... nil, :domain nil})}
 (r-interop.core/->clj-pos-kw-fn "gettextf"))

(def getwd
 ^{:name-r "getwd", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "getwd"))

(def gl
 ^{:name-r "gl",
  :doc "",
  :argslists
  ({:n nil,
    :k nil,
    :length [nil nil nil],
    :labels [nil nil],
    :ordered false})}
 (r-interop.core/->clj-pos-kw-fn "gl"))

(def globalenv
 ^{:name-r "globalenv", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "globalenv"))

(def gregexpr
 ^{:name-r "gregexpr",
  :doc "",
  :argslists
  ({:pattern nil,
    :text nil,
    :ignore.case false,
    :perl false,
    :fixed false,
    :useBytes false})}
 (r-interop.core/->clj-pos-kw-fn "gregexpr"))

(def grep
 ^{:name-r "grep",
  :doc "",
  :argslists
  ({:pattern nil,
    :x nil,
    :ignore.case false,
    :perl false,
    :value false,
    :fixed false,
    :useBytes false,
    :invert false})}
 (r-interop.core/->clj-pos-kw-fn "grep"))

(def grepl
 ^{:name-r "grepl",
  :doc "",
  :argslists
  ({:pattern nil,
    :x nil,
    :ignore.case false,
    :perl false,
    :fixed false,
    :useBytes false})}
 (r-interop.core/->clj-pos-kw-fn "grepl"))

(def grep-raw
 ^{:name-r "grepRaw",
  :doc "",
  :argslists
  ({:pattern nil,
    :x nil,
    :offset 1,
    :ignore.case false,
    :value false,
    :fixed false,
    :all false,
    :invert false})}
 (r-interop.core/->clj-pos-kw-fn "grepRaw"))

(def grouping
 ^{:name-r "grouping", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "grouping"))

(def gsub
 ^{:name-r "gsub",
  :doc "",
  :argslists
  ({:pattern nil,
    :replacement nil,
    :x nil,
    :ignore.case false,
    :perl false,
    :fixed false,
    :useBytes false})}
 (r-interop.core/->clj-pos-kw-fn "gsub"))

(def gzcon
 ^{:name-r "gzcon",
  :doc "",
  :argslists
  ({:con nil, :level 6, :allowNonCompressed true, :text false})}
 (r-interop.core/->clj-pos-kw-fn "gzcon"))

(def gzfile
 ^{:name-r "gzfile",
  :doc "",
  :argslists
  ({:description nil,
    :open "",
    :encoding [nil "encoding"],
    :compression 6})}
 (r-interop.core/->clj-pos-kw-fn "gzfile"))

(def iconv
 ^{:name-r "iconv",
  :doc "",
  :argslists
  ({:x nil, :from "", :to "", :sub [nil], :mark true, :toRaw false})}
 (r-interop.core/->clj-pos-kw-fn "iconv"))

(def iconvlist
 ^{:name-r "iconvlist", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "iconvlist"))

(def icu-get-collate
 ^{:name-r "icuGetCollate",
  :doc "",
  :argslists ({:type [nil "actual" "valid"]})}
 (r-interop.core/->clj-pos-kw-fn "icuGetCollate"))

(def icu-set-collate
 ^{:name-r "icuSetCollate", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "icuSetCollate"))

(def identical
 ^{:name-r "identical",
  :doc "",
  :argslists
  ({:x nil,
    :y nil,
    :num.eq true,
    :single.NA true,
    :attrib.as.set true,
    :ignore.bytecode true,
    :ignore.environment false,
    :ignore.srcref true})}
 (r-interop.core/->clj-pos-kw-fn "identical"))

(def identity
 ^{:name-r "identity", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "identity"))

(def ifelse
 ^{:name-r "ifelse",
  :doc "",
  :argslists ({:test nil, :yes nil, :no nil})}
 (r-interop.core/->clj-pos-kw-fn "ifelse"))

(def im
 ^{:name-r "Im", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "Im"))

(def import
 ^{:name-r "import", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "import"))

(def import-into-env
 ^{:name-r "importIntoEnv",
  :doc "",
  :argslists
  ({:impenv nil, :impnames nil, :expenv nil, :expnames nil})}
 (r-interop.core/->clj-pos-kw-fn "importIntoEnv"))

(def inherits
 ^{:name-r "inherits",
  :doc "",
  :argslists ({:x nil, :what nil, :which false})}
 (r-interop.core/->clj-pos-kw-fn "inherits"))

(def integer
 ^{:name-r "integer", :doc "", :argslists ({:length 0})}
 (r-interop.core/->clj-pos-kw-fn "integer"))

(def interaction
 ^{:name-r "interaction",
  :doc "",
  :argslists ({:... nil, :drop false, :sep ".", :lex.order false})}
 (r-interop.core/->clj-pos-kw-fn "interaction"))

(def interactive
 ^{:name-r "interactive", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "interactive"))

(def intersect
 ^{:name-r "intersect", :doc "", :argslists ({:x nil, :y nil})}
 (r-interop.core/->clj-pos-kw-fn "intersect"))

(def int-to-bits
 ^{:name-r "intToBits", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "intToBits"))

(def int-to-utf-8
 ^{:name-r "intToUtf8",
  :doc "",
  :argslists ({:x nil, :multiple false, :allow_surrogate_pairs false})}
 (r-interop.core/->clj-pos-kw-fn "intToUtf8"))

(def inverse-rle
 ^{:name-r "inverse.rle", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "inverse.rle"))

(def invisible
 ^{:name-r "invisible", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "invisible"))

(def invoke-restart
 ^{:name-r "invokeRestart", :doc "", :argslists ({:r nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "invokeRestart"))

(def invoke-restart-interactively
 ^{:name-r "invokeRestartInteractively", :doc "", :argslists ({:r nil})}
 (r-interop.core/->clj-pos-kw-fn "invokeRestartInteractively"))

(def is-array
 ^{:name-r "is.array", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "is.array"))

(def is-atomic
 ^{:name-r "is.atomic", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "is.atomic"))

(def is-call
 ^{:name-r "is.call", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "is.call"))

(def is-character
 ^{:name-r "is.character", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "is.character"))

(def is-complex
 ^{:name-r "is.complex", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "is.complex"))

(def is-data-frame
 ^{:name-r "is.data.frame", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "is.data.frame"))

(def is-double
 ^{:name-r "is.double", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "is.double"))

(def is-element
 ^{:name-r "is.element", :doc "", :argslists ({:el nil, :set nil})}
 (r-interop.core/->clj-pos-kw-fn "is.element"))

(def is-environment
 ^{:name-r "is.environment", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "is.environment"))

(def is-expression
 ^{:name-r "is.expression", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "is.expression"))

(def is-factor
 ^{:name-r "is.factor", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "is.factor"))

(def is-finite
 ^{:name-r "is.finite", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "is.finite"))

(def is-function
 ^{:name-r "is.function", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "is.function"))

(def is-infinite
 ^{:name-r "is.infinite", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "is.infinite"))

(def is-integer
 ^{:name-r "is.integer", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "is.integer"))

(def is-language
 ^{:name-r "is.language", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "is.language"))

(def is-list
 ^{:name-r "is.list", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "is.list"))

(def is-loaded
 ^{:name-r "is.loaded",
  :doc "",
  :argslists ({:symbol nil, :PACKAGE "", :type ""})}
 (r-interop.core/->clj-pos-kw-fn "is.loaded"))

(def is-logical
 ^{:name-r "is.logical", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "is.logical"))

(def is-matrix
 ^{:name-r "is.matrix", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "is.matrix"))

(def is-na
 ^{:name-r "is.na", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "is.na"))

(def is-na-data-frame
 ^{:name-r "is.na.data.frame", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "is.na.data.frame"))

(def is-na-numeric-version
 ^{:name-r "is.na.numeric_version", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "is.na.numeric_version"))

(def is-name
 ^{:name-r "is.name", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "is.name"))

(def is-nan
 ^{:name-r "is.nan", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "is.nan"))

(def is-null
 ^{:name-r "is.null", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "is.null"))

(def is-numeric
 ^{:name-r "is.numeric", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "is.numeric"))

(def is-numeric-version
 ^{:name-r "is.numeric_version", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "is.numeric_version"))

(def is-numeric-date
 ^{:name-r "is.numeric.Date", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "is.numeric.Date"))

(def is-numeric-difftime
 ^{:name-r "is.numeric.difftime", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "is.numeric.difftime"))

(def is-object
 ^{:name-r "is.object", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "is.object"))

(def is-ordered
 ^{:name-r "is.ordered", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "is.ordered"))

(def is-package-version
 ^{:name-r "is.package_version", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "is.package_version"))

(def is-pairlist
 ^{:name-r "is.pairlist", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "is.pairlist"))

(def is-polyglot-value
 ^{:name-r "is.polyglot.value", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "is.polyglot.value"))

(def is-primitive
 ^{:name-r "is.primitive", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "is.primitive"))

(def is-qr
 ^{:name-r "is.qr", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "is.qr"))

(def is-r
 ^{:name-r "is.R", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "is.R"))

(def is-raw
 ^{:name-r "is.raw", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "is.raw"))

(def is-recursive
 ^{:name-r "is.recursive", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "is.recursive"))

(def is-single
 ^{:name-r "is.single", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "is.single"))

(def is-symbol
 ^{:name-r "is.symbol", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "is.symbol"))

(def is-table
 ^{:name-r "is.table", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "is.table"))

(def is-unsorted
 ^{:name-r "is.unsorted",
  :doc "",
  :argslists ({:x nil, :na.rm false, :strictly false})}
 (r-interop.core/->clj-pos-kw-fn "is.unsorted"))

(def is-vector
 ^{:name-r "is.vector", :doc "", :argslists ({:x nil, :mode "any"})}
 (r-interop.core/->clj-pos-kw-fn "is.vector"))

(def isatty
 ^{:name-r "isatty", :doc "", :argslists ({:con nil})}
 (r-interop.core/->clj-pos-kw-fn "isatty"))

(def is-base-namespace
 ^{:name-r "isBaseNamespace", :doc "", :argslists ({:ns nil})}
 (r-interop.core/->clj-pos-kw-fn "isBaseNamespace"))

(def isdebugged
 ^{:name-r "isdebugged",
  :doc "",
  :argslists ({:fun nil, :signature nil})}
 (r-interop.core/->clj-pos-kw-fn "isdebugged"))

(def is-false
 ^{:name-r "isFALSE", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "isFALSE"))

(def is-incomplete
 ^{:name-r "isIncomplete", :doc "", :argslists ({:con nil})}
 (r-interop.core/->clj-pos-kw-fn "isIncomplete"))

(def is-namespace
 ^{:name-r "isNamespace", :doc "", :argslists ({:ns nil})}
 (r-interop.core/->clj-pos-kw-fn "isNamespace"))

(def is-namespace-loaded
 ^{:name-r "isNamespaceLoaded", :doc "", :argslists ({:name nil})}
 (r-interop.core/->clj-pos-kw-fn "isNamespaceLoaded"))

(def is-odate
 ^{:name-r "ISOdate",
  :doc "",
  :argslists
  ({:year nil,
    :month nil,
    :day nil,
    :hour 12,
    :min 0,
    :sec 0,
    :tz "GMT"})}
 (r-interop.core/->clj-pos-kw-fn "ISOdate"))

(def is-odatetime
 ^{:name-r "ISOdatetime",
  :doc "",
  :argslists
  ({:year nil,
    :month nil,
    :day nil,
    :hour nil,
    :min nil,
    :sec nil,
    :tz ""})}
 (r-interop.core/->clj-pos-kw-fn "ISOdatetime"))

(def is-open
 ^{:name-r "isOpen", :doc "", :argslists ({:con nil, :rw ""})}
 (r-interop.core/->clj-pos-kw-fn "isOpen"))

(def is-restart
 ^{:name-r "isRestart", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "isRestart"))

(def is-s-4
 ^{:name-r "isS4", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "isS4"))

(def is-seekable
 ^{:name-r "isSeekable", :doc "", :argslists ({:con nil})}
 (r-interop.core/->clj-pos-kw-fn "isSeekable"))

(def is-symmetric
 ^{:name-r "isSymmetric", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "isSymmetric"))

(def is-symmetric-matrix
 ^{:name-r "isSymmetric.matrix",
  :doc "",
  :argslists
  ({:object nil,
    :tol [nil 100 [nil nil nil]],
    :tol1 [nil 8 nil],
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "isSymmetric.matrix"))

(def is-true
 ^{:name-r "isTRUE", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "isTRUE"))

(def java-add-to-classpath
 ^{:name-r "java.addToClasspath", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "java.addToClasspath"))

(def java-type
 ^{:name-r "java.type", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "java.type"))

(def jitter
 ^{:name-r "jitter",
  :doc "",
  :argslists ({:x nil, :factor 1, :amount nil})}
 (r-interop.core/->clj-pos-kw-fn "jitter"))

(def julian
 ^{:name-r "julian", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "julian"))

(def julian-date
 ^{:name-r "julian.Date",
  :doc "",
  :argslists ({:x nil, :origin [nil "1970-01-01"], :... nil})}
 (r-interop.core/->clj-pos-kw-fn "julian.Date"))

(def kappa
 ^{:name-r "kappa", :doc "", :argslists ({:z nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "kappa"))

(def kappa-default
 ^{:name-r "kappa.default",
  :doc "",
  :argslists
  ({:z nil,
    :exact false,
    :norm nil,
    :method [nil "qr" "direct"],
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "kappa.default"))

(def kappa-lm
 ^{:name-r "kappa.lm", :doc "", :argslists ({:z nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "kappa.lm"))

(def kappa-qr
 ^{:name-r "kappa.qr", :doc "", :argslists ({:z nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "kappa.qr"))

(def kronecker
 ^{:name-r "kronecker",
  :doc "",
  :argslists
  ({:X nil, :Y nil, :FUN "*", :make.dimnames false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "kronecker"))

(def la-library
 ^{:name-r "La_library", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "La_library"))

(def la-version
 ^{:name-r "La_version", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "La_version"))

(def la-svd
 ^{:name-r "La.svd",
  :doc "",
  :argslists ({:x nil, :nu [nil nil nil], :nv [nil nil nil]})}
 (r-interop.core/->clj-pos-kw-fn "La.svd"))

(def labels
 ^{:name-r "labels", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "labels"))

(def labels-default
 ^{:name-r "labels.default",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "labels.default"))

(def lapply
 ^{:name-r "lapply", :doc "", :argslists ({:X nil, :FUN nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "lapply"))

(def lazy-load
 ^{:name-r "lazyLoad",
  :doc "",
  :argslists ({:filebase nil, :envir [nil], :filter nil})}
 (r-interop.core/->clj-pos-kw-fn "lazyLoad"))

(def lazy-load-d-bexec
 ^{:name-r "lazyLoadDBexec",
  :doc "",
  :argslists ({:filebase nil, :fun nil, :filter nil})}
 (r-interop.core/->clj-pos-kw-fn "lazyLoadDBexec"))

(def lazy-load-d-bfetch
 ^{:name-r "lazyLoadDBfetch", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "lazyLoadDBfetch"))

(def lbeta
 ^{:name-r "lbeta", :doc "", :argslists ({:a nil, :b nil})}
 (r-interop.core/->clj-pos-kw-fn "lbeta"))

(def lchoose
 ^{:name-r "lchoose", :doc "", :argslists ({:n nil, :k nil})}
 (r-interop.core/->clj-pos-kw-fn "lchoose"))

(def length
 ^{:name-r "length", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "length"))

(def lengths
 ^{:name-r "lengths", :doc "", :argslists ({:x nil, :use.names true})}
 (r-interop.core/->clj-pos-kw-fn "lengths"))

(def levels
 ^{:name-r "levels", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "levels"))

(def levels-default
 ^{:name-r "levels.default", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "levels.default"))

(def lfactorial
 ^{:name-r "lfactorial", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "lfactorial"))

(def lgamma
 ^{:name-r "lgamma", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "lgamma"))

(def libcurl-version
 ^{:name-r "libcurlVersion", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "libcurlVersion"))

(def library
 ^{:name-r "library",
  :doc "",
  :argslists
  ({:package nil,
    :quietly false,
    :lib.loc nil,
    :character.only false,
    :warn.conflicts true,
    :pos 2,
    :verbose [nil "verbose"],
    :logical.return false,
    :help nil})}
 (r-interop.core/->clj-pos-kw-fn "library"))

(def library-dynam
 ^{:name-r "library.dynam",
  :doc "",
  :argslists
  ({:chname nil,
    :package nil,
    :lib.loc nil,
    :verbose [nil "verbose"],
    :file.ext [nil nil nil],
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "library.dynam"))

(def library-dynam-unload
 ^{:name-r "library.dynam.unload",
  :doc "",
  :argslists
  ({:chname nil,
    :libpath nil,
    :verbose [nil "verbose"],
    :file.ext [nil nil nil]})}
 (r-interop.core/->clj-pos-kw-fn "library.dynam.unload"))

(def licence
 ^{:name-r "licence", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "licence"))

(def license
 ^{:name-r "license", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "license"))

(def list
 ^{:name-r "list", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "list"))

(def list-dirs
 ^{:name-r "list.dirs",
  :doc "",
  :argslists ({:path ".", :full.names true, :recursive true})}
 (r-interop.core/->clj-pos-kw-fn "list.dirs"))

(def list-files
 ^{:name-r "list.files",
  :doc "",
  :argslists
  ({:path ".",
    :pattern nil,
    :all.files false,
    :full.names false,
    :recursive false,
    :ignore.case false,
    :include.dirs false,
    :no.. false})}
 (r-interop.core/->clj-pos-kw-fn "list.files"))

(def list-2env
 ^{:name-r "list2env",
  :doc "",
  :argslists
  ({:x nil,
    :envir nil,
    :parent [nil],
    :hash [nil [nil [nil nil] 100]],
    :size [nil 29 [nil nil]]})}
 (r-interop.core/->clj-pos-kw-fn "list2env"))

(def load
 ^{:name-r "load",
  :doc "",
  :argslists ({:file nil, :envir [nil], :verbose false})}
 (r-interop.core/->clj-pos-kw-fn "load"))

(def loaded-namespaces
 ^{:name-r "loadedNamespaces", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "loadedNamespaces"))

(def loading-namespace-info
 ^{:name-r "loadingNamespaceInfo", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "loadingNamespaceInfo"))

(def load-namespace
 ^{:name-r "loadNamespace",
  :doc "",
  :argslists
  ({:package nil,
    :lib.loc nil,
    :keep.source [nil "keep.source.pkgs"],
    :partial false,
    :versionCheck nil})}
 (r-interop.core/->clj-pos-kw-fn "loadNamespace"))

(def local
 ^{:name-r "local", :doc "", :argslists ({:expr nil, :envir [nil]})}
 (r-interop.core/->clj-pos-kw-fn "local"))

(def lock-binding
 ^{:name-r "lockBinding", :doc "", :argslists ({:sym nil, :env nil})}
 (r-interop.core/->clj-pos-kw-fn "lockBinding"))

(def lock-environment
 ^{:name-r "lockEnvironment",
  :doc "",
  :argslists ({:env nil, :bindings false})}
 (r-interop.core/->clj-pos-kw-fn "lockEnvironment"))

(def log
 ^{:name-r "log", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "log"))

(def log-10
 ^{:name-r "log10", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "log10"))

(def log-1p
 ^{:name-r "log1p", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "log1p"))

(def log-2
 ^{:name-r "log2", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "log2"))

(def logb
 ^{:name-r "logb", :doc "", :argslists ({:x nil, :base [nil 1]})}
 (r-interop.core/->clj-pos-kw-fn "logb"))

(def logical
 ^{:name-r "logical", :doc "", :argslists ({:length 0})}
 (r-interop.core/->clj-pos-kw-fn "logical"))

(def lower-tri
 ^{:name-r "lower.tri", :doc "", :argslists ({:x nil, :diag false})}
 (r-interop.core/->clj-pos-kw-fn "lower.tri"))

(def ls
 ^{:name-r "ls",
  :doc "",
  :argslists
  ({:name nil,
    :pos [nil 1],
    :envir [nil nil],
    :all.names false,
    :pattern nil,
    :sorted true})}
 (r-interop.core/->clj-pos-kw-fn "ls"))

(def make-names
 ^{:name-r "make.names",
  :doc "",
  :argslists ({:names nil, :unique false, :allow_ true})}
 (r-interop.core/->clj-pos-kw-fn "make.names"))

(def make-unique
 ^{:name-r "make.unique", :doc "", :argslists ({:names nil, :sep "."})}
 (r-interop.core/->clj-pos-kw-fn "make.unique"))

(def make-active-binding
 ^{:name-r "makeActiveBinding",
  :doc "",
  :argslists ({:sym nil, :fun nil, :env nil})}
 (r-interop.core/->clj-pos-kw-fn "makeActiveBinding"))

(def map
 ^{:name-r "Map", :doc "", :argslists ({:f nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "Map"))

(def mapply
 ^{:name-r "mapply",
  :doc "",
  :argslists
  ({:FUN nil,
    :... nil,
    :MoreArgs nil,
    :SIMPLIFY true,
    :USE.NAMES true})}
 (r-interop.core/->clj-pos-kw-fn "mapply"))

(def margin-table
 ^{:name-r "margin.table", :doc "", :argslists ({:x nil, :margin nil})}
 (r-interop.core/->clj-pos-kw-fn "margin.table"))

(def mat-or-vec
 ^{:name-r "mat.or.vec", :doc "", :argslists ({:nr nil, :nc nil})}
 (r-interop.core/->clj-pos-kw-fn "mat.or.vec"))

(def match
 ^{:name-r "match",
  :doc "",
  :argslists
  ({:x nil, :table nil, :nomatch [nil], :incomparables nil})}
 (r-interop.core/->clj-pos-kw-fn "match"))

(def match-arg
 ^{:name-r "match.arg",
  :doc "",
  :argslists ({:arg nil, :choices nil, :several.ok false})}
 (r-interop.core/->clj-pos-kw-fn "match.arg"))

(def match-call
 ^{:name-r "match.call",
  :doc "",
  :argslists
  ({:definition [nil [nil]],
    :call [nil [nil]],
    :expand.dots true,
    :envir [nil 2]})}
 (r-interop.core/->clj-pos-kw-fn "match.call"))

(def match-fun
 ^{:name-r "match.fun", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "match.fun"))

(def math-data-frame
 ^{:name-r "Math.data.frame", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "Math.data.frame"))

(def math-date
 ^{:name-r "Math.Date", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "Math.Date"))

(def math-difftime
 ^{:name-r "Math.difftime", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "Math.difftime"))

(def math-factor
 ^{:name-r "Math.factor", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "Math.factor"))

(def matrix
 ^{:name-r "matrix",
  :doc "",
  :argslists
  ({:data [nil], :nrow 1, :ncol 1, :byrow false, :dimnames nil})}
 (r-interop.core/->clj-pos-kw-fn "matrix"))

(def max
 ^{:name-r "max", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "max"))

(def max-col
 ^{:name-r "max.col",
  :doc "",
  :argslists ({:m nil, :ties.method [nil "random" "first" "last"]})}
 (r-interop.core/->clj-pos-kw-fn "max.col"))

(def mean
 ^{:name-r "mean", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "mean"))

(def mean-date
 ^{:name-r "mean.Date", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "mean.Date"))

(def mean-default
 ^{:name-r "mean.default",
  :doc "",
  :argslists ({:x nil, :trim 0, :na.rm false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "mean.default"))

(def mean-difftime
 ^{:name-r "mean.difftime", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "mean.difftime"))

(def mem-limits
 ^{:name-r "mem.limits",
  :doc "",
  :argslists ({:nsize [nil], :vsize [nil]})}
 (r-interop.core/->clj-pos-kw-fn "mem.limits"))

(def mem-compress
 ^{:name-r "memCompress",
  :doc "",
  :argslists ({:from nil, :type [nil "gzip" "bzip2" "xz" "none"]})}
 (r-interop.core/->clj-pos-kw-fn "memCompress"))

(def mem-decompress
 ^{:name-r "memDecompress",
  :doc "",
  :argslists
  ({:from nil,
    :type [nil "unknown" "gzip" "bzip2" "xz" "none"],
    :asChar false})}
 (r-interop.core/->clj-pos-kw-fn "memDecompress"))

(def memory-profile
 ^{:name-r "memory.profile", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "memory.profile"))

(def merge
 ^{:name-r "merge", :doc "", :argslists ({:x nil, :y nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "merge"))

(def merge-data-frame
 ^{:name-r "merge.data.frame",
  :doc "",
  :argslists
  ({:y nil,
    :suffixes [nil ".x" ".y"],
    :by.y nil,
    :all.x nil,
    :by.x nil,
    :no.dups true,
    :incomparables nil,
    :all false,
    :... nil,
    :all.y nil,
    :by [nil [nil nil] [nil nil]],
    :x nil,
    :sort true})}
 (r-interop.core/->clj-pos-kw-fn "merge.data.frame"))

(def merge-default
 ^{:name-r "merge.default",
  :doc "",
  :argslists ({:x nil, :y nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "merge.default"))

(def message
 ^{:name-r "message",
  :doc "",
  :argslists ({:... nil, :domain nil, :appendLF true})}
 (r-interop.core/->clj-pos-kw-fn "message"))

(def mget
 ^{:name-r "mget",
  :doc "",
  :argslists
  ({:x nil,
    :envir [nil [nil 1]],
    :mode "any",
    :ifnotfound nil,
    :inherits false})}
 (r-interop.core/->clj-pos-kw-fn "mget"))

(def min
 ^{:name-r "min", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "min"))

(def missing
 ^{:name-r "missing", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "missing"))

(def mod
 ^{:name-r "Mod", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "Mod"))

(def mode
 ^{:name-r "mode", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "mode"))

(def months
 ^{:name-r "months", :doc "", :argslists ({:x nil, :abbreviate nil})}
 (r-interop.core/->clj-pos-kw-fn "months"))

(def months-date
 ^{:name-r "months.Date",
  :doc "",
  :argslists ({:x nil, :abbreviate false})}
 (r-interop.core/->clj-pos-kw-fn "months.Date"))

(def names
 ^{:name-r "names", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "names"))

(def namespace-export
 ^{:name-r "namespaceExport",
  :doc "",
  :argslists ({:ns nil, :vars nil})}
 (r-interop.core/->clj-pos-kw-fn "namespaceExport"))

(def namespace-import
 ^{:name-r "namespaceImport",
  :doc "",
  :argslists ({:self nil, :... nil, :from nil, :except [nil 0]})}
 (r-interop.core/->clj-pos-kw-fn "namespaceImport"))

(def namespace-import-classes
 ^{:name-r "namespaceImportClasses",
  :doc "",
  :argslists ({:self nil, :ns nil, :vars nil, :from nil})}
 (r-interop.core/->clj-pos-kw-fn "namespaceImportClasses"))

(def namespace-import-from
 ^{:name-r "namespaceImportFrom",
  :doc "",
  :argslists
  ({:self nil,
    :ns nil,
    :vars nil,
    :generics nil,
    :packages nil,
    :from "non-package environment",
    :except [nil 0]})}
 (r-interop.core/->clj-pos-kw-fn "namespaceImportFrom"))

(def namespace-import-methods
 ^{:name-r "namespaceImportMethods",
  :doc "",
  :argslists ({:self nil, :ns nil, :vars nil, :from nil})}
 (r-interop.core/->clj-pos-kw-fn "namespaceImportMethods"))

(def nargs
 ^{:name-r "nargs", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "nargs"))

(def nchar
 ^{:name-r "nchar",
  :doc "",
  :argslists ({:x nil, :type "chars", :allowNA false, :keepNA [nil]})}
 (r-interop.core/->clj-pos-kw-fn "nchar"))

(def ncol
 ^{:name-r "ncol", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "ncol"))

(def ncol
 ^{:name-r "NCOL", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "NCOL"))

(def negate
 ^{:name-r "Negate", :doc "", :argslists ({:f nil})}
 (r-interop.core/->clj-pos-kw-fn "Negate"))

(def new-env
 ^{:name-r "new.env",
  :doc "",
  :argslists ({:hash true, :parent [nil], :size 29})}
 (r-interop.core/->clj-pos-kw-fn "new.env"))

(def next-method
 ^{:name-r "NextMethod", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "NextMethod"))

(def ngettext
 ^{:name-r "ngettext",
  :doc "",
  :argslists ({:n nil, :msg1 nil, :msg2 nil, :domain nil})}
 (r-interop.core/->clj-pos-kw-fn "ngettext"))

(def nlevels
 ^{:name-r "nlevels", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "nlevels"))

(def noquote
 ^{:name-r "noquote", :doc "", :argslists ({:obj nil, :right false})}
 (r-interop.core/->clj-pos-kw-fn "noquote"))

(def norm
 ^{:name-r "norm",
  :doc "",
  :argslists ({:x nil, :type [nil "O" "I" "F" "M" "2"]})}
 (r-interop.core/->clj-pos-kw-fn "norm"))

(def normalize-path
 ^{:name-r "normalizePath",
  :doc "",
  :argslists ({:path nil, :winslash "\\", :mustWork [nil]})}
 (r-interop.core/->clj-pos-kw-fn "normalizePath"))

(def nrow
 ^{:name-r "nrow", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "nrow"))

(def nrow
 ^{:name-r "NROW", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "NROW"))

(def numeric
 ^{:name-r "numeric", :doc "", :argslists ({:length 0})}
 (r-interop.core/->clj-pos-kw-fn "numeric"))

(def numeric-version
 ^{:name-r "numeric_version",
  :doc "",
  :argslists ({:x nil, :strict true})}
 (r-interop.core/->clj-pos-kw-fn "numeric_version"))

(def nzchar
 ^{:name-r "nzchar", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "nzchar"))

(def objects
 ^{:name-r "objects",
  :doc "",
  :argslists
  ({:name nil,
    :pos [nil 1],
    :envir [nil nil],
    :all.names false,
    :pattern nil,
    :sorted true})}
 (r-interop.core/->clj-pos-kw-fn "objects"))

(def old-class
 ^{:name-r "oldClass", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "oldClass"))

(def olson-names
 ^{:name-r "OlsonNames", :doc "", :argslists ({:tzdir nil})}
 (r-interop.core/->clj-pos-kw-fn "OlsonNames"))

(def on-exit
 ^{:name-r "on.exit", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "on.exit"))

(def open
 ^{:name-r "open", :doc "", :argslists ({:con nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "open"))

(def open-connection
 ^{:name-r "open.connection",
  :doc "",
  :argslists ({:con nil, :open "r", :blocking true, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "open.connection"))

(def open-srcfile
 ^{:name-r "open.srcfile",
  :doc "",
  :argslists ({:con nil, :line nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "open.srcfile"))

(def open-srcfilealias
 ^{:name-r "open.srcfilealias",
  :doc "",
  :argslists ({:con nil, :line nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "open.srcfilealias"))

(def open-srcfilecopy
 ^{:name-r "open.srcfilecopy",
  :doc "",
  :argslists ({:con nil, :line nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "open.srcfilecopy"))

(def ops-data-frame
 ^{:name-r "Ops.data.frame", :doc "", :argslists ({:e1 nil, :e2 nil})}
 (r-interop.core/->clj-pos-kw-fn "Ops.data.frame"))

(def ops-date
 ^{:name-r "Ops.Date", :doc "", :argslists ({:e1 nil, :e2 nil})}
 (r-interop.core/->clj-pos-kw-fn "Ops.Date"))

(def ops-difftime
 ^{:name-r "Ops.difftime", :doc "", :argslists ({:e1 nil, :e2 nil})}
 (r-interop.core/->clj-pos-kw-fn "Ops.difftime"))

(def ops-factor
 ^{:name-r "Ops.factor", :doc "", :argslists ({:e1 nil, :e2 nil})}
 (r-interop.core/->clj-pos-kw-fn "Ops.factor"))

(def ops-numeric-version
 ^{:name-r "Ops.numeric_version",
  :doc "",
  :argslists ({:e1 nil, :e2 nil})}
 (r-interop.core/->clj-pos-kw-fn "Ops.numeric_version"))

(def ops-ordered
 ^{:name-r "Ops.ordered", :doc "", :argslists ({:e1 nil, :e2 nil})}
 (r-interop.core/->clj-pos-kw-fn "Ops.ordered"))

(def options
 ^{:name-r "options", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "options"))

(def order
 ^{:name-r "order",
  :doc "",
  :argslists
  ({:... nil,
    :na.last true,
    :decreasing false,
    :method [nil "auto" "shell" "radix"]})}
 (r-interop.core/->clj-pos-kw-fn "order"))

(def ordered
 ^{:name-r "ordered", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "ordered"))

(def outer
 ^{:name-r "outer",
  :doc "",
  :argslists ({:X nil, :Y nil, :FUN "*", :... nil})}
 (r-interop.core/->clj-pos-kw-fn "outer"))

(def package-version
 ^{:name-r "package_version",
  :doc "",
  :argslists ({:x nil, :strict true})}
 (r-interop.core/->clj-pos-kw-fn "package_version"))

(def package-event
 ^{:name-r "packageEvent",
  :doc "",
  :argslists
  ({:pkgname nil, :event [nil "onLoad" "attach" "detach" "onUnload"]})}
 (r-interop.core/->clj-pos-kw-fn "packageEvent"))

(def package-has-namespace
 ^{:name-r "packageHasNamespace",
  :doc "",
  :argslists ({:package nil, :package.lib nil})}
 (r-interop.core/->clj-pos-kw-fn "packageHasNamespace"))

(def package-startup-message
 ^{:name-r "packageStartupMessage",
  :doc "",
  :argslists ({:... nil, :domain nil, :appendLF true})}
 (r-interop.core/->clj-pos-kw-fn "packageStartupMessage"))

(def pack-bits
 ^{:name-r "packBits",
  :doc "",
  :argslists ({:x nil, :type [nil "raw" "integer"]})}
 (r-interop.core/->clj-pos-kw-fn "packBits"))

(def pairlist
 ^{:name-r "pairlist", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "pairlist"))

(def parent-env
 ^{:name-r "parent.env", :doc "", :argslists ({:env nil})}
 (r-interop.core/->clj-pos-kw-fn "parent.env"))

(def parent-frame
 ^{:name-r "parent.frame", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "parent.frame"))

(def parse
 ^{:name-r "parse",
  :doc "",
  :argslists
  ({:file "",
    :n nil,
    :text nil,
    :prompt "?",
    :keep.source [nil "keep.source"],
    :srcfile nil,
    :encoding "unknown"})}
 (r-interop.core/->clj-pos-kw-fn "parse"))

(def parse-namespace-file
 ^{:name-r "parseNamespaceFile",
  :doc "",
  :argslists ({:package nil, :package.lib nil, :mustExist true})}
 (r-interop.core/->clj-pos-kw-fn "parseNamespaceFile"))

(def paste
 ^{:name-r "paste",
  :doc "",
  :argslists ({:... nil, :sep " ", :collapse nil})}
 (r-interop.core/->clj-pos-kw-fn "paste"))

(def paste-0
 ^{:name-r "paste0", :doc "", :argslists ({:... nil, :collapse nil})}
 (r-interop.core/->clj-pos-kw-fn "paste0"))

(def path-expand
 ^{:name-r "path.expand", :doc "", :argslists ({:path nil})}
 (r-interop.core/->clj-pos-kw-fn "path.expand"))

(def path-package
 ^{:name-r "path.package",
  :doc "",
  :argslists ({:package nil, :quiet false})}
 (r-interop.core/->clj-pos-kw-fn "path.package"))

(def pcre-config
 ^{:name-r "pcre_config", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "pcre_config"))

(def pentagamma
 ^{:name-r "pentagamma", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "pentagamma"))

(def pipe
 ^{:name-r "pipe",
  :doc "",
  :argslists
  ({:description nil, :open "", :encoding [nil "encoding"]})}
 (r-interop.core/->clj-pos-kw-fn "pipe"))

(def pmatch
 ^{:name-r "pmatch",
  :doc "",
  :argslists
  ({:x nil, :table nil, :nomatch [nil], :duplicates.ok false})}
 (r-interop.core/->clj-pos-kw-fn "pmatch"))

(def pmax
 ^{:name-r "pmax", :doc "", :argslists ({:... nil, :na.rm false})}
 (r-interop.core/->clj-pos-kw-fn "pmax"))

(def pmax-int
 ^{:name-r "pmax.int", :doc "", :argslists ({:... nil, :na.rm false})}
 (r-interop.core/->clj-pos-kw-fn "pmax.int"))

(def pmin
 ^{:name-r "pmin", :doc "", :argslists ({:... nil, :na.rm false})}
 (r-interop.core/->clj-pos-kw-fn "pmin"))

(def pmin-int
 ^{:name-r "pmin.int", :doc "", :argslists ({:... nil, :na.rm false})}
 (r-interop.core/->clj-pos-kw-fn "pmin.int"))

(def polyroot
 ^{:name-r "polyroot", :doc "", :argslists ({:z nil})}
 (r-interop.core/->clj-pos-kw-fn "polyroot"))

(def pos-to-env
 ^{:name-r "pos.to.env", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "pos.to.env"))

(def position
 ^{:name-r "Position",
  :doc "",
  :argslists ({:f nil, :x nil, :right false, :nomatch [nil]})}
 (r-interop.core/->clj-pos-kw-fn "Position"))

(def pretty
 ^{:name-r "pretty", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "pretty"))

(def pretty-default
 ^{:name-r "pretty.default",
  :doc "",
  :argslists
  ({:x nil,
    :n 5,
    :min.n [nil nil 3],
    :shrink.sml 0.75,
    :high.u.bias 1.5,
    :u5.bias [nil 0.5 [nil 1.5 nil]],
    :eps.correct 0,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "pretty.default"))

(def pretty-num
 ^{:name-r "prettyNum",
  :doc "",
  :argslists
  ({:preserve.width [nil "common" "individual" "none"],
    :big.interval 3,
    :big.mark "",
    :... nil,
    :input.d.mark nil,
    :x nil,
    :small.interval 5,
    :decimal.mark [nil "OutDec"],
    :is.cmplx [nil],
    :small.mark "",
    :zero.print nil,
    :drop0trailing false})}
 (r-interop.core/->clj-pos-kw-fn "prettyNum"))

(def print
 ^{:name-r "print", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print"))

(def print-as-is
 ^{:name-r "print.AsIs", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.AsIs"))

(def print-by
 ^{:name-r "print.by",
  :doc "",
  :argslists ({:x nil, :... nil, :vsep nil})}
 (r-interop.core/->clj-pos-kw-fn "print.by"))

(def print-condition
 ^{:name-r "print.condition", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.condition"))

(def print-connection
 ^{:name-r "print.connection", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.connection"))

(def print-data-frame
 ^{:name-r "print.data.frame",
  :doc "",
  :argslists
  ({:x nil,
    :... nil,
    :digits nil,
    :quote false,
    :right true,
    :row.names true})}
 (r-interop.core/->clj-pos-kw-fn "print.data.frame"))

(def print-date
 ^{:name-r "print.Date",
  :doc "",
  :argslists ({:x nil, :max nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.Date"))

(def print-default
 ^{:name-r "print.default",
  :doc "",
  :argslists
  ({:print.gap nil,
    :digits nil,
    :useSource true,
    :quote true,
    :max nil,
    :... nil,
    :right false,
    :x nil,
    :na.print nil})}
 (r-interop.core/->clj-pos-kw-fn "print.default"))

(def print-difftime
 ^{:name-r "print.difftime",
  :doc "",
  :argslists ({:x nil, :digits [nil "digits"], :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.difftime"))

(def print-dlist
 ^{:name-r "print.Dlist", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.Dlist"))

(def print-dll-info
 ^{:name-r "print.DLLInfo", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.DLLInfo"))

(def print-dll-info-list
 ^{:name-r "print.DLLInfoList",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.DLLInfoList"))

(def print-dll-registered-routines
 ^{:name-r "print.DLLRegisteredRoutines",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.DLLRegisteredRoutines"))

(def print-eigen
 ^{:name-r "print.eigen", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.eigen"))

(def print-factor
 ^{:name-r "print.factor",
  :doc "",
  :argslists
  ({:x nil,
    :quote false,
    :max.levels nil,
    :width [nil "width"],
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.factor"))

(def print-function
 ^{:name-r "print.function",
  :doc "",
  :argslists ({:x nil, :useSource true, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.function"))

(def print-hexmode
 ^{:name-r "print.hexmode", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.hexmode"))

(def print-library-iqr
 ^{:name-r "print.libraryIQR", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.libraryIQR"))

(def print-listof
 ^{:name-r "print.listof", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.listof"))

(def print-native-routine-list
 ^{:name-r "print.NativeRoutineList",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.NativeRoutineList"))

(def print-noquote
 ^{:name-r "print.noquote",
  :doc "",
  :argslists ({:x nil, :quote false, :right false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.noquote"))

(def print-numeric-version
 ^{:name-r "print.numeric_version",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.numeric_version"))

(def print-octmode
 ^{:name-r "print.octmode", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.octmode"))

(def print-package-info
 ^{:name-r "print.packageInfo",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.packageInfo"))

(def print-proc-time
 ^{:name-r "print.proc_time", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.proc_time"))

(def print-restart
 ^{:name-r "print.restart", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.restart"))

(def print-rle
 ^{:name-r "print.rle",
  :doc "",
  :argslists ({:x nil, :digits [nil "digits"], :prefix "", :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.rle"))

(def print-simple-list
 ^{:name-r "print.simple.list",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.simple.list"))

(def print-srcfile
 ^{:name-r "print.srcfile", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.srcfile"))

(def print-srcref
 ^{:name-r "print.srcref",
  :doc "",
  :argslists ({:x nil, :useSource true, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.srcref"))

(def print-summary-table
 ^{:name-r "print.summary.table",
  :doc "",
  :argslists
  ({:x nil, :digits [nil 1 [nil [nil "digits"] 3]], :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.summary.table"))

(def print-summary-warnings
 ^{:name-r "print.summary.warnings",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.summary.warnings"))

(def print-summary-default
 ^{:name-r "print.summaryDefault",
  :doc "",
  :argslists
  ({:x nil, :digits [nil 3 [nil [nil "digits"] 3]], :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.summaryDefault"))

(def print-table
 ^{:name-r "print.table",
  :doc "",
  :argslists
  ({:x nil,
    :digits [nil "digits"],
    :quote false,
    :na.print "",
    :zero.print "0",
    :right [nil [nil nil] [nil nil]],
    :justify "none",
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.table"))

(def print-warnings
 ^{:name-r "print.warnings",
  :doc "",
  :argslists
  ({:x nil,
    :tags nil,
    :header [nil nil "Warning message:\n" "Warning messages:\n"],
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "print.warnings"))

(def prmatrix
 ^{:name-r "prmatrix",
  :doc "",
  :argslists
  ({:x nil,
    :rowlab [nil nil 1],
    :collab [nil nil 2],
    :quote true,
    :right false,
    :na.print nil,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "prmatrix"))

(def proc-time
 ^{:name-r "proc.time", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "proc.time"))

(def prod
 ^{:name-r "prod", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "prod"))

(def prop-table
 ^{:name-r "prop.table", :doc "", :argslists ({:x nil, :margin nil})}
 (r-interop.core/->clj-pos-kw-fn "prop.table"))

(def provide-dimnames
 ^{:name-r "provideDimnames",
  :doc "",
  :argslists ({:x nil, :sep "", :base [nil nil], :unique true})}
 (r-interop.core/->clj-pos-kw-fn "provideDimnames"))

(def psigamma
 ^{:name-r "psigamma", :doc "", :argslists ({:x nil, :deriv 0})}
 (r-interop.core/->clj-pos-kw-fn "psigamma"))

(def push-back
 ^{:name-r "pushBack",
  :doc "",
  :argslists
  ({:data nil,
    :connection nil,
    :newLine true,
    :encoding [nil "" "bytes" "UTF-8"]})}
 (r-interop.core/->clj-pos-kw-fn "pushBack"))

(def push-back-length
 ^{:name-r "pushBackLength", :doc "", :argslists ({:connection nil})}
 (r-interop.core/->clj-pos-kw-fn "pushBackLength"))

(def qr
 ^{:name-r "qr", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "qr"))

(def qr-coef
 ^{:name-r "qr.coef", :doc "", :argslists ({:qr nil, :y nil})}
 (r-interop.core/->clj-pos-kw-fn "qr.coef"))

(def qr-default
 ^{:name-r "qr.default",
  :doc "",
  :argslists ({:x nil, :tol 1.0E-7, :LAPACK false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "qr.default"))

(def qr-fitted
 ^{:name-r "qr.fitted",
  :doc "",
  :argslists ({:qr nil, :y nil, :k [nil nil nil]})}
 (r-interop.core/->clj-pos-kw-fn "qr.fitted"))

(def qr-q
 ^{:name-r "qr.Q",
  :doc "",
  :argslists ({:qr nil, :complete false, :Dvec nil})}
 (r-interop.core/->clj-pos-kw-fn "qr.Q"))

(def qr-qty
 ^{:name-r "qr.qty", :doc "", :argslists ({:qr nil, :y nil})}
 (r-interop.core/->clj-pos-kw-fn "qr.qty"))

(def qr-qy
 ^{:name-r "qr.qy", :doc "", :argslists ({:qr nil, :y nil})}
 (r-interop.core/->clj-pos-kw-fn "qr.qy"))

(def qr-r
 ^{:name-r "qr.R", :doc "", :argslists ({:qr nil, :complete false})}
 (r-interop.core/->clj-pos-kw-fn "qr.R"))

(def qr-resid
 ^{:name-r "qr.resid", :doc "", :argslists ({:qr nil, :y nil})}
 (r-interop.core/->clj-pos-kw-fn "qr.resid"))

(def qr-solve
 ^{:name-r "qr.solve",
  :doc "",
  :argslists ({:a nil, :b nil, :tol 1.0E-7})}
 (r-interop.core/->clj-pos-kw-fn "qr.solve"))

(def qr-x
 ^{:name-r "qr.X",
  :doc "",
  :argslists
  ({:qr nil,
    :complete false,
    :ncol [nil nil [nil nil] [nil [nil nil]]]})}
 (r-interop.core/->clj-pos-kw-fn "qr.X"))

(def quarters
 ^{:name-r "quarters", :doc "", :argslists ({:x nil, :abbreviate nil})}
 (r-interop.core/->clj-pos-kw-fn "quarters"))

(def quarters-date
 ^{:name-r "quarters.Date", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "quarters.Date"))

(def quit
 ^{:name-r "quit",
  :doc "",
  :argslists ({:save "default", :status 0, :runLast true})}
 (r-interop.core/->clj-pos-kw-fn "quit"))

(def quote
 ^{:name-r "quote", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "quote"))

(def r-system-version
 ^{:name-r "R_system_version",
  :doc "",
  :argslists ({:x nil, :strict true})}
 (r-interop.core/->clj-pos-kw-fn "R_system_version"))

(def r-home
 ^{:name-r "R.home", :doc "", :argslists ({:component "home"})}
 (r-interop.core/->clj-pos-kw-fn "R.home"))

(def r-version
 ^{:name-r "R.Version", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "R.Version"))

(def range
 ^{:name-r "range", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "range"))

(def range-default
 ^{:name-r "range.default",
  :doc "",
  :argslists ({:... nil, :na.rm false, :finite false})}
 (r-interop.core/->clj-pos-kw-fn "range.default"))

(def rank
 ^{:name-r "rank",
  :doc "",
  :argslists
  ({:x nil,
    :na.last true,
    :ties.method [nil "average" "first" "last" "random" "max" "min"]})}
 (r-interop.core/->clj-pos-kw-fn "rank"))

(def rapply
 ^{:name-r "rapply",
  :doc "",
  :argslists
  ({:object nil,
    :f nil,
    :classes "ANY",
    :deflt nil,
    :how [nil "unlist" "replace" "list"],
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "rapply"))

(def raw
 ^{:name-r "raw", :doc "", :argslists ({:length 0})}
 (r-interop.core/->clj-pos-kw-fn "raw"))

(def raw-connection
 ^{:name-r "rawConnection",
  :doc "",
  :argslists ({:object nil, :open "r"})}
 (r-interop.core/->clj-pos-kw-fn "rawConnection"))

(def raw-connection-value
 ^{:name-r "rawConnectionValue", :doc "", :argslists ({:con nil})}
 (r-interop.core/->clj-pos-kw-fn "rawConnectionValue"))

(def raw-shift
 ^{:name-r "rawShift", :doc "", :argslists ({:x nil, :n nil})}
 (r-interop.core/->clj-pos-kw-fn "rawShift"))

(def raw-to-bits
 ^{:name-r "rawToBits", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "rawToBits"))

(def raw-to-char
 ^{:name-r "rawToChar", :doc "", :argslists ({:x nil, :multiple false})}
 (r-interop.core/->clj-pos-kw-fn "rawToChar"))

(def rbind
 ^{:name-r "rbind", :doc "", :argslists ({:... nil, :deparse.level 1})}
 (r-interop.core/->clj-pos-kw-fn "rbind"))

(def rbind-data-frame
 ^{:name-r "rbind.data.frame",
  :doc "",
  :argslists
  ({:... nil,
    :deparse.level 1,
    :make.row.names true,
    :stringsAsFactors [nil]})}
 (r-interop.core/->clj-pos-kw-fn "rbind.data.frame"))

(def rcond
 ^{:name-r "rcond",
  :doc "",
  :argslists
  ({:x nil, :norm [nil "O" "I" "1"], :triangular false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "rcond"))

(def re
 ^{:name-r "Re", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "Re"))

(def read-dcf
 ^{:name-r "read.dcf",
  :doc "",
  :argslists ({:file nil, :fields nil, :all false, :keep.white nil})}
 (r-interop.core/->clj-pos-kw-fn "read.dcf"))

(def read-bin
 ^{:name-r "readBin",
  :doc "",
  :argslists
  ({:con nil,
    :what nil,
    :n 1,
    :size [nil],
    :signed true,
    :endian [nil nil nil]})}
 (r-interop.core/->clj-pos-kw-fn "readBin"))

(def read-char
 ^{:name-r "readChar",
  :doc "",
  :argslists ({:con nil, :nchars nil, :useBytes false})}
 (r-interop.core/->clj-pos-kw-fn "readChar"))

(def readline
 ^{:name-r "readline", :doc "", :argslists ({:prompt ""})}
 (r-interop.core/->clj-pos-kw-fn "readline"))

(def read-lines
 ^{:name-r "readLines",
  :doc "",
  :argslists
  ({:con [nil],
    :n [nil 1],
    :ok true,
    :warn true,
    :encoding "unknown",
    :skipNul false})}
 (r-interop.core/->clj-pos-kw-fn "readLines"))

(def read-rds
 ^{:name-r "readRDS", :doc "", :argslists ({:file nil, :refhook nil})}
 (r-interop.core/->clj-pos-kw-fn "readRDS"))

(def read-renviron
 ^{:name-r "readRenviron", :doc "", :argslists ({:path nil})}
 (r-interop.core/->clj-pos-kw-fn "readRenviron"))

(def recall
 ^{:name-r "Recall", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "Recall"))

(def reduce
 ^{:name-r "Reduce",
  :doc "",
  :argslists
  ({:f nil, :x nil, :init nil, :right false, :accumulate false})}
 (r-interop.core/->clj-pos-kw-fn "Reduce"))

(def reg-finalizer
 ^{:name-r "reg.finalizer",
  :doc "",
  :argslists ({:e nil, :f nil, :onexit false})}
 (r-interop.core/->clj-pos-kw-fn "reg.finalizer"))

(def regexec
 ^{:name-r "regexec",
  :doc "",
  :argslists
  ({:pattern nil,
    :text nil,
    :ignore.case false,
    :perl false,
    :fixed false,
    :useBytes false})}
 (r-interop.core/->clj-pos-kw-fn "regexec"))

(def regexpr
 ^{:name-r "regexpr",
  :doc "",
  :argslists
  ({:pattern nil,
    :text nil,
    :ignore.case false,
    :perl false,
    :fixed false,
    :useBytes false})}
 (r-interop.core/->clj-pos-kw-fn "regexpr"))

(def register-s-3method
 ^{:name-r "registerS3method",
  :doc "",
  :argslists ({:genname nil, :class nil, :method nil, :envir [nil]})}
 (r-interop.core/->clj-pos-kw-fn "registerS3method"))

(def register-s-3methods
 ^{:name-r "registerS3methods",
  :doc "",
  :argslists ({:info nil, :package nil, :env nil})}
 (r-interop.core/->clj-pos-kw-fn "registerS3methods"))

(def regmatches
 ^{:name-r "regmatches",
  :doc "",
  :argslists ({:x nil, :m nil, :invert false})}
 (r-interop.core/->clj-pos-kw-fn "regmatches"))

(def remove-task-callback
 ^{:name-r "removeTaskCallback", :doc "", :argslists ({:id nil})}
 (r-interop.core/->clj-pos-kw-fn "removeTaskCallback"))

(def rep
 ^{:name-r "rep", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "rep"))

(def rep-len
 ^{:name-r "rep_len", :doc "", :argslists ({:x nil, :length.out nil})}
 (r-interop.core/->clj-pos-kw-fn "rep_len"))

(def rep-date
 ^{:name-r "rep.Date", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "rep.Date"))

(def rep-factor
 ^{:name-r "rep.factor", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "rep.factor"))

(def rep-int
 ^{:name-r "rep.int", :doc "", :argslists ({:x nil, :times nil})}
 (r-interop.core/->clj-pos-kw-fn "rep.int"))

(def rep-numeric-version
 ^{:name-r "rep.numeric_version",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "rep.numeric_version"))

(def replace
 ^{:name-r "replace",
  :doc "",
  :argslists ({:x nil, :list nil, :values nil})}
 (r-interop.core/->clj-pos-kw-fn "replace"))

(def replicate
 ^{:name-r "replicate",
  :doc "",
  :argslists ({:n nil, :expr nil, :simplify "array"})}
 (r-interop.core/->clj-pos-kw-fn "replicate"))

(def require
 ^{:name-r "require",
  :doc "",
  :argslists
  ({:package nil,
    :lib.loc nil,
    :quietly false,
    :warn.conflicts true,
    :character.only false})}
 (r-interop.core/->clj-pos-kw-fn "require"))

(def require-namespace
 ^{:name-r "requireNamespace",
  :doc "",
  :argslists ({:package nil, :... nil, :quietly false})}
 (r-interop.core/->clj-pos-kw-fn "requireNamespace"))

(def restart-description
 ^{:name-r "restartDescription", :doc "", :argslists ({:r nil})}
 (r-interop.core/->clj-pos-kw-fn "restartDescription"))

(def restart-formals
 ^{:name-r "restartFormals", :doc "", :argslists ({:r nil})}
 (r-interop.core/->clj-pos-kw-fn "restartFormals"))

(def retracemem
 ^{:name-r "retracemem", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "retracemem"))

(def return
 ^{:name-r "return", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "return"))

(def return-value
 ^{:name-r "returnValue", :doc "", :argslists ({:default nil})}
 (r-interop.core/->clj-pos-kw-fn "returnValue"))

(def rev
 ^{:name-r "rev", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "rev"))

(def rev-default
 ^{:name-r "rev.default", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "rev.default"))

(def rle
 ^{:name-r "rle", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "rle"))

(def rm
 ^{:name-r "rm",
  :doc "",
  :argslists
  ({:... nil,
    :list [nil],
    :pos [nil 1],
    :envir [nil nil],
    :inherits false})}
 (r-interop.core/->clj-pos-kw-fn "rm"))

(def rn-gkind
 ^{:name-r "RNGkind",
  :doc "",
  :argslists ({:kind nil, :normal.kind nil})}
 (r-interop.core/->clj-pos-kw-fn "RNGkind"))

(def rn-gversion
 ^{:name-r "RNGversion", :doc "", :argslists ({:vstr nil})}
 (r-interop.core/->clj-pos-kw-fn "RNGversion"))

(def round
 ^{:name-r "round", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "round"))

(def round-date
 ^{:name-r "round.Date", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "round.Date"))

(def row
 ^{:name-r "row", :doc "", :argslists ({:x nil, :as.factor false})}
 (r-interop.core/->clj-pos-kw-fn "row"))

(def row-names
 ^{:name-r "row.names", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "row.names"))

(def row-names-data-frame
 ^{:name-r "row.names.data.frame", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "row.names.data.frame"))

(def row-names-default
 ^{:name-r "row.names.default", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "row.names.default"))

(def row-means
 ^{:name-r "rowMeans",
  :doc "",
  :argslists ({:x nil, :na.rm false, :dims 1})}
 (r-interop.core/->clj-pos-kw-fn "rowMeans"))

(def rownames
 ^{:name-r "rownames",
  :doc "",
  :argslists ({:x nil, :do.NULL true, :prefix "row"})}
 (r-interop.core/->clj-pos-kw-fn "rownames"))

(def rowsum
 ^{:name-r "rowsum",
  :doc "",
  :argslists ({:x nil, :group nil, :reorder true, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "rowsum"))

(def rowsum-data-frame
 ^{:name-r "rowsum.data.frame",
  :doc "",
  :argslists
  ({:x nil, :group nil, :reorder true, :na.rm false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "rowsum.data.frame"))

(def rowsum-default
 ^{:name-r "rowsum.default",
  :doc "",
  :argslists
  ({:x nil, :group nil, :reorder true, :na.rm false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "rowsum.default"))

(def row-sums
 ^{:name-r "rowSums",
  :doc "",
  :argslists ({:x nil, :na.rm false, :dims 1})}
 (r-interop.core/->clj-pos-kw-fn "rowSums"))

(def sample
 ^{:name-r "sample",
  :doc "",
  :argslists ({:x nil, :size nil, :replace false, :prob nil})}
 (r-interop.core/->clj-pos-kw-fn "sample"))

(def sample-int
 ^{:name-r "sample.int",
  :doc "",
  :argslists
  ({:n nil,
    :size nil,
    :replace false,
    :prob nil,
    :useHash
    [nil
     [nil
      [nil [nil [nil nil] [nil nil]] [nil nil [nil nil 2]]]
      [nil nil 10000000]]]})}
 (r-interop.core/->clj-pos-kw-fn "sample.int"))

(def sapply
 ^{:name-r "sapply",
  :doc "",
  :argslists
  ({:X nil, :FUN nil, :... nil, :simplify true, :USE.NAMES true})}
 (r-interop.core/->clj-pos-kw-fn "sapply"))

(def save
 ^{:name-r "save",
  :doc "",
  :argslists
  ({:ascii false,
    :envir [nil],
    :precheck true,
    :file [nil "'file' must be specified"],
    :compression_level nil,
    :eval.promises true,
    :compress [nil [nil nil]],
    :list [nil],
    :... nil,
    :version nil})}
 (r-interop.core/->clj-pos-kw-fn "save"))

(def save-image
 ^{:name-r "save.image",
  :doc "",
  :argslists
  ({:file ".RData",
    :version nil,
    :ascii false,
    :compress [nil nil],
    :safe true})}
 (r-interop.core/->clj-pos-kw-fn "save.image"))

(def save-rds
 ^{:name-r "saveRDS",
  :doc "",
  :argslists
  ({:object nil,
    :file "",
    :ascii false,
    :version nil,
    :compress true,
    :refhook nil})}
 (r-interop.core/->clj-pos-kw-fn "saveRDS"))

(def scale
 ^{:name-r "scale",
  :doc "",
  :argslists ({:x nil, :center true, :scale true})}
 (r-interop.core/->clj-pos-kw-fn "scale"))

(def scale-default
 ^{:name-r "scale.default",
  :doc "",
  :argslists ({:x nil, :center true, :scale true})}
 (r-interop.core/->clj-pos-kw-fn "scale.default"))

(def scan
 ^{:name-r "scan",
  :doc "",
  :argslists
  ({:encoding "unknown",
    :flush false,
    :na.strings "NA",
    :sep "",
    :blank.lines.skip true,
    :nmax [nil 1],
    :quiet false,
    :allowEscapes false,
    :n [nil 1],
    :fill false,
    :file "",
    :fileEncoding "",
    :comment.char "",
    :skipNul false,
    :quote [nil [nil nil "\n"] "" "'\""],
    :multi.line true,
    :nlines 0,
    :dec ".",
    :what [nil],
    :strip.white false,
    :skip 0,
    :text nil})}
 (r-interop.core/->clj-pos-kw-fn "scan"))

(def search
 ^{:name-r "search", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "search"))

(def searchpaths
 ^{:name-r "searchpaths", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "searchpaths"))

(def seek
 ^{:name-r "seek", :doc "", :argslists ({:con nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "seek"))

(def seek-connection
 ^{:name-r "seek.connection",
  :doc "",
  :argslists
  ({:con nil, :where [nil], :origin "start", :rw "", :... nil})}
 (r-interop.core/->clj-pos-kw-fn "seek.connection"))

(def seq
 ^{:name-r "seq", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "seq"))

(def seq-along
 ^{:name-r "seq_along", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "seq_along"))

(def seq-len
 ^{:name-r "seq_len", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "seq_len"))

(def seq-date
 ^{:name-r "seq.Date",
  :doc "",
  :argslists
  ({:from nil,
    :to nil,
    :by nil,
    :length.out nil,
    :along.with nil,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "seq.Date"))

(def seq-default
 ^{:name-r "seq.default",
  :doc "",
  :argslists
  ({:from 1,
    :to 1,
    :by [nil [nil [nil [nil nil nil]] [nil [nil nil 1]]]],
    :length.out nil,
    :along.with nil,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "seq.default"))

(def seq-int
 ^{:name-r "seq.int", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "seq.int"))

(def sequence
 ^{:name-r "sequence", :doc "", :argslists ({:nvec nil})}
 (r-interop.core/->clj-pos-kw-fn "sequence"))

(def serialize
 ^{:name-r "serialize",
  :doc "",
  :argslists
  ({:object nil,
    :connection nil,
    :ascii false,
    :xdr true,
    :version nil,
    :refhook nil})}
 (r-interop.core/->clj-pos-kw-fn "serialize"))

(def set-seed
 ^{:name-r "set.seed",
  :doc "",
  :argslists ({:seed nil, :kind nil, :normal.kind nil})}
 (r-interop.core/->clj-pos-kw-fn "set.seed"))

(def setdiff
 ^{:name-r "setdiff", :doc "", :argslists ({:x nil, :y nil})}
 (r-interop.core/->clj-pos-kw-fn "setdiff"))

(def setequal
 ^{:name-r "setequal", :doc "", :argslists ({:x nil, :y nil})}
 (r-interop.core/->clj-pos-kw-fn "setequal"))

(def set-hook
 ^{:name-r "setHook",
  :doc "",
  :argslists
  ({:hookName nil,
    :value nil,
    :action [nil "append" "prepend" "replace"]})}
 (r-interop.core/->clj-pos-kw-fn "setHook"))

(def set-namespace-info
 ^{:name-r "setNamespaceInfo",
  :doc "",
  :argslists ({:ns nil, :which nil, :val nil})}
 (r-interop.core/->clj-pos-kw-fn "setNamespaceInfo"))

(def set-session-time-limit
 ^{:name-r "setSessionTimeLimit",
  :doc "",
  :argslists ({:cpu ##Inf, :elapsed ##Inf})}
 (r-interop.core/->clj-pos-kw-fn "setSessionTimeLimit"))

(def set-time-limit
 ^{:name-r "setTimeLimit",
  :doc "",
  :argslists ({:cpu ##Inf, :elapsed ##Inf, :transient false})}
 (r-interop.core/->clj-pos-kw-fn "setTimeLimit"))

(def setwd
 ^{:name-r "setwd", :doc "", :argslists ({:dir nil})}
 (r-interop.core/->clj-pos-kw-fn "setwd"))

(def show-connections
 ^{:name-r "showConnections", :doc "", :argslists ({:all false})}
 (r-interop.core/->clj-pos-kw-fn "showConnections"))

(def sh-quote
 ^{:name-r "shQuote",
  :doc "",
  :argslists ({:string nil, :type [nil "sh" "csh" "cmd" "cmd2"]})}
 (r-interop.core/->clj-pos-kw-fn "shQuote"))

(def sign
 ^{:name-r "sign", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "sign"))

(def signal-condition
 ^{:name-r "signalCondition", :doc "", :argslists ({:cond nil})}
 (r-interop.core/->clj-pos-kw-fn "signalCondition"))

(def signif
 ^{:name-r "signif", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "signif"))

(def simple-condition
 ^{:name-r "simpleCondition",
  :doc "",
  :argslists ({:message nil, :call nil})}
 (r-interop.core/->clj-pos-kw-fn "simpleCondition"))

(def simple-error
 ^{:name-r "simpleError",
  :doc "",
  :argslists ({:message nil, :call nil})}
 (r-interop.core/->clj-pos-kw-fn "simpleError"))

(def simple-message
 ^{:name-r "simpleMessage",
  :doc "",
  :argslists ({:message nil, :call nil})}
 (r-interop.core/->clj-pos-kw-fn "simpleMessage"))

(def simple-warning
 ^{:name-r "simpleWarning",
  :doc "",
  :argslists ({:message nil, :call nil})}
 (r-interop.core/->clj-pos-kw-fn "simpleWarning"))

(def simplify-2array
 ^{:name-r "simplify2array",
  :doc "",
  :argslists ({:x nil, :higher true})}
 (r-interop.core/->clj-pos-kw-fn "simplify2array"))

(def sin
 ^{:name-r "sin", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "sin"))

(def single
 ^{:name-r "single", :doc "", :argslists ({:length 0})}
 (r-interop.core/->clj-pos-kw-fn "single"))

(def sinh
 ^{:name-r "sinh", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "sinh"))

(def sink
 ^{:name-r "sink",
  :doc "",
  :argslists
  ({:file nil,
    :append false,
    :type [nil "output" "message"],
    :split false})}
 (r-interop.core/->clj-pos-kw-fn "sink"))

(def sink-number
 ^{:name-r "sink.number",
  :doc "",
  :argslists ({:type [nil "output" "message"]})}
 (r-interop.core/->clj-pos-kw-fn "sink.number"))

(def sinpi
 ^{:name-r "sinpi", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "sinpi"))

(def slice-index
 ^{:name-r "slice.index", :doc "", :argslists ({:x nil, :MARGIN nil})}
 (r-interop.core/->clj-pos-kw-fn "slice.index"))

(def socket-connection
 ^{:name-r "socketConnection",
  :doc "",
  :argslists
  ({:host "localhost",
    :port nil,
    :server false,
    :blocking false,
    :open "a+",
    :encoding [nil "encoding"],
    :timeout [nil "timeout"]})}
 (r-interop.core/->clj-pos-kw-fn "socketConnection"))

(def socket-select
 ^{:name-r "socketSelect",
  :doc "",
  :argslists ({:socklist nil, :write false, :timeout nil})}
 (r-interop.core/->clj-pos-kw-fn "socketSelect"))

(def solve
 ^{:name-r "solve", :doc "", :argslists ({:a nil, :b nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "solve"))

(def solve-default
 ^{:name-r "solve.default",
  :doc "",
  :argslists
  ({:a nil, :b nil, :tol [nil nil nil], :LINPACK false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "solve.default"))

(def solve-qr
 ^{:name-r "solve.qr", :doc "", :argslists ({:a nil, :b nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "solve.qr"))

(def sort
 ^{:name-r "sort",
  :doc "",
  :argslists ({:x nil, :decreasing false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "sort"))

(def sort-default
 ^{:name-r "sort.default",
  :doc "",
  :argslists ({:x nil, :decreasing false, :na.last [nil], :... nil})}
 (r-interop.core/->clj-pos-kw-fn "sort.default"))

(def sort-int
 ^{:name-r "sort.int",
  :doc "",
  :argslists
  ({:x nil,
    :partial nil,
    :na.last [nil],
    :decreasing false,
    :method [nil "auto" "shell" "quick" "radix"],
    :index.return false})}
 (r-interop.core/->clj-pos-kw-fn "sort.int"))

(def sort-list
 ^{:name-r "sort.list",
  :doc "",
  :argslists
  ({:x nil,
    :partial nil,
    :na.last true,
    :decreasing false,
    :method [nil "auto" "shell" "quick" "radix"]})}
 (r-interop.core/->clj-pos-kw-fn "sort.list"))

(def source
 ^{:name-r "source",
  :doc "",
  :argslists
  ({:keep.source [nil "keep.source"],
    :encoding [nil "encoding"],
    :exprs nil,
    :deparseCtrl "showAttributes",
    :file nil,
    :verbose [nil "verbose"],
    :prompt.echo [nil "prompt"],
    :print.eval nil,
    :width.cutoff 60,
    :echo nil,
    :continue.echo [nil "continue"],
    :max.deparse.length 150,
    :spaced nil,
    :skip.echo 0,
    :chdir false,
    :local false})}
 (r-interop.core/->clj-pos-kw-fn "source"))

(def split
 ^{:name-r "split",
  :doc "",
  :argslists ({:x nil, :f nil, :drop false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "split"))

(def split-data-frame
 ^{:name-r "split.data.frame",
  :doc "",
  :argslists ({:x nil, :f nil, :drop false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "split.data.frame"))

(def split-date
 ^{:name-r "split.Date",
  :doc "",
  :argslists ({:x nil, :f nil, :drop false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "split.Date"))

(def split-default
 ^{:name-r "split.default",
  :doc "",
  :argslists
  ({:x nil,
    :f nil,
    :drop false,
    :sep ".",
    :lex.order false,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "split.default"))

(def sprintf
 ^{:name-r "sprintf", :doc "", :argslists ({:fmt nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "sprintf"))

(def sqrt
 ^{:name-r "sqrt", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "sqrt"))

(def s-quote
 ^{:name-r "sQuote", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "sQuote"))

(def srcfile
 ^{:name-r "srcfile",
  :doc "",
  :argslists
  ({:filename nil, :encoding [nil "encoding"], :Enc "unknown"})}
 (r-interop.core/->clj-pos-kw-fn "srcfile"))

(def srcfilealias
 ^{:name-r "srcfilealias",
  :doc "",
  :argslists ({:filename nil, :srcfile nil})}
 (r-interop.core/->clj-pos-kw-fn "srcfilealias"))

(def srcfilecopy
 ^{:name-r "srcfilecopy",
  :doc "",
  :argslists
  ({:filename nil, :lines nil, :timestamp [nil], :isFile false})}
 (r-interop.core/->clj-pos-kw-fn "srcfilecopy"))

(def srcref
 ^{:name-r "srcref", :doc "", :argslists ({:srcfile nil, :lloc nil})}
 (r-interop.core/->clj-pos-kw-fn "srcref"))

(def standard-generic
 ^{:name-r "standardGeneric", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "standardGeneric"))

(def starts-with
 ^{:name-r "startsWith", :doc "", :argslists ({:x nil, :prefix nil})}
 (r-interop.core/->clj-pos-kw-fn "startsWith"))

(def stderr
 ^{:name-r "stderr", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "stderr"))

(def stdin
 ^{:name-r "stdin", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "stdin"))

(def stdout
 ^{:name-r "stdout", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "stdout"))

(def stop
 ^{:name-r "stop",
  :doc "",
  :argslists ({:... nil, :call. true, :domain nil})}
 (r-interop.core/->clj-pos-kw-fn "stop"))

(def stopifnot
 ^{:name-r "stopifnot",
  :doc "",
  :argslists ({:... nil, :exprs nil, :local true})}
 (r-interop.core/->clj-pos-kw-fn "stopifnot"))

(def storage-mode
 ^{:name-r "storage.mode", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "storage.mode"))

(def strftime
 ^{:name-r "strftime",
  :doc "",
  :argslists ({:x nil, :format "", :tz "", :usetz false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "strftime"))

(def strptime
 ^{:name-r "strptime",
  :doc "",
  :argslists ({:x nil, :format nil, :tz ""})}
 (r-interop.core/->clj-pos-kw-fn "strptime"))

(def strrep
 ^{:name-r "strrep", :doc "", :argslists ({:x nil, :times nil})}
 (r-interop.core/->clj-pos-kw-fn "strrep"))

(def strsplit
 ^{:name-r "strsplit",
  :doc "",
  :argslists
  ({:x nil, :split nil, :fixed false, :perl false, :useBytes false})}
 (r-interop.core/->clj-pos-kw-fn "strsplit"))

(def strtoi
 ^{:name-r "strtoi", :doc "", :argslists ({:x nil, :base 0})}
 (r-interop.core/->clj-pos-kw-fn "strtoi"))

(def strtrim
 ^{:name-r "strtrim", :doc "", :argslists ({:x nil, :width nil})}
 (r-interop.core/->clj-pos-kw-fn "strtrim"))

(def structure
 ^{:name-r "structure", :doc "", :argslists ({:.Data nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "structure"))

(def strwrap
 ^{:name-r "strwrap",
  :doc "",
  :argslists
  ({:x nil,
    :width [nil 0.9 [nil "width"]],
    :indent 0,
    :exdent 0,
    :prefix "",
    :simplify true,
    :initial nil})}
 (r-interop.core/->clj-pos-kw-fn "strwrap"))

(def sub
 ^{:name-r "sub",
  :doc "",
  :argslists
  ({:pattern nil,
    :replacement nil,
    :x nil,
    :ignore.case false,
    :perl false,
    :fixed false,
    :useBytes false})}
 (r-interop.core/->clj-pos-kw-fn "sub"))

(def subset
 ^{:name-r "subset", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "subset"))

(def subset-data-frame
 ^{:name-r "subset.data.frame",
  :doc "",
  :argslists
  ({:x nil, :subset nil, :select nil, :drop false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "subset.data.frame"))

(def subset-default
 ^{:name-r "subset.default",
  :doc "",
  :argslists ({:x nil, :subset nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "subset.default"))

(def subset-matrix
 ^{:name-r "subset.matrix",
  :doc "",
  :argslists
  ({:x nil, :subset nil, :select nil, :drop false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "subset.matrix"))

(def substitute
 ^{:name-r "substitute", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "substitute"))

(def substr
 ^{:name-r "substr",
  :doc "",
  :argslists ({:x nil, :start nil, :stop nil})}
 (r-interop.core/->clj-pos-kw-fn "substr"))

(def substring
 ^{:name-r "substring",
  :doc "",
  :argslists ({:text nil, :first nil, :last 1000000})}
 (r-interop.core/->clj-pos-kw-fn "substring"))

(def sum
 ^{:name-r "sum", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "sum"))

(def summary
 ^{:name-r "summary", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "summary"))

(def summary-connection
 ^{:name-r "summary.connection",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "summary.connection"))

(def summary-data-frame
 ^{:name-r "summary.data.frame",
  :doc "",
  :argslists
  ({:object nil,
    :maxsum 7,
    :digits [nil 3 [nil [nil "digits"] 3]],
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "summary.data.frame"))

(def summary-data-frame
 ^{:name-r "Summary.data.frame",
  :doc "",
  :argslists ({:... nil, :na.rm nil})}
 (r-interop.core/->clj-pos-kw-fn "Summary.data.frame"))

(def summary-date
 ^{:name-r "summary.Date",
  :doc "",
  :argslists ({:object nil, :digits 12, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "summary.Date"))

(def summary-date
 ^{:name-r "Summary.Date", :doc "", :argslists ({:... nil, :na.rm nil})}
 (r-interop.core/->clj-pos-kw-fn "Summary.Date"))

(def summary-default
 ^{:name-r "summary.default",
  :doc "",
  :argslists ({:object nil, :... nil, :digits nil})}
 (r-interop.core/->clj-pos-kw-fn "summary.default"))

(def summary-difftime
 ^{:name-r "Summary.difftime",
  :doc "",
  :argslists ({:... nil, :na.rm nil})}
 (r-interop.core/->clj-pos-kw-fn "Summary.difftime"))

(def summary-factor
 ^{:name-r "summary.factor",
  :doc "",
  :argslists ({:object nil, :maxsum 100, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "summary.factor"))

(def summary-factor
 ^{:name-r "Summary.factor",
  :doc "",
  :argslists ({:... nil, :na.rm nil})}
 (r-interop.core/->clj-pos-kw-fn "Summary.factor"))

(def summary-matrix
 ^{:name-r "summary.matrix",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "summary.matrix"))

(def summary-numeric-version
 ^{:name-r "Summary.numeric_version",
  :doc "",
  :argslists ({:... nil, :na.rm nil})}
 (r-interop.core/->clj-pos-kw-fn "Summary.numeric_version"))

(def summary-ordered
 ^{:name-r "Summary.ordered",
  :doc "",
  :argslists ({:... nil, :na.rm nil})}
 (r-interop.core/->clj-pos-kw-fn "Summary.ordered"))

(def summary-proc-time
 ^{:name-r "summary.proc_time",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "summary.proc_time"))

(def summary-srcfile
 ^{:name-r "summary.srcfile",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "summary.srcfile"))

(def summary-srcref
 ^{:name-r "summary.srcref",
  :doc "",
  :argslists ({:object nil, :useSource false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "summary.srcref"))

(def summary-table
 ^{:name-r "summary.table",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "summary.table"))

(def summary-warnings
 ^{:name-r "summary.warnings",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "summary.warnings"))

(def suppress-messages
 ^{:name-r "suppressMessages", :doc "", :argslists ({:expr nil})}
 (r-interop.core/->clj-pos-kw-fn "suppressMessages"))

(def suppress-package-startup-messages
 ^{:name-r "suppressPackageStartupMessages",
  :doc "",
  :argslists ({:expr nil})}
 (r-interop.core/->clj-pos-kw-fn "suppressPackageStartupMessages"))

(def suppress-warnings
 ^{:name-r "suppressWarnings", :doc "", :argslists ({:expr nil})}
 (r-interop.core/->clj-pos-kw-fn "suppressWarnings"))

(def suspend-interrupts
 ^{:name-r "suspendInterrupts", :doc "", :argslists ({:expr nil})}
 (r-interop.core/->clj-pos-kw-fn "suspendInterrupts"))

(def svd
 ^{:name-r "svd",
  :doc "",
  :argslists
  ({:x nil, :nu [nil nil nil], :nv [nil nil nil], :LINPACK false})}
 (r-interop.core/->clj-pos-kw-fn "svd"))

(def sweep
 ^{:name-r "sweep",
  :doc "",
  :argslists
  ({:x nil,
    :MARGIN nil,
    :STATS nil,
    :FUN "-",
    :check.margin true,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "sweep"))

(def switch
 ^{:name-r "switch", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "switch"))

(def sys-call
 ^{:name-r "sys.call", :doc "", :argslists ({:which 0})}
 (r-interop.core/->clj-pos-kw-fn "sys.call"))

(def sys-calls
 ^{:name-r "sys.calls", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "sys.calls"))

(def sys-chmod
 ^{:name-r "Sys.chmod",
  :doc "",
  :argslists ({:paths nil, :mode "0777", :use_umask true})}
 (r-interop.core/->clj-pos-kw-fn "Sys.chmod"))

(def sys-date
 ^{:name-r "Sys.Date", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "Sys.Date"))

(def sys-frame
 ^{:name-r "sys.frame", :doc "", :argslists ({:which 0})}
 (r-interop.core/->clj-pos-kw-fn "sys.frame"))

(def sys-frames
 ^{:name-r "sys.frames", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "sys.frames"))

(def sys-function
 ^{:name-r "sys.function", :doc "", :argslists ({:which 0})}
 (r-interop.core/->clj-pos-kw-fn "sys.function"))

(def sys-getenv
 ^{:name-r "Sys.getenv",
  :doc "",
  :argslists ({:x nil, :unset "", :names [nil]})}
 (r-interop.core/->clj-pos-kw-fn "Sys.getenv"))

(def sys-getlocale
 ^{:name-r "Sys.getlocale", :doc "", :argslists ({:category "LC_ALL"})}
 (r-interop.core/->clj-pos-kw-fn "Sys.getlocale"))

(def sys-getpid
 ^{:name-r "Sys.getpid", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "Sys.getpid"))

(def sys-glob
 ^{:name-r "Sys.glob",
  :doc "",
  :argslists ({:paths nil, :dirmark false})}
 (r-interop.core/->clj-pos-kw-fn "Sys.glob"))

(def sys-info
 ^{:name-r "Sys.info", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "Sys.info"))

(def sys-load-image
 ^{:name-r "sys.load.image",
  :doc "",
  :argslists ({:name nil, :quiet nil})}
 (r-interop.core/->clj-pos-kw-fn "sys.load.image"))

(def sys-localeconv
 ^{:name-r "Sys.localeconv", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "Sys.localeconv"))

(def sys-nframe
 ^{:name-r "sys.nframe", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "sys.nframe"))

(def sys-on-exit
 ^{:name-r "sys.on.exit", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "sys.on.exit"))

(def sys-parent
 ^{:name-r "sys.parent", :doc "", :argslists ({:n 1})}
 (r-interop.core/->clj-pos-kw-fn "sys.parent"))

(def sys-parents
 ^{:name-r "sys.parents", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "sys.parents"))

(def sys-readlink
 ^{:name-r "Sys.readlink", :doc "", :argslists ({:paths nil})}
 (r-interop.core/->clj-pos-kw-fn "Sys.readlink"))

(def sys-save-image
 ^{:name-r "sys.save.image", :doc "", :argslists ({:name nil})}
 (r-interop.core/->clj-pos-kw-fn "sys.save.image"))

(def sys-setenv
 ^{:name-r "Sys.setenv", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "Sys.setenv"))

(def sys-set-file-time
 ^{:name-r "Sys.setFileTime",
  :doc "",
  :argslists ({:path nil, :time nil})}
 (r-interop.core/->clj-pos-kw-fn "Sys.setFileTime"))

(def sys-setlocale
 ^{:name-r "Sys.setlocale",
  :doc "",
  :argslists ({:category "LC_ALL", :locale ""})}
 (r-interop.core/->clj-pos-kw-fn "Sys.setlocale"))

(def sys-sleep
 ^{:name-r "Sys.sleep", :doc "", :argslists ({:time nil})}
 (r-interop.core/->clj-pos-kw-fn "Sys.sleep"))

(def sys-source
 ^{:name-r "sys.source",
  :doc "",
  :argslists
  ({:file nil,
    :envir [nil],
    :chdir false,
    :keep.source [nil "keep.source.pkgs"],
    :toplevel.env [nil nil]})}
 (r-interop.core/->clj-pos-kw-fn "sys.source"))

(def sys-status
 ^{:name-r "sys.status", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "sys.status"))

(def sys-time
 ^{:name-r "Sys.time", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "Sys.time"))

(def sys-timezone
 ^{:name-r "Sys.timezone", :doc "", :argslists ({:location true})}
 (r-interop.core/->clj-pos-kw-fn "Sys.timezone"))

(def sys-umask
 ^{:name-r "Sys.umask", :doc "", :argslists ({:mode [nil]})}
 (r-interop.core/->clj-pos-kw-fn "Sys.umask"))

(def sys-unsetenv
 ^{:name-r "Sys.unsetenv", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "Sys.unsetenv"))

(def sys-which
 ^{:name-r "Sys.which", :doc "", :argslists ({:names nil})}
 (r-interop.core/->clj-pos-kw-fn "Sys.which"))

(def system
 ^{:name-r "system",
  :doc "",
  :argslists
  ({:invisible true,
    :show.output.on.console true,
    :ignore.stdout false,
    :minimized false,
    :command nil,
    :intern false,
    :ignore.stderr false,
    :wait true,
    :input nil,
    :timeout 0})}
 (r-interop.core/->clj-pos-kw-fn "system"))

(def system-file
 ^{:name-r "system.file",
  :doc "",
  :argslists
  ({:... nil, :package "base", :lib.loc nil, :mustWork false})}
 (r-interop.core/->clj-pos-kw-fn "system.file"))

(def system-time
 ^{:name-r "system.time",
  :doc "",
  :argslists ({:expr nil, :gcFirst true})}
 (r-interop.core/->clj-pos-kw-fn "system.time"))

(def system-2
 ^{:name-r "system2",
  :doc "",
  :argslists
  ({:args [nil],
    :stdin "",
    :invisible true,
    :minimized false,
    :command nil,
    :env [nil],
    :wait true,
    :input nil,
    :timeout 0,
    :stderr "",
    :stdout ""})}
 (r-interop.core/->clj-pos-kw-fn "system2"))

(def t-data-frame
 ^{:name-r "t.data.frame", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "t.data.frame"))

(def t-default
 ^{:name-r "t.default", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "t.default"))

(def table
 ^{:name-r "table",
  :doc "",
  :argslists
  ({:... nil,
    :exclude [nil [nil nil "no"] [nil [nil] [##NaN]]],
    :useNA [nil "no" "ifany" "always"],
    :dnn [nil nil],
    :deparse.level 1})}
 (r-interop.core/->clj-pos-kw-fn "table"))

(def tabulate
 ^{:name-r "tabulate",
  :doc "",
  :argslists ({:bin nil, :nbins {:empty-key nil, :na.rm true}})}
 (r-interop.core/->clj-pos-kw-fn "tabulate"))

(def tan
 ^{:name-r "tan", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "tan"))

(def tanh
 ^{:name-r "tanh", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "tanh"))

(def tanpi
 ^{:name-r "tanpi", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "tanpi"))

(def tapply
 ^{:name-r "tapply",
  :doc "",
  :argslists
  ({:X nil,
    :INDEX nil,
    :FUN nil,
    :... nil,
    :default [nil],
    :simplify true})}
 (r-interop.core/->clj-pos-kw-fn "tapply"))

(def task-callback-manager
 ^{:name-r "taskCallbackManager",
  :doc "",
  :argslists ({:handlers [nil], :registered false, :verbose false})}
 (r-interop.core/->clj-pos-kw-fn "taskCallbackManager"))

(def tcrossprod
 ^{:name-r "tcrossprod", :doc "", :argslists ({:x nil, :y nil})}
 (r-interop.core/->clj-pos-kw-fn "tcrossprod"))

(def tempdir
 ^{:name-r "tempdir", :doc "", :argslists ({:check false})}
 (r-interop.core/->clj-pos-kw-fn "tempdir"))

(def tempfile
 ^{:name-r "tempfile",
  :doc "",
  :argslists ({:pattern "file", :tmpdir [nil], :fileext ""})}
 (r-interop.core/->clj-pos-kw-fn "tempfile"))

(def test-platform-equivalence
 ^{:name-r "testPlatformEquivalence",
  :doc "",
  :argslists ({:built nil, :run nil})}
 (r-interop.core/->clj-pos-kw-fn "testPlatformEquivalence"))

(def tetragamma
 ^{:name-r "tetragamma", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "tetragamma"))

(def text-connection
 ^{:name-r "textConnection",
  :doc "",
  :argslists
  ({:object nil,
    :open "r",
    :local false,
    :encoding [nil "" "bytes" "UTF-8"]})}
 (r-interop.core/->clj-pos-kw-fn "textConnection"))

(def text-connection-value
 ^{:name-r "textConnectionValue", :doc "", :argslists ({:con nil})}
 (r-interop.core/->clj-pos-kw-fn "textConnectionValue"))

(def tolower
 ^{:name-r "tolower", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "tolower"))

(def topenv
 ^{:name-r "topenv",
  :doc "",
  :argslists
  ({:envir [nil], :matchThisEnv [nil "topLevelEnvironment"]})}
 (r-interop.core/->clj-pos-kw-fn "topenv"))

(def to-string
 ^{:name-r "toString", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "toString"))

(def to-string-default
 ^{:name-r "toString.default",
  :doc "",
  :argslists ({:x nil, :width nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "toString.default"))

(def toupper
 ^{:name-r "toupper", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "toupper"))

(def trace
 ^{:name-r "trace",
  :doc "",
  :argslists
  ({:what nil,
    :tracer nil,
    :exit nil,
    :at nil,
    :print nil,
    :signature nil,
    :where [nil [nil]],
    :edit false})}
 (r-interop.core/->clj-pos-kw-fn "trace"))

(def traceback
 ^{:name-r "traceback",
  :doc "",
  :argslists ({:x nil, :max.lines [nil "deparse.max.lines"]})}
 (r-interop.core/->clj-pos-kw-fn "traceback"))

(def tracemem
 ^{:name-r "tracemem", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "tracemem"))

(def tracing-state
 ^{:name-r "tracingState", :doc "", :argslists ({:on nil})}
 (r-interop.core/->clj-pos-kw-fn "tracingState"))

(def transform
 ^{:name-r "transform", :doc "", :argslists ({:_data nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "transform"))

(def transform-data-frame
 ^{:name-r "transform.data.frame",
  :doc "",
  :argslists ({:_data nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "transform.data.frame"))

(def transform-default
 ^{:name-r "transform.default",
  :doc "",
  :argslists ({:_data nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "transform.default"))

(def trigamma
 ^{:name-r "trigamma", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "trigamma"))

(def trimws
 ^{:name-r "trimws",
  :doc "",
  :argslists ({:x nil, :which [nil "both" "left" "right"]})}
 (r-interop.core/->clj-pos-kw-fn "trimws"))

(def trunc
 ^{:name-r "trunc", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "trunc"))

(def trunc-date
 ^{:name-r "trunc.Date", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "trunc.Date"))

(def truncate
 ^{:name-r "truncate", :doc "", :argslists ({:con nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "truncate"))

(def truncate-connection
 ^{:name-r "truncate.connection",
  :doc "",
  :argslists ({:con nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "truncate.connection"))

(def try
 ^{:name-r "try",
  :doc "",
  :argslists
  ({:expr nil,
    :silent false,
    :outFile {:empty-key nil, :default [nil]}})}
 (r-interop.core/->clj-pos-kw-fn "try"))

(def try-catch
 ^{:name-r "tryCatch",
  :doc "",
  :argslists ({:expr nil, :... nil, :finally nil})}
 (r-interop.core/->clj-pos-kw-fn "tryCatch"))

(def typeof
 ^{:name-r "typeof", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "typeof"))

(def unclass
 ^{:name-r "unclass", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "unclass"))

(def undebug
 ^{:name-r "undebug", :doc "", :argslists ({:fun nil, :signature nil})}
 (r-interop.core/->clj-pos-kw-fn "undebug"))

(def union
 ^{:name-r "union", :doc "", :argslists ({:x nil, :y nil})}
 (r-interop.core/->clj-pos-kw-fn "union"))

(def unique
 ^{:name-r "unique",
  :doc "",
  :argslists ({:x nil, :incomparables false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "unique"))

(def unique-array
 ^{:name-r "unique.array",
  :doc "",
  :argslists
  ({:x nil,
    :incomparables false,
    :MARGIN 1,
    :fromLast false,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "unique.array"))

(def unique-data-frame
 ^{:name-r "unique.data.frame",
  :doc "",
  :argslists
  ({:x nil, :incomparables false, :fromLast false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "unique.data.frame"))

(def unique-default
 ^{:name-r "unique.default",
  :doc "",
  :argslists
  ({:x nil,
    :incomparables false,
    :fromLast false,
    :nmax [nil],
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "unique.default"))

(def unique-matrix
 ^{:name-r "unique.matrix",
  :doc "",
  :argslists
  ({:x nil,
    :incomparables false,
    :MARGIN 1,
    :fromLast false,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "unique.matrix"))

(def unique-numeric-version
 ^{:name-r "unique.numeric_version",
  :doc "",
  :argslists ({:x nil, :incomparables false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "unique.numeric_version"))

(def unique-warnings
 ^{:name-r "unique.warnings",
  :doc "",
  :argslists ({:x nil, :incomparables false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "unique.warnings"))

(def units
 ^{:name-r "units", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "units"))

(def units-difftime
 ^{:name-r "units.difftime", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "units.difftime"))

(def unix-time
 ^{:name-r "unix.time", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "unix.time"))

(def unlink
 ^{:name-r "unlink",
  :doc "",
  :argslists ({:x nil, :recursive false, :force false})}
 (r-interop.core/->clj-pos-kw-fn "unlink"))

(def unlist
 ^{:name-r "unlist",
  :doc "",
  :argslists ({:x nil, :recursive true, :use.names true})}
 (r-interop.core/->clj-pos-kw-fn "unlist"))

(def unload-namespace
 ^{:name-r "unloadNamespace", :doc "", :argslists ({:ns nil})}
 (r-interop.core/->clj-pos-kw-fn "unloadNamespace"))

(def unlock-binding
 ^{:name-r "unlockBinding", :doc "", :argslists ({:sym nil, :env nil})}
 (r-interop.core/->clj-pos-kw-fn "unlockBinding"))

(def unname
 ^{:name-r "unname", :doc "", :argslists ({:obj nil, :force false})}
 (r-interop.core/->clj-pos-kw-fn "unname"))

(def unserialize
 ^{:name-r "unserialize",
  :doc "",
  :argslists ({:connection nil, :refhook nil})}
 (r-interop.core/->clj-pos-kw-fn "unserialize"))

(def unsplit
 ^{:name-r "unsplit",
  :doc "",
  :argslists ({:value nil, :f nil, :drop false})}
 (r-interop.core/->clj-pos-kw-fn "unsplit"))

(def untrace
 ^{:name-r "untrace",
  :doc "",
  :argslists ({:what nil, :signature nil, :where [nil [nil]]})}
 (r-interop.core/->clj-pos-kw-fn "untrace"))

(def untracemem
 ^{:name-r "untracemem", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "untracemem"))

(def unz
 ^{:name-r "unz",
  :doc "",
  :argslists
  ({:description nil,
    :filename nil,
    :open "",
    :encoding [nil "encoding"]})}
 (r-interop.core/->clj-pos-kw-fn "unz"))

(def upper-tri
 ^{:name-r "upper.tri", :doc "", :argslists ({:x nil, :diag false})}
 (r-interop.core/->clj-pos-kw-fn "upper.tri"))

(def url
 ^{:name-r "url",
  :doc "",
  :argslists
  ({:description nil,
    :open "",
    :blocking true,
    :encoding [nil "encoding"],
    :method [nil "url.method" "default"]})}
 (r-interop.core/->clj-pos-kw-fn "url"))

(def use-method
 ^{:name-r "UseMethod", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "UseMethod"))

(def utf-8-to-int
 ^{:name-r "utf8ToInt", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "utf8ToInt"))

(def valid-enc
 ^{:name-r "validEnc", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "validEnc"))

(def valid-utf-8
 ^{:name-r "validUTF8", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "validUTF8"))

(def vapply
 ^{:name-r "vapply",
  :doc "",
  :argslists
  ({:X nil, :FUN nil, :FUN.VALUE nil, :... nil, :USE.NAMES true})}
 (r-interop.core/->clj-pos-kw-fn "vapply"))

(def vector
 ^{:name-r "vector", :doc "", :argslists ({:mode "logical", :length 0})}
 (r-interop.core/->clj-pos-kw-fn "vector"))

(def vectorize
 ^{:name-r "Vectorize",
  :doc "",
  :argslists
  ({:FUN nil, :vectorize.args nil, :SIMPLIFY true, :USE.NAMES true})}
 (r-interop.core/->clj-pos-kw-fn "Vectorize"))

(def warning
 ^{:name-r "warning",
  :doc "",
  :argslists
  ({:... nil,
    :call. true,
    :immediate. false,
    :noBreaks. false,
    :domain nil})}
 (r-interop.core/->clj-pos-kw-fn "warning"))

(def warnings
 ^{:name-r "warnings", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "warnings"))

(def weekdays
 ^{:name-r "weekdays", :doc "", :argslists ({:x nil, :abbreviate nil})}
 (r-interop.core/->clj-pos-kw-fn "weekdays"))

(def weekdays-date
 ^{:name-r "weekdays.Date",
  :doc "",
  :argslists ({:x nil, :abbreviate false})}
 (r-interop.core/->clj-pos-kw-fn "weekdays.Date"))

(def which
 ^{:name-r "which",
  :doc "",
  :argslists ({:x nil, :arr.ind false, :useNames true})}
 (r-interop.core/->clj-pos-kw-fn "which"))

(def which-max
 ^{:name-r "which.max", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "which.max"))

(def which-min
 ^{:name-r "which.min", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "which.min"))

(def with
 ^{:name-r "with",
  :doc "",
  :argslists ({:data nil, :expr nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "with"))

(def with-default
 ^{:name-r "with.default",
  :doc "",
  :argslists ({:data nil, :expr nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "with.default"))

(def with-autoprint
 ^{:name-r "withAutoprint",
  :doc "",
  :argslists
  ({:print. true,
    :evaluated false,
    :exprs nil,
    :deparseCtrl [nil "keepInteger" "showAttributes" "keepNA"],
    :width.cutoff [nil 20 [nil "width"]],
    :echo true,
    :... nil,
    :max.deparse.length ##Inf,
    :local [nil]})}
 (r-interop.core/->clj-pos-kw-fn "withAutoprint"))

(def with-calling-handlers
 ^{:name-r "withCallingHandlers",
  :doc "",
  :argslists ({:expr nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "withCallingHandlers"))

(def within
 ^{:name-r "within",
  :doc "",
  :argslists ({:data nil, :expr nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "within"))

(def within-data-frame
 ^{:name-r "within.data.frame",
  :doc "",
  :argslists ({:data nil, :expr nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "within.data.frame"))

(def within-list
 ^{:name-r "within.list",
  :doc "",
  :argslists ({:data nil, :expr nil, :keepAttrs true, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "within.list"))

(def with-restarts
 ^{:name-r "withRestarts", :doc "", :argslists ({:expr nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "withRestarts"))

(def with-visible
 ^{:name-r "withVisible", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "withVisible"))

(def write
 ^{:name-r "write",
  :doc "",
  :argslists
  ({:x nil,
    :file "data",
    :ncolumns [nil [nil nil] 1 5],
    :append false,
    :sep " "})}
 (r-interop.core/->clj-pos-kw-fn "write"))

(def write-dcf
 ^{:name-r "write.dcf",
  :doc "",
  :argslists
  ({:x nil,
    :file "",
    :append false,
    :useBytes false,
    :indent [nil 0.1 [nil "width"]],
    :width [nil 0.9 [nil "width"]],
    :keep.white nil})}
 (r-interop.core/->clj-pos-kw-fn "write.dcf"))

(def write-bin
 ^{:name-r "writeBin",
  :doc "",
  :argslists
  ({:object nil,
    :con nil,
    :size [nil],
    :endian [nil nil nil],
    :useBytes false})}
 (r-interop.core/->clj-pos-kw-fn "writeBin"))

(def write-char
 ^{:name-r "writeChar",
  :doc "",
  :argslists
  ({:object nil,
    :con nil,
    :nchars {:empty-key nil, :type "chars"},
    :eos "",
    :useBytes false})}
 (r-interop.core/->clj-pos-kw-fn "writeChar"))

(def write-lines
 ^{:name-r "writeLines",
  :doc "",
  :argslists ({:text nil, :con [nil], :sep "\n", :useBytes false})}
 (r-interop.core/->clj-pos-kw-fn "writeLines"))

(def xor
 ^{:name-r "xor", :doc "", :argslists ({:x nil, :y nil})}
 (r-interop.core/->clj-pos-kw-fn "xor"))

(def xpdrows-data-frame
 ^{:name-r "xpdrows.data.frame",
  :doc "",
  :argslists ({:x nil, :old.rows nil, :new.rows nil})}
 (r-interop.core/->clj-pos-kw-fn "xpdrows.data.frame"))

(def xtfrm
 ^{:name-r "xtfrm", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "xtfrm"))

(def xtfrm-as-is
 ^{:name-r "xtfrm.AsIs", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "xtfrm.AsIs"))

(def xtfrm-date
 ^{:name-r "xtfrm.Date", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "xtfrm.Date"))

(def xtfrm-default
 ^{:name-r "xtfrm.default", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "xtfrm.default"))

(def xtfrm-difftime
 ^{:name-r "xtfrm.difftime", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "xtfrm.difftime"))

(def xtfrm-factor
 ^{:name-r "xtfrm.factor", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "xtfrm.factor"))

(def xtfrm-numeric-version
 ^{:name-r "xtfrm.numeric_version", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "xtfrm.numeric_version"))

(def xtfrm-surv
 ^{:name-r "xtfrm.Surv", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "xtfrm.Surv"))

(def xzfile
 ^{:name-r "xzfile",
  :doc "",
  :argslists
  ({:description nil,
    :open "",
    :encoding [nil "encoding"],
    :compression 6})}
 (r-interop.core/->clj-pos-kw-fn "xzfile"))

(def zapsmall
 ^{:name-r "zapsmall",
  :doc "",
  :argslists ({:x nil, :digits [nil "digits"]})}
 (r-interop.core/->clj-pos-kw-fn "zapsmall"))
