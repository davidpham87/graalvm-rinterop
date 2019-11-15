(defproject r-interop-example "0.1.0-SNAPSHOT"

  :description "Example of using r-interop"

  :url "https://github.com/davidpham87/graalvm-rinterop/example"

  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}

  :source-paths ["src" "test" "../src" "assets"]

  :resource-paths ["assets"]

  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/java.data "0.1.1"]
                 [camel-snake-kebab "0.4.0"]
                 [org.clojure/data.csv "0.1.4"]
                 [uncomplicate/neanderthal "0.26.1"] ;; simplifies computation
                 [uncomplicate/clojurecl "0.13.0"]
                 [uncomplicate/clojurecuda "0.8.0"]]
  ;; :jvm-opts ["--polyglot" "--jvm"]

  :repl {:dependencies [[nrepl "0.6.0"]
                        [cider/cider-nrepl "0.23.0-SNAPSHOT"]]
         :plugins [[cider/cider-nrepl "0.23.0-SNAPSHOT"]]}
  :repl-options {:init-ns exo.class-test}
  )
