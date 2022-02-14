import java.lang.Integer.max

fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
    TODO()
}

private fun attempt1(gas: IntArray, cost: IntArray): Int {
    val circleSize = gas.size
    val currentGasInCar = IntArray(circleSize)

    for (trip in 0 until circleSize * 2) {
        val index = trip % circleSize
        if(index < trip && currentGasInCar[index] >= 0)
            return index

        val costToNext = cost[index]
        val stationGas = gas[index]
        for (i in max(0, trip - circleSize)..trip) {
            val startPosition = i % circleSize
            val currentGas = currentGasInCar[startPosition]
            if (currentGas >= 0) {
                currentGasInCar[startPosition] = currentGas + stationGas - costToNext
            }
        }
    }
    return currentGasInCar.indexOfFirst { it >= 0 }
}