package com.company.algorithms.sorting

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class Partition01Test {

    private var partition01 = Partition01

    @Test
    fun testPartition01() {
        val arr = intArrayOf(0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1)
        val result = partition01.partition01(arr, arr.size)
        Assertions.assertArrayEquals(intArrayOf(0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1), arr)
        Assertions.assertEquals(3, result)
    }
}