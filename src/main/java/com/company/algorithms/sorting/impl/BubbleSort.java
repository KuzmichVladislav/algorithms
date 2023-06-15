package com.company.algorithms.sorting.impl;

import com.company.algorithms.sorting.Sort;

/**
 * The BubbleSorting class implements Sort interface. It sorts an array of integers using Bubble
 * sort algorithm.
 */
public class BubbleSort implements Sort {

  @Override
  public void sort(int[] arr) {
    // Get the length of the array
    int n = arr.length;
    // Loop through the array
    for (int i = 0; i < n; i++) {
      // Loop through the unsorted part of the array
      for (int j = 1; j < (n - i); j++) {
        // Check if adjacent elements are in the wrong order
        if (arr[j - 1] > arr[j]) {
          // Swap adjacent elements that are in the wrong order
          swap(arr, j - 1, j);
        }
      }
    }
  }
}
