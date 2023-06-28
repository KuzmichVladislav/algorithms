package com.company.algorithms.sorting

/**
 * Problem: Find the minimum number of swaps required to bring all
 * elements less than the given value together at the start of the array.
 */
object MinimumSwaps {

    //Time complexity is linear or O(n)
    fun minSwaps(arr: IntArray, k: Int): Int {
        var left = 0
        var right = arr.size - 1
        var swaps = 0
        while (left < right) {
            while (arr[right] > k && left < right) {
                right--
            }
            while (arr[left] <= k && left < right) {
                left++
            }
            if (left < right) {
                arr[right] = arr[left].also { arr[left] = arr[right] }
                swaps++
            }
        }
        return swaps
    }
}