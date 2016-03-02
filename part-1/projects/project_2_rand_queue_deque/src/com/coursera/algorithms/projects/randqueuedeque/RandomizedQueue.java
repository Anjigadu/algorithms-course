package com.coursera.algorithms.projects.randqueuedeque;

import java.util.Iterator;
import java.util.NoSuchElementException;

import edu.princeton.cs.algs4.StdRandom;


public class RandomizedQueue<Item> implements Iterable<Item> {

 private Item[] items = null;
 private int capacity;
 private int head; // exactly where to remove (first non null element)
 private int tail; // exactly where to put (ie, last element pos +1)
 private int size;
 /**
  * construct an empty randomized queue
  */
 public RandomizedQueue() {
  capacity = 2;
  items = (Item[]) new Object[capacity];
  head = 0;
  tail = 0;
  size = 0;
 }

 /**
  * // is the queue empty?
  * @return
  */
 public boolean isEmpty() {
  return (size == 0);
 }                 

 /**
  * // return the number of items on the queue
  * @return
  */
 public int size() {
  return size;
 }

 /**
  *   // add the item
  * @param item
  */
 public void enqueue(Item item) {
  if (item == null)
   throw new NullPointerException();    
  if (tail == capacity)
   resize(capacity*2);
  items[tail++] = item;
  size++;
 }

 /**
  * // remove and return a random item
  * @return
  */
 public Item dequeue() {
  if (size == 0)
   throw new NoSuchElementException();
  if (size*4 == capacity)
   resize(capacity/2);
  int randIndex = StdRandom.uniform(head, tail);
  Item item = items[randIndex];
  items[randIndex] = items[head++];
  items[head-1] = null;
  size--;
  return item;
 }                    


 /**
  * return (but do not remove) a random item
  * @return
  */
 public Item sample() {
  if (size() == 0)
   throw new NoSuchElementException();
  Item item = items[StdRandom.uniform(head, tail)];
  return item;
 }


 /**
  * return an independent iterator over items in random order
  */
 public Iterator<Item> iterator() {
  return new RQueueIterator();
 }

 private void resize(int newCapacity) {
  Item[] newArray = (Item[]) new Object[newCapacity];
  int k = 0;
  for (int i = head; i < tail; i++) {
   if (items[i] != null)
    newArray[k++] = items[i]; 
  }
  head = 0;
  capacity = newCapacity;
  items = newArray;
  tail = size;
 }

 private class RQueueIterator implements Iterator<Item> {

  private Item[] iterArray = null;
  private int cursor;
  private int max;
  RQueueIterator() {
   cursor = 0;
   if (size() > 0) {
    iterArray = (Item[]) new Object[size()];
    int k = 0;
    for (int i = head; i < tail; i++) {
     if (items[i] != null)
      iterArray[k++] = items[i]; 
    }
    StdRandom.shuffle(iterArray);
    max = k;
   }
  }

  @Override
  public boolean hasNext() {

   return (cursor < max);
  }

  @Override
  public Item next() {
   if (!hasNext())
    throw new NoSuchElementException();
   return iterArray[cursor++];
  }

  @Override
  public void remove() {
   throw new UnsupportedOperationException();
  }
 }
 /**
  *  unit testing
  * @param args
  */
 public static void main(String[] args) {
  RandomizedQueue<Integer> rQueue = new RandomizedQueue<>();
  rQueue.enqueue(1);
  rQueue.enqueue(2);
  rQueue.enqueue(3);
  rQueue.enqueue(4);
  rQueue.enqueue(5);
  System.out.println("size" + rQueue.size());
  for (int i : rQueue) {
   System.out.println(i);
  }
  rQueue.sample();
  rQueue.sample();
  rQueue.sample();
  rQueue.dequeue();
  System.out.println("size" + rQueue.size());
  System.out.println("capacity" + rQueue.capacity);
  for (int i : rQueue) {
   System.out.println(i);
  }

  rQueue.dequeue();
  rQueue.dequeue();
  rQueue.sample();
  rQueue.dequeue();
  rQueue.sample();
  rQueue.dequeue();
  

 }
}