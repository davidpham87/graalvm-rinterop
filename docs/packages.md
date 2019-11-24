# Packages

First step, check if the packages you want to convert into Clojure is installed
on fastR. I am going to present how to include some packages into Clojure and
show you some limitation on the way.

# Install the package on fastR

I recommend you to launch a fastR process and install the targeted package via
that process. E.g. with `ggplot2`

``` shell
$ /usr/lib/jvm/graalvm/bin/R
R version 3.5.1 (FastR)
Copyright (c) 2013-19, Oracle and/or its affiliates
Copyright (c) 1995-2018, The R Core Team
Copyright (c) 2018 The R Foundation for Statistical Computing
Copyright (c) 2012-4 Purdue University
Copyright (c) 1997-2002, Makoto Matsumoto and Takuji Nishimura
All rights reserved.

FastR is free software and comes with ABSOLUTELY NO WARRANTY.
You are welcome to redistribute it under certain conditions.
Type 'license()' or 'licence()' for distribution details.

R is a collaborative project with many contributors.
Type 'contributors()' for more information.

Type 'q()' to quit R.

> install.packages('ggplot2')
```

This can take quite some time.

# Create the Clojure Bindings

First of all, you are not all forced to create a namespace for your R bindings.
It is perfectly valid to define them in your main script files like this

``` clojure
(ns cool-project.core
  (:require [r-interop.core :as rc :refer (defn-r eval-r)]))

(eval-r "ggplot2")

(defn-r qqplot) ;; convert qqplot
(defn-r plot ggplot) ;; create binding of `ggplot` to the plot.
```

I made the choice to enforce `kebab-case` into the packages, so I created
facilities to automatically convert function names in R to the desired
format. That being said, the conversion still miss whenever you have conversion
function (e.g. `cov2cor` translated to `cov->cor`) or whenever several
uppercase letter follow each other (e.g. `stats::ARMAacf` which should be
converted to `arma-acf` and not `arm-acf`).
