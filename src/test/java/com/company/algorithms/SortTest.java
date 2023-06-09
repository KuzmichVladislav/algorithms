package com.company.algorithms;

import com.company.algorithms.impl.*;
import com.company.algorithms.impl.shell_step.impl.HibbardStep;
import com.company.algorithms.impl.shell_step.impl.KnutStep;
import com.company.algorithms.impl.shell_step.impl.ShellStep;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.IntStream;

class SortTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(SortTest.class);

  int[] arr;

  @BeforeEach
  void initArray() {
    arr = new int[1000000];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * 1000000);
    }
  }

  @Test
  void testBubbleSort() {
    long startTime = System.nanoTime();
    Sort bubbleSort = new BubbleSort();
    bubbleSort.sort(arr);
    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    LOGGER.info(
        "Time taken for sorting 100000 elements using Bubble Sort: "
            + String.format("%.3f", duration / 1_000_000_000.0)
            + " seconds");
    IntStream.range(0, arr.length - 1)
        .mapToObj(i -> arr[i] <= arr[i + 1])
        .forEach(Assertions::assertTrue);
  }

  @Test
  void testInsertionSort() {
    long startTime = System.nanoTime();
    Sort insertionSort = new InsertionSort();
    insertionSort.sort(arr);
    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    LOGGER.info(
        "Time taken for sorting 100000 elements using Insertion Sort: "
            + String.format("%.3f", duration / 1_000_000_000.0)
            + " seconds");
    IntStream.range(0, arr.length - 1)
        .mapToObj(i -> arr[i] <= arr[i + 1])
        .forEach(Assertions::assertTrue);
  }

  @Test
  void testSelectionSort() {
    long startTime = System.nanoTime();
    Sort selectionSort = new SelectionSort();
    selectionSort.sort(arr);
    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    LOGGER.info(
        "Time taken for sorting 100000 elements using Selection Sort: "
            + String.format("%.3f", duration / 1_000_000_000.0)
            + " seconds");
    IntStream.range(0, arr.length - 1)
        .mapToObj(i -> arr[i] <= arr[i + 1])
        .forEach(Assertions::assertTrue);
  }

  @Test
  void testShellSort() {
    long startTime = System.nanoTime();
    Sort shellSort = new ShellSort();
    shellSort.sort(arr);
    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    LOGGER.info(
        "Time taken for sorting 100000 elements using Shel Sort: "
            + String.format("%.3f", duration / 1_000_000_000.0)
            + " seconds");
    IntStream.range(0, arr.length - 1)
        .mapToObj(i -> arr[i] <= arr[i + 1])
        .forEach(Assertions::assertTrue);
  }

  @Test
  void testShellSortWithHibbardStep() {
    long startTime = System.nanoTime();
    ShellSort shellSort = new ShellSort();
    shellSort.modifiedSort(arr, new HibbardStep(arr));
    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    LOGGER.info(
        "Time taken for sorting 100000 elements using Shell Sort With Hibbard Step: "
            + String.format("%.3f", duration / 1_000_000_000.0)
            + " seconds");
    IntStream.range(0, arr.length - 1)
        .mapToObj(i -> arr[i] <= arr[i + 1])
        .forEach(Assertions::assertTrue);
  }

  @Test
  void testShellSortWithShellStep() {
    long startTime = System.nanoTime();
    ShellSort shellSort = new ShellSort();
    shellSort.modifiedSort(arr, new ShellStep(arr));
    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    LOGGER.info(
        "Time taken for sorting 100000 elements using Shell Sort With Shell Step: "
            + String.format("%.3f", duration / 1_000_000_000.0)
            + " seconds");
    IntStream.range(0, arr.length - 1)
        .mapToObj(i -> arr[i] <= arr[i + 1])
        .forEach(Assertions::assertTrue);
  }

  @Test
  void testShellSortWithKnutStep() {
    long startTime = System.nanoTime();
    ShellSort shellSort = new ShellSort();
    shellSort.modifiedSort(arr, new KnutStep(arr));
    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    LOGGER.info(
        "Time taken for sorting 100000 elements using Shell Sort With Knut Step: "
            + String.format("%.3f", duration / 1_000_000_000.0)
            + " seconds");
    IntStream.range(0, arr.length - 1)
        .mapToObj(i -> arr[i] <= arr[i + 1])
        .forEach(Assertions::assertTrue);
  }

  @Test
  void testQuickSort() {
    long startTime = System.nanoTime();
    Sort quickSort = new QuickSort();
    quickSort.sort(arr);
    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    LOGGER.info(
        "Time taken for sorting 100000 elements using Quick Sort: "
            + String.format("%.3f", duration / 1_000_000_000.0)
            + " seconds");
    IntStream.range(0, arr.length - 1)
        .mapToObj(i -> arr[i] <= arr[i + 1])
        .forEach(Assertions::assertTrue);
  }
}
