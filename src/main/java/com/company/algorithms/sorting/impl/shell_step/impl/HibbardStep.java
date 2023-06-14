package com.company.algorithms.sorting.impl.shell_step.impl;

import com.company.algorithms.sorting.impl.shell_step.StepGenerator;

public class HibbardStep implements StepGenerator {

  private int i;

  public HibbardStep(int[] arr) {
    for (; Math.pow(2, i) - 1 < arr.length; i++) {
      i++;
    }
  }

  @Override
  public int nextStep() {
    return (int) (Math.pow(2, --i) - 1);
  }
}
