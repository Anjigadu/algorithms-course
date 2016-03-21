Undirected Graph
=


Graph
- 

 Set of vertices connected by pairs of edges
 
 Having thousands of practical applications
 
 Path : Sequence of vertices connected by edges
 
 Cycle : A path whose first and last vertices are same
 
 Two vertices are connected if there is a path between them.
 
 
 Problems?
 
  * Is there a path b/w s and t ?
  * What is the shortest path b/w s & t ?
  * Is there a cycle between s & t?
  * Is there a cycle that uses each edges exactly once (Euler tour)?
  * Is there a cycle that uses each vertices exactly once( Hamilton tour)?
  * Is there a  way to connect all the vertices?
  * MST - BEst way to connect all vertices with minimum edges
  * Bi connectivity -  Is there a edge that removal will disconnect the graph

Depth First Search
-

  Goal - Systematically search the Graph
  
  DFS (vertex v)
  
   mark vertex v as visited
   
   Recusrively visit all unmarked vertices adjacent to v
   

Design Pattern

   Idea is to decouple the Graph data type from graph processing
   
   * Create graph object
   * Pass the graph object to graph processing routine
   * Query the graph processing routine for the information

