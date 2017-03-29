(ns leiningen.aot-jar
  (:require [leiningen.aot-order :as aot-order]
            [leiningen.core.eval :as eval]))

(defn aot-jar
  "Like the jar task, but the :aot setting is automatically replaced
  by a list of all namespaces of the source files in :source-paths, in
  an order suitable for successfull aot compilation."
  [project & args]
  (let [jar-args args
        namespaces (vec (aot-order/namespaces (:source-paths project)))]
    ;;(println "Using aot namespace order:" namespaces)
    (eval/eval-in-project (assoc project :aot
                                 namespaces)
                          `(jar/jar ~@jar-args)
                          '(require 'leiningen.jar))))
