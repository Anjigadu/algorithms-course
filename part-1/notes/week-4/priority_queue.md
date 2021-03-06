Priority Queues
=

This is to remove the largest / smallest element from the collection.

Challenge
-

Where N is larger number we cannot accomodate in the memory and we're interested only the largest / smallest M items then ,

 Pesudocode
 -
  * Create a PQ
  * Insert elements one by one from the stream as incoming
  * if size of PQ more than M then delete min / max depends upon requirement

so with M space, we could store the M largest/smallest items from the huge N items.

Binary Heap
=

Array representation of a heap ordered complete binary tree.

Heap-ordered binary tree,

* Keys in nodes
* Parent's key is no smaller than the children's keys

Array representation

 * indices starts at 1.
 * take nodes in level order
 * no explicit link needed

A[1] is the largest key , root of the binary tree

* parent of k is k/2

* childrens are 2k and 2k + 1


Promotion in a heap
-

Child's key become larger than parent's key

* Exchange key with parent's key
* repeat until the heap order restored.

bottom line : Going upwards

Insertion in a heap
-

* Insert key after the last entry
* perform promotion until violation solved.

Cost: at most 1 + log2N


Demotion in a heap
-

 Parent's key becomes smaller than its one/ both children's keys
 
 * Exchange parent's key with the key of the larger child.
 * Repeat until the heap property restored.

bottom line : going downwards.

Deletion of maximum in a heap
-

* Save the root value in temp
* Exchange the root's value with the last value ( a[N] )
* Demotion of root to fit into it's correct position


note: Dereference the N+1 element to prevent loitering


Best Practise
-

Use immutable keys


Heap Sort
-

Basic Plan

 * Create a max-heap with all N keys - inplace
 * Repeatedly remove the maximum key (and put it in the N - i-1 th position) - inplace
 

Pseudocode
-

Build heap using bottom up method
 
 for (i = N/2 ;i >= 1;i++)
  
  sink(a,i,N);

Second pass - sort down

 while (N > 1)
 
  exch (a,1,N--)
  sink(a,1,N);
  
Mathematical Analysis

Heap constuction uses Comparision & exch <= 2N
Heap sort uses comp & exchanges <= 2NlgN


Bottom line
-
Heap sort is an in place algorithm with NlogN worst case time.

 * Heap sort is optimal for both space and time but
 * Not stable
 * Not cache efficient
 * Inner loop longer than quick sort
 

Event driven simulation
-

Goal - simulate the motion of N moving particles that move according to the laws of elastic collision.
