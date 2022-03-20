
fun rotate(matrix: Array<IntArray>) {
    val n = matrix.size - 1
    val half = n / 2

    for(y in 0 until matrix.size / 2) {
        for (x in 0..half) {
            val y1 = x
            val x1 = n - y
            val y2 = n - y
            val x2 = n - x
            val y3 = n - x
            val x3 = y

            val buf = matrix[y][x]

            matrix[y][x] = matrix[y3][x3]
            matrix[y3][x3] = matrix[y2][x2]
            matrix[y2][x2] = matrix[y1][x1]
            matrix[y1][x1] = buf
        }
    }
}
