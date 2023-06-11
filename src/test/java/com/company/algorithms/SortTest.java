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
  int arraySize = 100;

  @BeforeEach
  void initArray() {
    arr = new int[arraySize];
//    IntStream.range(0, arr.length).forEach(i -> arr[i] = (int) (Math.random() * arraySize));
    IntStream.range(0, arr.length).forEach(i -> arr[i] = i);
  }

  @Test
  void testBubbleSort() {
    long startTime = System.nanoTime();
    Sort bubbleSort = new BubbleSort();
    bubbleSort.sort(arr);
    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    loggingTakenTime(duration, "Bubble");
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
    loggingTakenTime(duration, "Insertion");
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
    loggingTakenTime(duration, "Selection");
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
    loggingTakenTime(duration, "Shell");
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
    loggingTakenTime(duration, "Shell with Hibbard step");
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
    loggingTakenTime(duration, "Shell with Shell step");
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
    loggingTakenTime(duration, "Shell with Knut step");
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
    loggingTakenTime(duration, "Quick");
    IntStream.range(0, arr.length - 1)
        .mapToObj(i -> arr[i] <= arr[i + 1])
        .forEach(Assertions::assertTrue);
  }

  private void loggingTakenTime(long duration, String sortName) {
    LOGGER.info(
        String.format(
            "Time taken for sorting %d elements using %s Sort: %.3f seconds",
            arraySize, sortName, (duration / 1_000_000_000.0)));
  }
}
