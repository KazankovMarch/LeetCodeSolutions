class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        return "ListNode(`val`=$`val`, next=$next)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ListNode) return false

        if (`val` != other.`val`) return false

        return true
    }

    override fun hashCode(): Int {
        return `val`
    }
}

fun nodeListOf(vararg values: Int): ListNode? {
    if(values.isEmpty()) return null

    val head = ListNode(values[0])
    var currentNode = head
    for (i in 1 until values.size) {
        currentNode.next = ListNode(values[i])
        currentNode = currentNode.next!!
    }
    return head
}