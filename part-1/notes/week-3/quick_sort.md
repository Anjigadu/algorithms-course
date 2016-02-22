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


Best case - O(NlogN)
Worst case - O(N^2)
Average case - compares ~ 2NlnN = 1.39NlgN & exch ~1/3NlnN

practical improvements
-

* use insertion sort for N=10
* best choice of pivot is median - use median of 3 (of random items)
* 

Conclusion

Quick sort,

 * In place sorting
 * Not stable
 
Selection
-

Given N items, find the kth largest
Ex: min(k=0), max(k=N), median(k= N/2)

Applications

* order statistics
* find the top k


Using theory

* sort using NlogN and find

Quick Select
-


In partition,

  + **a[j] is in its place**
  + no larger entry to the left of j
  + no smaller entry to the right of j
  
Repeat in one sub array depending upon j and if j==k then return a[j]

pseudocode
-

 select(Comparable[] a,int k){
  
 shuffle(a);
   
   int lo = 0 , hi = length -1;
 
   while (hi > lo) {
   
    int j = partition(a,lo,hi);
	
	if ( j < k) lo = j+1;
	
	else if (j > k) hi = j-1;
	
	else return a[k];   
   
   }
   
	return a[k];
 }
 
 
 Quick select uses linear time in average

 
 
 Duplicates
 -
 
 * group a column and filter
 * finding collinear points
 * filter emails based on sender
 
 3-way partitioning
 
 Goal : Partition the array into three parts so that
 
  * Entries between lt & gt equal to parition item v
  * No larger elements to the left of lt
  * No smaller elements to the right of gt
  
  
 Pseudocode
 -
 
 * Let v be the partitioning item a[lo]
 * scan i from left to right (until i crosses gt)
	+ (a[i] < v ) : exch a[lt] with a[i] & increment i,lt
	+ (a[i] > v) : exch a[gt] with a[i] & increment gt
	+ (a[i] == v) : increment i
	

sort(Comparable[] a,int lo,int hi){

 if (hi<=lo) return;
 lt = lo;
 gt = hi -1;
 v = a[lo];
 i = lo;
 while ( i <=gt) {
 
	if (a[i] < v) then exch(a,lt++,i++);
	else if (a[i] > v) then exch(a,gt++,i);
	else then i++;
	
 }
 // lt -> gt contains equal elements so we can skip them for next sorting
 sort(a,lo,lt-1);
 sort(a,gt+1,hi);

}

	

 Quick sort - 3 way partition is entrophy optimal
 
 
 Bottom line : Randomized quick sort with 3 way partitioning will be lineararithmetic to linear for practical applications.


Tukey's ninther: 

* Median of median of three samples, each of three entries instead of shuffling.
* approximates the median of 9
* Uses at most 12 compares

Better than shuffling because of less costs and no movement of data



