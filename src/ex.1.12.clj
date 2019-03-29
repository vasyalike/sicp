(defn pascal-triangle [n-row k-col]
  (cond (= n-row 0) 1
        (= k-col 0) 1
        (= n-row k-col) 1
        :else (+ (pascal-triangle (- n-row 1) (- k-col 1)) (pascal-triangle (- n-row 1) k-col))))

(println (pascal-triangle 0 0))
(println (pascal-triangle 1 0))
(println (pascal-triangle 1 1))
(println (pascal-triangle 2 1))
(println (pascal-triangle 4 2))
(println)
(println (pascal-triangle 7 0))
(println (pascal-triangle 7 1))
(println (pascal-triangle 7 2))
(println (pascal-triangle 7 3))
(println (pascal-triangle 7 4))
(println (pascal-triangle 7 5))
(println (pascal-triangle 7 6))
(println (pascal-triangle 7 7))

#_(println (pascal-triangle 30 15))                           ;155117520