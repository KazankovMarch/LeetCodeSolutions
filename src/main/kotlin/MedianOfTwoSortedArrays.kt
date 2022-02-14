fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val mergedArraySize = nums1.size + nums2.size
    var iterator1 = 0
    var iterator2 = 0
    var currentValue: Int? = null
    var previousValue: Int? = null
    for (i in 0..mergedArraySize / 2) {
        previousValue = currentValue
        if (iterator1 < nums1.size && (iterator2 == nums2.size || nums1[iterator1] < nums2[iterator2])) {
            currentValue = nums1[iterator1]
            iterator1++
        } else {
            currentValue = nums2[iterator2]
            iterator2++
        }
    }
    currentValue!!
    return if (mergedArraySize % 2 == 0 && previousValue != null) {
        (previousValue + currentValue).toDouble() / 2
    } else {
        currentValue.toDouble()
    }
}