fun minEatingSpeed(piles: IntArray, h: Int): Int {
    return binarySearchSpeed(piles, h, 1, Int.MAX_VALUE)
}

private fun binarySearchSpeed(piles: IntArray, h: Int, leftBorder: Int, rightBorder: Int): Int {
    val searchWidth = rightBorder - leftBorder
    if (searchWidth <= 1) {
        return if(eatingTime(piles, leftBorder) <= h) {
            leftBorder
        } else {
            rightBorder
        }
    }

    val searchMedian = leftBorder + searchWidth / 2
    val eatingTimeForMedian = eatingTime(piles, searchMedian)
    return if (eatingTimeForMedian <= h) {
        binarySearchSpeed(piles, h, leftBorder, searchMedian)
    } else {
        binarySearchSpeed(piles, h, searchMedian, rightBorder)
    }
}

private fun eatingTime(piles: IntArray, speed: Int): Int = piles.fold(0) { totalTime, pile ->
    return@fold if (pile % speed == 0) {
        totalTime + pile / speed
    } else {
        totalTime + pile / speed + 1
    }
}
