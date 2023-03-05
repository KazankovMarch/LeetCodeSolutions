import java.util.LinkedList

fun minJumps(arr: IntArray): Int {
    val crossJumpPaths = findCrossJumpPaths(arr)

    val visitedIndexes = mutableSetOf<Int>()

    val indexesQueue = LinkedList<Int>()
    val jumpCountersQueue = LinkedList<Int>()

    fun jumpIfNotVisited(toIndex: Int, jumpCounter: Int) {
        if (toIndex <= 0 || toIndex >= arr.size) return
        if (toIndex in visitedIndexes) return
        visitedIndexes.add(toIndex)
        indexesQueue.add(toIndex)
        jumpCountersQueue.add(jumpCounter + 1)
    }

    var jumpCounter = 0
    var currentIndex = 0

    while (currentIndex != arr.lastIndex) {
        jumpIfNotVisited(currentIndex + 1, jumpCounter)
        jumpIfNotVisited(currentIndex - 1, jumpCounter)
        crossJumpPaths[arr[currentIndex]]?.forEach { toIndex ->
            jumpIfNotVisited(toIndex, jumpCounter)
        }
        crossJumpPaths.remove(arr[currentIndex]) // optimization
        currentIndex = indexesQueue.poll()
        jumpCounter = jumpCountersQueue.poll()
    }

    return jumpCounter
}

fun findCrossJumpPaths(arr: IntArray): MutableMap<Int, MutableSet<Int>> {
    val result = hashMapOf<Int, MutableSet<Int>>()
    arr.forEachIndexed { index, value ->
        result.compute(value) { _: Int, paths: MutableSet<Int>? ->
            paths?.let { it.add(index); it } ?: mutableSetOf(index)
        }
    }
    return result
}