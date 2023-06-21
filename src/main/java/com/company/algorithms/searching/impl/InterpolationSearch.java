package com.company.algorithms.searching.impl;

import com.company.algorithms.searching.Search;

public class InterpolationSearch implements Search {

  @Override
  public int search(int[] arr, int key) {
    int left = 0;
    int right = arr.length - 1;
    while (arr[left] < key && key < arr[right]) {
      if (arr[left] == arr[right]) {
        break;
      }
      int index = (key - arr[left]) * (left - right) / (arr[left] - arr[right]) + left;
      if (arr[index] > key) {
        right = index - 1;
      } else if (arr[index] < key) {
        left = index + 1;
      } else {
        return index;
      }
    }
    if (arr[left] == key) {
      return left;
    }
    if (arr[right] == key) {
      return right;
    }
    return -1;
  }
}
