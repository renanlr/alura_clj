(ns estoque.aula5)

(def estoque {"Mochila" 10 "Camiseta" 5})
(println estoque)

(def estoque {"Mochila" 10, "Camiseta" 5})
(println estoque)
(println "Temos" (count estoque) "Elementos")
(println "Chaves são:" (keys estoque))
(println "Valores são:" (vals estoque))

; keyword
; :mochila
(def estoque {:mochila  10
              :camiseta 5})

(println (assoc estoque :cadeira 3))
(println estoque)
(println (assoc estoque :mochila 1))

(println (update estoque :mochila inc))
(println (update estoque :mochila #(- % 3)))


(println (dissoc estoque :mochila))







(def pedido {:mochila  {:quantidade 2, :preco 80}
             :camiseta {:quantidade 3, :preco 40}})

(println pedido)

(def pedido (assoc pedido :chaveiro {:quantidade 1, :preco 10}))


(println pedido)
; se pedido for null causa nullpointer
(println (pedido :mochila))
(println (get pedido :mochila))
(println (get pedido :mochila {}))
(println (:mochila pedido))
(println (:mochila pedido {}))

; THREADING FIRST
(println (-> pedido
             :mochila
             :quantidade))

(-> pedido
    :mochila
    :quantidade
    println)



