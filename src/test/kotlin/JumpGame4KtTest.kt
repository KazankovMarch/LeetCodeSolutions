import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class JumpGame4KtTest {

    @Test
    fun `complex path`() {
        // 0 --> 4 --> 3 --> 9
        assertEquals(3, minJumps(intArrayOf(100, -23, -23, 404, 100, 23, 23, 23, 3, 404)))
    }

    @Test
    fun `single element array`() {
        assertEquals(0, minJumps(intArrayOf(7)))
    }

    @Test
    fun `simple path`() {
        // 0 -> 7
        assertEquals(1, minJumps(intArrayOf(7, 6, 9, 6, 9, 6, 9, 7)))
    }
}