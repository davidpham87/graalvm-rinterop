(ns r-interop.gen-packages.grDevices)

(def excluded-fns #{"dev.copy2eps" "dev.copy2pdf" "dev2bitmap" "rgb2hsv"})
(def manual-aliases
  '((defn-r dev-copy->eps dev.copy2eps)
    (defn-r dev-copy->pdf dev.copy2pdf)
    (defn-r dev->bitmap dev2bitmap)
    (defn-r rgb->hsv rgb2hsv)))
(def config {:package "grDevices" :excluded-fns excluded-fns :aliases manual-aliases})
