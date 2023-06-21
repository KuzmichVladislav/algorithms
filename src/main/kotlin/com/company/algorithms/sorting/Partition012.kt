package com.company.algorithms.sorting

/**
 * Given an array containing 0s, 1s and 2s. Write an algorithm to sort
 * the array so that 0s come first, followed by 1s and then 2s in the end.
 */
object Partition012 {

    fun partition012(arr: IntArray) {
        val counts = IntArray(3)
        for (i in arr.indices) {
            counts[arr[i]]++
        }
        var index = 0
        for (i in 0 until counts[0]) {
            arr[index++] = 0
        }
        for (i in 0 until counts[1]) {
            arr[index++] = 1
        }
        for (i in 0 until counts[2]) {
            arr[index++] = 2
        }
    }

    fun partition012SecondSolution(arr: IntArray) {
        var left = 0
        var right = arr.size - 1
        var i = 0
        while (i <= right) {
            when {
                arr[i] == 0 -> {
                    arr[i] = arr[left].also { arr[left] = arr[i] }
                    i++
                    left++
                }
                arr[i] == 2 -> {
                    arr[i] = arr[right].also { arr[right] = arr[i] }
                    right--
                }
                else -> i++
            }
        }
    }
}