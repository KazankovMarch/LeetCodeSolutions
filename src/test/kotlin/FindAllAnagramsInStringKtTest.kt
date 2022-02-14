import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FindAllAnagramsInStringKtTest {

    @Test
    fun `Example 1`() {
        assertEquals(
            listOf(0,6),
            findAnagrams("cbaebabacd", "abc")
        )
    }
    @Test
    fun `Example 2`() {
        assertEquals(
            listOf(0,1,2),
            findAnagrams("abab", "ab")
        )
    }

    @Test
    fun `single letter p`() {
        assertEquals(
            listOf(0,2),
            findAnagrams("abab", "a")
        )
        assertEquals(
            emptyList<Int>(),
            findAnagrams("dfgfs", "a")
        )
    }

    @Test
    fun `single letter s`() {
        assertEquals(
            emptyList<Int>(),
            findAnagrams("d", "afds")
        )
        assertEquals(
            listOf(0),
            findAnagrams("d", "d")
        )
    }

}