(ns social-buzz.config
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [social-buzz.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[social-buzz started successfully using the development profile]=-"))
   :middleware wrap-dev})
