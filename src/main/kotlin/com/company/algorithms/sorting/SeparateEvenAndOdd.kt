package com.company.algorithms.sorting

/**
 * Problem: Given an array of even and odd numbers,
 * write a program to separate even numbers from odd numbers.
 */
object SeparateEvenAndOdd {

    // Time complexity is linear or O(n).
    fun separateEvenAndOdd(data: IntArray, size: Int) {
        var left = 0
        var right = size - 1
        val aux = IntArray(size)
        for (i in 0 until size) {
            if (data[i] % 2 == 0) {
                aux[left] = data[i]
                left++
            } else if (data[i] % 2 == 1) {
                aux[right] = data[i]
                right--
            }
        }
        for (i in 0 until size) data[i] = aux[i]
    }
}