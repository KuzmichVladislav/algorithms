package com.company.algorithms.sorting

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class RangePartitionTest {

    private var rangePartition = RangePartition

    @Test
    fun testRangePartition() {
        val arr = intArrayOf(
            1, 2, 3, 4, 18, 5, 17, 6, 16, 7, 15, 8, 14, 9, 13, 10, 12,
            11
        )
        rangePartition.rangePartition(arr, 9, 12)
        Assertions.assertArrayEquals(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 9, 11, 14, 13, 15, 16, 17, 18), arr)
    }
}