package com.company.algorithms.sorting

import kotlin.math.abs

/**
 * Problem: Sort array according to the absolute difference from the given value
 */
object GreaterSort {

    // Time complexity is linear or O(n).
    fun greaterBubbleSort(arr: IntArray, size: Int, ref: Int, comparisonFunction: (Int, Int) -> Boolean) {
        for (i in 0 until size - 1) {
            for (j in 0 until size - i - 1) {
                if (comparisonFunction(arr[j], arr[j + 1])) {
                    arr[j] = arr[j + 1].also { arr[j + 1] = arr[j] }
                }
            }
        }
    }
}
