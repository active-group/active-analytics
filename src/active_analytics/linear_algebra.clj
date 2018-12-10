(ns active-analytics.linear-algebra
  (:require [uncomplicate.neanderthal.core :as neanderthal]
            [uncomplicate.neanderthal.math :as math]
            [uncomplicate.neanderthal.native :as native]))

;; TODO:
;; - functions to create vectors/matrices/numbers
;;   -> see/use neanderthal.core/vctr, /ge, ...

(defmacro scal
  "Multiply a scalar `a` with a matrix `m`."
  [a m]
  `(neanderthal/scal ~a ~m))

(defn nrm1
  "Calculates the 1-norm of a matrix `m`."
  [m]
  (neanderthal/nrm1 m))

(defmacro mv
  "Multiplies a matrix `m` with a vector `v`."
  [m v]
  `(neanderthal/mv ~m
                   ~v))

(defn xpy
  "Adds matrices or vectors."
  [m1 m2]
  (println m1 m2)
  (neanderthal/xpy m1
                   m2))

(defn subtract
  "Subtracts the matrix `m2` from the matrix `m1`."
  [m1 m2]
  (neanderthal/axpy -1
                    m1
                    m2))

(defmacro dim
  [v]
  `(neanderthal/dim ~v))

(defmacro zero
  [m]
  `(neanderthal/zero ~m))

(defn vctr
  [source]
  (neanderthal/vctr native/native-double source))

(defn entry
  [x i]
  (neanderthal/entry x i))

(defn imin
  [x]
  (neanderthal/imin x))

(defn imax
  [x]
  (neanderthal/imax x))

(defn abs
  [x]
  (math/abs x))
