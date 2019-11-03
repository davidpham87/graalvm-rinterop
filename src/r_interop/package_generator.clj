(ns r-interop.package-generator
  (:require
   [r-interop.core :refer (create-package-bindings)]
   [r-interop.gen-packages.base ]
   [r-interop.gen-packages.stats]))

(create-package-bindings r-interop.gen-packages.base/config)
(create-package-bindings r-interop.gen-packages.stats/config)

(comment
  (clojure.pprint/pprint
   (let [clj-id "qqnorm"
         r-id "qqnorm"
         args {:p 1 :q 1}]
     (list 'def (symbol r-id)
           (symbol "^") {:name-r r-id :doc "" :argslists (list args)}
           `(->clj-pos-kw-fn ~r-id))))

  )
