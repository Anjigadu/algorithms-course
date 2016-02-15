Fundamental Data structures
=

Operations
-

* insert
* remove
* iterate
* test is empty?

Data structures
-

+ stack -> LIFO
+ Queue -> FIFO


Stack
-

Implementation using Linked List

* push - insert at the head node of linked list
* pop - remove at the head node of linked list
* empty - check head is empty

Running time : O(1)
Space : O(40N) Since for each element we have to store next references space overhead. 40 bytes per element excluding the item it holds.

Implementation using Array

* push - insert at position N
* pop - remove at position N-1
* empty - check N == 0

Defect : Fixed size can be overcome by resizing

Note:
To avoid loitering problem set the array value as null while pop.


Array Resizing
-

Double the array when stack is full
half the array when stack is one quater full

Maintain invariant that stack is always between 25% and 100%


Queue
-

Implementation using Linked list

maintain first and last pointer.

* enqueue - insert at the last node
* dequeue - remove the first node

Implementation using Array
 
maintain head and tail

* enqueue - insert at the tail 
* dequeue - remove the head
