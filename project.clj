(defproject lein-aot-order "0.1.0"
  :description "This leiningen plugin helps to work around
  problems of clojure ahead-of-time compilation, by determining a
  suitable compilation order via clojure.tools.namespace."
  
  :url "https://github.com/active-group/lein-aot-order"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :release-tasks
  [["vcs" "assert-committed"]
   ["change" "version" "leiningen.release/bump-version" "release"]
   ["vcs" "commit"]
   ["vcs" "tag" "--no-sign"]
   ["deploy" "clojars"]
   ["change" "version" "leiningen.release/bump-version"]
   ["vcs" "commit"]]

  :deploy-repositories
  {"clojars" {:url "https://clojars.org/repo"
              :sign-releases false}}

  :dependencies [[org.clojure/tools.namespace "0.3.0-alpha3"]]
  :eval-in-leiningen true)
