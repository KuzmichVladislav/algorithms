package com.company.algorithms.sorting

/**
 * Problem: Given an array containing 0s and 1s. Write an algorithm
 * to sort the array so that 0s come first, followed by 1s.
 * Also, find the minimum number of swaps required to sort the array.
 */
object Partition01 {

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
                val temp = arr[left]
                arr[left] = arr[right]
                arr[right] = temp
                count++
            }
        }
        return count
    }
}