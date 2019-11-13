(ns r-interop.packages.splines
 (:require [r-interop.core :refer (defn-r)]))

(def as-poly-spline
 ^{:name-r "as.polySpline",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "as.polySpline"))

(def as-vector
 ^{:name-r "asVector", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "asVector"))

(def back-spline
 ^{:name-r "backSpline", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "backSpline"))

(def bs
 ^{:name-r "bs",
  :doc "",
  :argslists
  ({:x nil,
    :df nil,
    :knots nil,
    :degree 3,
    :intercept false,
    :Boundary.knots [nil nil]})}
 (r-interop.core/->clj-pos-kw-fn "bs"))

(def interp-spline
 ^{:name-r "interpSpline",
  :doc "",
  :argslists
  ({:obj1 nil,
    :obj2 nil,
    :bSpline false,
    :period nil,
    :ord 4,
    :na.action nil,
    :sparse false})}
 (r-interop.core/->clj-pos-kw-fn "interpSpline"))

(def ns
 ^{:name-r "ns",
  :doc "",
  :argslists
  ({:x nil,
    :df nil,
    :knots nil,
    :intercept false,
    :Boundary.knots [nil nil]})}
 (r-interop.core/->clj-pos-kw-fn "ns"))

(def periodic-spline
 ^{:name-r "periodicSpline",
  :doc "",
  :argslists
  ({:obj1 nil, :obj2 nil, :knots nil, :period [nil 2 nil], :ord 4})}
 (r-interop.core/->clj-pos-kw-fn "periodicSpline"))

(def poly-spline
 ^{:name-r "polySpline", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "polySpline"))

(def spline-des
 ^{:name-r "spline.des",
  :doc "",
  :argslists
  ({:knots nil,
    :x nil,
    :ord 4,
    :derivs [nil [nil nil]],
    :outer.ok false,
    :sparse false})}
 (r-interop.core/->clj-pos-kw-fn "spline.des"))

(def spline-design
 ^{:name-r "splineDesign",
  :doc "",
  :argslists
  ({:knots nil,
    :x nil,
    :ord 4,
    :derivs 0,
    :outer.ok false,
    :sparse false})}
 (r-interop.core/->clj-pos-kw-fn "splineDesign"))

(def spline-knots
 ^{:name-r "splineKnots", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "splineKnots"))

(def spline-order
 ^{:name-r "splineOrder", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "splineOrder"))

(def xy-vector
 ^{:name-r "xyVector", :doc "", :argslists ({:x nil, :y nil})}
 (r-interop.core/->clj-pos-kw-fn "xyVector"))
