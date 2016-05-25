(ns clojure-fizzbuzz.core
  (:gen-class))

(defn fizzbuzz [x]
  (cond
    (zero? (mod x 15)) "fizzbuzz"
    (zero? (mod x 5)) "buzz"
    (zero? (mod x 3)) "fizz"
    :else x)
  )