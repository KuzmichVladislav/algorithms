package com.company.algorithms.searching.impl;

import com.company.algorithms.searching.Search;

import java.util.stream.IntStream;

public class LinearSearchUnsorted implements Search {

  @Override
  public int search(int[] arr, int key) {
    return IntStream.range(0, arr.length).filter(i -> arr[i] == key).findFirst().orElse(-1);
  }
}
