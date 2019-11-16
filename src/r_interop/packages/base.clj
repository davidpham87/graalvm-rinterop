(ns r-interop.packages.base
 (:require [r-interop.core :refer (defn-r eval-r)]))

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
    :method {},
    :named true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "abbreviate"))

(def abs
 ^{:name-r "abs", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "abs"))

(def acos
 ^{:name-r "acos", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "acos"))

(def acosh
 ^{:name-r "acosh", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "acosh"))

(def add-na
 ^{:name-r "addNA", :doc "", :argslists ({:x nil, :ifany false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "addNA"))

(def add-task-callback
 ^{:name-r "addTaskCallback",
  :doc "",
  :argslists ({:f nil, :data nil, :name {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "addTaskCallback"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "agrep"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "agrepl"))

(def alist
 ^{:name-r "alist", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "alist"))

(def all
 ^{:name-r "all", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "all"))

(def all-equal
 ^{:name-r "all.equal",
  :doc "",
  :argslists ({:target nil, :current nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "all.equal"))

(def all-equal-character
 ^{:name-r "all.equal.character",
  :doc "",
  :argslists
  ({:target nil, :current nil, :... nil, :check.attributes true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "all.equal.character"))

(def all-equal-default
 ^{:name-r "all.equal.default",
  :doc "",
  :argslists ({:target nil, :current nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "all.equal.default"))

(def all-equal-environment
 ^{:name-r "all.equal.environment",
  :doc "",
  :argslists ({:target nil, :current nil, :all.names true, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "all.equal.environment"))

(def all-equal-env-ref-class
 ^{:name-r "all.equal.envRefClass",
  :doc "",
  :argslists ({:target nil, :current nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "all.equal.envRefClass"))

(def all-equal-factor
 ^{:name-r "all.equal.factor",
  :doc "",
  :argslists
  ({:target nil, :current nil, :... nil, :check.attributes true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "all.equal.factor"))

(def all-equal-formula
 ^{:name-r "all.equal.formula",
  :doc "",
  :argslists ({:target nil, :current nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "all.equal.formula"))

(def all-equal-language
 ^{:name-r "all.equal.language",
  :doc "",
  :argslists ({:target nil, :current nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "all.equal.language"))

(def all-equal-list
 ^{:name-r "all.equal.list",
  :doc "",
  :argslists
  ({:target nil,
    :current nil,
    :... nil,
    :check.attributes true,
    :use.names true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "all.equal.list"))

(def all-equal-numeric
 ^{:name-r "all.equal.numeric",
  :doc "",
  :argslists
  ({:target nil,
    :current nil,
    :tolerance {},
    :scale nil,
    :... nil,
    :check.attributes true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "all.equal.numeric"))

(def all-equal-raw
 ^{:name-r "all.equal.raw",
  :doc "",
  :argslists
  ({:target nil, :current nil, :... nil, :check.attributes true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "all.equal.raw"))

(def all-names
 ^{:name-r "all.names",
  :doc "",
  :argslists
  ({:expr nil, :functions true, :max.names {}, :unique false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "all.names"))

(def all-vars
 ^{:name-r "all.vars",
  :doc "",
  :argslists
  ({:expr nil, :functions false, :max.names {}, :unique true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "all.vars"))

(def allow-interrupts
 ^{:name-r "allowInterrupts", :doc "", :argslists ({:expr nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "allowInterrupts"))

(def any
 ^{:name-r "any", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "any"))

(def any-duplicated
 ^{:name-r "anyDuplicated",
  :doc "",
  :argslists ({:x nil, :incomparables false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "anyDuplicated"))

(def any-duplicated-array
 ^{:name-r "anyDuplicated.array",
  :doc "",
  :argslists
  ({:x nil,
    :incomparables false,
    :MARGIN 1,
    :fromLast false,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "anyDuplicated.array"))

(def any-duplicated-data-frame
 ^{:name-r "anyDuplicated.data.frame",
  :doc "",
  :argslists
  ({:x nil, :incomparables false, :fromLast false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "anyDuplicated.data.frame"))

(def any-duplicated-default
 ^{:name-r "anyDuplicated.default",
  :doc "",
  :argslists
  ({:x nil, :incomparables false, :fromLast false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "anyDuplicated.default"))

(def any-duplicated-matrix
 ^{:name-r "anyDuplicated.matrix",
  :doc "",
  :argslists
  ({:x nil,
    :incomparables false,
    :MARGIN 1,
    :fromLast false,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "anyDuplicated.matrix"))

(def any-na
 ^{:name-r "anyNA", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "anyNA"))

(def any-na-numeric-version
 ^{:name-r "anyNA.numeric_version",
  :doc "",
  :argslists ({:x nil, :recursive false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "anyNA.numeric_version"))

(def aperm
 ^{:name-r "aperm", :doc "", :argslists ({:a nil, :perm nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "aperm"))

(def aperm-default
 ^{:name-r "aperm.default",
  :doc "",
  :argslists ({:a nil, :perm nil, :resize true, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "aperm.default"))

(def aperm-table
 ^{:name-r "aperm.table",
  :doc "",
  :argslists
  ({:a nil, :perm nil, :resize true, :keep.class true, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "aperm.table"))

(def append
 ^{:name-r "append",
  :doc "",
  :argslists ({:x nil, :values nil, :after {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "append"))

(def apply
 ^{:name-r "apply",
  :doc "",
  :argslists ({:X nil, :MARGIN nil, :FUN nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "apply"))

(def arg
 ^{:name-r "Arg", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Arg"))

(def args
 ^{:name-r "args", :doc "", :argslists ({:name nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "args"))

(def array
 ^{:name-r "array",
  :doc "",
  :argslists ({:data [nil], :dim {}, :dimnames nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "array"))

(def array-ind
 ^{:name-r "arrayInd",
  :doc "",
  :argslists ({:ind nil, :.dim nil, :.dimnames nil, :useNames false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "arrayInd"))

(def as-array
 ^{:name-r "as.array", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.array"))

(def as-array-default
 ^{:name-r "as.array.default", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.array.default"))

(def as-array-polyglot-value
 ^{:name-r "as.array.polyglot.value",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.array.polyglot.value"))

(def as-call
 ^{:name-r "as.call", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.call"))

(def as-character
 ^{:name-r "as.character", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.character"))

(def as-character-condition
 ^{:name-r "as.character.condition",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.character.condition"))

(def as-character-date
 ^{:name-r "as.character.Date",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.character.Date"))

(def as-character-default
 ^{:name-r "as.character.default",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.character.default"))

(def as-character-error
 ^{:name-r "as.character.error",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.character.error"))

(def as-character-factor
 ^{:name-r "as.character.factor",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.character.factor"))

(def as-character-hexmode
 ^{:name-r "as.character.hexmode",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.character.hexmode"))

(def as-character-numeric-version
 ^{:name-r "as.character.numeric_version",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "as.character.numeric_version"))

(def as-character-octmode
 ^{:name-r "as.character.octmode",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.character.octmode"))

(def as-character-srcref
 ^{:name-r "as.character.srcref",
  :doc "",
  :argslists ({:x nil, :useSource true, :to nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.character.srcref"))

(def as-complex
 ^{:name-r "as.complex", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.complex"))

(def as-data-frame
 ^{:name-r "as.data.frame",
  :doc "",
  :argslists ({:x nil, :row.names nil, :optional false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.data.frame"))

(def as-data-frame-array
 ^{:name-r "as.data.frame.array",
  :doc "",
  :argslists ({:x nil, :row.names nil, :optional false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.data.frame.array"))

(def as-data-frame-as-is
 ^{:name-r "as.data.frame.AsIs",
  :doc "",
  :argslists ({:x nil, :row.names nil, :optional false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.data.frame.AsIs"))

(def as-data-frame-character
 ^{:name-r "as.data.frame.character",
  :doc "",
  :argslists ({:x nil, :... nil, :stringsAsFactors {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.data.frame.character"))

(def as-data-frame-complex
 ^{:name-r "as.data.frame.complex",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :... nil,
    :nm {:empty-key nil, :collapse " "}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.data.frame.complex"))

(def as-data-frame-data-frame
 ^{:name-r "as.data.frame.data.frame",
  :doc "",
  :argslists ({:x nil, :row.names nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.data.frame.data.frame"))

(def as-data-frame-date
 ^{:name-r "as.data.frame.Date",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :... nil,
    :nm {:empty-key nil, :collapse " "}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.data.frame.Date"))

(def as-data-frame-default
 ^{:name-r "as.data.frame.default",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.data.frame.default"))

(def as-data-frame-difftime
 ^{:name-r "as.data.frame.difftime",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :... nil,
    :nm {:empty-key nil, :collapse " "}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.data.frame.difftime"))

(def as-data-frame-factor
 ^{:name-r "as.data.frame.factor",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :... nil,
    :nm {:empty-key nil, :collapse " "}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.data.frame.factor"))

(def as-data-frame-integer
 ^{:name-r "as.data.frame.integer",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :... nil,
    :nm {:empty-key nil, :collapse " "}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.data.frame.integer"))

(def as-data-frame-list
 ^{:name-r "as.data.frame.list",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :... nil,
    :cut.names false,
    :col.names {},
    :fix.empty.names true,
    :stringsAsFactors {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.data.frame.list"))

(def as-data-frame-logical
 ^{:name-r "as.data.frame.logical",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :... nil,
    :nm {:empty-key nil, :collapse " "}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.data.frame.logical"))

(def as-data-frame-matrix
 ^{:name-r "as.data.frame.matrix",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :make.names true,
    :... nil,
    :stringsAsFactors {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.data.frame.matrix"))

(def as-data-frame-model-matrix
 ^{:name-r "as.data.frame.model.matrix",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :make.names true,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.data.frame.model.matrix"))

(def as-data-frame-noquote
 ^{:name-r "as.data.frame.noquote",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :... nil,
    :nm {:empty-key nil, :collapse " "}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.data.frame.noquote"))

(def as-data-frame-numeric
 ^{:name-r "as.data.frame.numeric",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :... nil,
    :nm {:empty-key nil, :collapse " "}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.data.frame.numeric"))

(def as-data-frame-numeric-version
 ^{:name-r "as.data.frame.numeric_version",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :... nil,
    :nm {:empty-key nil, :collapse " "}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "as.data.frame.numeric_version"))

(def as-data-frame-ordered
 ^{:name-r "as.data.frame.ordered",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :... nil,
    :nm {:empty-key nil, :collapse " "}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.data.frame.ordered"))

(def as-data-frame-polyglot-value
 ^{:name-r "as.data.frame.polyglot.value",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :... nil,
    :nm {:empty-key nil, :collapse " "}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "as.data.frame.polyglot.value"))

(def as-data-frame-raw
 ^{:name-r "as.data.frame.raw",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :... nil,
    :nm {:empty-key nil, :collapse " "}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.data.frame.raw"))

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
    :base {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.data.frame.table"))

(def as-data-frame-ts
 ^{:name-r "as.data.frame.ts", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.data.frame.ts"))

(def as-data-frame-vector
 ^{:name-r "as.data.frame.vector",
  :doc "",
  :argslists
  ({:x nil,
    :row.names nil,
    :optional false,
    :... nil,
    :nm {:empty-key nil, :collapse " "}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.data.frame.vector"))

(def as-date
 ^{:name-r "as.Date", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.Date"))

(def as-date-character
 ^{:name-r "as.Date.character",
  :doc "",
  :argslists
  ({:x nil, :format nil, :tryFormats {}, :optional false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.Date.character"))

(def as-date-default
 ^{:name-r "as.Date.default", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.Date.default"))

(def as-date-factor
 ^{:name-r "as.Date.factor", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.Date.factor"))

(def as-date-numeric
 ^{:name-r "as.Date.numeric",
  :doc "",
  :argslists ({:x nil, :origin nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.Date.numeric"))

(def as-difftime
 ^{:name-r "as.difftime",
  :doc "",
  :argslists ({:tim nil, :format "%X", :units "auto"})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.difftime"))

(def as-double
 ^{:name-r "as.double", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.double"))

(def as-double-difftime
 ^{:name-r "as.double.difftime",
  :doc "",
  :argslists ({:x nil, :units "auto", :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.double.difftime"))

(def as-environment
 ^{:name-r "as.environment", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.environment"))

(def as-expression
 ^{:name-r "as.expression", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.expression"))

(def as-expression-default
 ^{:name-r "as.expression.default",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.expression.default"))

(def as-factor
 ^{:name-r "as.factor", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.factor"))

(def as-function
 ^{:name-r "as.function", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.function"))

(def as-function-default
 ^{:name-r "as.function.default",
  :doc "",
  :argslists ({:x nil, :envir {}, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.function.default"))

(def as-hexmode
 ^{:name-r "as.hexmode", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.hexmode"))

(def as-integer
 ^{:name-r "as.integer", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.integer"))

(def as-list
 ^{:name-r "as.list", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.list"))

(def as-list-data-frame
 ^{:name-r "as.list.data.frame",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.list.data.frame"))

(def as-list-date
 ^{:name-r "as.list.Date", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.list.Date"))

(def as-list-default
 ^{:name-r "as.list.default", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.list.default"))

(def as-list-environment
 ^{:name-r "as.list.environment",
  :doc "",
  :argslists ({:x nil, :all.names false, :sorted false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.list.environment"))

(def as-list-factor
 ^{:name-r "as.list.factor", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.list.factor"))

(def as-list-function
 ^{:name-r "as.list.function", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.list.function"))

(def as-list-numeric-version
 ^{:name-r "as.list.numeric_version",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.list.numeric_version"))

(def as-logical
 ^{:name-r "as.logical", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.logical"))

(def as-logical-factor
 ^{:name-r "as.logical.factor",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.logical.factor"))

(def as-matrix
 ^{:name-r "as.matrix", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.matrix"))

(def as-matrix-data-frame
 ^{:name-r "as.matrix.data.frame",
  :doc "",
  :argslists ({:x nil, :rownames.force [nil], :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.matrix.data.frame"))

(def as-matrix-default
 ^{:name-r "as.matrix.default",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.matrix.default"))

(def as-matrix-noquote
 ^{:name-r "as.matrix.noquote",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.matrix.noquote"))

(def as-matrix-polyglot-value
 ^{:name-r "as.matrix.polyglot.value",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.matrix.polyglot.value"))

(def as-name
 ^{:name-r "as.name", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.name"))

(def as-null
 ^{:name-r "as.null", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.null"))

(def as-null-default
 ^{:name-r "as.null.default", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.null.default"))

(def as-numeric
 ^{:name-r "as.numeric", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.numeric"))

(def as-numeric-version
 ^{:name-r "as.numeric_version", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.numeric_version"))

(def as-octmode
 ^{:name-r "as.octmode", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.octmode"))

(def as-ordered
 ^{:name-r "as.ordered", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.ordered"))

(def as-package-version
 ^{:name-r "as.package_version", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.package_version"))

(def as-pairlist
 ^{:name-r "as.pairlist", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.pairlist"))

(def as-qr
 ^{:name-r "as.qr", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.qr"))

(def as-raw
 ^{:name-r "as.raw", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.raw"))

(def as-single
 ^{:name-r "as.single", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.single"))

(def as-single-default
 ^{:name-r "as.single.default",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.single.default"))

(def as-symbol
 ^{:name-r "as.symbol", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.symbol"))

(def as-table
 ^{:name-r "as.table", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.table"))

(def as-table-default
 ^{:name-r "as.table.default", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.table.default"))

(def as-vector
 ^{:name-r "as.vector", :doc "", :argslists ({:x nil, :mode "any"})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.vector"))

(def as-vector-factor
 ^{:name-r "as.vector.factor",
  :doc "",
  :argslists ({:x nil, :mode "any"})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "as.vector.factor"))

(def asin
 ^{:name-r "asin", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "asin"))

(def asinh
 ^{:name-r "asinh", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "asinh"))

(def as-namespace
 ^{:name-r "asNamespace",
  :doc "",
  :argslists ({:ns nil, :base.OK true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "asNamespace"))

(def as-s-3
 ^{:name-r "asS3",
  :doc "",
  :argslists ({:object nil, :flag true, :complete true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "asS3"))

(def as-s-4
 ^{:name-r "asS4",
  :doc "",
  :argslists ({:object nil, :flag true, :complete true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "asS4"))

(def assign
 ^{:name-r "assign",
  :doc "",
  :argslists
  ({:x nil,
    :value nil,
    :pos {},
    :envir {},
    :inherits false,
    :immediate true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "assign"))

(def atan
 ^{:name-r "atan", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "atan"))

(def atan-2
 ^{:name-r "atan2", :doc "", :argslists ({:y nil, :x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "atan2"))

(def atanh
 ^{:name-r "atanh", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "atanh"))

(def attach
 ^{:name-r "attach",
  :doc "",
  :argslists
  ({:what nil,
    :pos 2,
    :name {:empty-key nil, :backtick false},
    :warn.conflicts true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "attach"))

(def attach-namespace
 ^{:name-r "attachNamespace",
  :doc "",
  :argslists ({:ns nil, :pos 2, :depends nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "attachNamespace"))

(def attr
 ^{:name-r "attr", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "attr"))

(def attr-all-equal
 ^{:name-r "attr.all.equal",
  :doc "",
  :argslists
  ({:target nil,
    :current nil,
    :... nil,
    :check.attributes true,
    :check.names true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "attr.all.equal"))

(def attributes
 ^{:name-r "attributes", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "attributes"))

(def autoload
 ^{:name-r "autoload",
  :doc "",
  :argslists ({:name nil, :package nil, :reset false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "autoload"))

(def autoloader
 ^{:name-r "autoloader",
  :doc "",
  :argslists ({:name nil, :package nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "autoloader"))

(def backsolve
 ^{:name-r "backsolve",
  :doc "",
  :argslists
  ({:r nil, :x nil, :k {}, :upper.tri true, :transpose false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "backsolve"))

(def baseenv
 ^{:name-r "baseenv", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "baseenv"))

(def basename
 ^{:name-r "basename", :doc "", :argslists ({:path nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "basename"))

(def bessel-i
 ^{:name-r "besselI",
  :doc "",
  :argslists ({:x nil, :nu nil, :expon.scaled false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "besselI"))

(def bessel-j
 ^{:name-r "besselJ", :doc "", :argslists ({:x nil, :nu nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "besselJ"))

(def bessel-k
 ^{:name-r "besselK",
  :doc "",
  :argslists ({:x nil, :nu nil, :expon.scaled false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "besselK"))

(def bessel-y
 ^{:name-r "besselY", :doc "", :argslists ({:x nil, :nu nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "besselY"))

(def beta
 ^{:name-r "beta", :doc "", :argslists ({:a nil, :b nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "beta"))

(def binding-is-active
 ^{:name-r "bindingIsActive",
  :doc "",
  :argslists ({:sym nil, :env nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "bindingIsActive"))

(def binding-is-locked
 ^{:name-r "bindingIsLocked",
  :doc "",
  :argslists ({:sym nil, :env nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "bindingIsLocked"))

(def bindtextdomain
 ^{:name-r "bindtextdomain", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "bindtextdomain"))

(def bitw-and
 ^{:name-r "bitwAnd", :doc "", :argslists ({:a nil, :b nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "bitwAnd"))

(def bitw-not
 ^{:name-r "bitwNot", :doc "", :argslists ({:a nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "bitwNot"))

(def bitw-or
 ^{:name-r "bitwOr", :doc "", :argslists ({:a nil, :b nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "bitwOr"))

(def bitw-shift-l
 ^{:name-r "bitwShiftL", :doc "", :argslists ({:a nil, :n nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "bitwShiftL"))

(def bitw-shift-r
 ^{:name-r "bitwShiftR", :doc "", :argslists ({:a nil, :n nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "bitwShiftR"))

(def bitw-xor
 ^{:name-r "bitwXor", :doc "", :argslists ({:a nil, :b nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "bitwXor"))

(def body
 ^{:name-r "body", :doc "", :argslists ({:fun {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "body"))

(def bquote
 ^{:name-r "bquote", :doc "", :argslists ({:expr nil, :where {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "bquote"))

(def browser
 ^{:name-r "browser", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "browser"))

(def browser-condition
 ^{:name-r "browserCondition", :doc "", :argslists ({:n 1})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "browserCondition"))

(def browser-set-debug
 ^{:name-r "browserSetDebug", :doc "", :argslists ({:n 1})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "browserSetDebug"))

(def browser-text
 ^{:name-r "browserText", :doc "", :argslists ({:n 1})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "browserText"))

(def builtins
 ^{:name-r "builtins", :doc "", :argslists ({:internal false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "builtins"))

(def by
 ^{:name-r "by",
  :doc "",
  :argslists
  ({:data nil, :INDICES nil, :FUN nil, :... nil, :simplify true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "by"))

(def by-data-frame
 ^{:name-r "by.data.frame",
  :doc "",
  :argslists
  ({:data nil, :INDICES nil, :FUN nil, :... nil, :simplify true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "by.data.frame"))

(def by-default
 ^{:name-r "by.default",
  :doc "",
  :argslists
  ({:data nil, :INDICES nil, :FUN nil, :... nil, :simplify true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "by.default"))

(def bzfile
 ^{:name-r "bzfile",
  :doc "",
  :argslists
  ({:description nil, :open "", :encoding {}, :compression 9})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "bzfile"))

(def c-date
 ^{:name-r "c.Date", :doc "", :argslists ({:... nil, :recursive false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "c.Date"))

(def c-difftime
 ^{:name-r "c.difftime",
  :doc "",
  :argslists ({:... nil, :recursive false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "c.difftime"))

(def c-noquote
 ^{:name-r "c.noquote",
  :doc "",
  :argslists ({:... nil, :recursive false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "c.noquote"))

(def c-numeric-version
 ^{:name-r "c.numeric_version",
  :doc "",
  :argslists ({:... nil, :recursive false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "c.numeric_version"))

(def c-warnings
 ^{:name-r "c.warnings",
  :doc "",
  :argslists ({:... nil, :recursive false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "c.warnings"))

(def call
 ^{:name-r "call", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "call"))

(def call-cc
 ^{:name-r "callCC", :doc "", :argslists ({:fun nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "callCC"))

(def capabilities
 ^{:name-r "capabilities", :doc "", :argslists ({:what nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "capabilities"))

(def casefold
 ^{:name-r "casefold", :doc "", :argslists ({:x nil, :upper false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "casefold"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "cat"))

(def cbind
 ^{:name-r "cbind", :doc "", :argslists ({:... nil, :deparse.level 1})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "cbind"))

(def cbind-data-frame
 ^{:name-r "cbind.data.frame",
  :doc "",
  :argslists ({:... nil, :deparse.level 1})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "cbind.data.frame"))

(def ceiling
 ^{:name-r "ceiling", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "ceiling"))

(def char-expand
 ^{:name-r "char.expand",
  :doc "",
  :argslists ({:input nil, :target nil, :nomatch {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "char.expand"))

(def character
 ^{:name-r "character", :doc "", :argslists ({:length 0})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "character"))

(def charmatch
 ^{:name-r "charmatch",
  :doc "",
  :argslists ({:x nil, :table nil, :nomatch [nil]})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "charmatch"))

(def char-to-raw
 ^{:name-r "charToRaw", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "charToRaw"))

(def chartr
 ^{:name-r "chartr", :doc "", :argslists ({:old nil, :new nil, :x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "chartr"))

(def check-tzones
 ^{:name-r "check_tzones", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "check_tzones"))

(def chk-dots
 ^{:name-r "chkDots",
  :doc "",
  :argslists ({:... nil, :which.call {}, :allowed {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "chkDots"))

(def chol
 ^{:name-r "chol", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "chol"))

(def chol-default
 ^{:name-r "chol.default",
  :doc "",
  :argslists
  ({:x nil, :pivot false, :LINPACK false, :tol {}, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "chol.default"))

(def chol-2inv
 ^{:name-r "chol2inv",
  :doc "",
  :argslists ({:x nil, :size {}, :LINPACK false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "chol2inv"))

(def choose
 ^{:name-r "choose", :doc "", :argslists ({:n nil, :k nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "choose"))

(def class
 ^{:name-r "class", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "class"))

(def clear-push-back
 ^{:name-r "clearPushBack", :doc "", :argslists ({:connection nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "clearPushBack"))

(def close
 ^{:name-r "close", :doc "", :argslists ({:con nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "close"))

(def close-connection
 ^{:name-r "close.connection",
  :doc "",
  :argslists ({:con nil, :type "rw", :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "close.connection"))

(def close-srcfile
 ^{:name-r "close.srcfile", :doc "", :argslists ({:con nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "close.srcfile"))

(def close-srcfilealias
 ^{:name-r "close.srcfilealias",
  :doc "",
  :argslists ({:con nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "close.srcfilealias"))

(def close-all-connections
 ^{:name-r "closeAllConnections", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "closeAllConnections"))

(def col
 ^{:name-r "col", :doc "", :argslists ({:x nil, :as.factor false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "col"))

(def col-means
 ^{:name-r "colMeans",
  :doc "",
  :argslists ({:x nil, :na.rm false, :dims 1})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "colMeans"))

(def colnames
 ^{:name-r "colnames",
  :doc "",
  :argslists ({:x nil, :do.NULL true, :prefix "col"})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "colnames"))

(def col-sums
 ^{:name-r "colSums",
  :doc "",
  :argslists ({:x nil, :na.rm false, :dims 1})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "colSums"))

(def command-args
 ^{:name-r "commandArgs", :doc "", :argslists ({:trailingOnly false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "commandArgs"))

(def comment
 ^{:name-r "comment", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "comment"))

(def complex
 ^{:name-r "complex",
  :doc "",
  :argslists
  ({:length.out 0, :real {}, :imaginary {}, :modulus 1, :argument 0})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "complex"))

(def compute-restarts
 ^{:name-r "computeRestarts", :doc "", :argslists ({:cond nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "computeRestarts"))

(def condition-call
 ^{:name-r "conditionCall", :doc "", :argslists ({:c nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "conditionCall"))

(def condition-call-condition
 ^{:name-r "conditionCall.condition", :doc "", :argslists ({:c nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "conditionCall.condition"))

(def condition-message
 ^{:name-r "conditionMessage", :doc "", :argslists ({:c nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "conditionMessage"))

(def condition-message-condition
 ^{:name-r "conditionMessage.condition", :doc "", :argslists ({:c nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "conditionMessage.condition"))

(def conflicts
 ^{:name-r "conflicts",
  :doc "",
  :argslists ({:where {}, :detail false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "conflicts"))

(def conj
 ^{:name-r "Conj", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Conj"))

(def contributors
 ^{:name-r "contributors", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "contributors"))

(def cos
 ^{:name-r "cos", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "cos"))

(def cosh
 ^{:name-r "cosh", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "cosh"))

(def cospi
 ^{:name-r "cospi", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "cospi"))

(def crossprod
 ^{:name-r "crossprod", :doc "", :argslists ({:x nil, :y nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "crossprod"))

(def cstack-info
 ^{:name-r "Cstack_info", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Cstack_info"))

(def cummax
 ^{:name-r "cummax", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "cummax"))

(def cummin
 ^{:name-r "cummin", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "cummin"))

(def cumprod
 ^{:name-r "cumprod", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "cumprod"))

(def cumsum
 ^{:name-r "cumsum", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "cumsum"))

(def curl-get-headers
 ^{:name-r "curlGetHeaders",
  :doc "",
  :argslists ({:url nil, :redirect true, :verify true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "curlGetHeaders"))

(def cut
 ^{:name-r "cut", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "cut"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "cut.Date"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "cut.default"))

(def data-class
 ^{:name-r "data.class", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "data.class"))

(def data-frame
 ^{:name-r "data.frame",
  :doc "",
  :argslists
  ({:... nil,
    :row.names nil,
    :check.rows false,
    :check.names true,
    :fix.empty.names true,
    :stringsAsFactors {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "data.frame"))

(def data-matrix
 ^{:name-r "data.matrix",
  :doc "",
  :argslists ({:frame nil, :rownames.force [nil]})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "data.matrix"))

(def date
 ^{:name-r "date", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "date"))

(def debug
 ^{:name-r "debug",
  :doc "",
  :argslists ({:fun nil, :text "", :condition nil, :signature nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "debug"))

(def debugging-state
 ^{:name-r "debuggingState", :doc "", :argslists ({:on nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "debuggingState"))

(def debugonce
 ^{:name-r "debugonce",
  :doc "",
  :argslists ({:fun nil, :text "", :condition nil, :signature nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "debugonce"))

(def default-strings-as-factors
 ^{:name-r "default.stringsAsFactors", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "default.stringsAsFactors"))

(def delayed-assign
 ^{:name-r "delayedAssign",
  :doc "",
  :argslists ({:x nil, :value nil, :eval.env {}, :assign.env {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "delayedAssign"))

(def deparse
 ^{:name-r "deparse",
  :doc "",
  :argslists
  ({:expr nil,
    :width.cutoff 60,
    :backtick {},
    :control {},
    :nlines {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "deparse"))

(def det
 ^{:name-r "det", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "det"))

(def detach
 ^{:name-r "detach",
  :doc "",
  :argslists
  ({:name nil,
    :pos 2,
    :unload false,
    :character.only false,
    :force false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "detach"))

(def determinant
 ^{:name-r "determinant",
  :doc "",
  :argslists ({:x nil, :logarithm true, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "determinant"))

(def determinant-matrix
 ^{:name-r "determinant.matrix",
  :doc "",
  :argslists ({:x nil, :logarithm true, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "determinant.matrix"))

(def dget
 ^{:name-r "dget",
  :doc "",
  :argslists ({:file nil, :keep.source false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "dget"))

(def diag
 ^{:name-r "diag",
  :doc "",
  :argslists ({:x 1, :nrow nil, :ncol nil, :names true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "diag"))

(def diff
 ^{:name-r "diff", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "diff"))

(def diff-date
 ^{:name-r "diff.Date",
  :doc "",
  :argslists ({:x nil, :lag 1, :differences 1, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "diff.Date"))

(def diff-default
 ^{:name-r "diff.default",
  :doc "",
  :argslists ({:x nil, :lag 1, :differences 1, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "diff.default"))

(def diff-difftime
 ^{:name-r "diff.difftime", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "diff.difftime"))

(def difftime
 ^{:name-r "difftime",
  :doc "",
  :argslists ({:time1 nil, :time2 nil, :tz nil, :units {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "difftime"))

(def digamma
 ^{:name-r "digamma", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "digamma"))

(def dim
 ^{:name-r "dim", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "dim"))

(def dim-data-frame
 ^{:name-r "dim.data.frame", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "dim.data.frame"))

(def dimnames
 ^{:name-r "dimnames", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "dimnames"))

(def dimnames-data-frame
 ^{:name-r "dimnames.data.frame", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "dimnames.data.frame"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "dir"))

(def dir-create
 ^{:name-r "dir.create",
  :doc "",
  :argslists
  ({:path nil, :showWarnings true, :recursive false, :mode "0777"})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "dir.create"))

(def dir-exists
 ^{:name-r "dir.exists", :doc "", :argslists ({:paths nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "dir.exists"))

(def dirname
 ^{:name-r "dirname", :doc "", :argslists ({:path nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "dirname"))

(def do-call
 ^{:name-r "do.call",
  :doc "",
  :argslists ({:what nil, :args nil, :quote false, :envir {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "do.call"))

(def dont-check
 ^{:name-r "dontCheck", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "dontCheck"))

(def double
 ^{:name-r "double", :doc "", :argslists ({:length 0})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "double"))

(def dput
 ^{:name-r "dput",
  :doc "",
  :argslists ({:x nil, :file "", :control {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "dput"))

(def d-quote
 ^{:name-r "dQuote", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "dQuote"))

(def drop
 ^{:name-r "drop", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "drop"))

(def droplevels
 ^{:name-r "droplevels", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "droplevels"))

(def droplevels-data-frame
 ^{:name-r "droplevels.data.frame",
  :doc "",
  :argslists ({:x nil, :except nil, :exclude nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "droplevels.data.frame"))

(def droplevels-factor
 ^{:name-r "droplevels.factor",
  :doc "",
  :argslists ({:x nil, :exclude {}, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "droplevels.factor"))

(def dump
 ^{:name-r "dump",
  :doc "",
  :argslists
  ({:list nil,
    :file "dumpdata.R",
    :append false,
    :control "all",
    :envir {},
    :evaluate true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "dump"))

(def duplicated
 ^{:name-r "duplicated",
  :doc "",
  :argslists ({:x nil, :incomparables false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "duplicated"))

(def duplicated-array
 ^{:name-r "duplicated.array",
  :doc "",
  :argslists
  ({:x nil,
    :incomparables false,
    :MARGIN 1,
    :fromLast false,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "duplicated.array"))

(def duplicated-data-frame
 ^{:name-r "duplicated.data.frame",
  :doc "",
  :argslists
  ({:x nil, :incomparables false, :fromLast false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "duplicated.data.frame"))

(def duplicated-default
 ^{:name-r "duplicated.default",
  :doc "",
  :argslists
  ({:x nil,
    :incomparables false,
    :fromLast false,
    :nmax [nil],
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "duplicated.default"))

(def duplicated-matrix
 ^{:name-r "duplicated.matrix",
  :doc "",
  :argslists
  ({:x nil,
    :incomparables false,
    :MARGIN 1,
    :fromLast false,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "duplicated.matrix"))

(def duplicated-numeric-version
 ^{:name-r "duplicated.numeric_version",
  :doc "",
  :argslists ({:x nil, :incomparables false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "duplicated.numeric_version"))

(def duplicated-warnings
 ^{:name-r "duplicated.warnings",
  :doc "",
  :argslists ({:x nil, :incomparables false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "duplicated.warnings"))

(def dyn-load
 ^{:name-r "dyn.load",
  :doc "",
  :argslists ({:x nil, :local true, :now true, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "dyn.load"))

(def dyn-unload
 ^{:name-r "dyn.unload", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "dyn.unload"))

(def dyn-get
 ^{:name-r "dynGet",
  :doc "",
  :argslists
  ({:x nil,
    :ifnotfound {:empty-key nil, :domain [nil]},
    :minframe 1,
    :inherits false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "dynGet"))

(def eapply
 ^{:name-r "eapply",
  :doc "",
  :argslists
  ({:env nil, :FUN nil, :... nil, :all.names false, :USE.NAMES true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "eapply"))

(def eigen
 ^{:name-r "eigen",
  :doc "",
  :argslists
  ({:x nil, :symmetric nil, :only.values false, :EISPACK false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "eigen"))

(def emptyenv
 ^{:name-r "emptyenv", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "emptyenv"))

(def enc-2native
 ^{:name-r "enc2native", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "enc2native"))

(def enc-2utf-8
 ^{:name-r "enc2utf8", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "enc2utf8"))

(def encode-string
 ^{:name-r "encodeString",
  :doc "",
  :argslists
  ({:x nil, :width 0, :quote "", :na.encode true, :justify {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "encodeString"))

(def encoding
 ^{:name-r "Encoding", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Encoding"))

(def ends-with
 ^{:name-r "endsWith", :doc "", :argslists ({:x nil, :suffix nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "endsWith"))

(def enquote
 ^{:name-r "enquote", :doc "", :argslists ({:cl nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "enquote"))

(def env-profile
 ^{:name-r "env.profile", :doc "", :argslists ({:env nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "env.profile"))

(def environment
 ^{:name-r "environment", :doc "", :argslists ({:fun nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "environment"))

(def environment-is-locked
 ^{:name-r "environmentIsLocked", :doc "", :argslists ({:env nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "environmentIsLocked"))

(def environment-name
 ^{:name-r "environmentName", :doc "", :argslists ({:env nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "environmentName"))

(def eval-parent
 ^{:name-r "eval.parent", :doc "", :argslists ({:expr nil, :n 1})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "eval.parent"))

(def eval-polyglot
 ^{:name-r "eval.polyglot", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "eval.polyglot"))

(def evalq
 ^{:name-r "evalq",
  :doc "",
  :argslists ({:expr nil, :envir {}, :enclos {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "evalq"))

(def exists
 ^{:name-r "exists",
  :doc "",
  :argslists
  ({:x nil,
    :where {},
    :envir {},
    :frame nil,
    :mode "any",
    :inherits true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "exists"))

(def exp
 ^{:name-r "exp", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "exp"))

(def expand-grid
 ^{:name-r "expand.grid",
  :doc "",
  :argslists
  ({:... nil, :KEEP.OUT.ATTRS true, :stringsAsFactors true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "expand.grid"))

(def expm-1
 ^{:name-r "expm1", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "expm1"))

(def export
 ^{:name-r "export", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "export"))

(def expression
 ^{:name-r "expression", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "expression"))

(def ext-soft-version
 ^{:name-r "extSoftVersion", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "extSoftVersion"))

(def factor
 ^{:name-r "factor",
  :doc "",
  :argslists
  ({:x {},
    :levels nil,
    :labels nil,
    :exclude [nil],
    :ordered {},
    :nmax [nil]})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "factor"))

(def factorial
 ^{:name-r "factorial", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "factorial"))

(def fifo
 ^{:name-r "fifo",
  :doc "",
  :argslists
  ({:description nil, :open "", :blocking false, :encoding {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "fifo"))

(def file
 ^{:name-r "file",
  :doc "",
  :argslists
  ({:description "",
    :open "",
    :blocking true,
    :encoding {},
    :raw false,
    :method {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "file"))

(def file-access
 ^{:name-r "file.access", :doc "", :argslists ({:names nil, :mode 0})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "file.access"))

(def file-append
 ^{:name-r "file.append",
  :doc "",
  :argslists ({:file1 nil, :file2 nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "file.append"))

(def file-choose
 ^{:name-r "file.choose", :doc "", :argslists ({:new false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "file.choose"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "file.copy"))

(def file-create
 ^{:name-r "file.create",
  :doc "",
  :argslists ({:... nil, :showWarnings true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "file.create"))

(def file-exists
 ^{:name-r "file.exists", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "file.exists"))

(def file-info
 ^{:name-r "file.info",
  :doc "",
  :argslists ({:... nil, :extra_cols true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "file.info"))

(def file-link
 ^{:name-r "file.link", :doc "", :argslists ({:from nil, :to nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "file.link"))

(def file-mode
 ^{:name-r "file.mode", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "file.mode"))

(def file-mtime
 ^{:name-r "file.mtime", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "file.mtime"))

(def file-path
 ^{:name-r "file.path", :doc "", :argslists ({:... nil, :fsep {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "file.path"))

(def file-remove
 ^{:name-r "file.remove", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "file.remove"))

(def file-rename
 ^{:name-r "file.rename", :doc "", :argslists ({:from nil, :to nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "file.rename"))

(def file-show
 ^{:name-r "file.show",
  :doc "",
  :argslists
  ({:... nil,
    :header {},
    :title "R Information",
    :delete.file false,
    :pager {},
    :encoding ""})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "file.show"))

(def file-size
 ^{:name-r "file.size", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "file.size"))

(def file-symlink
 ^{:name-r "file.symlink", :doc "", :argslists ({:from nil, :to nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "file.symlink"))

(def filter
 ^{:name-r "Filter", :doc "", :argslists ({:f nil, :x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Filter"))

(def find
 ^{:name-r "Find",
  :doc "",
  :argslists ({:f nil, :x nil, :right false, :nomatch nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Find"))

(def find-package
 ^{:name-r "find.package",
  :doc "",
  :argslists ({:package nil, :lib.loc nil, :quiet false, :verbose {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "find.package"))

(def find-interval
 ^{:name-r "findInterval",
  :doc "",
  :argslists
  ({:x nil,
    :vec nil,
    :rightmost.closed false,
    :all.inside false,
    :left.open false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "findInterval"))

(def find-package-env
 ^{:name-r "findPackageEnv", :doc "", :argslists ({:info nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "findPackageEnv"))

(def find-restart
 ^{:name-r "findRestart", :doc "", :argslists ({:name nil, :cond nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "findRestart"))

(def floor
 ^{:name-r "floor", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "floor"))

(def flush
 ^{:name-r "flush", :doc "", :argslists ({:con nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "flush"))

(def flush-connection
 ^{:name-r "flush.connection", :doc "", :argslists ({:con nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "flush.connection"))

(def force
 ^{:name-r "force", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "force"))

(def force-and-call
 ^{:name-r "forceAndCall", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "forceAndCall"))

(def formals
 ^{:name-r "formals", :doc "", :argslists ({:fun {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "formals"))

(def format
 ^{:name-r "format", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "format"))

(def format-as-is
 ^{:name-r "format.AsIs",
  :doc "",
  :argslists ({:x nil, :width 12, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "format.AsIs"))

(def format-data-frame
 ^{:name-r "format.data.frame",
  :doc "",
  :argslists ({:x nil, :... nil, :justify "none"})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "format.data.frame"))

(def format-date
 ^{:name-r "format.Date", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "format.Date"))

(def format-default
 ^{:name-r "format.default",
  :doc "",
  :argslists
  ({:justify {},
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
    :decimal.mark {},
    :nsmall 0,
    :small.mark "",
    :zero.print nil,
    :drop0trailing false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "format.default"))

(def format-difftime
 ^{:name-r "format.difftime", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "format.difftime"))

(def format-factor
 ^{:name-r "format.factor", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "format.factor"))

(def format-hexmode
 ^{:name-r "format.hexmode",
  :doc "",
  :argslists ({:x nil, :width nil, :upper.case false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "format.hexmode"))

(def format-info
 ^{:name-r "format.info",
  :doc "",
  :argslists ({:x nil, :digits nil, :nsmall 0})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "format.info"))

(def format-library-iqr
 ^{:name-r "format.libraryIQR",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "format.libraryIQR"))

(def format-numeric-version
 ^{:name-r "format.numeric_version",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "format.numeric_version"))

(def format-octmode
 ^{:name-r "format.octmode",
  :doc "",
  :argslists ({:x nil, :width nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "format.octmode"))

(def format-package-info
 ^{:name-r "format.packageInfo",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "format.packageInfo"))

(def format-pval
 ^{:name-r "format.pval",
  :doc "",
  :argslists ({:pv nil, :digits {}, :eps {}, :na.form "NA", :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "format.pval"))

(def format-summary-default
 ^{:name-r "format.summaryDefault",
  :doc "",
  :argslists ({:x nil, :digits {}, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "format.summaryDefault"))

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
    :decimal.mark {},
    :small.mark "",
    :zero.print nil,
    :drop0trailing false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "formatC"))

(def format-dl
 ^{:name-r "formatDL",
  :doc "",
  :argslists ({:x nil, :y nil, :style {}, :width {}, :indent nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "formatDL"))

(def forwardsolve
 ^{:name-r "forwardsolve",
  :doc "",
  :argslists
  ({:l nil, :x nil, :k {}, :upper.tri false, :transpose false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "forwardsolve"))

(def gamma
 ^{:name-r "gamma", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "gamma"))

(def gc
 ^{:name-r "gc",
  :doc "",
  :argslists ({:verbose {}, :reset false, :full true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "gc"))

(def gcinfo
 ^{:name-r "gcinfo", :doc "", :argslists ({:verbose nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "gcinfo"))

(def gctorture
 ^{:name-r "gctorture", :doc "", :argslists ({:on true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "gctorture"))

(def gctorture-2
 ^{:name-r "gctorture2",
  :doc "",
  :argslists ({:step nil, :wait nil, :inhibit_release false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "gctorture2"))

(def get
 ^{:name-r "get",
  :doc "",
  :argslists
  ({:x nil, :pos {}, :envir {}, :mode "any", :inherits true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "get"))

(def get-0
 ^{:name-r "get0",
  :doc "",
  :argslists
  ({:x nil, :envir {}, :mode "any", :inherits true, :ifnotfound nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "get0"))

(def get-all-connections
 ^{:name-r "getAllConnections", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "getAllConnections"))

(def get-calling-dll
 ^{:name-r "getCallingDLL",
  :doc "",
  :argslists ({:f {}, :doStop false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "getCallingDLL"))

(def get-calling-dl-le
 ^{:name-r "getCallingDLLe", :doc "", :argslists ({:e nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "getCallingDLLe"))

(def get-connection
 ^{:name-r "getConnection", :doc "", :argslists ({:what nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "getConnection"))

(def get-dll-registered-routines
 ^{:name-r "getDLLRegisteredRoutines",
  :doc "",
  :argslists ({:dll nil, :addNames true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "getDLLRegisteredRoutines"))

(def get-dll-registered-routines-character
 ^{:name-r "getDLLRegisteredRoutines.character",
  :doc "",
  :argslists ({:dll nil, :addNames true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "getDLLRegisteredRoutines.character"))

(def get-dll-registered-routines-dll-info
 ^{:name-r "getDLLRegisteredRoutines.DLLInfo",
  :doc "",
  :argslists ({:dll nil, :addNames true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "getDLLRegisteredRoutines.DLLInfo"))

(def get-element
 ^{:name-r "getElement", :doc "", :argslists ({:object nil, :name nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "getElement"))

(def geterrmessage
 ^{:name-r "geterrmessage", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "geterrmessage"))

(def get-exported-value
 ^{:name-r "getExportedValue",
  :doc "",
  :argslists ({:ns nil, :name nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "getExportedValue"))

(def get-hook
 ^{:name-r "getHook", :doc "", :argslists ({:hookName nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "getHook"))

(def get-loaded-dl-ls
 ^{:name-r "getLoadedDLLs", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "getLoadedDLLs"))

(def get-namespace
 ^{:name-r "getNamespace", :doc "", :argslists ({:name nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "getNamespace"))

(def get-namespace-exports
 ^{:name-r "getNamespaceExports", :doc "", :argslists ({:ns nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "getNamespaceExports"))

(def get-namespace-imports
 ^{:name-r "getNamespaceImports", :doc "", :argslists ({:ns nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "getNamespaceImports"))

(def get-namespace-info
 ^{:name-r "getNamespaceInfo",
  :doc "",
  :argslists ({:ns nil, :which nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "getNamespaceInfo"))

(def get-namespace-name
 ^{:name-r "getNamespaceName", :doc "", :argslists ({:ns nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "getNamespaceName"))

(def get-namespace-users
 ^{:name-r "getNamespaceUsers", :doc "", :argslists ({:ns nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "getNamespaceUsers"))

(def get-namespace-version
 ^{:name-r "getNamespaceVersion", :doc "", :argslists ({:ns nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "getNamespaceVersion"))

(def get-native-symbol-info
 ^{:name-r "getNativeSymbolInfo",
  :doc "",
  :argslists
  ({:name nil,
    :PACKAGE nil,
    :unlist true,
    :withRegistrationInfo false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "getNativeSymbolInfo"))

(def get-option
 ^{:name-r "getOption", :doc "", :argslists ({:x nil, :default nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "getOption"))

(def get-rversion
 ^{:name-r "getRversion", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "getRversion"))

(def get-src-lines
 ^{:name-r "getSrcLines",
  :doc "",
  :argslists ({:srcfile nil, :first nil, :last nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "getSrcLines"))

(def get-task-callback-names
 ^{:name-r "getTaskCallbackNames", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "getTaskCallbackNames"))

(def gettext
 ^{:name-r "gettext", :doc "", :argslists ({:... nil, :domain nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "gettext"))

(def gettextf
 ^{:name-r "gettextf",
  :doc "",
  :argslists ({:fmt nil, :... nil, :domain nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "gettextf"))

(def getwd
 ^{:name-r "getwd", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "getwd"))

(def gl
 ^{:name-r "gl",
  :doc "",
  :argslists
  ({:n nil, :k nil, :length {}, :labels {}, :ordered false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "gl"))

(def globalenv
 ^{:name-r "globalenv", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "globalenv"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "gregexpr"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "grep"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "grepl"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "grepRaw"))

(def grouping
 ^{:name-r "grouping", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "grouping"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "gsub"))

(def gzcon
 ^{:name-r "gzcon",
  :doc "",
  :argslists
  ({:con nil, :level 6, :allowNonCompressed true, :text false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "gzcon"))

(def gzfile
 ^{:name-r "gzfile",
  :doc "",
  :argslists
  ({:description nil, :open "", :encoding {}, :compression 6})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "gzfile"))

(def iconv
 ^{:name-r "iconv",
  :doc "",
  :argslists
  ({:x nil, :from "", :to "", :sub [nil], :mark true, :toRaw false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "iconv"))

(def iconvlist
 ^{:name-r "iconvlist", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "iconvlist"))

(def icu-get-collate
 ^{:name-r "icuGetCollate", :doc "", :argslists ({:type {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "icuGetCollate"))

(def icu-set-collate
 ^{:name-r "icuSetCollate", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "icuSetCollate"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "identical"))

(def identity
 ^{:name-r "identity", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "identity"))

(def ifelse
 ^{:name-r "ifelse",
  :doc "",
  :argslists ({:test nil, :yes nil, :no nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "ifelse"))

(def im
 ^{:name-r "Im", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Im"))

(def import
 ^{:name-r "import", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "import"))

(def import-into-env
 ^{:name-r "importIntoEnv",
  :doc "",
  :argslists
  ({:impenv nil, :impnames nil, :expenv nil, :expnames nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "importIntoEnv"))

(def inherits
 ^{:name-r "inherits",
  :doc "",
  :argslists ({:x nil, :what nil, :which false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "inherits"))

(def integer
 ^{:name-r "integer", :doc "", :argslists ({:length 0})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "integer"))

(def interaction
 ^{:name-r "interaction",
  :doc "",
  :argslists ({:... nil, :drop false, :sep ".", :lex.order false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "interaction"))

(def interactive
 ^{:name-r "interactive", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "interactive"))

(def intersect
 ^{:name-r "intersect", :doc "", :argslists ({:x nil, :y nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "intersect"))

(def int-to-bits
 ^{:name-r "intToBits", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "intToBits"))

(def int-to-utf-8
 ^{:name-r "intToUtf8",
  :doc "",
  :argslists ({:x nil, :multiple false, :allow_surrogate_pairs false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "intToUtf8"))

(def inverse-rle
 ^{:name-r "inverse.rle", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "inverse.rle"))

(def invisible
 ^{:name-r "invisible", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "invisible"))

(def invoke-restart
 ^{:name-r "invokeRestart", :doc "", :argslists ({:r nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "invokeRestart"))

(def invoke-restart-interactively
 ^{:name-r "invokeRestartInteractively", :doc "", :argslists ({:r nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "invokeRestartInteractively"))

(def is-array
 ^{:name-r "is.array", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.array"))

(def is-atomic
 ^{:name-r "is.atomic", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.atomic"))

(def is-call
 ^{:name-r "is.call", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.call"))

(def is-character
 ^{:name-r "is.character", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.character"))

(def is-complex
 ^{:name-r "is.complex", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.complex"))

(def is-data-frame
 ^{:name-r "is.data.frame", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.data.frame"))

(def is-double
 ^{:name-r "is.double", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.double"))

(def is-element
 ^{:name-r "is.element", :doc "", :argslists ({:el nil, :set nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.element"))

(def is-environment
 ^{:name-r "is.environment", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.environment"))

(def is-expression
 ^{:name-r "is.expression", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.expression"))

(def is-factor
 ^{:name-r "is.factor", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.factor"))

(def is-finite
 ^{:name-r "is.finite", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.finite"))

(def is-function
 ^{:name-r "is.function", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.function"))

(def is-infinite
 ^{:name-r "is.infinite", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.infinite"))

(def is-integer
 ^{:name-r "is.integer", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.integer"))

(def is-language
 ^{:name-r "is.language", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.language"))

(def is-list
 ^{:name-r "is.list", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.list"))

(def is-loaded
 ^{:name-r "is.loaded",
  :doc "",
  :argslists ({:symbol nil, :PACKAGE "", :type ""})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.loaded"))

(def is-logical
 ^{:name-r "is.logical", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.logical"))

(def is-matrix
 ^{:name-r "is.matrix", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.matrix"))

(def is-na
 ^{:name-r "is.na", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.na"))

(def is-na-data-frame
 ^{:name-r "is.na.data.frame", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.na.data.frame"))

(def is-na-numeric-version
 ^{:name-r "is.na.numeric_version", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.na.numeric_version"))

(def is-name
 ^{:name-r "is.name", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.name"))

(def is-nan
 ^{:name-r "is.nan", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.nan"))

(def is-null
 ^{:name-r "is.null", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.null"))

(def is-numeric
 ^{:name-r "is.numeric", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.numeric"))

(def is-numeric-version
 ^{:name-r "is.numeric_version", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.numeric_version"))

(def is-numeric-date
 ^{:name-r "is.numeric.Date", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.numeric.Date"))

(def is-numeric-difftime
 ^{:name-r "is.numeric.difftime", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.numeric.difftime"))

(def is-object
 ^{:name-r "is.object", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.object"))

(def is-ordered
 ^{:name-r "is.ordered", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.ordered"))

(def is-package-version
 ^{:name-r "is.package_version", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.package_version"))

(def is-pairlist
 ^{:name-r "is.pairlist", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.pairlist"))

(def is-polyglot-value
 ^{:name-r "is.polyglot.value", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.polyglot.value"))

(def is-primitive
 ^{:name-r "is.primitive", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.primitive"))

(def is-qr
 ^{:name-r "is.qr", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.qr"))

(def is-r
 ^{:name-r "is.R", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.R"))

(def is-raw
 ^{:name-r "is.raw", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.raw"))

(def is-recursive
 ^{:name-r "is.recursive", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.recursive"))

(def is-single
 ^{:name-r "is.single", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.single"))

(def is-symbol
 ^{:name-r "is.symbol", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.symbol"))

(def is-table
 ^{:name-r "is.table", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.table"))

(def is-unsorted
 ^{:name-r "is.unsorted",
  :doc "",
  :argslists ({:x nil, :na.rm false, :strictly false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.unsorted"))

(def is-vector
 ^{:name-r "is.vector", :doc "", :argslists ({:x nil, :mode "any"})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "is.vector"))

(def isatty
 ^{:name-r "isatty", :doc "", :argslists ({:con nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "isatty"))

(def is-base-namespace
 ^{:name-r "isBaseNamespace", :doc "", :argslists ({:ns nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "isBaseNamespace"))

(def isdebugged
 ^{:name-r "isdebugged",
  :doc "",
  :argslists ({:fun nil, :signature nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "isdebugged"))

(def is-false
 ^{:name-r "isFALSE", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "isFALSE"))

(def is-incomplete
 ^{:name-r "isIncomplete", :doc "", :argslists ({:con nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "isIncomplete"))

(def is-namespace
 ^{:name-r "isNamespace", :doc "", :argslists ({:ns nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "isNamespace"))

(def is-namespace-loaded
 ^{:name-r "isNamespaceLoaded", :doc "", :argslists ({:name nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "isNamespaceLoaded"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "ISOdate"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "ISOdatetime"))

(def is-open
 ^{:name-r "isOpen", :doc "", :argslists ({:con nil, :rw ""})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "isOpen"))

(def is-restart
 ^{:name-r "isRestart", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "isRestart"))

(def is-s-4
 ^{:name-r "isS4", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "isS4"))

(def is-seekable
 ^{:name-r "isSeekable", :doc "", :argslists ({:con nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "isSeekable"))

(def is-symmetric
 ^{:name-r "isSymmetric", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "isSymmetric"))

(def is-symmetric-matrix
 ^{:name-r "isSymmetric.matrix",
  :doc "",
  :argslists ({:object nil, :tol {}, :tol1 {}, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "isSymmetric.matrix"))

(def is-true
 ^{:name-r "isTRUE", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "isTRUE"))

(def java-add-to-classpath
 ^{:name-r "java.addToClasspath", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "java.addToClasspath"))

(def java-type
 ^{:name-r "java.type", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "java.type"))

(def jitter
 ^{:name-r "jitter",
  :doc "",
  :argslists ({:x nil, :factor 1, :amount nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "jitter"))

(def julian
 ^{:name-r "julian", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "julian"))

(def julian-date
 ^{:name-r "julian.Date",
  :doc "",
  :argslists ({:x nil, :origin {}, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "julian.Date"))

(def kappa
 ^{:name-r "kappa", :doc "", :argslists ({:z nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "kappa"))

(def kappa-default
 ^{:name-r "kappa.default",
  :doc "",
  :argslists ({:z nil, :exact false, :norm nil, :method {}, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "kappa.default"))

(def kappa-lm
 ^{:name-r "kappa.lm", :doc "", :argslists ({:z nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "kappa.lm"))

(def kappa-qr
 ^{:name-r "kappa.qr", :doc "", :argslists ({:z nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "kappa.qr"))

(def kronecker
 ^{:name-r "kronecker",
  :doc "",
  :argslists
  ({:X nil, :Y nil, :FUN "*", :make.dimnames false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "kronecker"))

(def la-library
 ^{:name-r "La_library", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "La_library"))

(def la-version
 ^{:name-r "La_version", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "La_version"))

(def la-svd
 ^{:name-r "La.svd", :doc "", :argslists ({:x nil, :nu {}, :nv {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "La.svd"))

(def labels
 ^{:name-r "labels", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "labels"))

(def labels-default
 ^{:name-r "labels.default",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "labels.default"))

(def lapply
 ^{:name-r "lapply", :doc "", :argslists ({:X nil, :FUN nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "lapply"))

(def lazy-load
 ^{:name-r "lazyLoad",
  :doc "",
  :argslists ({:filebase nil, :envir {}, :filter nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "lazyLoad"))

(def lazy-load-d-bexec
 ^{:name-r "lazyLoadDBexec",
  :doc "",
  :argslists ({:filebase nil, :fun nil, :filter nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "lazyLoadDBexec"))

(def lazy-load-d-bfetch
 ^{:name-r "lazyLoadDBfetch", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "lazyLoadDBfetch"))

(def lbeta
 ^{:name-r "lbeta", :doc "", :argslists ({:a nil, :b nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "lbeta"))

(def lchoose
 ^{:name-r "lchoose", :doc "", :argslists ({:n nil, :k nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "lchoose"))

(def length
 ^{:name-r "length", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "length"))

(def lengths
 ^{:name-r "lengths", :doc "", :argslists ({:x nil, :use.names true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "lengths"))

(def levels
 ^{:name-r "levels", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "levels"))

(def levels-default
 ^{:name-r "levels.default", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "levels.default"))

(def lfactorial
 ^{:name-r "lfactorial", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "lfactorial"))

(def lgamma
 ^{:name-r "lgamma", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "lgamma"))

(def libcurl-version
 ^{:name-r "libcurlVersion", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "libcurlVersion"))

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
    :verbose {},
    :logical.return false,
    :help nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "library"))

(def library-dynam
 ^{:name-r "library.dynam",
  :doc "",
  :argslists
  ({:chname nil,
    :package nil,
    :lib.loc nil,
    :verbose {},
    :file.ext {},
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "library.dynam"))

(def library-dynam-unload
 ^{:name-r "library.dynam.unload",
  :doc "",
  :argslists ({:chname nil, :libpath nil, :verbose {}, :file.ext {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "library.dynam.unload"))

(def licence
 ^{:name-r "licence", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "licence"))

(def license
 ^{:name-r "license", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "license"))

(def list
 ^{:name-r "list", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "list"))

(def list-dirs
 ^{:name-r "list.dirs",
  :doc "",
  :argslists ({:path ".", :full.names true, :recursive true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "list.dirs"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "list.files"))

(def list-2env
 ^{:name-r "list2env",
  :doc "",
  :argslists ({:x nil, :envir nil, :parent {}, :hash {}, :size {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "list2env"))

(def load
 ^{:name-r "load",
  :doc "",
  :argslists ({:file nil, :envir {}, :verbose false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "load"))

(def loaded-namespaces
 ^{:name-r "loadedNamespaces", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "loadedNamespaces"))

(def loading-namespace-info
 ^{:name-r "loadingNamespaceInfo", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "loadingNamespaceInfo"))

(def load-namespace
 ^{:name-r "loadNamespace",
  :doc "",
  :argslists
  ({:package nil,
    :lib.loc nil,
    :keep.source {},
    :partial false,
    :versionCheck nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "loadNamespace"))

(def local
 ^{:name-r "local", :doc "", :argslists ({:expr nil, :envir {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "local"))

(def lock-binding
 ^{:name-r "lockBinding", :doc "", :argslists ({:sym nil, :env nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "lockBinding"))

(def lock-environment
 ^{:name-r "lockEnvironment",
  :doc "",
  :argslists ({:env nil, :bindings false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "lockEnvironment"))

(def log
 ^{:name-r "log", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "log"))

(def log-10
 ^{:name-r "log10", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "log10"))

(def log-1p
 ^{:name-r "log1p", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "log1p"))

(def log-2
 ^{:name-r "log2", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "log2"))

(def logb
 ^{:name-r "logb", :doc "", :argslists ({:x nil, :base {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "logb"))

(def logical
 ^{:name-r "logical", :doc "", :argslists ({:length 0})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "logical"))

(def lower-tri
 ^{:name-r "lower.tri", :doc "", :argslists ({:x nil, :diag false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "lower.tri"))

(def ls
 ^{:name-r "ls",
  :doc "",
  :argslists
  ({:name nil,
    :pos {},
    :envir {},
    :all.names false,
    :pattern nil,
    :sorted true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "ls"))

(def make-names
 ^{:name-r "make.names",
  :doc "",
  :argslists ({:names nil, :unique false, :allow_ true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "make.names"))

(def make-unique
 ^{:name-r "make.unique", :doc "", :argslists ({:names nil, :sep "."})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "make.unique"))

(def make-active-binding
 ^{:name-r "makeActiveBinding",
  :doc "",
  :argslists ({:sym nil, :fun nil, :env nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "makeActiveBinding"))

(def map
 ^{:name-r "Map", :doc "", :argslists ({:f nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Map"))

(def mapply
 ^{:name-r "mapply",
  :doc "",
  :argslists
  ({:FUN nil,
    :... nil,
    :MoreArgs nil,
    :SIMPLIFY true,
    :USE.NAMES true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "mapply"))

(def margin-table
 ^{:name-r "margin.table", :doc "", :argslists ({:x nil, :margin nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "margin.table"))

(def mat-or-vec
 ^{:name-r "mat.or.vec", :doc "", :argslists ({:nr nil, :nc nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "mat.or.vec"))

(def match
 ^{:name-r "match",
  :doc "",
  :argslists
  ({:x nil, :table nil, :nomatch [nil], :incomparables nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "match"))

(def match-arg
 ^{:name-r "match.arg",
  :doc "",
  :argslists ({:arg nil, :choices nil, :several.ok false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "match.arg"))

(def match-call
 ^{:name-r "match.call",
  :doc "",
  :argslists
  ({:definition {}, :call {}, :expand.dots true, :envir {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "match.call"))

(def match-fun
 ^{:name-r "match.fun", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "match.fun"))

(def math-data-frame
 ^{:name-r "Math.data.frame", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Math.data.frame"))

(def math-date
 ^{:name-r "Math.Date", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Math.Date"))

(def math-difftime
 ^{:name-r "Math.difftime", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Math.difftime"))

(def math-factor
 ^{:name-r "Math.factor", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Math.factor"))

(def matrix
 ^{:name-r "matrix",
  :doc "",
  :argslists
  ({:data [nil], :nrow 1, :ncol 1, :byrow false, :dimnames nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "matrix"))

(def max
 ^{:name-r "max", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "max"))

(def max-col
 ^{:name-r "max.col", :doc "", :argslists ({:m nil, :ties.method {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "max.col"))

(def mean
 ^{:name-r "mean", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "mean"))

(def mean-date
 ^{:name-r "mean.Date", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "mean.Date"))

(def mean-default
 ^{:name-r "mean.default",
  :doc "",
  :argslists ({:x nil, :trim 0, :na.rm false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "mean.default"))

(def mean-difftime
 ^{:name-r "mean.difftime", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "mean.difftime"))

(def mem-limits
 ^{:name-r "mem.limits",
  :doc "",
  :argslists ({:nsize [nil], :vsize [nil]})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "mem.limits"))

(def mem-compress
 ^{:name-r "memCompress", :doc "", :argslists ({:from nil, :type {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "memCompress"))

(def mem-decompress
 ^{:name-r "memDecompress",
  :doc "",
  :argslists ({:from nil, :type {}, :asChar false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "memDecompress"))

(def memory-profile
 ^{:name-r "memory.profile", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "memory.profile"))

(def merge
 ^{:name-r "merge", :doc "", :argslists ({:x nil, :y nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "merge"))

(def merge-data-frame
 ^{:name-r "merge.data.frame",
  :doc "",
  :argslists
  ({:y nil,
    :suffixes {},
    :by.y nil,
    :all.x nil,
    :by.x nil,
    :no.dups true,
    :incomparables nil,
    :all false,
    :... nil,
    :all.y nil,
    :by {},
    :x nil,
    :sort true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "merge.data.frame"))

(def merge-default
 ^{:name-r "merge.default",
  :doc "",
  :argslists ({:x nil, :y nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "merge.default"))

(def message
 ^{:name-r "message",
  :doc "",
  :argslists ({:... nil, :domain nil, :appendLF true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "message"))

(def mget
 ^{:name-r "mget",
  :doc "",
  :argslists
  ({:x nil, :envir {}, :mode "any", :ifnotfound nil, :inherits false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "mget"))

(def min
 ^{:name-r "min", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "min"))

(def missing
 ^{:name-r "missing", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "missing"))

(def mod
 ^{:name-r "Mod", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Mod"))

(def mode
 ^{:name-r "mode", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "mode"))

(def months
 ^{:name-r "months", :doc "", :argslists ({:x nil, :abbreviate nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "months"))

(def months-date
 ^{:name-r "months.Date",
  :doc "",
  :argslists ({:x nil, :abbreviate false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "months.Date"))

(def names
 ^{:name-r "names", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "names"))

(def namespace-export
 ^{:name-r "namespaceExport",
  :doc "",
  :argslists ({:ns nil, :vars nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "namespaceExport"))

(def namespace-import
 ^{:name-r "namespaceImport",
  :doc "",
  :argslists ({:self nil, :... nil, :from nil, :except {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "namespaceImport"))

(def namespace-import-classes
 ^{:name-r "namespaceImportClasses",
  :doc "",
  :argslists ({:self nil, :ns nil, :vars nil, :from nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "namespaceImportClasses"))

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
    :except {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "namespaceImportFrom"))

(def namespace-import-methods
 ^{:name-r "namespaceImportMethods",
  :doc "",
  :argslists ({:self nil, :ns nil, :vars nil, :from nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "namespaceImportMethods"))

(def nargs
 ^{:name-r "nargs", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "nargs"))

(def nchar
 ^{:name-r "nchar",
  :doc "",
  :argslists ({:x nil, :type "chars", :allowNA false, :keepNA [nil]})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "nchar"))

(def ncol
 ^{:name-r "ncol", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "ncol"))

(def ncol
 ^{:name-r "NCOL", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "NCOL"))

(def negate
 ^{:name-r "Negate", :doc "", :argslists ({:f nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Negate"))

(def new-env
 ^{:name-r "new.env",
  :doc "",
  :argslists ({:hash true, :parent {}, :size 29})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "new.env"))

(def next-method
 ^{:name-r "NextMethod", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "NextMethod"))

(def ngettext
 ^{:name-r "ngettext",
  :doc "",
  :argslists ({:n nil, :msg1 nil, :msg2 nil, :domain nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "ngettext"))

(def nlevels
 ^{:name-r "nlevels", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "nlevels"))

(def noquote
 ^{:name-r "noquote", :doc "", :argslists ({:obj nil, :right false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "noquote"))

(def norm
 ^{:name-r "norm", :doc "", :argslists ({:x nil, :type {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "norm"))

(def normalize-path
 ^{:name-r "normalizePath",
  :doc "",
  :argslists ({:path nil, :winslash "\\", :mustWork [nil]})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "normalizePath"))

(def nrow
 ^{:name-r "nrow", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "nrow"))

(def nrow
 ^{:name-r "NROW", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "NROW"))

(def numeric
 ^{:name-r "numeric", :doc "", :argslists ({:length 0})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "numeric"))

(def numeric-version
 ^{:name-r "numeric_version",
  :doc "",
  :argslists ({:x nil, :strict true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "numeric_version"))

(def nzchar
 ^{:name-r "nzchar", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "nzchar"))

(def objects
 ^{:name-r "objects",
  :doc "",
  :argslists
  ({:name nil,
    :pos {},
    :envir {},
    :all.names false,
    :pattern nil,
    :sorted true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "objects"))

(def old-class
 ^{:name-r "oldClass", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "oldClass"))

(def olson-names
 ^{:name-r "OlsonNames", :doc "", :argslists ({:tzdir nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "OlsonNames"))

(def on-exit
 ^{:name-r "on.exit", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "on.exit"))

(def open
 ^{:name-r "open", :doc "", :argslists ({:con nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "open"))

(def open-connection
 ^{:name-r "open.connection",
  :doc "",
  :argslists ({:con nil, :open "r", :blocking true, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "open.connection"))

(def open-srcfile
 ^{:name-r "open.srcfile",
  :doc "",
  :argslists ({:con nil, :line nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "open.srcfile"))

(def open-srcfilealias
 ^{:name-r "open.srcfilealias",
  :doc "",
  :argslists ({:con nil, :line nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "open.srcfilealias"))

(def open-srcfilecopy
 ^{:name-r "open.srcfilecopy",
  :doc "",
  :argslists ({:con nil, :line nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "open.srcfilecopy"))

(def ops-data-frame
 ^{:name-r "Ops.data.frame", :doc "", :argslists ({:e1 nil, :e2 nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Ops.data.frame"))

(def ops-date
 ^{:name-r "Ops.Date", :doc "", :argslists ({:e1 nil, :e2 nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Ops.Date"))

(def ops-difftime
 ^{:name-r "Ops.difftime", :doc "", :argslists ({:e1 nil, :e2 nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Ops.difftime"))

(def ops-factor
 ^{:name-r "Ops.factor", :doc "", :argslists ({:e1 nil, :e2 nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Ops.factor"))

(def ops-numeric-version
 ^{:name-r "Ops.numeric_version",
  :doc "",
  :argslists ({:e1 nil, :e2 nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Ops.numeric_version"))

(def ops-ordered
 ^{:name-r "Ops.ordered", :doc "", :argslists ({:e1 nil, :e2 nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Ops.ordered"))

(def options
 ^{:name-r "options", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "options"))

(def order
 ^{:name-r "order",
  :doc "",
  :argslists
  ({:... nil, :na.last true, :decreasing false, :method {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "order"))

(def ordered
 ^{:name-r "ordered", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "ordered"))

(def outer
 ^{:name-r "outer",
  :doc "",
  :argslists ({:X nil, :Y nil, :FUN "*", :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "outer"))

(def package-version
 ^{:name-r "package_version",
  :doc "",
  :argslists ({:x nil, :strict true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "package_version"))

(def package-event
 ^{:name-r "packageEvent",
  :doc "",
  :argslists ({:pkgname nil, :event {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "packageEvent"))

(def package-has-namespace
 ^{:name-r "packageHasNamespace",
  :doc "",
  :argslists ({:package nil, :package.lib nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "packageHasNamespace"))

(def package-startup-message
 ^{:name-r "packageStartupMessage",
  :doc "",
  :argslists ({:... nil, :domain nil, :appendLF true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "packageStartupMessage"))

(def pack-bits
 ^{:name-r "packBits", :doc "", :argslists ({:x nil, :type {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "packBits"))

(def pairlist
 ^{:name-r "pairlist", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "pairlist"))

(def parent-env
 ^{:name-r "parent.env", :doc "", :argslists ({:env nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "parent.env"))

(def parent-frame
 ^{:name-r "parent.frame", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "parent.frame"))

(def parse
 ^{:name-r "parse",
  :doc "",
  :argslists
  ({:file "",
    :n nil,
    :text nil,
    :prompt "?",
    :keep.source {},
    :srcfile nil,
    :encoding "unknown"})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "parse"))

(def parse-namespace-file
 ^{:name-r "parseNamespaceFile",
  :doc "",
  :argslists ({:package nil, :package.lib nil, :mustExist true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "parseNamespaceFile"))

(def paste
 ^{:name-r "paste",
  :doc "",
  :argslists ({:... nil, :sep " ", :collapse nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "paste"))

(def paste-0
 ^{:name-r "paste0", :doc "", :argslists ({:... nil, :collapse nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "paste0"))

(def path-expand
 ^{:name-r "path.expand", :doc "", :argslists ({:path nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "path.expand"))

(def path-package
 ^{:name-r "path.package",
  :doc "",
  :argslists ({:package nil, :quiet false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "path.package"))

(def pcre-config
 ^{:name-r "pcre_config", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "pcre_config"))

(def pentagamma
 ^{:name-r "pentagamma", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "pentagamma"))

(def pipe
 ^{:name-r "pipe",
  :doc "",
  :argslists ({:description nil, :open "", :encoding {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "pipe"))

(def pmatch
 ^{:name-r "pmatch",
  :doc "",
  :argslists
  ({:x nil, :table nil, :nomatch [nil], :duplicates.ok false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "pmatch"))

(def pmax
 ^{:name-r "pmax", :doc "", :argslists ({:... nil, :na.rm false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "pmax"))

(def pmax-int
 ^{:name-r "pmax.int", :doc "", :argslists ({:... nil, :na.rm false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "pmax.int"))

(def pmin
 ^{:name-r "pmin", :doc "", :argslists ({:... nil, :na.rm false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "pmin"))

(def pmin-int
 ^{:name-r "pmin.int", :doc "", :argslists ({:... nil, :na.rm false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "pmin.int"))

(def polyroot
 ^{:name-r "polyroot", :doc "", :argslists ({:z nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "polyroot"))

(def pos-to-env
 ^{:name-r "pos.to.env", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "pos.to.env"))

(def position
 ^{:name-r "Position",
  :doc "",
  :argslists ({:f nil, :x nil, :right false, :nomatch [nil]})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Position"))

(def pretty
 ^{:name-r "pretty", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "pretty"))

(def pretty-default
 ^{:name-r "pretty.default",
  :doc "",
  :argslists
  ({:x nil,
    :n 5,
    :min.n {},
    :shrink.sml 0.75,
    :high.u.bias 1.5,
    :u5.bias {},
    :eps.correct 0,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "pretty.default"))

(def pretty-num
 ^{:name-r "prettyNum",
  :doc "",
  :argslists
  ({:preserve.width {},
    :big.interval 3,
    :big.mark "",
    :... nil,
    :input.d.mark nil,
    :x nil,
    :small.interval 5,
    :decimal.mark {},
    :is.cmplx [nil],
    :small.mark "",
    :zero.print nil,
    :drop0trailing false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "prettyNum"))

(def print
 ^{:name-r "print", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print"))

(def print-as-is
 ^{:name-r "print.AsIs", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.AsIs"))

(def print-by
 ^{:name-r "print.by",
  :doc "",
  :argslists ({:x nil, :... nil, :vsep nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.by"))

(def print-condition
 ^{:name-r "print.condition", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.condition"))

(def print-connection
 ^{:name-r "print.connection", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.connection"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.data.frame"))

(def print-date
 ^{:name-r "print.Date",
  :doc "",
  :argslists ({:x nil, :max nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.Date"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.default"))

(def print-difftime
 ^{:name-r "print.difftime",
  :doc "",
  :argslists ({:x nil, :digits {}, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.difftime"))

(def print-dlist
 ^{:name-r "print.Dlist", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.Dlist"))

(def print-dll-info
 ^{:name-r "print.DLLInfo", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.DLLInfo"))

(def print-dll-info-list
 ^{:name-r "print.DLLInfoList",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.DLLInfoList"))

(def print-dll-registered-routines
 ^{:name-r "print.DLLRegisteredRoutines",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "print.DLLRegisteredRoutines"))

(def print-eigen
 ^{:name-r "print.eigen", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.eigen"))

(def print-factor
 ^{:name-r "print.factor",
  :doc "",
  :argslists
  ({:x nil, :quote false, :max.levels nil, :width {}, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.factor"))

(def print-function
 ^{:name-r "print.function",
  :doc "",
  :argslists ({:x nil, :useSource true, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.function"))

(def print-hexmode
 ^{:name-r "print.hexmode", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.hexmode"))

(def print-library-iqr
 ^{:name-r "print.libraryIQR", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.libraryIQR"))

(def print-listof
 ^{:name-r "print.listof", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.listof"))

(def print-native-routine-list
 ^{:name-r "print.NativeRoutineList",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.NativeRoutineList"))

(def print-noquote
 ^{:name-r "print.noquote",
  :doc "",
  :argslists ({:x nil, :quote false, :right false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.noquote"))

(def print-numeric-version
 ^{:name-r "print.numeric_version",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.numeric_version"))

(def print-octmode
 ^{:name-r "print.octmode", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.octmode"))

(def print-package-info
 ^{:name-r "print.packageInfo",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.packageInfo"))

(def print-proc-time
 ^{:name-r "print.proc_time", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.proc_time"))

(def print-restart
 ^{:name-r "print.restart", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.restart"))

(def print-rle
 ^{:name-r "print.rle",
  :doc "",
  :argslists ({:x nil, :digits {}, :prefix "", :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.rle"))

(def print-simple-list
 ^{:name-r "print.simple.list",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.simple.list"))

(def print-srcfile
 ^{:name-r "print.srcfile", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.srcfile"))

(def print-srcref
 ^{:name-r "print.srcref",
  :doc "",
  :argslists ({:x nil, :useSource true, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.srcref"))

(def print-summary-table
 ^{:name-r "print.summary.table",
  :doc "",
  :argslists ({:x nil, :digits {}, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.summary.table"))

(def print-summary-warnings
 ^{:name-r "print.summary.warnings",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.summary.warnings"))

(def print-summary-default
 ^{:name-r "print.summaryDefault",
  :doc "",
  :argslists ({:x nil, :digits {}, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.summaryDefault"))

(def print-table
 ^{:name-r "print.table",
  :doc "",
  :argslists
  ({:x nil,
    :digits {},
    :quote false,
    :na.print "",
    :zero.print "0",
    :right {},
    :justify "none",
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.table"))

(def print-warnings
 ^{:name-r "print.warnings",
  :doc "",
  :argslists ({:x nil, :tags nil, :header {}, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "print.warnings"))

(def prmatrix
 ^{:name-r "prmatrix",
  :doc "",
  :argslists
  ({:x nil,
    :rowlab {},
    :collab {},
    :quote true,
    :right false,
    :na.print nil,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "prmatrix"))

(def proc-time
 ^{:name-r "proc.time", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "proc.time"))

(def prod
 ^{:name-r "prod", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "prod"))

(def prop-table
 ^{:name-r "prop.table", :doc "", :argslists ({:x nil, :margin nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "prop.table"))

(def provide-dimnames
 ^{:name-r "provideDimnames",
  :doc "",
  :argslists ({:x nil, :sep "", :base {}, :unique true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "provideDimnames"))

(def psigamma
 ^{:name-r "psigamma", :doc "", :argslists ({:x nil, :deriv 0})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "psigamma"))

(def push-back
 ^{:name-r "pushBack",
  :doc "",
  :argslists
  ({:data nil, :connection nil, :newLine true, :encoding {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "pushBack"))

(def push-back-length
 ^{:name-r "pushBackLength", :doc "", :argslists ({:connection nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "pushBackLength"))

(def qr
 ^{:name-r "qr", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "qr"))

(def qr-coef
 ^{:name-r "qr.coef", :doc "", :argslists ({:qr nil, :y nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "qr.coef"))

(def qr-default
 ^{:name-r "qr.default",
  :doc "",
  :argslists ({:x nil, :tol 1.0E-7, :LAPACK false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "qr.default"))

(def qr-fitted
 ^{:name-r "qr.fitted", :doc "", :argslists ({:qr nil, :y nil, :k {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "qr.fitted"))

(def qr-q
 ^{:name-r "qr.Q",
  :doc "",
  :argslists ({:qr nil, :complete false, :Dvec nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "qr.Q"))

(def qr-qty
 ^{:name-r "qr.qty", :doc "", :argslists ({:qr nil, :y nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "qr.qty"))

(def qr-qy
 ^{:name-r "qr.qy", :doc "", :argslists ({:qr nil, :y nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "qr.qy"))

(def qr-r
 ^{:name-r "qr.R", :doc "", :argslists ({:qr nil, :complete false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "qr.R"))

(def qr-resid
 ^{:name-r "qr.resid", :doc "", :argslists ({:qr nil, :y nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "qr.resid"))

(def qr-solve
 ^{:name-r "qr.solve",
  :doc "",
  :argslists ({:a nil, :b nil, :tol 1.0E-7})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "qr.solve"))

(def qr-x
 ^{:name-r "qr.X",
  :doc "",
  :argslists ({:qr nil, :complete false, :ncol {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "qr.X"))

(def quarters
 ^{:name-r "quarters", :doc "", :argslists ({:x nil, :abbreviate nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "quarters"))

(def quarters-date
 ^{:name-r "quarters.Date", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "quarters.Date"))

(def quit
 ^{:name-r "quit",
  :doc "",
  :argslists ({:save "default", :status 0, :runLast true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "quit"))

(def quote
 ^{:name-r "quote", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "quote"))

(def r-system-version
 ^{:name-r "R_system_version",
  :doc "",
  :argslists ({:x nil, :strict true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "R_system_version"))

(def r-home
 ^{:name-r "R.home", :doc "", :argslists ({:component "home"})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "R.home"))

(def r-version
 ^{:name-r "R.Version", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "R.Version"))

(def range
 ^{:name-r "range", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "range"))

(def range-default
 ^{:name-r "range.default",
  :doc "",
  :argslists ({:... nil, :na.rm false, :finite false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "range.default"))

(def rank
 ^{:name-r "rank",
  :doc "",
  :argslists ({:x nil, :na.last true, :ties.method {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "rank"))

(def rapply
 ^{:name-r "rapply",
  :doc "",
  :argslists
  ({:object nil,
    :f nil,
    :classes "ANY",
    :deflt nil,
    :how {},
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "rapply"))

(def raw
 ^{:name-r "raw", :doc "", :argslists ({:length 0})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "raw"))

(def raw-connection
 ^{:name-r "rawConnection",
  :doc "",
  :argslists ({:object nil, :open "r"})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "rawConnection"))

(def raw-connection-value
 ^{:name-r "rawConnectionValue", :doc "", :argslists ({:con nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "rawConnectionValue"))

(def raw-shift
 ^{:name-r "rawShift", :doc "", :argslists ({:x nil, :n nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "rawShift"))

(def raw-to-bits
 ^{:name-r "rawToBits", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "rawToBits"))

(def raw-to-char
 ^{:name-r "rawToChar", :doc "", :argslists ({:x nil, :multiple false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "rawToChar"))

(def rbind
 ^{:name-r "rbind", :doc "", :argslists ({:... nil, :deparse.level 1})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "rbind"))

(def rbind-data-frame
 ^{:name-r "rbind.data.frame",
  :doc "",
  :argslists
  ({:... nil,
    :deparse.level 1,
    :make.row.names true,
    :stringsAsFactors {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "rbind.data.frame"))

(def rcond
 ^{:name-r "rcond",
  :doc "",
  :argslists ({:x nil, :norm {}, :triangular false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "rcond"))

(def re
 ^{:name-r "Re", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Re"))

(def read-dcf
 ^{:name-r "read.dcf",
  :doc "",
  :argslists ({:file nil, :fields nil, :all false, :keep.white nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "read.dcf"))

(def read-bin
 ^{:name-r "readBin",
  :doc "",
  :argslists
  ({:con nil, :what nil, :n 1, :size [nil], :signed true, :endian {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "readBin"))

(def read-char
 ^{:name-r "readChar",
  :doc "",
  :argslists ({:con nil, :nchars nil, :useBytes false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "readChar"))

(def readline
 ^{:name-r "readline", :doc "", :argslists ({:prompt ""})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "readline"))

(def read-lines
 ^{:name-r "readLines",
  :doc "",
  :argslists
  ({:con {},
    :n {},
    :ok true,
    :warn true,
    :encoding "unknown",
    :skipNul false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "readLines"))

(def read-rds
 ^{:name-r "readRDS", :doc "", :argslists ({:file nil, :refhook nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "readRDS"))

(def read-renviron
 ^{:name-r "readRenviron", :doc "", :argslists ({:path nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "readRenviron"))

(def recall
 ^{:name-r "Recall", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Recall"))

(def reduce
 ^{:name-r "Reduce",
  :doc "",
  :argslists
  ({:f nil, :x nil, :init nil, :right false, :accumulate false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Reduce"))

(def reg-finalizer
 ^{:name-r "reg.finalizer",
  :doc "",
  :argslists ({:e nil, :f nil, :onexit false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "reg.finalizer"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "regexec"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "regexpr"))

(def register-s-3method
 ^{:name-r "registerS3method",
  :doc "",
  :argslists ({:genname nil, :class nil, :method nil, :envir {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "registerS3method"))

(def register-s-3methods
 ^{:name-r "registerS3methods",
  :doc "",
  :argslists ({:info nil, :package nil, :env nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "registerS3methods"))

(def regmatches
 ^{:name-r "regmatches",
  :doc "",
  :argslists ({:x nil, :m nil, :invert false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "regmatches"))

(def remove-task-callback
 ^{:name-r "removeTaskCallback", :doc "", :argslists ({:id nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "removeTaskCallback"))

(def rep
 ^{:name-r "rep", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "rep"))

(def rep-len
 ^{:name-r "rep_len", :doc "", :argslists ({:x nil, :length.out nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "rep_len"))

(def rep-date
 ^{:name-r "rep.Date", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "rep.Date"))

(def rep-factor
 ^{:name-r "rep.factor", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "rep.factor"))

(def rep-int
 ^{:name-r "rep.int", :doc "", :argslists ({:x nil, :times nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "rep.int"))

(def rep-numeric-version
 ^{:name-r "rep.numeric_version",
  :doc "",
  :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "rep.numeric_version"))

(def replace
 ^{:name-r "replace",
  :doc "",
  :argslists ({:x nil, :list nil, :values nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "replace"))

(def replicate
 ^{:name-r "replicate",
  :doc "",
  :argslists ({:n nil, :expr nil, :simplify "array"})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "replicate"))

(def require
 ^{:name-r "require",
  :doc "",
  :argslists
  ({:package nil,
    :lib.loc nil,
    :quietly false,
    :warn.conflicts true,
    :character.only false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "require"))

(def require-namespace
 ^{:name-r "requireNamespace",
  :doc "",
  :argslists ({:package nil, :... nil, :quietly false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "requireNamespace"))

(def restart-description
 ^{:name-r "restartDescription", :doc "", :argslists ({:r nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "restartDescription"))

(def restart-formals
 ^{:name-r "restartFormals", :doc "", :argslists ({:r nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "restartFormals"))

(def retracemem
 ^{:name-r "retracemem", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "retracemem"))

(def return
 ^{:name-r "return", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "return"))

(def return-value
 ^{:name-r "returnValue", :doc "", :argslists ({:default nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "returnValue"))

(def rev
 ^{:name-r "rev", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "rev"))

(def rev-default
 ^{:name-r "rev.default", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "rev.default"))

(def rle
 ^{:name-r "rle", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "rle"))

(def rm
 ^{:name-r "rm",
  :doc "",
  :argslists
  ({:... nil, :list {}, :pos {}, :envir {}, :inherits false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "rm"))

(def rn-gkind
 ^{:name-r "RNGkind",
  :doc "",
  :argslists ({:kind nil, :normal.kind nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "RNGkind"))

(def rn-gversion
 ^{:name-r "RNGversion", :doc "", :argslists ({:vstr nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "RNGversion"))

(def round
 ^{:name-r "round", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "round"))

(def round-date
 ^{:name-r "round.Date", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "round.Date"))

(def row
 ^{:name-r "row", :doc "", :argslists ({:x nil, :as.factor false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "row"))

(def row-names
 ^{:name-r "row.names", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "row.names"))

(def row-names-data-frame
 ^{:name-r "row.names.data.frame", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "row.names.data.frame"))

(def row-names-default
 ^{:name-r "row.names.default", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "row.names.default"))

(def row-means
 ^{:name-r "rowMeans",
  :doc "",
  :argslists ({:x nil, :na.rm false, :dims 1})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "rowMeans"))

(def rownames
 ^{:name-r "rownames",
  :doc "",
  :argslists ({:x nil, :do.NULL true, :prefix "row"})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "rownames"))

(def rowsum
 ^{:name-r "rowsum",
  :doc "",
  :argslists ({:x nil, :group nil, :reorder true, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "rowsum"))

(def rowsum-data-frame
 ^{:name-r "rowsum.data.frame",
  :doc "",
  :argslists
  ({:x nil, :group nil, :reorder true, :na.rm false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "rowsum.data.frame"))

(def rowsum-default
 ^{:name-r "rowsum.default",
  :doc "",
  :argslists
  ({:x nil, :group nil, :reorder true, :na.rm false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "rowsum.default"))

(def row-sums
 ^{:name-r "rowSums",
  :doc "",
  :argslists ({:x nil, :na.rm false, :dims 1})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "rowSums"))

(def sample
 ^{:name-r "sample",
  :doc "",
  :argslists ({:x nil, :size nil, :replace false, :prob nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sample"))

(def sample-int
 ^{:name-r "sample.int",
  :doc "",
  :argslists
  ({:n nil, :size nil, :replace false, :prob nil, :useHash {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sample.int"))

(def sapply
 ^{:name-r "sapply",
  :doc "",
  :argslists
  ({:X nil, :FUN nil, :... nil, :simplify true, :USE.NAMES true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sapply"))

(def save
 ^{:name-r "save",
  :doc "",
  :argslists
  ({:ascii false,
    :envir {},
    :precheck true,
    :file {},
    :compression_level nil,
    :eval.promises true,
    :compress {},
    :list {},
    :... nil,
    :version nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "save"))

(def save-image
 ^{:name-r "save.image",
  :doc "",
  :argslists
  ({:file ".RData",
    :version nil,
    :ascii false,
    :compress {},
    :safe true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "save.image"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "saveRDS"))

(def scale
 ^{:name-r "scale",
  :doc "",
  :argslists ({:x nil, :center true, :scale true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "scale"))

(def scale-default
 ^{:name-r "scale.default",
  :doc "",
  :argslists ({:x nil, :center true, :scale true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "scale.default"))

(def scan
 ^{:name-r "scan",
  :doc "",
  :argslists
  ({:encoding "unknown",
    :flush false,
    :na.strings "NA",
    :sep "",
    :blank.lines.skip true,
    :nmax {},
    :quiet false,
    :allowEscapes false,
    :n {},
    :fill false,
    :file "",
    :fileEncoding "",
    :comment.char "",
    :skipNul false,
    :quote {},
    :multi.line true,
    :nlines 0,
    :dec ".",
    :what {},
    :strip.white false,
    :skip 0,
    :text nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "scan"))

(def search
 ^{:name-r "search", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "search"))

(def searchpaths
 ^{:name-r "searchpaths", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "searchpaths"))

(def seek
 ^{:name-r "seek", :doc "", :argslists ({:con nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "seek"))

(def seek-connection
 ^{:name-r "seek.connection",
  :doc "",
  :argslists
  ({:con nil, :where [nil], :origin "start", :rw "", :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "seek.connection"))

(def seq
 ^{:name-r "seq", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "seq"))

(def seq-along
 ^{:name-r "seq_along", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "seq_along"))

(def seq-len
 ^{:name-r "seq_len", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "seq_len"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "seq.Date"))

(def seq-default
 ^{:name-r "seq.default",
  :doc "",
  :argslists
  ({:from 1,
    :to 1,
    :by {},
    :length.out nil,
    :along.with nil,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "seq.default"))

(def seq-int
 ^{:name-r "seq.int", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "seq.int"))

(def sequence
 ^{:name-r "sequence", :doc "", :argslists ({:nvec nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sequence"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "serialize"))

(def set-seed
 ^{:name-r "set.seed",
  :doc "",
  :argslists ({:seed nil, :kind nil, :normal.kind nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "set.seed"))

(def setdiff
 ^{:name-r "setdiff", :doc "", :argslists ({:x nil, :y nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "setdiff"))

(def setequal
 ^{:name-r "setequal", :doc "", :argslists ({:x nil, :y nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "setequal"))

(def set-hook
 ^{:name-r "setHook",
  :doc "",
  :argslists ({:hookName nil, :value nil, :action {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "setHook"))

(def set-namespace-info
 ^{:name-r "setNamespaceInfo",
  :doc "",
  :argslists ({:ns nil, :which nil, :val nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "setNamespaceInfo"))

(def set-session-time-limit
 ^{:name-r "setSessionTimeLimit",
  :doc "",
  :argslists ({:cpu ##Inf, :elapsed ##Inf})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "setSessionTimeLimit"))

(def set-time-limit
 ^{:name-r "setTimeLimit",
  :doc "",
  :argslists ({:cpu ##Inf, :elapsed ##Inf, :transient false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "setTimeLimit"))

(def setwd
 ^{:name-r "setwd", :doc "", :argslists ({:dir nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "setwd"))

(def show-connections
 ^{:name-r "showConnections", :doc "", :argslists ({:all false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "showConnections"))

(def sh-quote
 ^{:name-r "shQuote", :doc "", :argslists ({:string nil, :type {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "shQuote"))

(def sign
 ^{:name-r "sign", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sign"))

(def signal-condition
 ^{:name-r "signalCondition", :doc "", :argslists ({:cond nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "signalCondition"))

(def signif
 ^{:name-r "signif", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "signif"))

(def simple-condition
 ^{:name-r "simpleCondition",
  :doc "",
  :argslists ({:message nil, :call nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "simpleCondition"))

(def simple-error
 ^{:name-r "simpleError",
  :doc "",
  :argslists ({:message nil, :call nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "simpleError"))

(def simple-message
 ^{:name-r "simpleMessage",
  :doc "",
  :argslists ({:message nil, :call nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "simpleMessage"))

(def simple-warning
 ^{:name-r "simpleWarning",
  :doc "",
  :argslists ({:message nil, :call nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "simpleWarning"))

(def simplify-2array
 ^{:name-r "simplify2array",
  :doc "",
  :argslists ({:x nil, :higher true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "simplify2array"))

(def sin
 ^{:name-r "sin", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sin"))

(def single
 ^{:name-r "single", :doc "", :argslists ({:length 0})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "single"))

(def sinh
 ^{:name-r "sinh", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sinh"))

(def sink
 ^{:name-r "sink",
  :doc "",
  :argslists ({:file nil, :append false, :type {}, :split false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sink"))

(def sink-number
 ^{:name-r "sink.number", :doc "", :argslists ({:type {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sink.number"))

(def sinpi
 ^{:name-r "sinpi", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sinpi"))

(def slice-index
 ^{:name-r "slice.index", :doc "", :argslists ({:x nil, :MARGIN nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "slice.index"))

(def socket-connection
 ^{:name-r "socketConnection",
  :doc "",
  :argslists
  ({:host "localhost",
    :port nil,
    :server false,
    :blocking false,
    :open "a+",
    :encoding {},
    :timeout {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "socketConnection"))

(def socket-select
 ^{:name-r "socketSelect",
  :doc "",
  :argslists ({:socklist nil, :write false, :timeout nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "socketSelect"))

(def solve
 ^{:name-r "solve", :doc "", :argslists ({:a nil, :b nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "solve"))

(def solve-default
 ^{:name-r "solve.default",
  :doc "",
  :argslists ({:a nil, :b nil, :tol {}, :LINPACK false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "solve.default"))

(def solve-qr
 ^{:name-r "solve.qr", :doc "", :argslists ({:a nil, :b nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "solve.qr"))

(def sort
 ^{:name-r "sort",
  :doc "",
  :argslists ({:x nil, :decreasing false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sort"))

(def sort-default
 ^{:name-r "sort.default",
  :doc "",
  :argslists ({:x nil, :decreasing false, :na.last [nil], :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sort.default"))

(def sort-int
 ^{:name-r "sort.int",
  :doc "",
  :argslists
  ({:x nil,
    :partial nil,
    :na.last [nil],
    :decreasing false,
    :method {},
    :index.return false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sort.int"))

(def sort-list
 ^{:name-r "sort.list",
  :doc "",
  :argslists
  ({:x nil,
    :partial nil,
    :na.last true,
    :decreasing false,
    :method {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sort.list"))

(def source
 ^{:name-r "source",
  :doc "",
  :argslists
  ({:keep.source {},
    :encoding {},
    :exprs nil,
    :deparseCtrl "showAttributes",
    :file nil,
    :verbose {},
    :prompt.echo {},
    :print.eval nil,
    :width.cutoff 60,
    :echo nil,
    :continue.echo {},
    :max.deparse.length 150,
    :spaced nil,
    :skip.echo 0,
    :chdir false,
    :local false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "source"))

(def split
 ^{:name-r "split",
  :doc "",
  :argslists ({:x nil, :f nil, :drop false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "split"))

(def split-data-frame
 ^{:name-r "split.data.frame",
  :doc "",
  :argslists ({:x nil, :f nil, :drop false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "split.data.frame"))

(def split-date
 ^{:name-r "split.Date",
  :doc "",
  :argslists ({:x nil, :f nil, :drop false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "split.Date"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "split.default"))

(def sprintf
 ^{:name-r "sprintf", :doc "", :argslists ({:fmt nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sprintf"))

(def sqrt
 ^{:name-r "sqrt", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sqrt"))

(def s-quote
 ^{:name-r "sQuote", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sQuote"))

(def srcfile
 ^{:name-r "srcfile",
  :doc "",
  :argslists ({:filename nil, :encoding {}, :Enc "unknown"})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "srcfile"))

(def srcfilealias
 ^{:name-r "srcfilealias",
  :doc "",
  :argslists ({:filename nil, :srcfile nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "srcfilealias"))

(def srcfilecopy
 ^{:name-r "srcfilecopy",
  :doc "",
  :argslists
  ({:filename nil, :lines nil, :timestamp {}, :isFile false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "srcfilecopy"))

(def srcref
 ^{:name-r "srcref", :doc "", :argslists ({:srcfile nil, :lloc nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "srcref"))

(def standard-generic
 ^{:name-r "standardGeneric", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "standardGeneric"))

(def starts-with
 ^{:name-r "startsWith", :doc "", :argslists ({:x nil, :prefix nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "startsWith"))

(def stderr
 ^{:name-r "stderr", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "stderr"))

(def stdin
 ^{:name-r "stdin", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "stdin"))

(def stdout
 ^{:name-r "stdout", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "stdout"))

(def stop
 ^{:name-r "stop",
  :doc "",
  :argslists ({:... nil, :call. true, :domain nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "stop"))

(def stopifnot
 ^{:name-r "stopifnot",
  :doc "",
  :argslists ({:... nil, :exprs nil, :local true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "stopifnot"))

(def storage-mode
 ^{:name-r "storage.mode", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "storage.mode"))

(def strftime
 ^{:name-r "strftime",
  :doc "",
  :argslists ({:x nil, :format "", :tz "", :usetz false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "strftime"))

(def strptime
 ^{:name-r "strptime",
  :doc "",
  :argslists ({:x nil, :format nil, :tz ""})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "strptime"))

(def strrep
 ^{:name-r "strrep", :doc "", :argslists ({:x nil, :times nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "strrep"))

(def strsplit
 ^{:name-r "strsplit",
  :doc "",
  :argslists
  ({:x nil, :split nil, :fixed false, :perl false, :useBytes false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "strsplit"))

(def strtoi
 ^{:name-r "strtoi", :doc "", :argslists ({:x nil, :base 0})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "strtoi"))

(def strtrim
 ^{:name-r "strtrim", :doc "", :argslists ({:x nil, :width nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "strtrim"))

(def structure
 ^{:name-r "structure", :doc "", :argslists ({:.Data nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "structure"))

(def strwrap
 ^{:name-r "strwrap",
  :doc "",
  :argslists
  ({:x nil,
    :width {},
    :indent 0,
    :exdent 0,
    :prefix "",
    :simplify true,
    :initial nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "strwrap"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "sub"))

(def subset
 ^{:name-r "subset", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "subset"))

(def subset-data-frame
 ^{:name-r "subset.data.frame",
  :doc "",
  :argslists
  ({:x nil, :subset nil, :select nil, :drop false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "subset.data.frame"))

(def subset-default
 ^{:name-r "subset.default",
  :doc "",
  :argslists ({:x nil, :subset nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "subset.default"))

(def subset-matrix
 ^{:name-r "subset.matrix",
  :doc "",
  :argslists
  ({:x nil, :subset nil, :select nil, :drop false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "subset.matrix"))

(def substitute
 ^{:name-r "substitute", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "substitute"))

(def substr
 ^{:name-r "substr",
  :doc "",
  :argslists ({:x nil, :start nil, :stop nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "substr"))

(def substring
 ^{:name-r "substring",
  :doc "",
  :argslists ({:text nil, :first nil, :last 1000000})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "substring"))

(def sum
 ^{:name-r "sum", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sum"))

(def summary
 ^{:name-r "summary", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "summary"))

(def summary-connection
 ^{:name-r "summary.connection",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "summary.connection"))

(def summary-data-frame
 ^{:name-r "summary.data.frame",
  :doc "",
  :argslists ({:object nil, :maxsum 7, :digits {}, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "summary.data.frame"))

(def summary-data-frame
 ^{:name-r "Summary.data.frame",
  :doc "",
  :argslists ({:... nil, :na.rm nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Summary.data.frame"))

(def summary-date
 ^{:name-r "summary.Date",
  :doc "",
  :argslists ({:object nil, :digits 12, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "summary.Date"))

(def summary-date
 ^{:name-r "Summary.Date", :doc "", :argslists ({:... nil, :na.rm nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Summary.Date"))

(def summary-default
 ^{:name-r "summary.default",
  :doc "",
  :argslists ({:object nil, :... nil, :digits nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "summary.default"))

(def summary-difftime
 ^{:name-r "Summary.difftime",
  :doc "",
  :argslists ({:... nil, :na.rm nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Summary.difftime"))

(def summary-factor
 ^{:name-r "summary.factor",
  :doc "",
  :argslists ({:object nil, :maxsum 100, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "summary.factor"))

(def summary-factor
 ^{:name-r "Summary.factor",
  :doc "",
  :argslists ({:... nil, :na.rm nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Summary.factor"))

(def summary-matrix
 ^{:name-r "summary.matrix",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "summary.matrix"))

(def summary-numeric-version
 ^{:name-r "Summary.numeric_version",
  :doc "",
  :argslists ({:... nil, :na.rm nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Summary.numeric_version"))

(def summary-ordered
 ^{:name-r "Summary.ordered",
  :doc "",
  :argslists ({:... nil, :na.rm nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Summary.ordered"))

(def summary-proc-time
 ^{:name-r "summary.proc_time",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "summary.proc_time"))

(def summary-srcfile
 ^{:name-r "summary.srcfile",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "summary.srcfile"))

(def summary-srcref
 ^{:name-r "summary.srcref",
  :doc "",
  :argslists ({:object nil, :useSource false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "summary.srcref"))

(def summary-table
 ^{:name-r "summary.table",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "summary.table"))

(def summary-warnings
 ^{:name-r "summary.warnings",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "summary.warnings"))

(def suppress-messages
 ^{:name-r "suppressMessages", :doc "", :argslists ({:expr nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "suppressMessages"))

(def suppress-package-startup-messages
 ^{:name-r "suppressPackageStartupMessages",
  :doc "",
  :argslists ({:expr nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot
  "suppressPackageStartupMessages"))

(def suppress-warnings
 ^{:name-r "suppressWarnings", :doc "", :argslists ({:expr nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "suppressWarnings"))

(def suspend-interrupts
 ^{:name-r "suspendInterrupts", :doc "", :argslists ({:expr nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "suspendInterrupts"))

(def svd
 ^{:name-r "svd",
  :doc "",
  :argslists ({:x nil, :nu {}, :nv {}, :LINPACK false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "svd"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "sweep"))

(def switch
 ^{:name-r "switch", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "switch"))

(def sys-call
 ^{:name-r "sys.call", :doc "", :argslists ({:which 0})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sys.call"))

(def sys-calls
 ^{:name-r "sys.calls", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sys.calls"))

(def sys-chmod
 ^{:name-r "Sys.chmod",
  :doc "",
  :argslists ({:paths nil, :mode "0777", :use_umask true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Sys.chmod"))

(def sys-date
 ^{:name-r "Sys.Date", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Sys.Date"))

(def sys-frame
 ^{:name-r "sys.frame", :doc "", :argslists ({:which 0})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sys.frame"))

(def sys-frames
 ^{:name-r "sys.frames", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sys.frames"))

(def sys-function
 ^{:name-r "sys.function", :doc "", :argslists ({:which 0})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sys.function"))

(def sys-getenv
 ^{:name-r "Sys.getenv",
  :doc "",
  :argslists ({:x nil, :unset "", :names [nil]})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Sys.getenv"))

(def sys-getlocale
 ^{:name-r "Sys.getlocale", :doc "", :argslists ({:category "LC_ALL"})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Sys.getlocale"))

(def sys-getpid
 ^{:name-r "Sys.getpid", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Sys.getpid"))

(def sys-glob
 ^{:name-r "Sys.glob",
  :doc "",
  :argslists ({:paths nil, :dirmark false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Sys.glob"))

(def sys-info
 ^{:name-r "Sys.info", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Sys.info"))

(def sys-load-image
 ^{:name-r "sys.load.image",
  :doc "",
  :argslists ({:name nil, :quiet nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sys.load.image"))

(def sys-localeconv
 ^{:name-r "Sys.localeconv", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Sys.localeconv"))

(def sys-nframe
 ^{:name-r "sys.nframe", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sys.nframe"))

(def sys-on-exit
 ^{:name-r "sys.on.exit", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sys.on.exit"))

(def sys-parent
 ^{:name-r "sys.parent", :doc "", :argslists ({:n 1})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sys.parent"))

(def sys-parents
 ^{:name-r "sys.parents", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sys.parents"))

(def sys-readlink
 ^{:name-r "Sys.readlink", :doc "", :argslists ({:paths nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Sys.readlink"))

(def sys-save-image
 ^{:name-r "sys.save.image", :doc "", :argslists ({:name nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sys.save.image"))

(def sys-setenv
 ^{:name-r "Sys.setenv", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Sys.setenv"))

(def sys-set-file-time
 ^{:name-r "Sys.setFileTime",
  :doc "",
  :argslists ({:path nil, :time nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Sys.setFileTime"))

(def sys-setlocale
 ^{:name-r "Sys.setlocale",
  :doc "",
  :argslists ({:category "LC_ALL", :locale ""})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Sys.setlocale"))

(def sys-sleep
 ^{:name-r "Sys.sleep", :doc "", :argslists ({:time nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Sys.sleep"))

(def sys-source
 ^{:name-r "sys.source",
  :doc "",
  :argslists
  ({:file nil,
    :envir {},
    :chdir false,
    :keep.source {},
    :toplevel.env {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sys.source"))

(def sys-status
 ^{:name-r "sys.status", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "sys.status"))

(def sys-time
 ^{:name-r "Sys.time", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Sys.time"))

(def sys-timezone
 ^{:name-r "Sys.timezone", :doc "", :argslists ({:location true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Sys.timezone"))

(def sys-umask
 ^{:name-r "Sys.umask", :doc "", :argslists ({:mode [nil]})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Sys.umask"))

(def sys-unsetenv
 ^{:name-r "Sys.unsetenv", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Sys.unsetenv"))

(def sys-which
 ^{:name-r "Sys.which", :doc "", :argslists ({:names nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Sys.which"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "system"))

(def system-file
 ^{:name-r "system.file",
  :doc "",
  :argslists
  ({:... nil, :package "base", :lib.loc nil, :mustWork false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "system.file"))

(def system-time
 ^{:name-r "system.time",
  :doc "",
  :argslists ({:expr nil, :gcFirst true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "system.time"))

(def system-2
 ^{:name-r "system2",
  :doc "",
  :argslists
  ({:args {},
    :stdin "",
    :invisible true,
    :minimized false,
    :command nil,
    :env {},
    :wait true,
    :input nil,
    :timeout 0,
    :stderr "",
    :stdout ""})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "system2"))

(def t-data-frame
 ^{:name-r "t.data.frame", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "t.data.frame"))

(def t-default
 ^{:name-r "t.default", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "t.default"))

(def table
 ^{:name-r "table",
  :doc "",
  :argslists
  ({:... nil, :exclude {}, :useNA {}, :dnn {}, :deparse.level 1})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "table"))

(def tabulate
 ^{:name-r "tabulate",
  :doc "",
  :argslists ({:bin nil, :nbins {:empty-key nil, :na.rm true}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "tabulate"))

(def tan
 ^{:name-r "tan", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "tan"))

(def tanh
 ^{:name-r "tanh", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "tanh"))

(def tanpi
 ^{:name-r "tanpi", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "tanpi"))

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
 (r-interop.core/->clj-pos-kw-fn-polyglot "tapply"))

(def task-callback-manager
 ^{:name-r "taskCallbackManager",
  :doc "",
  :argslists ({:handlers {}, :registered false, :verbose false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "taskCallbackManager"))

(def tcrossprod
 ^{:name-r "tcrossprod", :doc "", :argslists ({:x nil, :y nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "tcrossprod"))

(def tempdir
 ^{:name-r "tempdir", :doc "", :argslists ({:check false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "tempdir"))

(def tempfile
 ^{:name-r "tempfile",
  :doc "",
  :argslists ({:pattern "file", :tmpdir {}, :fileext ""})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "tempfile"))

(def test-platform-equivalence
 ^{:name-r "testPlatformEquivalence",
  :doc "",
  :argslists ({:built nil, :run nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "testPlatformEquivalence"))

(def tetragamma
 ^{:name-r "tetragamma", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "tetragamma"))

(def text-connection
 ^{:name-r "textConnection",
  :doc "",
  :argslists ({:object nil, :open "r", :local false, :encoding {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "textConnection"))

(def text-connection-value
 ^{:name-r "textConnectionValue", :doc "", :argslists ({:con nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "textConnectionValue"))

(def tolower
 ^{:name-r "tolower", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "tolower"))

(def topenv
 ^{:name-r "topenv",
  :doc "",
  :argslists ({:envir {}, :matchThisEnv {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "topenv"))

(def to-string
 ^{:name-r "toString", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "toString"))

(def to-string-default
 ^{:name-r "toString.default",
  :doc "",
  :argslists ({:x nil, :width nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "toString.default"))

(def toupper
 ^{:name-r "toupper", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "toupper"))

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
    :where {},
    :edit false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "trace"))

(def traceback
 ^{:name-r "traceback", :doc "", :argslists ({:x nil, :max.lines {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "traceback"))

(def tracemem
 ^{:name-r "tracemem", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "tracemem"))

(def tracing-state
 ^{:name-r "tracingState", :doc "", :argslists ({:on nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "tracingState"))

(def transform
 ^{:name-r "transform", :doc "", :argslists ({:_data nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "transform"))

(def transform-data-frame
 ^{:name-r "transform.data.frame",
  :doc "",
  :argslists ({:_data nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "transform.data.frame"))

(def transform-default
 ^{:name-r "transform.default",
  :doc "",
  :argslists ({:_data nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "transform.default"))

(def trigamma
 ^{:name-r "trigamma", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "trigamma"))

(def trimws
 ^{:name-r "trimws", :doc "", :argslists ({:x nil, :which {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "trimws"))

(def trunc
 ^{:name-r "trunc", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "trunc"))

(def trunc-date
 ^{:name-r "trunc.Date", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "trunc.Date"))

(def truncate
 ^{:name-r "truncate", :doc "", :argslists ({:con nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "truncate"))

(def truncate-connection
 ^{:name-r "truncate.connection",
  :doc "",
  :argslists ({:con nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "truncate.connection"))

(def try
 ^{:name-r "try",
  :doc "",
  :argslists
  ({:expr nil, :silent false, :outFile {:empty-key nil, :default {}}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "try"))

(def try-catch
 ^{:name-r "tryCatch",
  :doc "",
  :argslists ({:expr nil, :... nil, :finally nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "tryCatch"))

(def typeof
 ^{:name-r "typeof", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "typeof"))

(def unclass
 ^{:name-r "unclass", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "unclass"))

(def undebug
 ^{:name-r "undebug", :doc "", :argslists ({:fun nil, :signature nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "undebug"))

(def union
 ^{:name-r "union", :doc "", :argslists ({:x nil, :y nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "union"))

(def unique
 ^{:name-r "unique",
  :doc "",
  :argslists ({:x nil, :incomparables false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "unique"))

(def unique-array
 ^{:name-r "unique.array",
  :doc "",
  :argslists
  ({:x nil,
    :incomparables false,
    :MARGIN 1,
    :fromLast false,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "unique.array"))

(def unique-data-frame
 ^{:name-r "unique.data.frame",
  :doc "",
  :argslists
  ({:x nil, :incomparables false, :fromLast false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "unique.data.frame"))

(def unique-default
 ^{:name-r "unique.default",
  :doc "",
  :argslists
  ({:x nil,
    :incomparables false,
    :fromLast false,
    :nmax [nil],
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "unique.default"))

(def unique-matrix
 ^{:name-r "unique.matrix",
  :doc "",
  :argslists
  ({:x nil,
    :incomparables false,
    :MARGIN 1,
    :fromLast false,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "unique.matrix"))

(def unique-numeric-version
 ^{:name-r "unique.numeric_version",
  :doc "",
  :argslists ({:x nil, :incomparables false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "unique.numeric_version"))

(def unique-warnings
 ^{:name-r "unique.warnings",
  :doc "",
  :argslists ({:x nil, :incomparables false, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "unique.warnings"))

(def units
 ^{:name-r "units", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "units"))

(def units-difftime
 ^{:name-r "units.difftime", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "units.difftime"))

(def unix-time
 ^{:name-r "unix.time", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "unix.time"))

(def unlink
 ^{:name-r "unlink",
  :doc "",
  :argslists ({:x nil, :recursive false, :force false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "unlink"))

(def unlist
 ^{:name-r "unlist",
  :doc "",
  :argslists ({:x nil, :recursive true, :use.names true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "unlist"))

(def unload-namespace
 ^{:name-r "unloadNamespace", :doc "", :argslists ({:ns nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "unloadNamespace"))

(def unlock-binding
 ^{:name-r "unlockBinding", :doc "", :argslists ({:sym nil, :env nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "unlockBinding"))

(def unname
 ^{:name-r "unname", :doc "", :argslists ({:obj nil, :force false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "unname"))

(def unserialize
 ^{:name-r "unserialize",
  :doc "",
  :argslists ({:connection nil, :refhook nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "unserialize"))

(def unsplit
 ^{:name-r "unsplit",
  :doc "",
  :argslists ({:value nil, :f nil, :drop false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "unsplit"))

(def untrace
 ^{:name-r "untrace",
  :doc "",
  :argslists ({:what nil, :signature nil, :where {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "untrace"))

(def untracemem
 ^{:name-r "untracemem", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "untracemem"))

(def unz
 ^{:name-r "unz",
  :doc "",
  :argslists
  ({:description nil, :filename nil, :open "", :encoding {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "unz"))

(def upper-tri
 ^{:name-r "upper.tri", :doc "", :argslists ({:x nil, :diag false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "upper.tri"))

(def url
 ^{:name-r "url",
  :doc "",
  :argslists
  ({:description nil,
    :open "",
    :blocking true,
    :encoding {},
    :method {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "url"))

(def use-method
 ^{:name-r "UseMethod", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "UseMethod"))

(def utf-8-to-int
 ^{:name-r "utf8ToInt", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "utf8ToInt"))

(def valid-enc
 ^{:name-r "validEnc", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "validEnc"))

(def valid-utf-8
 ^{:name-r "validUTF8", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "validUTF8"))

(def vapply
 ^{:name-r "vapply",
  :doc "",
  :argslists
  ({:X nil, :FUN nil, :FUN.VALUE nil, :... nil, :USE.NAMES true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "vapply"))

(def vector
 ^{:name-r "vector", :doc "", :argslists ({:mode "logical", :length 0})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "vector"))

(def vectorize
 ^{:name-r "Vectorize",
  :doc "",
  :argslists
  ({:FUN nil, :vectorize.args nil, :SIMPLIFY true, :USE.NAMES true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "Vectorize"))

(def warning
 ^{:name-r "warning",
  :doc "",
  :argslists
  ({:... nil,
    :call. true,
    :immediate. false,
    :noBreaks. false,
    :domain nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "warning"))

(def warnings
 ^{:name-r "warnings", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "warnings"))

(def weekdays
 ^{:name-r "weekdays", :doc "", :argslists ({:x nil, :abbreviate nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "weekdays"))

(def weekdays-date
 ^{:name-r "weekdays.Date",
  :doc "",
  :argslists ({:x nil, :abbreviate false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "weekdays.Date"))

(def which
 ^{:name-r "which",
  :doc "",
  :argslists ({:x nil, :arr.ind false, :useNames true})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "which"))

(def which-max
 ^{:name-r "which.max", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "which.max"))

(def which-min
 ^{:name-r "which.min", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "which.min"))

(def with
 ^{:name-r "with",
  :doc "",
  :argslists ({:data nil, :expr nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "with"))

(def with-default
 ^{:name-r "with.default",
  :doc "",
  :argslists ({:data nil, :expr nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "with.default"))

(def with-autoprint
 ^{:name-r "withAutoprint",
  :doc "",
  :argslists
  ({:print. true,
    :evaluated false,
    :exprs nil,
    :deparseCtrl {},
    :width.cutoff {},
    :echo true,
    :... nil,
    :max.deparse.length ##Inf,
    :local {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "withAutoprint"))

(def with-calling-handlers
 ^{:name-r "withCallingHandlers",
  :doc "",
  :argslists ({:expr nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "withCallingHandlers"))

(def within
 ^{:name-r "within",
  :doc "",
  :argslists ({:data nil, :expr nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "within"))

(def within-data-frame
 ^{:name-r "within.data.frame",
  :doc "",
  :argslists ({:data nil, :expr nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "within.data.frame"))

(def within-list
 ^{:name-r "within.list",
  :doc "",
  :argslists ({:data nil, :expr nil, :keepAttrs true, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "within.list"))

(def with-restarts
 ^{:name-r "withRestarts", :doc "", :argslists ({:expr nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "withRestarts"))

(def with-visible
 ^{:name-r "withVisible", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "withVisible"))

(def write
 ^{:name-r "write",
  :doc "",
  :argslists
  ({:x nil, :file "data", :ncolumns {}, :append false, :sep " "})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "write"))

(def write-dcf
 ^{:name-r "write.dcf",
  :doc "",
  :argslists
  ({:x nil,
    :file "",
    :append false,
    :useBytes false,
    :indent {},
    :width {},
    :keep.white nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "write.dcf"))

(def write-bin
 ^{:name-r "writeBin",
  :doc "",
  :argslists
  ({:object nil, :con nil, :size [nil], :endian {}, :useBytes false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "writeBin"))

(def write-char
 ^{:name-r "writeChar",
  :doc "",
  :argslists
  ({:object nil,
    :con nil,
    :nchars {:empty-key nil, :type "chars"},
    :eos "",
    :useBytes false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "writeChar"))

(def write-lines
 ^{:name-r "writeLines",
  :doc "",
  :argslists ({:text nil, :con {}, :sep "\n", :useBytes false})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "writeLines"))

(def xor
 ^{:name-r "xor", :doc "", :argslists ({:x nil, :y nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "xor"))

(def xpdrows-data-frame
 ^{:name-r "xpdrows.data.frame",
  :doc "",
  :argslists ({:x nil, :old.rows nil, :new.rows nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "xpdrows.data.frame"))

(def xtfrm
 ^{:name-r "xtfrm", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn-polyglot "xtfrm"))

(def xtfrm-as-is
 ^{:name-r "xtfrm.AsIs", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "xtfrm.AsIs"))

(def xtfrm-date
 ^{:name-r "xtfrm.Date", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "xtfrm.Date"))

(def xtfrm-default
 ^{:name-r "xtfrm.default", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "xtfrm.default"))

(def xtfrm-difftime
 ^{:name-r "xtfrm.difftime", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "xtfrm.difftime"))

(def xtfrm-factor
 ^{:name-r "xtfrm.factor", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "xtfrm.factor"))

(def xtfrm-numeric-version
 ^{:name-r "xtfrm.numeric_version", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "xtfrm.numeric_version"))

(def xtfrm-surv
 ^{:name-r "xtfrm.Surv", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "xtfrm.Surv"))

(def xzfile
 ^{:name-r "xzfile",
  :doc "",
  :argslists
  ({:description nil, :open "", :encoding {}, :compression 6})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "xzfile"))

(def zapsmall
 ^{:name-r "zapsmall", :doc "", :argslists ({:x nil, :digits {}})}
 (r-interop.core/->clj-pos-kw-fn-polyglot "zapsmall"))
