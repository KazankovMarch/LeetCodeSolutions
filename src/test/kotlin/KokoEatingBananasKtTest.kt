import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class KokoEatingBananasKtTest {

    @Test
    fun `Example 1`() {
        assertEquals(
            4,
            minEatingSpeed(intArrayOf(3, 6, 7, 11), 8)
        )
    }

    @Test
    fun `Example 2`() {
        assertEquals(
            30,
            minEatingSpeed(intArrayOf(30, 11, 23, 4, 20), 5)
        )
    }

    @Test
    fun `Example 3`() {
        assertEquals(
            23,
            minEatingSpeed(intArrayOf(30, 11, 23, 4, 20), 6)
        )
    }

    @Test
    fun `large single pile`() {
        assertEquals(
            3,
            minEatingSpeed(intArrayOf(20), 8)
        )
    }

    @Test
    fun `tiny single pile`() {
        assertEquals(
            1,
            minEatingSpeed(intArrayOf(1), 1)
        )
    }

}