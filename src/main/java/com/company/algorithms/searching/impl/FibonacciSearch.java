package com.company.algorithms.searching.impl;

import com.company.algorithms.searching.Search;

public class FibonacciSearch implements Search {

  @Override
  public int search(int[] arr, int key) {
    // (m-2)'th Fibonacci Number
    int fib2 = 0;
    // (m-1)'th Fibonacci Number
    int fib1 = 1;
    // m'th Fibonacci Number
    int fib = fib2 + fib1;
    int n = arr.length;
    while (fib < n) {
      fib2 = fib1;
      fib1 = fib;
      fib = fib2 + fib1;
    }
    int offset = -1;
    while (fib > 1) {
      int i = Math.min(offset + fib2, n - 1);
      if (arr[i] < key) {
        fib = fib1;
        fib1 = fib2;
        fib2 = fib - fib1;
        offset = i;
      } else if (arr[i] > key) {
        fib = fib2;
        fib1 -= fib2;
        fib2 = fib - fib1;
      } else {
        return i;
      }
    }
    if (fib1 == 1 && arr[offset + 1] == key) {
      return offset + 1;
    }
    return -1;
  }
}
