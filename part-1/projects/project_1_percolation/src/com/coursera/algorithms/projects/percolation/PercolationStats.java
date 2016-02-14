package com.coursera.algorithms.projects.percolation;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

public class PercolationStats {

  
  private double[] thresholds;
  private double mean;
  private double stddev;
  private double confidenceLo;
  private double confidenceHi;
  private double factor;
  
  /**
  * perform T independent experiments on an N-by-N grid.
  * @param size size of grid
  * @param numTest number of times test to perform
  */
  public PercolationStats(int size, int numTest) {

    if (size <= 0 || numTest <= 0) {
      throw new IllegalArgumentException();
    }
    thresholds = new double[numTest];
    double opened = 0;
    double total = size * size;
    for (int test = 0; test < numTest; test++) {
      opened = 0;
      Percolation percolation = new Percolation(size);
      while (!percolation.percolates()) {
        
        int randomX = StdRandom.uniform(1, size + 1);
        int randomY = StdRandom.uniform(1, size + 1);
        if (!percolation.isOpen(randomX, randomY)) {
          opened += 1;
          percolation.open(randomX, randomY); 
        }
        
        
      }
      thresholds[test] = (opened / total);
    }
    mean = StdStats.mean(thresholds);
    stddev = StdStats.stddev(thresholds);
    factor = (1.96 * stddev) / Math.sqrt(numTest);
    confidenceLo = mean - factor;
    confidenceHi = mean + factor;
  } 
  
  /**
  * sample mean of percolation threshold.
  * @return mean value
  */
  public double mean() {
  
    return mean;
  }
  
  /**
  * sample standard deviation of percolation threshold.
  * @return std dev
  */
  public double stddev() {
    return stddev;
  }
  
  /**
  * low  endpoint of 95% confidence interval.
  * @return confidenceLo
  */
  public double confidenceLo() {
   
    return confidenceLo;
  }
   
  /**
   *  high endpoint of 95% confidence interval. 
   * @return confidenHi
   */
  public double confidenceHi()   {
   
    return confidenceHi;
  }

  /**
  * test client (optional).
  * @param args arguments
  */
  public static void main(String[] args) {
    int size = Integer.parseInt(args[0]);
    int numTest = Integer.parseInt(args[1]);
    PercolationStats stats = new PercolationStats(size, numTest);
    StdOut.print("mean                    = " + stats.mean() + "\n");
    StdOut.print("stddev                  = " + stats.stddev() + "\n");
    StdOut.print("95% confidence interval = " 
                 + stats.confidenceLo() + ", " + stats.confidenceHi() + "\n");
  }
}
