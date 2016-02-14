package com.coursera.algorithms.projects.percolation;


import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
  
  private int size;
  private boolean[][] grid;
  private boolean isPercolates;
  private int top;
  private int bottom;
  private WeightedQuickUnionUF topDisjointSet;
  private WeightedQuickUnionUF bottomDisjointSet;
  private static int[] xAxis = {0,1,0,-1};
  private static int[] yAxis = {1,0,-1,0};
  
  /**
  * create N-by-N grid, with all sites blocked.
  * @param num size
  */
  public Percolation(int num) {
    if ( num <= 0 ) {
      throw new IllegalArgumentException();
    }
    isPercolates = false;
    size = num;
    top = 0;
    bottom = (size * size) + 1;
    grid = new boolean[size + 1][size + 1];
    topDisjointSet = new WeightedQuickUnionUF(bottom + 1);
    bottomDisjointSet = new WeightedQuickUnionUF(bottom + 1);
    for (int xindex = 1; xindex <= size ;xindex++) {
      for (int yindex = 1; yindex <= size ;yindex++) {
        grid[xindex][yindex] = false;  
      }
    }
  }

  /**
  * open site (row i, column j) if it is not open already.
  * @param xindex x index
  * @param yindex  y index
  */
  public void open(int xindex, int yindex) {
    if (!checkBoundary(xindex,yindex)) {
      throw new IndexOutOfBoundsException();
    }
    if ( grid[xindex][yindex] == false) {
      grid[xindex][yindex] = true;
      int currElement = getIndexinDisjointSet(xindex,yindex);
      for (int neigh = 0 ; neigh < 4; neigh++) {
        int neighX = xindex + xAxis[neigh];
        int neighY = yindex + yAxis[neigh];
        if ( checkBoundary(neighX,neighY) && grid[neighX][neighY] ) {
          int neighElement = getIndexinDisjointSet(neighX,neighY);
          bottomDisjointSet.union(currElement, neighElement);
          topDisjointSet.union(currElement, neighElement);
        }
      }
      
      if (xindex == 1) {
        topDisjointSet.union(currElement, top);
      }
      if (xindex == size) {
        bottomDisjointSet.union(currElement, bottom);
      }
      if (topDisjointSet.connected(currElement, top) 
          && bottomDisjointSet.connected(currElement, bottom)) {
       
        isPercolates = true;
      }
    }
  }

  /**
  * is site (row i, column j) open?.
  * @param xindex x index
  * @param yindex y index
  * @return true if open site
  */
  public boolean isOpen(int xindex, int yindex) {
    if (checkBoundary(xindex,yindex)) {
      return grid[xindex][yindex];
    } else {
      throw new IndexOutOfBoundsException();
    }
  }

  /**
  * is site (row i, column j) full?.
  * @param xindex x index
  * @param yindex y index
  * @return returns true if full
  */
  public boolean isFull(int xindex, int yindex) {

    if (checkBoundary(xindex,yindex) && grid[xindex][yindex]) {
      return topDisjointSet.connected(getIndexinDisjointSet(xindex, yindex), top);
    } else {
      throw new IndexOutOfBoundsException();
    }
  }

  /**
  * does the system percolate?.
  * @return if the grid percolates
  */
  public boolean percolates() {
  
    return isPercolates;
  } 

  /**
  * To check boundary.
  * @param xindex x index
  * @param yindex y index
  * @return true if within grid
  */
  private boolean checkBoundary(int xindex, int yindex) {
   
    return !( xindex <= 0 || xindex > size || yindex <= 0 || yindex > size ); 
  }
  
  /**
  * To get index in disjoint set.
  * @param xindex xindex
  * @param yindex yindex
  * @return index in disjoint set
  */
  private int getIndexinDisjointSet(int xindex, int yindex) {
    return ( ((xindex - 1) * size) + yindex);
   
  }
  
  /**
  * test client (optional).
  * @param args arguments
  */
  public static void main( String[] args ) {

  }
}
