package com.company.algorithms.sorting

/**
 * Problem: Given an array of integers and a range. Write an algorithm to
 * partition the array so that values smaller than the range come to the left,
 * then values under the range follow with values greater than the range.
 */
object RangePartition {

    // Time complexity is linear or O(n).
    fun rangePartition(arr: IntArray, lower: Int, higher: Int) {
        var start = 0
        var end = arr.size - 1
        var i = 0
        while (i <= end) {
            when {
                arr[i] < lower -> {
                    arr[i] = arr[start].also { arr[start] = arr[i] }
                    i++
                    start++
                }
                arr[i] > higher -> {
                    arr[i] = arr[end].also { arr[end] = arr[i] }
                    end--
                }
                else -> {
                    i++
                }
            }
        }
    }
}