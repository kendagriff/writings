(ns writings.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
  (route/resources "/writings")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
