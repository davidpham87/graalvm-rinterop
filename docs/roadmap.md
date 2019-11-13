# TODO

## How to include R class into interop?

I guess, I will have to understand how class are mapped in R.

## Write an example on how to export a packages

Write example on how to export a package to create a clojure file.

``` clojure
(def config {:package "stats" :excluded-fns excluded-fns :aliases aliases
    :load? true :root-ns "r-interop.packages" :root-filepath "r_interop/packages"})
(r-interop.core/create-package-bindings config)
```
