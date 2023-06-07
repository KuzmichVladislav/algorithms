package com.company.algorithms.impl;

import com.company.algorithms.Sort;

public class ShellSort implements Sort {

  @Override
  public void sort(int[] arr) {
    // get the length of the array
    int n = arr.length;
    // iterate over gaps between elements in the array
    for (int gap = n / 2; gap > 0; gap /= 2) {
      // iterate over each element in the array
      for (int i = gap; i < n; i++) {
        // store the current element in a temporary variable
        int temp = arr[i];
        int j;
        // compare each element with its neighbor and swap them if they are out of order
        for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
          arr[j] = arr[j - gap];
        }
        // assign the temporary variable to its correct position in the sorted array
        arr[j] = temp;
      }
    }
  }
}
