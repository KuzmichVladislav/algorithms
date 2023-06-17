package com.company.algorithms.searching.impl;

import com.company.algorithms.searching.Search;

public class BinarySearch implements Search {

  @Override
  public int search(int[] arr, int key) {
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
      int middle = (high + low) / 2;
      if (arr[middle] == key) {
        return middle;
      } else if (arr[middle] < key) {
        low = middle + 1;
      } else {
        high = middle - 1;
      }
    }
    return -1;
  }
}
