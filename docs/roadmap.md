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

## Import all the packages in base

All packages are here.

https://stat.ethz.ch/R-manual/R-devel/library/

## Write about bugs

### Not preserving dimensions

Try to create a 2x2 matrix and get back a vector

### hasMembers is true but no keys are returned

Check with interop, and see any errors. Sometimes the hasMembers returns an empty set and the members might be duplicates, wtf?!
