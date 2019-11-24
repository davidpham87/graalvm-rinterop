(ns r-interop.package-generator
  "Simple scripts for generating packages files in the gen_packages folder"
  (:require
   [r-interop.core :refer (create-package-bindings)]
   [r-interop.gen-packages.base]
   [r-interop.gen-packages.boot]
   [r-interop.gen-packages.grDevices]
   [r-interop.gen-packages.mgcv]
   [r-interop.gen-packages.nlme]
   [r-interop.gen-packages.splines]
   [r-interop.gen-packages.stats]
   [r-interop.gen-packages.utils]))

(create-package-bindings r-interop.gen-packages.base/config)
(create-package-bindings r-interop.gen-packages.boot/config)
(create-package-bindings r-interop.gen-packages.grDevices/config)
(create-package-bindings r-interop.gen-packages.mgcv/config)
(create-package-bindings r-interop.gen-packages.nlme/config)
(create-package-bindings r-interop.gen-packages.splines/config)
(create-package-bindings r-interop.gen-packages.stats/config)
(create-package-bindings r-interop.gen-packages.utils/config)
