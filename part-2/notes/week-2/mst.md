Minimum Spanning Tree
=

Given : A connected undirected graph with positive weights

A spannning tree is both Tree (a connected acyclic graph) and also spanning (includes all vertices)


Greedy Algorithm
-

Simplification

  * Assume that Graph is connected
  * and also unique edge weights

Consequence, the MST exists and unique


Cut Property
-
  A cut in a graph is a partition of its vertices into two ( non empty ) sets.
  
  A crossing edge is an edge connects a vertex from one set to another


Given any cut, the minimum weight crossing edge is in the mst


Greedy MST algorithm
-

 * Start with all edges colored Gray
 * Find cut with no black crossing edges; Color its min weight edge as black
 * Repeat until V-1 edges are colored
 
REmoving Assumptions
-

  If the edge weights are not unique, then there can be multiple MST , our greedy algorithm finds one of it.
  
  If the graph is not connected, our greedy algorithm finds Minimum spanning Forest for each connected component.
  
  
