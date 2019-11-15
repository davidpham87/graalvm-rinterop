(ns r-interop.gen-packages.mgcv)

(def exceptions
  [{:clj "ff-des"          :r "FFdes"}
   {:clj "smooth->random"  :r "smooth2random"}
   {:clj "gam->derivative" :r "gam2derivative"}
   {:clj "gam->objective"  :r "gam2objective"}])

(def excluded-fns (into #{} (map :r exceptions)))
(def manual-aliases
  (map #(list 'defn-r (symbol (:clj %)) (symbol (:r %)))
       exceptions))

(def config {:package "mgcv" :excluded-fns excluded-fns :aliases manual-aliases
             :load? true})
