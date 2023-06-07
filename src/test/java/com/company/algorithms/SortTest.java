package com.company.algorithms;

import com.company.algorithms.impl.BubbleSort;
import com.company.algorithms.impl.InsertionSort;
import com.company.algorithms.impl.SelectionSort;
import com.company.algorithms.impl.ShellSort;
import com.company.algorithms.impl.shell_step.impl.HibbardStep;
import com.company.algorithms.impl.shell_step.impl.KnutStep;
import com.company.algorithms.impl.shell_step.impl.ShellStep;
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
    Sort bubbleSort = new BubbleSort();
    bubbleSort.sort(arr);
    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    System.out.println(
        "Time taken for sorting 100000 elements using Bubble Sort: "
            + String.format("%.3f", duration / 1_000_000_000.0)
            + " seconds");
    for (int i = 0; i < arr.length - 1; i++) {
      Assertions.assertTrue(arr[i] <= arr[i + 1]);
    }
  }

  @Test
  void testInsertionSort() {
    long startTime = System.nanoTime();
    Sort insertionSort = new InsertionSort();
    insertionSort.sort(arr);
    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    System.out.println(
        "Time taken for sorting 100000 elements using Insertion Sort: "
            + String.format("%.3f", duration / 1_000_000_000.0)
            + " seconds");
    for (int i = 0; i < arr.length - 1; i++) {
      Assertions.assertTrue(arr[i] <= arr[i + 1]);
    }
  }

  @Test
  void testSelectionSort() {
    long startTime = System.nanoTime();
    Sort selectionSort = new SelectionSort();
    selectionSort.sort(arr);
    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    System.out.println(
        "Time taken for sorting 100000 elements using Selection Sort: "
            + String.format("%.3f", duration / 1_000_000_000.0)
            + " seconds");
    for (int i = 0; i < arr.length - 1; i++) {
      Assertions.assertTrue(arr[i] <= arr[i + 1]);
    }
  }

  @Test
  void testShellSort() {
    long startTime = System.nanoTime();
    Sort shellSort = new ShellSort();
    shellSort.sort(arr);
    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    System.out.println(
        "Time taken for sorting 100000 elements using Shel Sort: "
            + String.format("%.3f", duration / 1_000_000_000.0)
            + " seconds");
    for (int i = 0; i < arr.length - 1; i++) {
      Assertions.assertTrue(arr[i] <= arr[i + 1]);
    }
  }

  @Test
  void testShellSortWithHibbardStep() {
    long startTime = System.nanoTime();
    ShellSort shellSort = new ShellSort();
    shellSort.modifiedSort(arr, new HibbardStep(arr));
    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    System.out.println(
        "Time taken for sorting 100000 elements using Shell Sort With Hibbard Step: "
            + String.format("%.3f", duration / 1_000_000_000.0)
            + " seconds");
    for (int i = 0; i < arr.length - 1; i++) {
      Assertions.assertTrue(arr[i] <= arr[i + 1]);
    }
  }

  @Test
  void testShellSortWithShellStep() {
    long startTime = System.nanoTime();
    ShellSort shellSort = new ShellSort();
    shellSort.modifiedSort(arr, new ShellStep(arr));
    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    System.out.println(
        "Time taken for sorting 100000 elements using Shell Sort With Shell Step: "
            + String.format("%.3f", duration / 1_000_000_000.0)
            + " seconds");
    for (int i = 0; i < arr.length - 1; i++) {
      Assertions.assertTrue(arr[i] <= arr[i + 1]);
    }
  }

  @Test
  void testShellSortWithKnutStep() {
    long startTime = System.nanoTime();
    ShellSort shellSort = new ShellSort();
    shellSort.modifiedSort(arr, new KnutStep(arr));
    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    System.out.println(
        "Time taken for sorting 100000 elements using Shell Sort With Knut Step: "
            + String.format("%.3f", duration / 1_000_000_000.0)
            + " seconds");
    for (int i = 0; i < arr.length - 1; i++) {
      Assertions.assertTrue(arr[i] <= arr[i + 1]);
    }
  }
}
