(defn average [x y] (/ (+ x y) 2))
(defn abs [x] (if (< x 0) (- x) x))

(defn improve [guess x] (average guess (/ x guess)))
(defn good-enough? [guess x] (< (abs (- (improve guess x) guess)) 0.000001))
#_(defn good-enough? [guess x] (< (abs (- (* guess guess) x)) 0.001))
(defn sqrt-iter [guess x] (if (good-enough? guess x) guess (sqrt-iter (improve guess x) x)))

(defn sqrt [x] (sqrt-iter 1.0 x))

(println (sqrt 0.000001))
(println (sqrt 900000000000000))
