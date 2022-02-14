fun fourSumCount(
    nums1: IntArray,
    nums2: IntArray,
    nums3: IntArray,
    nums4: IntArray
): Int {
    var result = 0

    nums1.forEach { i1 ->
        nums2.forEach {  i2 ->
            val sum1 = i1 + i2
            nums3.forEach {  i3 ->
                val sum2 = sum1 + i3
                nums4.forEach {  i4 ->
                    if(sum2 + i4 == 0) {
                        result++
                    }
                }
            }
        }
    }
    return result
}