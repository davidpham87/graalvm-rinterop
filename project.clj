(defproject r_interop "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [camel-snake-kebab "0.4.0"]]
  :repl {:plugins [[cider/cider-nrepl "0.22.3"]]}
  :repl-options {:init-ns r-interop.core})
