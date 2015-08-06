(ns leiningen.new.minimal-clojure-project
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "minimal-clojure-project"))

(defn minimal-clojure-project
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' minimal-clojure-project project.")
    (->files data
             ["src/{{sanitized}}/foo.clj" (render "foo.clj" data)])))
