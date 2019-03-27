(defn first-denomination [kind-of-coins]
  (cond (= kind-of-coins 1) 1
        (= kind-of-coins 2) 5
        (= kind-of-coins 3) 10
        (= kind-of-coins 4) 25
        (= kind-of-coins 5) 50))

(defn count-change [amount]
  (defn change-req [amount kind-of-coins]
    (cond
      (= amount 0) 1
      (or (< amount 0) (= kind-of-coins 0)) 0
      :else (+
              (change-req amount (- kind-of-coins 1))
              (change-req (- amount (first-denomination kind-of-coins)) kind-of-coins))))

  (change-req amount 5))

(print (count-change 100))