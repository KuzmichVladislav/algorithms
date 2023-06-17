package com.company.algorithms.searching.impl;

import com.company.algorithms.searching.Search;

public class LinearSearchSorted implements Search {

  @Override
  public int search(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++) {
      if (key == arr[i]) {
        return i;
      } else if (key < arr[i]) {
        return -1;
      }
    }
    return -1;
  }
}
