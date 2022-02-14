import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SequentialDigitsKtTest {

    @Test
    fun `Example 1`() {
        assertEquals(
            listOf(123, 234),
            sequentialDigits(100, 300)
        )
    }
    @Test
    fun `Example 2`() {
        assertEquals(
            listOf(1000, 13000),
            sequentialDigits(100, 300)
        )
    }

}