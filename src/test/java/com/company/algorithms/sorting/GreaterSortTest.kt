package com.company.algorithms.sorting

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlin.math.abs

internal class GreaterSortTest {

    private var greaterSort = GreaterSort

    private fun absGreater(value1: Int, value2: Int, ref: Int): Boolean {
        return abs(value1 - ref) > abs(value2 - ref)
    }

    private fun eqGreater(value1: Int, value2: Int, ref: Int): Boolean {
        return ref * value1 * value1 > ref * value2 * value2
    }

    @Test
    fun testAbsBubbleSort() {
        val arr = intArrayOf(9, 1, 8, 2, 7, 3, 6, 4, 5)
        val ref = 5
        greaterSort.greaterBubbleSort(arr, arr.size, ref) { value1, value2 ->
            absGreater(value1, value2, ref)
        }
        Assertions.assertArrayEquals(intArrayOf(5, 6, 4, 7, 3, 8, 2, 9, 1), arr)
    }

    @Test
    fun testEqBubbleSort() {
        val arr = intArrayOf(3, -1, 4, 1, 5, 9, 2, 6)
        val ref = 2
        greaterSort.greaterBubbleSort(arr, arr.size, ref) { value1, value2 ->
            eqGreater(value1, value2, ref)
        }
        Assertions.assertArrayEquals(intArrayOf(-1, 1, 2, 3, 4, 5, 6, 9), arr)
    }
}