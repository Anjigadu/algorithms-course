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


Quick Find
-
