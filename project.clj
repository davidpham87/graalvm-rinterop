(defproject r-interop "0.1.0-SNAPSHOT"

  :description "Interop between R and Clojure with GraalVM"

  :url "https://github.com/davidpham87/graalvm-rinterop"

  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}

  :source-paths ["src" "test"]

  :dependencies [[org.clojure/clojure "1.10.0"]
                 [camel-snake-kebab "0.4.0"]
                 [uncomplicate/neanderthal "0.26.1"] ;; simplifies computation
                 [uncomplicate/clojurecl "0.13.0"]
                 [uncomplicate/clojurecuda "0.8.0"]]
  ;; :jvm-opts ["--polyglot" "--jvm"]

  :repl {:dependencies [[nrepl "0.6.0"]
                        [cider/cider-nrepl "0.23.0-SNAPSHOT"]]
         :plugins [[cider/cider-nrepl "0.23.0-SNAPSHOT"]]}
  :repl-options {:init-ns r-interop.core})
