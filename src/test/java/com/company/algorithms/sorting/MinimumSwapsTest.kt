package com.company.algorithms.sorting

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class MinimumSwapsTest {

    private var minSwaps = MinimumSwaps

    @Test
    fun testMinSwaps() {
        val array = intArrayOf(1, 2, 3, 4, 18, 5, 17, 6, 16, 7, 15, 8, 14, 9, 13, 10, 12, 11)
        val result = minSwaps.minSwaps(array, 10)
        Assertions.assertEquals(3, result)
    }
}