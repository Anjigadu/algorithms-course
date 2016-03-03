Symbol Table
=

Key-value abstraction

* Insert a value with the specified key
* Given a key, search for the corresponding value


Associative array abstraction - Associate one value with each key

Conventions
-

 * values are not going to be null
 * method get() returns null if key not present
 * method put() will override the old value with the new one.


Elementary symbol table implementations
-

 * Sequential search with Linked List ( O(n) for insertion and search)
 * Binary search in ordered array ( O(logn) for search but for insert O(n) )
 


Binary Search Tree
=

 classic data structure for efficient implementation of symbol table
 
 Binary search tree is a **binary tree** in **symmetric order**
 
 Binary tree
 
  * Either empty
  * Two disjoint binary trees (left & right)
 
Symmetric order

 Each node's key is
 
 * Larger than all keys to its left sub tree
 * Smaller than all keys to its right sub tree
 
Pseudocode
-

get
-
  public Node get(Key key) {
  
   Node x = root;
   
   while(x != null) {
   
    int cmp = x.compareTo(key);
    
    if (cmp < 0 ) x = x.left;
    
    else if (cmp > 0) x = x.right;
    
    else return x;
   
   }
  
  return null;
  }
 
put
-
 public void put(Key key,Value value) {
 
 root = put(root,key,value);
 
 }

  private Node put(Node x, Key key,Value value ) {
  
  
   if(x == null) return new Node(key,value);
   
    int cmp = x.compareTo(key);
    
    if (cmp < 0 ) x.left = put(x.left,key,value);
    
    else if (cmp > 0) x.right = put(x.right,key,value);
    
    else x.value = value;
    
    return x;
   }
  
  return null;
  }
 
Delete
-
deleteMin - goto left most and return null to the parent recursive call.

delete ( O(sqrt(N))

 * No Child - return null
 * One Child - return child
 * Two child - Find Successor(A left most node in right sub tree) of the node , and replace it with the node

Open problem: For random insert,delete the tree height becomes sqrt(N) not log N. Still searching for algorithm simple and efficient.

Bottom line
-
 * Insert/Search involves 1 + depth of tree compares
 * Tree height depends upon the order of insertion
 

Oredered operations in BST
-

* Min / Max - smallest / largest key
* For Rank/select methods - maintain count variable in each node and increment while insertion and decrement while deletion.
* Iteration 
  + In order (left , root, right ) - yields the result in ascending order
  + Pre order ( root ,left, right)
  + Post order ( left, right ,root)
