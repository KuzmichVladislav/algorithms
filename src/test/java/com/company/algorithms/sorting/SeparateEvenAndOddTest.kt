package com.company.algorithms.sorting

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class SeparateEvenAndOddTest {
    private var separateEvenAndOdd = SeparateEvenAndOdd

    @Test
    fun testSeparateEvenAndOdd() {
        val arr = intArrayOf(9, 1, 8, 2, 7, 3, 6, 4, 5)
        separateEvenAndOdd.separateEvenAndOdd(arr, arr.size)
        Assertions.assertArrayEquals(intArrayOf(8, 2, 6, 4, 5, 3, 7, 1, 9), arr)
    }
}