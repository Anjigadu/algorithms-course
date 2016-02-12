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
    
  Union : O(1)
  
    To merge  change, parent of root(p) and change it into root(q) or vice versa
  
  Tree  tall.
