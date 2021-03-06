(defn sum-squares [a b] (+ (* a a) (* b b)))
(defn larger-two-sum-squares [a b c] 
  (cond 
    (and (<= a b) (<= a c)) (sum-squares b c) 
    (and (<= b a) (<= b c)) (sum-squares a c) 
    (and (<= c a) (<= c b)) (sum-squares a b)))

(print (larger-two-sum-squares 5 2 3))
