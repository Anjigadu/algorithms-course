Union Find
=

This file contains the notes for lectures of ***Week 1 : Union Find***


Dynamic Connectivity
-

Given a set of N objects,

Union command : connect two objects.

Find command : Is there a path connecting two objects


"Is Connected" is an equivalance relation

* Reflexive
* Symmetric
* Transitive

Connected Components:

  Maximal set of objects that are mutually connected.


Implementation:

  Find is to check whether the two objects are in same  component
  Union is to replace components containing two objects with their union


Quick Find / eager Approach
-

Data structure 

  Integer array id[] of size N
  
  Intrepretation  : p and q are connected iff they have the same id.
  
  Find: O(1)
  
    If id[p] == id[q] then same component not otherwise.
    
  Union: O(n)
  
    find all occurance of id[q] in id[] array and replace with id[p] or vice versa.

  Tree Flat

Quick Union / Lazy approach
-

Data structure:

  Integer array parent[] of size N.
  
  Interpretation: parent[i] is the parent of i.
  
  Root of i is parent[parent[parent...parent[i]...]]]
  
  
  Find : O(n)
  
    Check if p and q have the same root.
    
  Union : O(1) / O(n) including finding roots
  
    To merge  change, parent of root(p) and change it into root(q) or vice versa
  
  Tree  tall.
  
Quick Union Improvements:
-

 Improvement 1 : Weighting
 
 Weighter quick union:
 
  * Modify quick union to avoid tall tree.
  * Keep track of size of each tree (ie number of objects)
  * balance by linking root of smaller tree to root of larger tree
  
  Implementation:

    Data structure. Same as quick union but we need additional size[] to count number
    of objects in the tree
  
  Find: O(Log n)
  
    Same as quick union root(p) == root(q)
  
  Union: O(Log n)
    
    Modify quick union into 
    Link root of smaller tree to larger tree (ie  parent[root(smaller)] = root(larger) )
    update size array.
    
  
  Improvement 2 : Path compression
  
    in root function,
      `while (parent[i]!=i)`
      `parent[i] = parent[parent[i]]`
      `i = parent[i]`
    
    WQU + PC  = M + lg*N
    
Variations of Weighter QU
-

* Union by size - number of objects in tree
* Union by height - height of the tree
* Union by Rank -  ????


Applications
-

* Percolation
* Dynamic Connectivity
* Image processing
* Kruskal min spanning tree
