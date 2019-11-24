(ns r-interop.gen-packages.utils)

(def exceptions
  [{:clj "get-cran-mirrors"  :r "getCRANmirrors"}
   {:clj "get-s3-method"     :r "getS3method"}
   {:clj "glob->rx"          :r "glob2rx"}
   {:clj "is-s3-method"      :r "isS3method"}
   {:clj "is-s3-std-generic" :r "isS3stdGeneric"}
   {:clj "mirror->html"      :r "mirror2html"}])

(def excluded-fns (into #{} (map :r exceptions)))
(def manual-aliases
  (map #(list 'defn-r (symbol (:clj %)) (symbol (:r %)))
       exceptions))

(def config {:package "utils" :excluded-fns excluded-fns :aliases manual-aliases})
