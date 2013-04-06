(defproject writings "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.1.5"]
                 [fleet "0.10.1"]]
  :plugins [[lein-ring "0.8.2"]]
  :ring {:handler writings.handler/app}
  :profiles
  {:dev {:dependencies [[ring-mock "0.1.3"]]}})
