import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

internal class LinkedListCycle2KtTest {

    @Test
    fun `Example 1`() {
        val head = ListNode(3)
        val cycleBeginNode = ListNode(2)
        head.next = cycleBeginNode
        cycleBeginNode.next = ListNode(0)
        cycleBeginNode.next!!.next = ListNode(-4)
        cycleBeginNode.next!!.next!!.next = cycleBeginNode

        assertEquals(
            cycleBeginNode,
            detectCycle(head)
        )
    }

    @Test
    fun `Example 2`() {
        val head = ListNode(1)
        val tail = ListNode(2)
        head.next = tail
        tail.next = head

        assertEquals(
            head,
            detectCycle(head)
        )
    }

    @Test
    fun `Example 3`() {
        val head = ListNode(1)

        assertNull(detectCycle(head))
    }

}