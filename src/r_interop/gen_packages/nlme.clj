(ns r-interop.gen-packages.nlme)

(def exceptions
  [{:clj "lde-sys-mat" :r "LDEsysMat"}])
(def excluded-fns (into #{} (map :r exceptions)))
(def manual-aliases
  (map #(list 'defn-r (symbol (:clj %)) (symbol (:r %)))
       exceptions))

(def config {:package "nlme" :excluded-fns excluded-fns :aliases manual-aliases
             :load? true})
