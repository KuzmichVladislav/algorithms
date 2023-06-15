package com.company.algorithms.sorting;

public interface Sort {

  /**
   * Sorts an array of integers using insertion sort algorithm.
   *
   * @param arr - array of integers to be sorted
   */
  void sort(int[] arr);

  /**
   * Swaps two elements in an array.
   *
   * @param arr the array containing the elements to be swapped
   * @param i the index of the first element to be swapped
   * @param j the index of the second element to be swapped
   */
  default void swap(int[] arr, int i, int j) {
    // Store arr[i] in a temporary variable
    int temp = arr[i];
    // Set arr[i] to arr[j]
    arr[i] = arr[j];
    // Set arr[j] to the temporary variable
    arr[j] = temp;
  }
}
