package com.company.algorithms;

public interface Sorting {

  void sort(int[] arr);

  default void showArray(int[] arr) {
    System.out.println("Array: ");
    for (int j : arr) {
      System.out.print(j + " ");
    }
  }
}
