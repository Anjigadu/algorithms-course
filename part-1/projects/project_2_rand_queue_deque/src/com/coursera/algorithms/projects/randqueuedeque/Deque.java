package com.coursera.algorithms.projects.randqueuedeque;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class  Deque<Item> implements Iterable<Item> {



 private class Node<T> {
  private T item;
  private Node<T> next;
  private Node<T> prev;

  Node(T t) {
   this.item = t;
   this.prev = null;
   this.next = null;
  }

 }

 private Node<Item> first;
 private Node<Item> last;

 private int size;

 /**
  * construct an empty deque
  */
 public Deque() {
  first = null;
  last = null;
  size = 0;
 }                         

 /**
  * is the deque empty?
  * @return
  */
 public boolean isEmpty() {
  return (size == 0);
 }                

 /**
  * return the number of items on the deque
  * @return
  */
 public int size() {
  return size;
 }             

 /**
  * add the item to the front
  * @param item
  */
 public void addFirst(Item item) {
  if (item == null)
   throw new NullPointerException();
  Node<Item> oldFirst = first;
  first = new Node<Item>(item);
  first.next = oldFirst;
  if (oldFirst != null)
   oldFirst.prev = first;
  else
   last = first;
  size++;
 }          

 /**
  *  add the item to the end
  * @param item
  */
 public void addLast(Item item) {
  if (item == null)
   throw new NullPointerException();
  Node<Item> oldLast = last;
  last = new Node<Item>(item);
  last.prev = oldLast;
  if (oldLast != null)
   oldLast.next = last;
  else
   first = last;
  size++;
 }      

 /**
  * remove and return the item from the front
  * @return
  */
 public Item removeFirst() {
  if (size == 0)
   throw new NoSuchElementException();
  Item item = first.item;
  first = first.next;
  
  if (first == null)
   last = null;
  else
   first.prev = null;
  size--;
  return item;
 }    

 /**
  * remove and return the item from the end.
  * @return
  */
 public Item removeLast() {
  if (size == 0)
   throw new NoSuchElementException();
  Item item = last.item;
  
  last = last.prev;
  if (last == null)
   first = null;
  else
   last.next = null;
  size--;
  return item;
 }      

 /**
  * return an iterator over items in order from front to end
  */
 public Iterator<Item> iterator() {

  return new DequeIterator();
 }

 private class DequeIterator implements Iterator<Item> {

  private Node<Item> cursor;

  DequeIterator() {
   cursor =  first;
  }

  @Override
  public boolean hasNext() {

   return (cursor != null);
  }

  @Override
  public Item next() {
   if (!hasNext())
    throw new NoSuchElementException();
   Item item = cursor.item;
   cursor = cursor.next;
   return item;
  }

  @Override
  public void remove() {
   throw new UnsupportedOperationException();
  }
 }

 /**
  * unit testing
  * @param args
  */
 public static void main(String[] args) {
    Deque<String> deque = new Deque<String>();
    
    deque.addLast("Hello");
    System.out.println(deque.size());
    deque.removeFirst();
    
   System.out.println(deque.size());
 }   


}
