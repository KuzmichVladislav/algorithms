package com.company.algorithms.sorting

/**
 * Problem: Given an array containing 0s and 1s. Write an algorithm
 * to sort the array so that 0s come first, followed by 1s.
 * Also, find the minimum number of swaps required to sort the array.
 */
object Partition01 {

    /**
     * Time complexity looks like a quadratic (loop inside a loop)
     * but it is linear or O(n). As at each iteration of the inner loop,
     * either the left is increasing or the right is decreasing.
     * Once left is equal or greater than right, the loops stop.
     * Therefore, in total, the inner loops combined run for N number of times.
     */
    fun partition01(arr: IntArray, size: Int): Int {
        var left = 0
        var right = size - 1
        var count = 0
        while (left < right) {
            while (arr[left] == 0) {
                left++
            }
            while (arr[right] == 1) {
                right--
            }
            if (left < right) {
                arr[right] = arr[left].also { arr[left] = arr[right] }
                count++
            }
        }
        return count
    }
}