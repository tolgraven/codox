(defproject se.tolgraven.forks/lein-codox "0.10.12-SNAPSHOT"
  :description "Codox Leiningen plugin"
  :url "https://github.com/weavejester/codox"
  :scm {:dir ".."}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true
  :repositories [["private" {:url "https://tolgraven.hel1.your-objectstorage.com/m2/releases/"
                             :no-auth true}]]
  :deploy-repositories [["private-local" {:url "file:.deploy-m2"
                                          :sign-releases false}]]

  :dependencies [[leinjacker "0.4.3"]
                 [org.clojure/core.unify "0.5.7"]])
