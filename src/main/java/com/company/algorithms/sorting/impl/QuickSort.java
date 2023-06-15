package com.company.algorithms.sorting.impl;

import com.company.algorithms.sorting.Sort;

/**
 * The QuickSort class implements Sort interface. It sorts an array of integers using Quick sort
 * algorithm.
 */
public class QuickSort implements Sort {

  @Override
  public void sort(int[] arr) {
    // Check if the array is null or empty
    if (arr == null || arr.length == 0) {
      // If so, return
      return;
    }
    // Call the quicksort method with the array and its bounds
    quicksort(arr, 0, arr.length - 1);
  }

  private void quicksort(int[] arr, int left, int right) {
    // Set i to the left bound
    int i = left;
    // Set j to the right bound
    int j = right;
    // Choose a pivot element
    int pivot = arr[left + (right - left) / 2];

    // While i is less than or equal to j
    while (i <= j) {
      // Find an element on the left that should be on the right
      while (arr[i] < pivot) {
        // Increment i
        i++;
      }
      // Find an element on the right that should be on the left
      while (arr[j] > pivot) {
        // Decrement j
        j--;
      }
      // If i is less than or equal to j
      if (i <= j) {
        // Swap the elements at i and j
        swap(arr, i, j);
        // Increment i
        i++;
        // Decrement j
        j--;
      }
    }

    // If there are still elements on the left side of the pivot
    if (left < j) {
      // Recursively call quicksort on that side of the array
      quicksort(arr, left, j);
    }
    // If there are still elements on the right side of the pivot
    if (i < right) {
      // Recursively call quicksort on that side of the array
      quicksort(arr, i, right);
    }
  }
}
