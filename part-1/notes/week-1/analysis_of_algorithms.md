This file contains notes for analysis for algorithm related lectures.


Use Cost model and tilde notation to simplify the counts
Use approximate models

Order of growth functions
-

common order of growth functions

 * 1 Constant
 
  statement

 * log N lograthimic

  binary search

 * N linear

  single loop

 * Nlog N lineararithmetic

  divide and conquer 

* N^2 quadratic
  
  double loop

 * N^3 cubic
 
  triple loop

 * 2^N exponential
  
  check all the subsets


Best Case
-

* lower bound
* Determined by the easiest input
* provide a goal for all inputs

Worst Case
-

* upper bound
* Determined by the " most difficult" input
* provide a guarentee for all inputs


Average Case
-

* Expected cost for random input
* need a model to provide random input
* provides a way to predict performance



`Need to understand the input to process it effectively`

* Approach 1 : Design for worst case
* Approach 2 : Randomise, depend on probalistic guarantee


Notations

* Big theta - classify algorithms
* Big Oh - develop upper bounds
* Big Omega - develop lower bounds


Optimal algorithms should fall between upper and lower bounds.



Algorithm Design approach

* Develop an algorithm
* Prove lower bound

* Then lower the upper bound


Drawbacks

* Over pessimistic on worst case


Big Oh is not approximate model that is tilde ~



Memory
-
bit = 0 or 1
B   = 8 bits
MB  = 2^20 bytes
GB  = 2^30 bytes
 
