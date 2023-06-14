package com.company.algorithms.sorting.impl.shell_step.impl;

import com.company.algorithms.sorting.impl.shell_step.StepGenerator;

public class ShellStep implements StepGenerator {

  private int step;

  public ShellStep(int[] arr) {
    step = arr.length >> 1;
  }

  @Override
  public int nextStep() {
    step >>= 1;
    return step;
  }
}
