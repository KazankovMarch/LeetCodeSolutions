fun sortList(head: ListNode?): ListNode? {
    head ?: return null
    return sortNodesAndReturnNewHead(head, head)
}

private fun sortNodesAndReturnNewHead(
    head: ListNode,
    tail: ListNode
): ListNode {
    val nodeToAdd = tail.next ?: return head

    return when (val nodeBeforeInsert = findNodeBeforeNodeGreaterThan(head, nodeToAdd.`val`)) {
        tail -> {
            sortNodesAndReturnNewHead(head, nodeToAdd)
        }
        null -> {
            tail.next = nodeToAdd.next
            nodeToAdd.next = head
            sortNodesAndReturnNewHead(nodeToAdd, tail)
        }
        else -> {
            tail.next = nodeToAdd.next
            nodeToAdd.next = nodeBeforeInsert.next
            nodeBeforeInsert.next = nodeToAdd
            sortNodesAndReturnNewHead(head, tail)
        }
    }
}

fun findNodeBeforeNodeGreaterThan(head: ListNode, value: Int): ListNode? {
    if (head.`val` > value) return null
    var node = head
    while (node.next != null && node.next!!.`val` < value) {
        node = node.next!!
    }
    return node
}
