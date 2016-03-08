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

Each Node has additional color info. about parent link (red / black bit)

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
 
Color Flip
 
 Recolor the parent node to RED from black to avoid having two child links


Insertion

* Insert into tree with exactly one node
  
   If the new node goes to left, then add it to left and mark RED link
  
   If the new node goes to right, then add it to the right; mark as RED link and do left rotate

* Insert into tree with exactly two nodes

   If the new node goes to right(and left has RED link), add it to right; mark it as RED and do color flip (ie mark both links of parent as BLACK and parent 
   link of parent as RED)
   
   If the new node goes to left(and already RED link is in parent),add it to the LEFT, mark it as RED link; Do a right rotate on top node; and color flip
   
   If the new node goes in between, Rotate left on bottom node; then rotate right on top node ; and color flip
   
   
Implementation
-

 * Right child RED, left child Black -> Rotate Left
 * Left Child, left -left grand child red -> Rotate right
 * Both Children are RED -> Flip colors
 

    private Node put(Node h, Key key, Value value) {
      
      if (h == null) return new Node(key,value,RED); // add a new node at bottom with RED link
      int cmp = key.compareTo(h.key);
      if (cmp < 0) h.left = put(h.left,key,value);
      else if (cmp > o) h.right = put(h.right,key,value);
      else h.val = val;
      
      if (isRed(h.right) && !isRed(h.left)) h = rotateLeft(h);
      if (isRed(h.left) && isRed(h.left.left)) h = rotateRight(h);
      if (isRed(h.left) && isRed(h.right)) flipColors(h);
      
      return h;
    }
