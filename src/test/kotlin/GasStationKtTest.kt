import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class GasStationKtTest {

    @Test
    fun `Example 1`() {
        assertEquals(
            3,
            canCompleteCircuit(
                gas = intArrayOf(1, 2, 3, 4, 5),
                cost = intArrayOf(3, 4, 5, 1, 2)
            )
        )
    }

    @Test
    fun `Example 2`() {
        assertEquals(
            -1,
            canCompleteCircuit(
                gas = intArrayOf(2, 3, 4),
                cost = intArrayOf(3, 4, 3)
            )
        )
    }

    @Test
    fun `tiny circle`() {
        assertEquals(
            -1,
            canCompleteCircuit(
                gas = intArrayOf(2),
                cost = intArrayOf(3)
            )
        )
        assertEquals(
            0,
            canCompleteCircuit(
                gas = intArrayOf(3),
                cost = intArrayOf(2)
            )
        )
    }

    fun `large circle`() {

    }
}