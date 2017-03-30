(ns lein-aot-order.plugin
  (:require [lein-aot-order.core :as core]
            [leiningen.core.project :as p]
            [leiningen.core.main :as main]))

(defn middleware [project]
  (if (= :order (:aot project))
    (do
      (main/info "Injecting :aot list of ordered namespaces.")
      (assoc project
             :aot (vec (core/namespaces (:source-paths project)))))
    project))
