package com.company.algorithms.queue;

public class Queue {

  private final int capacity;
  private final int[] queueData;
  int frontIndex = 0;
  int backIndex = 0;
  private int currentSize;

  public Queue(int initialCapacity) {
    currentSize = 0;
    capacity = initialCapacity;
    queueData = new int[initialCapacity];
  }

  public Queue() {
    this(1000);
  }

  public boolean add(int value) {
    if (currentSize >= capacity) {
      System.out.println("Queue is full.");
      return false;
    } else {
      currentSize++;
      queueData[backIndex] = value;
      backIndex = (++backIndex) % capacity;
    }
    return true;
  }

  public int remove() {
    int value;
    if (currentSize <= 0) {
      System.out.println("Queue is empty.");
      return -999;
    } else {
      currentSize--;
      value = queueData[frontIndex];
      frontIndex = (++frontIndex) % capacity;
    }
    return value;
  }

  boolean isEmpty() {
    return currentSize == 0;
  }

  int size() {
    return currentSize;
  }

  void print() {
    if (currentSize == 0) {
      System.out.print("Queue is empty.");
      return;
    }
    int temp = frontIndex;
    int s = currentSize;
    System.out.print("Queue is : ");
    while (s > 0) {
      s--;
      System.out.print(queueData[temp] + " ");
      temp = (++temp) % capacity;
    }
    System.out.println();
  }
}
