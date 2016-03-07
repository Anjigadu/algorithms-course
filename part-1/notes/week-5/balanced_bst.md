Balanaced Binary Search Tree
=

 * 2-3 trees
 * Left leaning Red Black Trees
 * B-Trees
 

2-3 Trees
-

 Allows 1/2 keys per node
 
 + 2 node - one key , two children
 + 3 node - two keys, three children

    ( less than k1 , between k1 & k2 , greater than k2 )

Every path from root null have same length.


Search

  * Compare with the key
  * And recursively go to children depens on comparision ( < - left , > right , >=<= , middle (if thrree node) )

Insert

  * if the last node is two node, then replace it with three node.
  * If the last node is three node, create a temporaty 4 node and move the middle into parent and create two child nodes recursively.


Splitting 4 node into 3 node is local transformation involves constant number of operations.

Invariants

  Maintains symmetric order and perfect balance.
  
  Tree Height:
  
   Worst Case - all 2 nodes ( Log2N )
   Best case - all 3 nodes ( Log3N )
   
   Just 18 -30 even for billion nodes
   
   Guaranteed Lograthimic performance for search and insert
  
Red-Black BST
-

Left leaning Red Black tree

 
 Equivalent definition
 
  * No Node has two Red links connected to it.
  * Every path from root to null has same number of black links (Perfect Black balance)
  * Red links lean left.
 

Search

 It's identical to BST but having better performance due to the height.
 
 
Left Rotation

 Orient a temporarily right leaning red link to left.
 
 Right Rotation
 
 Orient a left rotating red link temporarily to right link
 
