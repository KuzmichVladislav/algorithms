package com.company.algorithms.sorting

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class Partition012Test {

    private var partition012 = Partition012


    @Test
    fun testPartition012() {
        val arr = intArrayOf(0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1)
        partition012.partition012(arr)
        Assertions.assertArrayEquals(intArrayOf(0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2), arr)
    }

    @Test
    fun testPartition012SecondSolution() {
        val arr = intArrayOf(0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1)
        partition012.partition012SecondSolution(arr)
        Assertions.assertArrayEquals(intArrayOf(0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2), arr)
    }
}