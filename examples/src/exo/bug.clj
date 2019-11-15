(ns exo.bug
  (:require
   [r-interop.core :as rc]
   [r-interop.packages.base :as r-base]
   [r-interop.packages.stats :as st]))

(println (.toString (rc/eval-r "matrix(1:4, 2)")))
;; Outputs
;;       [,1] [,2]
;; [1,]    1    3
;; [2,]    2    4
(rc/value->clj (rc/eval-r "matrix(1:4, 2)")) ;; => [1 2 3 4]
(.getArraySize (rc/eval-r "matrix(1:4, 2)")) ;; => 4
