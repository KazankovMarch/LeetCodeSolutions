import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class PermutationsKtTest {

    @Test
    fun `1-2-3-4 permutations`() {
        assertEquals(
            listOf(
                listOf(1,2,3,4),
                listOf(1,2,4,3),
                listOf(1,3,2,4),
                listOf(1,3,4,2),
                listOf(1,4,2,3),
                listOf(1,4,3,2),
                listOf(2,1,3,4),
                listOf(2,1,4,3),
                listOf(2,3,1,4),
                listOf(2,3,4,1),
                listOf(2,4,1,3),
                listOf(2,4,3,1),
                listOf(3,1,2,4),
                listOf(3,1,4,2),
                listOf(3,2,1,4),
                listOf(3,2,4,1),
                listOf(3,4,1,2),
                listOf(3,4,2,1),
                listOf(4,1,2,3),
                listOf(4,1,3,2),
                listOf(4,2,1,3),
                listOf(4,2,3,1),
                listOf(4,3,1,2),
                listOf(4,3,2,1)
            ),
            permute(intArrayOf(2,3,1,4))
        )
    }

    @Test
    fun emptyArray() {
        assertEquals(
            emptyList<List<Int>>(),
            permute(intArrayOf())
        )
    }

    @Test
    fun singleElementArray() {
        assertEquals(
            listOf(
                listOf(42)
            ),
            permute(intArrayOf(42))
        )
    }

    @Test
    fun largeDifferenceBetweenNumbers(){
        assertEquals(
            listOf(
                listOf(-24343434, 63456345),
                listOf(63456345, -24343434)
            ),
            permute(intArrayOf(63456345, -24343434))
        )
    }

}