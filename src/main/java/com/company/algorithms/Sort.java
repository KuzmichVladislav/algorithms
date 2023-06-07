package com.company.algorithms;

public interface Sort {

  void sort(int[] arr);

  default void showArray(int[] arr) {
    System.out.println("Array: ");
    for (int j : arr) {
      System.out.print(j + " ");
    }
    System.out.println();
  }
}
