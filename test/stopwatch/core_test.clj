(ns stopwatch.core-test
  (:require [clojure.test :refer :all]
            [stopwatch.core :refer :all]))

(deftest same-result
  (is (= (nanof identity (+ 1 2 3)) (+ 1 2 3)))
  (let [[t v] (nanov (str 2 3 4 {:a 1} ["blah"]))]
    (is (= v (str 2 3 4 {:a 1} ["blah"])))
    (is (not (neg? t)))))

(deftest valid-time
  (is (not (neg? (nano (sort [6 23 7 3 5]))))))


