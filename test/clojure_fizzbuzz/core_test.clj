(ns clojure-fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [clojure-fizzbuzz.core :refer :all]))

(deftest fizzbuzz-test
  (testing "returns fizz for a multiple of 3"
    (is (= "fizz" (fizzbuzz 3)))
    (is (= "fizz" (fizzbuzz 9))))

  (testing "returns buzz for a multiple of 5"
    (is (= "buzz" (fizzbuzz 5)))
    (is (= "buzz" (fizzbuzz 10))))

  (testing "returns fizzbuzz for a multiple of 3 and 5"
    (is (= "fizzbuzz" (fizzbuzz 15)))
    (is (= "fizzbuzz" (fizzbuzz 30))))

  (testing "returns number if not multiple of 3 or 5"
    (is (= 1 (fizzbuzz 1)))
    (is (= 2 (fizzbuzz 2)))))
