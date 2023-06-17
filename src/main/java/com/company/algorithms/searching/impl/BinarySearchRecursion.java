package com.company.algorithms.searching.impl;

import com.company.algorithms.searching.Search;

public class BinarySearchRecursion implements Search {

  @Override
  public int search(int[] arr, int key) {
    return binarySearch(arr, key, 0, arr.length - 1);
  }

  private int binarySearch(int[] arr, int key, int low, int high) {
    if (low > high) {
      return -1;
    }

    int mid = (low + high) / 2;
    if (arr[mid] == key) {
      return mid;
    } else if (arr[mid] < key) {
      return binarySearch(arr, key, mid + 1, high);
    } else {
      return binarySearch(arr, key, low, mid - 1);
    }
  }
}
