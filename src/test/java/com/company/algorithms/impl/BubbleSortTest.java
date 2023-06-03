package com.company.algorithms.impl;

import com.company.algorithms.Sorting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

  @Test
  void testSortRandom() {
    int[] arr = new int[100000];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * 100000);
    }
    long startTime = System.nanoTime();
    Sorting bubbleSorting = new BubbleSorting();
    bubbleSorting.sort(arr);
    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    System.out.println(
        "Time taken for sorting 100 elements using Bubble Sort: " + duration + " nanoseconds");
    for (int i = 0; i < arr.length - 1; i++) {
      Assertions.assertTrue(arr[i] <= arr[i + 1]);
    }
  }
}
