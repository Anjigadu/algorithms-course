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

sort(Comaprable[] a){
 shuffle(a);
 recur_sort(a,0,a.length-1);
}

recur_sort(Comparable[] a,int lo,int hi){

if( hi <=lo) return;

int j = partition(a,lo,hi);
recur_sort(a,lo,j-1);
recur_sort(a,j+1,hi);

}


Implementation details
-

* Partitioning in place - using auxilary array but it's not worth.
* Terminating the loop - testing wether the pointers crossed or not is tricky
* statying in bounds - the j== lo is redundant but i==hi is not
* preserving randomness - shuffle the array
* equal keys - it's better to stop on keys equal to the partioning item's key

