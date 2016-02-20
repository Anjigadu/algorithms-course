package com.coursera.algorithms.projects.randqueuedeque;

import java.util.Iterator;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Subset {

 
 public static void main(String[] args) {
    int k = Integer.parseInt(args[0]);
    String[] input = StdIn.readAllStrings();
    RandomizedQueue<String> rQueue = new RandomizedQueue<String>();
    for (String i : input) {
        //System.out.println(i);
        rQueue.enqueue(i);
    }
    int i = 0;
    Iterator<String> iterator = rQueue.iterator();
    while (i < k && iterator.hasNext()) {
     StdOut.println(iterator.next());
     i++;
    }
    }

}
