(ns r-interop.gen-packages.base)

(def excluded-fns
  #{
    ;; will break the code
    "eval" "for" "if" "function" "exception"
    "break" "remove" "next" "repeat" "while"

    ;; all the posix funciton defined below (otherwise get posi-xct in the function name)
    "all.equal.POSIXt" "anyNA.POSIXlt" "as.character.POSIXt"
    "as.data.frame.POSIXct" "as.data.frame.POSIXlt" "as.Date.POSIXct"
    "as.Date.POSIXlt" "as.double.POSIXlt" "as.list.POSIXct" "as.list.POSIXlt"
    "as.matrix.POSIXlt" "as.POSIXct" "as.POSIXct.Date" "as.POSIXct.default"
    "as.POSIXct.numeric" "as.POSIXct.POSIXlt" "as.POSIXlt"
    "as.POSIXlt.character" "as.POSIXlt.Date" "as.POSIXlt.default"
    "as.POSIXlt.factor" "as.POSIXlt.numeric" "as.POSIXlt.POSIXct" "c.POSIXct"
    "c.POSIXlt" "cut.POSIXt" "diff.POSIXt" "duplicated.POSIXlt"
    "format.POSIXct" "format.POSIXlt" "is.na.POSIXlt" "is.numeric.POSIXt"
    "julian.POSIXt" "length.POSIXlt" "Math.POSIXt" "mean.POSIXct"
    "mean.POSIXlt" "months.POSIXt" "names.POSIXlt" "Ops.POSIXt" "print.POSIXct"
    "print.POSIXlt" "quarters.POSIXt" "rep.POSIXct" "rep.POSIXlt"
    "round.POSIXt" "seq.POSIXt" "sort.POSIXlt" "split.POSIXct"
    "summary.POSIXct" "Summary.POSIXct" "summary.POSIXlt" "Summary.POSIXlt"
    "trunc.POSIXt" "unique.POSIXlt" "weekdays.POSIXt" "xtfrm.POSIXct"
    "xtfrm.POSIXlt"})

(def manual-aliases
  '((defn-r all-equal-posix-t all.equal.POSIXt)
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
    (defn-r xtfrm-posix-lt xtfrm.POSIXlt)))

(def config {:package "base" :excluded-fns excluded-fns :aliases manual-aliases})
