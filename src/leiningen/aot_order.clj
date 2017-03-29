(ns leiningen.aot-order
  (:require [clojure.tools.namespace.dir :as dir]
            [clojure.tools.namespace.track :as track]))

(defn namespaces [source-paths]
  (:clojure.tools.namespace.track/load ;; no public api for this?!
   (dir/scan-dirs (track/tracker) source-paths {:add-all? true})))

(defn aot-order
  "Print a vector of all namespaces of :source-paths clojure files, in
  an order suitable for successfull aot compilation."
  [project & args]
  (let [ns-list (namespaces (:source-paths project))]
    (println "Possible namespace compilation order:" (vec ns-list))))
