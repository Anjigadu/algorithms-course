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

Proposition
-

* compares NlgN
* array access 6NlgN


Practical improvements
-

* Use insertion sort for small arrays. ( N=7)
* Stop merging if last element of left array is lesser than first element of right array.
* Switch the role of aux and input array

Stability
-

* First sort by name, then sort by section.
* Second sort preserves the sorting result of first sort
* equal items never pass each other.
* do not use less than or equal to instead of lesss than

Insertion & merge sort are stable sorts.

Bottom up Merge Sort
=

Basic plan
-

* Pass through array merging sub arrays of size 1
* Repeat the steps for sub arrays of size 2,4,8,16...

Bottomline - no recursion needed

Pseudocode
-
 Sort(Comparable[] a)
  N = a.length
  aux = Comparable[N];
  for (int sz = 1; sz<N;sz = sz+sz)
    for(int lo = 0; lo < N-sz ; lo += sz+sz) 
     merge(a,lo,lo+sz-1,Math.min(lo+sz+sz-1,N-1));

