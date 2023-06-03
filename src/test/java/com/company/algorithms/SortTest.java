package com.company.algorithms;

import com.company.algorithms.impl.BubbleSorting;
import com.company.algorithms.impl.InsertionSorting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SortTest {

  int[] arr;

  @BeforeEach
  void initArray() {
    arr = new int[100000];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * 100000);
    }
  }

  @Test
  void testBubbleSort() {
    long startTime = System.nanoTime();
    Sorting bubbleSorting = new BubbleSorting();
    bubbleSorting.sort(arr);
    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    System.out.println(
        "Time taken for sorting 100000 elements using Bubble Sort: " + duration + " nanoseconds");
    for (int i = 0; i < arr.length - 1; i++) {
      Assertions.assertTrue(arr[i] <= arr[i + 1]);
    }
  }

  @Test
  void testInsertionSort() {
    long startTime = System.nanoTime();
    Sorting insertionSorting = new InsertionSorting();
    insertionSorting.sort(arr);
    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    System.out.println(
        "Time taken for sorting 100000 elements using Insertion Sort: "
            + duration
            + " nanoseconds");
    for (int i = 0; i < arr.length - 1; i++) {
      Assertions.assertTrue(arr[i] <= arr[i + 1]);
    }
  }
}
