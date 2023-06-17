package com.company.algorithms.searching;

/** The interface Search provides a method for searching an element in an array. */
public interface Search {

  /**
   * This method searches for an element in an array.
   *
   * @param arr The array to search.
   * @param key The element to search for.
   * @return The index of the element if found, -1 otherwise.
   */
  int search(int[] arr, int key);
}
