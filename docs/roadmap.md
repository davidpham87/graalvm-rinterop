# TODO

## Write an example on how to export a packages

Write example on how to export a package to create a clojure file.

``` clojure
(def config {:package "stats" :excluded-fns excluded-fns :aliases aliases
    :load? true :root-ns "r-interop.packages" :root-filepath "r_interop/packages"})
(r-interop.core/create-package-bindings config)
```

## Import all the packages in base

All packages are here.

https://stat.ethz.ch/R-manual/R-devel/library/

## Manual aliases as def

In automatic packages conversion, convert the manual defn-r into similar `def`
with meta data as the usual package.
