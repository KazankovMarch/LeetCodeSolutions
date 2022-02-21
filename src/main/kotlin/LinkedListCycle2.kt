
fun detectCycle(head: ListNode?): ListNode? {
    val visitedNodes = hashSetOf<ListNode>()
    return findCycleRecursively(head, visitedNodes)
}

private fun findCycleRecursively(nextNode: ListNode?, visitedNodes: MutableSet<ListNode>): ListNode? {
    if(nextNode == null) return null
    if(nextNode in visitedNodes) return nextNode

    visitedNodes.add(nextNode)
    return findCycleRecursively(nextNode.next, visitedNodes)
}
