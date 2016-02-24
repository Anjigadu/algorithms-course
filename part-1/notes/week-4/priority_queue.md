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


Insertion in a heap
-

* Insert key after the last entry
* perform promotion until violation solved.

Cost: at most 1 + log2N




