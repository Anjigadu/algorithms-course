Merge Sort
=

Basic plan
-

* divide array into two halves
* recursively sort each half
* merge two halves


Merge function
-

  * put everything in aux array.
  * maintain pointers i start with low , j start with mid +1 in aux array and k in main array
  * compare i & j entries and put them in main array's kth position and increment

Pseudocode
-
 recursive_sort (Comparable[] arr,Comparable[] aux, int lo, int hi)
   
   if ( hi <= lo) return
   
   int mid = lo + (hi-lo)/2; // to avoid integer overflow
   
   sort (a,aux,lo,mid);
   
   sort(a,aux,mid+1,hi);
   
   merge(a,aux,lo,mid,hi);
 
 sort(Comparable[] a)
   
    aux = new Comparable[a.length]; // Important not to create in recursive method call.
    
    sort(a,aux,0,a.length-1);
