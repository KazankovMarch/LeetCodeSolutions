import java.util.*

fun mergeKLists(lists: Array<ListNode?>): ListNode? {
    val treeMap = TreeMap<Int, List<ListNode>>()
    lists.forEach {
        if (it != null)
            treeMap.merge(it.`val`, listOf(it)) { currentList, singleElementList ->
                currentList + singleElementList
            }
    }

    val resultPreHead = ListNode(0)
    var currentResultNode = resultPreHead
    while (treeMap.isNotEmpty()) {
        val currentNodes = treeMap.pollFirstEntry().value
        currentNodes.forEach { currentNode: ListNode ->
            currentResultNode.next = ListNode(currentNode.`val`)
            currentResultNode = currentResultNode.next!!
            currentNode.next?.let {
                treeMap.merge(it.`val`, listOf(it)) { currentList, singleElementList ->
                    currentList + singleElementList
                }
            }
        }
    }
    return resultPreHead.next
}