package com.company.algorithms.searching.impl;

import com.company.algorithms.searching.Search;

public class TernarySearch implements Search {

  @Override
  public int search(int[] arr, int key) {
    int r = arr.length - 1;
    int l = 0;
    while (l <= r) {
      int h = (r - l) / 3;
      int m1 = l + h;
      int m2 = r - h;

      if (arr[m1] == key) {
        return m1;
      }
      if (arr[m2] == key) {
        return m2;
      }
      if (arr[m1] < key && key < arr[m2]) {
        l = m1 + 1;
        r = m2 - 1;
      } else if (key < arr[m1]) {
        r = m1 - 1;
      } else {
        l = m2 + 1;
      }
    }
    return -1;
  }
}
