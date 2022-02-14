import java.lang.Integer.max
import java.lang.Integer.min

fun trap(height: IntArray): Int {
    val water = IntArray(height.size)
    for(rightSide in height.indices) {
        val leftSide = leftSideOfCrator(height, rightSide)
        val waterLevel = min(height[leftSide], height[rightSide])
        for (i in leftSide+1 until rightSide) {
            water[i] = max(waterLevel - height[i], 0)
        }
    }
    return water.sum()
}

fun leftSideOfCrator(height: IntArray, rightSide: Int): Int {
    val waterLevel = height[rightSide]
    var i = rightSide-1
    var maxHeightExtremum: Int? = null
    var maxHeightExtremumIndex: Int? = null
    var up = false
    while (i >= 0 && height[i] < waterLevel) {
        if(height[i] > height[i+1]) {
            up = true
        }
        if(up && (maxHeightExtremum == null || maxHeightExtremum < height[i])){
            maxHeightExtremum = height[i]
            maxHeightExtremumIndex = i
        }
        i--
    }
    return if(i >= 0) {
        i
    } else {
        maxHeightExtremumIndex ?: rightSide
    }
}
