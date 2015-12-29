(ns social-buzz.config
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[social-buzz started successfully]=-"))
   :middleware identity})
