package com.company.algorithms.impl;

import com.company.algorithms.Sort;

public class MergeSort implements Sort {

  @Override
  public void sort(int[] arr) {
    mergeSort(arr, arr.length);
  }

  private void mergeSort(int[] a, int n) {
    // If n is less than 2, then return.
    if (n < 2) {
      return;
    }
    // Calculates mid as n divided by 2.
    int mid = n / 2;
    // Declares an integer array l of size mid.
    int[] l = new int[mid];
    // Declares an integer array r of size n minus mid.
    int[] r = new int[n - mid];
    // Copies the first half of array a into array l.
    System.arraycopy(a, 0, l, 0, mid);
    // Copies the second half of array a into array r.
    if (n - mid >= 0) {
      System.arraycopy(a, mid, r, 0, n - mid);
    }
    // Recursively calls mergeSort on array l with mid as its length.
    mergeSort(l, mid);
    // Recursively calls mergeSort on array r with n minus mid as its length.
    mergeSort(r, n - mid);
    // Calls merge method with parameters a, l, r, mid and n minus mid.
    merge(a, l, r, mid, n - mid);
  }

  private void merge(int[] a, int[] l, int[] r, int left, int right) {
    // Declares three integer variables i, j and k and initializes them to zero.
    int i = 0;
    int j = 0;
    int k = 0;
    // Compares elements of arrays l and r one by one and copies them into array a in ascending
    // order until one of them is exhausted.
    while (i < left && j < right) {
      if (l[i] <= r[j]) {
        a[k++] = l[i++];
      } else {
        a[k++] = r[j++];
      }
    }
    // Copies any remaining elements from array l into array a if there are any.
    while (i < left) {
      a[k++] = l[i++];
    }
    // Copies any remaining elements from array r into array a if there are any.
    while (j < right) {
      a[k++] = r[j++];
    }
  }
}
