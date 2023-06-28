package com.company.algorithms.searching;

import com.company.algorithms.searching.impl.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

class SearchTest {

  int[] testArr = {
    28, 49, 83, 84, 69, 78, 38, 84, 18, 21, 71, 30, 33, 31, 6, 98, 12, 14, 74, 68, 80, 41, 15, 45,
    49, 90, 86, 16, 44, 89, 17, 13, 1, 28, 23, 79, 67, 75, 66, 85, 35, 81, 84, 52, 86, 84, 46, 27,
    87, 62, 61, 48, 0, 95, 84, 41, 70, 79, 75, 90, 29, 8, 35, 26, 43, 79, 31, 4, 9, 18, 26, 11, 6,
    65, 90, 19, 6, 52, 6, 60, 5, 95, 29, 61, 35, 64, 42, 73, 51, 81, 27, 83, 21, 28, 52, 6, 95, 52,
    82, 86
  };
  int[] arr;

  @BeforeEach
  void initArray() {
    arr = new int[100];
    IntStream.range(0, arr.length).forEach(i -> arr[i] = testArr[i]);
  }

  @Test
  void testLinearSearchUnsorted() {
    Search linearSearchUnsorted = new LinearSearchUnsorted();
    int result = linearSearchUnsorted.search(arr, 0);
    Assertions.assertEquals(52, result);
  }

  @Test
  void testLinearSearchSorted() {
    Search linearSearchSorted = new LinearSearchSorted();
    Arrays.sort(arr);
    int result = linearSearchSorted.search(arr, 43);
    Assertions.assertEquals(44, result);
  }

  @Test
  void testBinarySearch() {
    Search binarySearch = new BinarySearch();
    Arrays.sort(arr);
    int result = binarySearch.search(arr, 43);
    Assertions.assertEquals(44, result);
  }

  @Test
  void testBinarySearchRecursion() {
    Search binarySearchRecursion = new BinarySearchRecursion();
    Arrays.sort(arr);
    int result = binarySearchRecursion.search(arr, 43);
    Assertions.assertEquals(44, result);
  }

  @Test
  void testFibonacciSearch() {
    Search fibonacciSearch = new FibonacciSearch();
    Arrays.sort(arr);
    int result = fibonacciSearch.search(arr, 43);
    Assertions.assertEquals(44, result);
  }

  @Test
  void testInterpolationSearch() {
    Search interpolationSearch = new InterpolationSearch();
    Arrays.sort(arr);
    int result = interpolationSearch.search(arr, 43);
    Assertions.assertEquals(44, result);
  }

  @Test
  void testTernarySearch() {
    Search ternarySearch = new TernarySearch();
    Arrays.sort(arr);
    int result = ternarySearch.search(arr, 43);
    Assertions.assertEquals(44, result);
  }
}
