package com.company.algorithms.sorting.impl;

import com.company.algorithms.sorting.Sort;

/**
 * This is a SelectionSorting class that implements Sorting interface. It sorts an array of integers
 * using selection sort algorithm.
 */
public class SelectionSort implements Sort {

  /**
   * Sorts an array of integers using selection sort algorithm.
   *
   * @param arr - array of integers to be sorted
   */
  @Override
  public void sort(int[] arr) {
    // Get the length of the array
    int n = arr.length;
    // Loop through the array
    for (int i = 0; i < n - 1; i++) {
      // Find the minimum element in unsorted part of the array
      int minIdx = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[minIdx]) {
          minIdx = j;
        }
      }
      // Swap the found minimum element with the first element
      swap(arr, minIdx, i);
    }
  }
}