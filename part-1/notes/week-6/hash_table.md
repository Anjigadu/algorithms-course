Hash Table
=

Another better way of implementing a symbol tables.

In hash tables, search will be better but the ordered operations are not possible.

Hashing
-

Basic plan - Save items in a key indexed table (index is the function of key)

Hash function

 Method to compute index for the key
 
 Classic example for space-time trade off
 
 
 Hash function
 -
 
 Idealistic goal - to scramble the keys uniformly to produce table index
 
 * efficiently computable.
 * Each table index is eqully likely for each key
 

combine each significant field(have to be immutable) using 31x + y
If primitive use hashCode() of wrapper type



Separate Chaining (using array of Linked list)

 At collision put in the top of linked list

 M ~ N/5 (constant)
 
Linear Probing (using bigger array ( M > N))

 At collision put the next empty slot
 
 M has to greater than N
