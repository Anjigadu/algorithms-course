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


Generics & Iterator
-

Generics allows that a single data structure implementation for multiple data types.

Iterator provides an easy way to iterate the elements without knowing the underlying data structure.


Bag
-

Provides way to add items to collection and iterating.

make use of stack without pop() or queue without deque.


Applications
-

* Undo in word processer
* Back button in browser
* compiler function call stack
* Postfix conversion
* Infix evaluation


Infix evaluation using two stack algorithm of Djikistra

value stack  - to store the values

operator stack - to store the operators

if left paranthesis ignore, if right paranthesis get two values  and a operator put the result back to value stack
