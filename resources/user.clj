(ns user
  (:require [clojure.tools.namespace.repl :refer [refresh]]))

(def screen-width 80)
(def SYMBOL "> ")
(def factor  2)
(def factored (/ screen-width factor))
(def hlo-pad (apply str (repeat factored SYMBOL)))

(println hlo-pad "Hlo RePl!")
