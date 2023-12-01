(ns xml-hiccup-test
  (:require [clojure.test :refer :all]
            [dk.cst.xml-hiccup :refer :all]
            [clojure.java.io :as io]
            [clojure.edn :as edn]))

(deftest input-vs-output
  (is (= (parse (io/file "test/test-1307-anno-tei.xml"))
         (parse (io/input-stream "test/test-1307-anno-tei.xml"))
         (parse (slurp "test/test-1307-anno-tei.xml"))
         (edn/read-string (slurp "test/test-1307-anno-tei.edn")))))
