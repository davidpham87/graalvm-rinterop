 # R_interop

A simple example to help the interaction with R and Clojure in GraalVM

## Usage

Install GraalVM first. See this
[guide](https://gist.github.com/ricardozanini/fa65e485251913e1467837b1c5a8ed28)
for a how to. Note that `alternatives` is actually `update-alternatives` on
most linux distribution.

On the Clojure part:

``` clojure
;; inside core.clj

;; define the rnorm function in clojure linked to the R rnorm function
(defn-r rnorm)

;; positional call to the rnorm function (n=10, mean=2, sd=3)
(rnorm 10 2 3)

;; Same as above for the qnorm, but accepts a maps of arguments
(defn-r-kw qnorm)
;; usual 0.95 and 0.975 quantile
(qnorm {:p [0.95, 0.975]})

;; Same as above with standard deviation of 2,
;; observe we did not specify (which then takes the default value 0)
(qnorm {:p [0.95, 0.975] :sd 2})
```

## Caveat

- Matrix dimensions are sometimes not respected (see the `lm`) example.
- Classes are not kept after conversion.

## License

Copyright © 2019 David Pham

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
