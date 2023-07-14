(ns hello-world.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
(defn myFunc  [n]
  "函数示例：(myFunc 7)"
  (cond
    (< n 0) "<0"
    (> n 7) ">7"
    :else "[0-7]"))
; 注释使用
(defn -main [& args]
  (println (not (= 1 2)))
  (println (- 1 2))
  (println (* 1 2))
   (println (str "Hello" " " "World"))
    (println (myFunc 7)))

