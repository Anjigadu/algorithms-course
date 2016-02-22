Quick Sort
=

One of the top 10 algorithms of 20th century.


Basic plan
-

* Shuffle the array
* partition so that, for some j
  + a[j] is in its place
  + no larger entry to the left of j
  + no smaller entry to the right of j
* sort each piece recursively


Partition
-

phase1

* Repeat until i and j cross each other.
* scan i from left to right as long as a[i] < a[lo]
* scan j from right to left as long as a[j] > a[lo]
* Exchange a[i] , a[j]

phase 2

* when pointers crossed exch a[lo] with a[j]


Pseudocode
-

parition(Comparable[] a,int lo,int hi)

 i = lo

 j = hi + 1

 while(true){

  while( a[++i] < a[lo] )

   if (i==hi) break;

  while (a[--j] > a[lo])

    if (j == lo) break;

   if( i >=j) break; // break the loop when pointers crossed

   exch(a[i],a[j]);
   
 }
 
 exch(a[j],a[lo])
 
 return j;
