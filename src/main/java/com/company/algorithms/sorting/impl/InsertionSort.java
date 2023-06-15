package com.company.algorithms.sorting.impl;

import com.company.algorithms.sorting.Sort;

/**
 * The InsertionSort class implements Sort interface. It sorts an array of integers using
 * Insertion sort algorithm.
 */
public class InsertionSort implements Sort {

  @Override
  public void sort(int[] arr) {
    // Get the length of the array
    int n = arr.length;
    // Loop through the array starting from the second element
    for (int i = 1; i < n; ++i) {
      // Store the current element in a variable
      int key = arr[i];
      // Set j to the index of the previous element
      int j = i - 1;
      // Move elements greater than key to one position ahead of their current position
      System.arraycopy(arr, j, arr, j + 1, i - j);
      // Insert key into its correct position in the sorted array
      arr[j + 1] = key;
    }
  }
}
