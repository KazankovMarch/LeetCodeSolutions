fun findAnagrams(s: String, p: String): List<Int> {
    val wantedChars = CharCounter()
    p.forEach { wantedChars.incCount(it) }

    val searchingChars = CharCounter()
    var currentCharsIsAnagram = false
    val result = mutableListOf<Int>()
    s.forEachIndexed { endIndex, nextChar ->
        searchingChars.incCount(nextChar)

        val startIndex = endIndex - p.length + 1

        if(startIndex == 0) {
            currentCharsIsAnagram = searchingChars == wantedChars
        } else if(startIndex > 0) {
            val charToDecCount = s[startIndex - 1]
            searchingChars.decCount(charToDecCount)
            currentCharsIsAnagram = if(currentCharsIsAnagram) {
                charToDecCount == nextChar
            } else {
                wantedChars == searchingChars
            }
        }

        if(currentCharsIsAnagram) {
            result.add(startIndex)
        }
    }
    return result
}

class CharCounter() {
    private val counters = hashMapOf<Char, Int>()

    fun incCount(char: Char) {
        counters[char] = (counters[char] ?: 0) + 1
    }

    fun decCount(char: Char) {
        val count = counters[char]
        if(count == 1) {
            counters.remove(char)
        } else {
            counters[char] = counters[char]!! - 1
        }
    }

    override fun equals(other: Any?): Boolean {
        return other is CharCounter && counters == other.counters
    }

    override fun hashCode(): Int {
        return counters.hashCode()
    }
}