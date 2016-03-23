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


For DFS keep a data structure contains ( marked array and edgeTo array )

 * marked array is for whether visited or not
 * edgeTo is used to denote from which vertex the current vertex has been visited
 

Application of DFS
  
   * Flood fill in photo shope using magic wand. ( consider pixels as vertex )



Breadth First Search
-

 * Repeat until the queue is empty
     + Remove vertex v from queue
     + add all the unmarked adjacent vertices of v to queue and mark them as visited

 In the data structure, we are maitaining edgeTo and also dist arrays.
 
 
 DFS - putting unvisited vertices on stack
 BFS - putting unvisited vertices on queue
 
 Shortest path - Find path from s to t with fewest possible number of edges
 
 BFS computes shortest path from source vertex s to all other vertecies in time proportional to E + V
 
Connected Components
-

vertices s & t are connected if there is a path between them

we want to answer in constant time so we couldn't use union find.

So DFS works well

A connected component is a maximal set of connnected vertices


count = 0;

id[];

for ( vertex v in vertices)

 if(v is not visited)
 
 count++;
 id[v] = count;
 dfs (v);



Directed Graphs
-

Direction matters and vertices have in degree and out degree


Problems

 * path
 * shortest path
 * topological sort - can we draw the directed graph so that all edges pointing upwards?
 * strong connectivity - Is there a directed path from u -> v and v->u
 * Page Rank - What is the importance of web page?
 * 

DFS - is same as undirected graph

Applications 
  * Program flow analysis
  * Garbage collecter - mark and sweep algorithm
  

 Reachability
 Path finding
 Topological sort
 Directed cycle detection
 
 
 BFS - is same as undirected graph
 
 For **Multiple source shortest path** problem, put all the source vertices into the queue initially instead of one source vertex. That's it. Do BFS as usual
 
 Applications
 
   * Web crawler  ( BFS with impilicit Graph)
      + Use Queue for sites to be explored
      + USe Set for visited vertices since we don't know earlier the sites
 

Topological Sorting
-

 Given a set of tasks to be completed, in which order the tasks to be completed
 
 It works only on DAG -  (Directed Acyclic Graph)
 
 
  Run DFS on graph
  Whenever a vertex is done put it into a stack ( post order)
  
  return the stack

Strong connected components
-

 
