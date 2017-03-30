(ns leiningen.aot-order
  (:require [lein-aot-order.core :as core]))

(defn aot-order
  "Print a vector of all namespaces of :source-paths clojure files, in
  an order suitable for successfull aot compilation."
  [project & args]
  (let [ns-list (core/namespaces (:source-paths project))]
    (println "Possible namespace compilation order:\n" (vec ns-list))
    (println "Set :aot to :order to use that.")))
