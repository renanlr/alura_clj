(ns estoque.aula4)

(def precos [30 700 1000])

(println (precos 0))
;(println (precos 0)) -> Retorna erro


(println (get precos 0))
(println (get precos 2))
(println "retorna nil" (get precos 17))
(println "retorna 0" (get precos 17 0))


(println (conj precos 5))
(println precos)
(println (+ 5 1))

(println (inc 5))

(println (update precos 0 inc))
(println (update precos 1 dec))
(println precos)

(println (map inc precos))
(println (filter even? (range 10)))

(println (reduce + precos))
