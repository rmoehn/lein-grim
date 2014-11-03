(defproject org.clojure-grimoire/lein-grim "0.1.0-SNAPSHOT"
  :description "A Leiningen plugin for generating Grimoire documentation"
  :url "http://github.com/clojure-grimoire/lein-grim"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :profiles {:dev-injects {:dependencies [[org.clojure/clojure "1.6.0"]
                                          [cider/cider-nrepl "0.8.0-SNAPSHOT"]
                                          [org.clojure/tools.namespace "0.2.7"]
                                          [org.clojure-grimoire/lib-grimoire "0.1.0-SNAPSHOT"]
                                          [me.arrdem/detritus "0.2.0-SNAPSHOT"]]}
             :dev         [:user :arrdem :dev-injects]}
  :eval-in-leiningen true)
