import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MergeKSortedListsKtTest {

    @Test
    fun `Example 1`() {
        assertEquals(
            nodeListOf(1,1,2,3,4,4,5,6),
            mergeKLists(
                arrayOf(
                    nodeListOf(1,4,5),
                    nodeListOf(1,3,4),
                    nodeListOf(2,6)
                )
            )
        )
    }
    @Test
    fun `Example 2`() {
        assertEquals(
            nodeListOf(),
            mergeKLists(emptyArray())
        )
    }
}