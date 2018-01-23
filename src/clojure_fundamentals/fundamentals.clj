(ns clojure-fundamentals.fundamentals)

;; Maps
(def myMap {:firstKey "value 1", :secKey "2 value"})

;; Higher Order function apply
(def hofunapply (apply str ["one" "two" "three"]))

(defn -main 
    "asdfasf"
    [& x]

    (println myMap)

    ;; Apply a function to each element
    (println hofunapply)

    ;; Which is different to
    (println (str ["one" "two" "three"]))
)
