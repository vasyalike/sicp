(defn pascal-triangle [col row]
  (cond (= row 1) 1
        (= col 1) 1
        (= row col) 1
        :else (+ (pascal-triangle (- col 1) (- row 1)) (pascal-triangle col (- row 1)))))

(println (pascal-triangle 1 1))
(println (pascal-triangle 1 2))
(println (pascal-triangle 2 2))
(println (pascal-triangle 2 3))
(println (pascal-triangle 3 5))
(println)
(println (pascal-triangle 2 8))
(println (pascal-triangle 3 8))
(println (pascal-triangle 4 8))
(println (pascal-triangle 5 8))
(println (pascal-triangle 6 8))
(println (pascal-triangle 7 8))