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

