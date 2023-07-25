package com.company.algorithms.stack;

import java.util.Arrays;

public class Stack<E> {

  public static final String STACK_EMPTY_EXCEPTION = "StackEmptyException";
  public static final String STACK_OVERFLOW_EXCEPTION = "StackOverflowException";
  private final int minimumCapacity;
  private int currentCapacity;
  private E[] stackData;
  private int topIndex = -1;

  public Stack() {
    this(1000);
  }

  public Stack(int initialCapacity) {
    stackData = (E[]) new Object[initialCapacity];
    currentCapacity = initialCapacity;
    minimumCapacity = initialCapacity;
  }

  public int size() {
    return topIndex + 1;
  }

  public boolean isEmpty() {
    return (topIndex == -1);
  }

  public void push(E value) throws IllegalStateException {
    if (topIndex + 1 == currentCapacity) {
      throw new IllegalStateException(STACK_OVERFLOW_EXCEPTION);
    }
    topIndex++;
    stackData[topIndex] = value;
  }

  public E top() throws IllegalStateException {
    if (isEmpty()) {
      throw new IllegalStateException(STACK_EMPTY_EXCEPTION);
    }
    return stackData[topIndex];
  }

  public E pop() {
    if (isEmpty()) {
      throw new IllegalStateException(STACK_EMPTY_EXCEPTION);
    }
    E topValue = stackData[topIndex];
    topIndex--;
    return topValue;
  }

  public void print() {
    for (int i = topIndex; i >= 0; i--) {
      System.out.print(stackData[i] + " ");
    }
    System.out.println();
  }

  public void push2(E value) {
    if (topIndex + 1 == currentCapacity) {
      System.out.println("size doubled");
      stackData = Arrays.copyOf(stackData, currentCapacity * 2);
      currentCapacity = currentCapacity * 2;
    }
    topIndex++;
    stackData[topIndex] = value;
  }

  public E pop2() {
    if (isEmpty()) {
      throw new IllegalStateException(STACK_EMPTY_EXCEPTION);
    }

    E topValue = stackData[topIndex];
    topIndex--;

    if (topIndex + 1 < (currentCapacity >> 1) && currentCapacity > minimumCapacity) {
      System.out.println("size halved top ");
      currentCapacity = currentCapacity >> 1;
      stackData = Arrays.copyOf(stackData, currentCapacity);
    }
    return topValue;
  }

  public void clear() {
    for (int i = 0; i <= topIndex; i++) {
      stackData[i] = null;
    }
    topIndex = -1;
  }
}
