;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname example_pluralize) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f () #f)))
;Problem: Design a function that pluralizes a given word. (Pluralize means to convert the word to its plural form.)
;For simplicity you may assume that just adding s is enough to pluralize a word.

;String -> String
;add s to a given string
;(define (pluralize word) "a") ;stub

(check-expect (pluralize "dog") "dogs")
(check-expect (pluralize "goal") "goals")

;(define (pluralize word) ;template
;  (... word))

(define (pluralize word)
 (string-append word "s"))