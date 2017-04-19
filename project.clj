(defproject lein-aot-order "0.1.0-SNAPSHOT"
  :description "This leiningen plugin helps to work around
  problems of clojure ahead-of-time compilation, by determining a
  suitable compilation order via clojure.tools.namespace."
  
  :url "https://github.com/active-group/lein-aot-order"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :deploy-repositories [["releases" :clojars]]

  :dependencies [[org.clojure/tools.namespace "0.3.0-alpha3"]]
  :eval-in-leiningen true)
