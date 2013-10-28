(ns bob)
(use 'clojure.string)
(defn response-for
  "Bob responds here."
  [msg]
  (if (or (nil? msg) (blank? msg))
    "Fine. Be that way!"
    ; If all alphabetic characters are upper case...
    (if (and (= (upper-case msg) msg) (not= (lower-case msg) msg))
        "Woah, chill out!"
    (if (= \? (last msg))
      "Sure."
      "Whatever."
      ))))
