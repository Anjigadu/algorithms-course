Sorting
=

Introduction
-

Goal : Sort any type of data


Callback = Reference to the executable code.


Use comparable interface and implement compareTo method.

* -1 for lesser than
* 0 for equal
* +1 for greater than

Selection Sort
-

* In ith iteration, find the index min of smallest remaining entry
* swap a[i], a[min]


Invariants

* Entries in the left of i are in ascending order.
* Entries in the right of i doesn't have the smaller element than any of the elements in left


Compares - N-1 + N-2 + N-3 .... + 2 + 1 + 0 ~ N^2/2 compares
Exchanges = N


Quadratic time even though the array is already sorted

Linear number of exchanges.



Insertion Sort
-

In iteration i, swap a[i] with each larger entry to its left.

Invariants

* Entries to the left of i are in ascending order
* Entries to the right of i are not in ascending order


For randomly sorted array,

Compares ~1/4 N^2
Exchanges ~1/4 N^2

Inversion:
 It's a pair of keys that are out of order.


Shell Sort
-

Insertion sort is inefficient because it moves the elements one at a time.

So in shell short we move the items h positions.

Idea: Move entries more than one position at a time by h-sorting the array.

` h-sort the array for the decreasing sequence of values of h`

How to h-sort the array?

 Insertion sort with stride length `h`
 
Why insertion sort?

* for bigger increments - small sub array
* for smaller increments - already partially sorted.


A g-sorted array will remain g-sorted after h-sorting also.

h sequence

`3X + 1`



Convex hull
-

Convex hull of a set of N points is the smallest perimeter fence enclosing the points.

