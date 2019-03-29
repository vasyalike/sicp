(defn f [n]
  (cond (< n 3) n
        :else (+ (f (- n 1)) (* 2 (f (- n 2))) (* 3 (f (- n 3))))))

(println (f 1))
(println (f 2))
(println (f 3))
(println (f 4))
(println (f 5))
(println (f 6))
(println (f 10))
(println (f 33))

(defn f-iter [n]
  (defn iter [n1 n2 n3 counter]
    (cond (< n 3) n
          (> counter n) n1
          :else (iter (+ n1 (* 2 n2) (* 3 n3)) n1 n2 (+ counter 1)))
    ) (iter 2 1 0 3))

(println (f-iter 1))
(println (f-iter 2))
(println (f-iter 3))
(println (f-iter 4))
(println (f-iter 5))
(println (f-iter 6))
(println (f-iter 10))
(println (f-iter 33))