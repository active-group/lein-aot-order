(ns lein-aot-order.core
  (:require [clojure.tools.namespace.dir :as dir]
            [clojure.tools.namespace.track :as track]))

(defn namespaces [source-paths]
  (:clojure.tools.namespace.track/load ;; no public api for this?!
   (dir/scan-dirs (track/tracker) source-paths {:add-all? true})))
