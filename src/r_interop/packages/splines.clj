(ns r-interop.packages.splines
 (:require [r-interop.core :refer (defn-r)]))



(def as-poly-spline
 ^{:name-r "as.polySpline",
  :doc "",
  :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "splines::as.polySpline"))

(def as-vector
 ^{:name-r "asVector", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "splines::asVector"))

(def back-spline
 ^{:name-r "backSpline", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "splines::backSpline"))

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
 (r-interop.core/->clj-pos-kw-fn "splines::bs"))

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
 (r-interop.core/->clj-pos-kw-fn "splines::interpSpline"))

(def ns
 ^{:name-r "ns",
  :doc "",
  :argslists
  ({:x nil,
    :df nil,
    :knots nil,
    :intercept false,
    :Boundary.knots [nil nil]})}
 (r-interop.core/->clj-pos-kw-fn "splines::ns"))

(def periodic-spline
 ^{:name-r "periodicSpline",
  :doc "",
  :argslists
  ({:obj1 nil, :obj2 nil, :knots nil, :period [nil 2 nil], :ord 4})}
 (r-interop.core/->clj-pos-kw-fn "splines::periodicSpline"))

(def poly-spline
 ^{:name-r "polySpline", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "splines::polySpline"))

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
 (r-interop.core/->clj-pos-kw-fn "splines::spline.des"))

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
 (r-interop.core/->clj-pos-kw-fn "splines::splineDesign"))

(def spline-knots
 ^{:name-r "splineKnots", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "splines::splineKnots"))

(def spline-order
 ^{:name-r "splineOrder", :doc "", :argslists ({:object nil})}
 (r-interop.core/->clj-pos-kw-fn "splines::splineOrder"))

(def xy-vector
 ^{:name-r "xyVector", :doc "", :argslists ({:x nil, :y nil})}
 (r-interop.core/->clj-pos-kw-fn "splines::xyVector"))
