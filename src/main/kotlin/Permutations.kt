fun permute(nums: IntArray): List<List<Int>> {
    val result = ArrayList<List<Int>>()
    var permutation = nums.sorted()
    while (permutation.isNotEmpty()) {
        result.add(permutation)
        permutation = calculateNextPermutation(permutation)
    }
    return result
}

fun calculateNextPermutation(current: List<Int>): List<Int> {
    var i = current.lastIndex
    do {
        i--
    } while (i >= 0  && current[i] > current[i + 1])

    if (i < 0) return emptyList()

    val valueToSwap1 = current[i]
    val indexToSwap1 = i

    i = current.lastIndex
    while (current[i] < valueToSwap1) {
        i--
    }
    val indexToSwap2 = i

    val resultList = ArrayList<Int>()
    resultList.addAll(current.subList(0, indexToSwap1))
    resultList.add(current[indexToSwap2])
    resultList.addAll(
        (
            current.subList(indexToSwap1 + 1, indexToSwap2) +
            current[indexToSwap1] +
            current.subList(indexToSwap2 + 1, current.lastIndex + 1)
        ).sorted()
    )
    return resultList
}