package com.company.algorithms.impl;

import com.company.algorithms.Sorting;

/**
 * This is a BubbleSorting class that implements Sorting interface. It sorts an array of integers
 * using bubble sort algorithm.
 */
public class BubbleSorting implements Sorting {

  /**
   * Sorts an array of integers using bubble sort algorithm.
   *
   * @param arr - array of integers to be sorted
   */
  @Override
  public void sort(int[] arr) {
    // Get the length of the array
    int n = arr.length;
    // Declare a temporary variable
    int temp;
    // Loop through the array
    for (int i = 0; i < n; i++) {
      // Loop through the unsorted part of the array
      for (int j = 1; j < (n - i); j++) {
        // Check if adjacent elements are in the wrong order
        if (arr[j - 1] > arr[j]) {
          // Swap adjacent elements that are in the wrong order
          temp = arr[j - 1];
          arr[j - 1] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }
}
