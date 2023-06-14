package com.company.algorithms.sorting;

public interface Sort {

  void sort(int[] arr);

  default void showArray(int[] arr) {
    System.out.println("Array: ");
    for (int j : arr) {
      System.out.print(j + " ");
    }
    System.out.println();
  }

  default void swap(int[] arr, int i, int j) {
    // Store arr[i] in a temporary variable
    int temp = arr[i];
    // Set arr[i] to arr[j]
    arr[i] = arr[j];
    // Set arr[j] to the temporary variable
    arr[j] = temp;
  }
}
