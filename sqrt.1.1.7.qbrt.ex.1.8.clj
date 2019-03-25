(defn average [x y] (/ (+ x y) 2))
(defn abs [x] (if (< x 0) (- x) x))

(defn sq-improve [guess x] (average guess (/ x guess)))
(defn qb-improve [guess x] (/ (+ (/ x (* guess guess)) (* 2 guess)) 3))

;this version produces more accurate results for small numbers
(defn good-enough? [improve guess x] (< (abs (- (improve guess x) guess)) 0.000001))
#_(defn good-enough? [guess x] (< (abs (- (* guess guess) x)) 0.001))

(defn root-iter [improve guess x] (if (good-enough? improve guess x) guess (root-iter improve (improve guess x) x)))

(defn sqrt [x] (root-iter sq-improve 1.0 x))
(defn qbrt [x] (root-iter qb-improve 1.0 x))

(println (sqrt 0.000001))
(println (sqrt 900000000000000))
(println (qbrt 27))
(println (qbrt 64))
