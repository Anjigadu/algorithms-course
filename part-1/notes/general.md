General Notes
=

This contains the general notes for the Part1 course.

* Algorihtm - method to solve the problem

* Data structure - method to store information


Steps :

  * Model the problem
  * Find an algorithm to solve it
  * Fast enough ? Fits in Memory?
  * If not Figure out Why?
  * Find a way to solve the problem
  * Iterate until satisfied

[Book Site](http://algs4.cs.princeton.edu/home/)


Assertion usage
-

 * statements to test assumptions/ preconditions about the program
 * can be enable/ disable at runtime
   ` java -ea Prog`
   ` java -da Prog`
 * Best practise : Use assertions to check internal invariants
 

Standard recipe for Equals() implementation
-

* Optimisation for reference equivality ( this == obj) return true;
* Check against null
* check two objects are same type and cast
* Compare each significatnt field
  + If primitive, use ==
  + If refernce, use equals()
  + If array, do for each entry
  
