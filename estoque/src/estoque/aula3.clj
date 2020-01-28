(ns estoque.aula3)

(defn mais-caro-que-100?
  [valor-bruto]
  (> valor-bruto 100))

(println (mais-caro-que-100? 101))
(println (mais-caro-que-100? 100))


(defn valor-descontado
  "Retorna o valor com desconto de 10% se deve aplicar desconto"
  [aplica? valor-bruto]
  (if (aplica? valor-bruto)
                       "Aplicar Desconto"
                       valor-bruto))

(println (valor-descontado mais-caro-que-100? 100))
(println (valor-descontado mais-caro-que-100? 101))
(println (valor-descontado (fn [v] (> v 100)) 100))
(println (valor-descontado (fn [v] (> v 100)) 101))
(println (valor-descontado #(> % 100) 100))
(println (valor-descontado #(> % 100) 101))
