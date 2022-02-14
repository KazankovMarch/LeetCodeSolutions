import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MedianOfTwoSortedArraysTest {

    @Test
    fun `Example 1`() {
        assertEquals(
            2.0,
            findMedianSortedArrays(intArrayOf(1, 3), intArrayOf(2))
        )
    }
    @Test
    fun `Example 2`() {
        assertEquals(
            2.5,
            findMedianSortedArrays(intArrayOf(1, 2), intArrayOf(3,4))
        )
    }

    @Test
    fun `single element`() {
        assertEquals(
            5.0,
            findMedianSortedArrays(intArrayOf(5), intArrayOf())
        )
        assertEquals(
            2.0,
            findMedianSortedArrays(intArrayOf(), intArrayOf(2))
        )
        assertEquals(
            3.5,
            findMedianSortedArrays(intArrayOf(5), intArrayOf(2))
        )
    }

    @Test
    fun `empty arrays`() {
        assertEquals(
            3.5,
            findMedianSortedArrays(intArrayOf(3,4), intArrayOf())
        )
        assertEquals(
            3.5,
            findMedianSortedArrays(intArrayOf(), intArrayOf(3,4))
        )
    }

    @Test
    fun `negative values`() {
        assertEquals(
            -1.0,
            findMedianSortedArrays(intArrayOf(3), intArrayOf(-2,-1))
        )
    }

}