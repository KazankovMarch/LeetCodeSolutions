import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class _4Sum2KtTest {

    @Test
    fun `Example 1`() {
        assertEquals(
            2,
            fourSumCount(
                intArrayOf(1, 2),
                intArrayOf(-2, -1),
                intArrayOf(-1, 2),
                intArrayOf(0, 2),
            )
        )
    }
    @Test
    fun `Example 2`() {
        assertEquals(
            1,
            fourSumCount(
                intArrayOf(0),
                intArrayOf(0),
                intArrayOf(0),
                intArrayOf(0),
            )
        )
    }

}