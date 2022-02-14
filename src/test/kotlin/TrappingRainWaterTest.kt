import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TrappingRainWaterTest {

    @Test
    fun `Example 1`() {
        assertEquals(
            6,
            trap(intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1))
        )
    }

    @Test
    fun `Example 2`() {
        assertEquals(
            9,
            trap(intArrayOf(4, 2, 0, 3, 2, 5))
        )
    }

    @Test
    fun `zero water`() {
        assertEquals(
            0,
            trap(intArrayOf(1, 2, 3, 2, 1))
        )
    }

    @Test
    fun `single element`() {
        assertEquals(
            0,
            trap(intArrayOf(1000))
        )
    }

    @Test
    fun test() {
        assertEquals(
            10,
            trap(intArrayOf(5,5,4,7,8,2,6,9,4,5))
        )
    }
}