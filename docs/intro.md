# Introduction to r_interop

TODO: write [great documentation](http://jacobian.org/writing/what-to-write/)

# Limitation

## Plots

I use emacs and plots are not the best friend in the clojure repl.  If you want
to use R visualization packages, then you can use the `(gr-devices/svg)` (the
`svg` function in R) and call `(gr-devices/dev-off)` (i.e. `dev.off()` in R)
afterwards.
