package com.company.algorithms.sorting.impl.shell_step.impl;

import com.company.algorithms.sorting.impl.shell_step.StepGenerator;

public class KnutStep implements StepGenerator {

  private int i;

  public KnutStep(int[] arr) {
    for (; Math.pow(3, i) / 2 < arr.length; i++) {
      i++;
    }
  }

  @Override
  public int nextStep() {
    int step = (int) ((Math.pow(3, i) - 1) / 2);
    i--;
    return step;
  }
}
