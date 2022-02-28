import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SortListKtTest {

    @Test
    fun `Example 1`() {
        assertEquals(
            nodeListOf(1, 2, 3, 4),
            sortList(nodeListOf(4,2,1,3))
        )
    }

    @Test
    fun `empty list`() {
        assertEquals(
            nodeListOf(),
            sortList(nodeListOf())
        )
    }

    @Test
    fun `list with duplicates`() {
        assertEquals(
            nodeListOf(-100, -100, -30, 0, 0, 0, 1, 2, 3, 3),
            sortList(
                nodeListOf(0, 1, 2, -100, -100, 3, 3, -30, 0, 0)
            )
        )
    }

}