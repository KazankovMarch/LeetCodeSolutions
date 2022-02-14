fun detectCapitalUse(word: String): Boolean =
    if (word.length == 1) {
        true
    } else {
        if (word[0].isLowerCase()) {
            word.all { it.isLowerCase() }
        } else {
            val wordWithoutFirstLetter = word.substring(1)
            wordWithoutFirstLetter.all { it.isLowerCase() } || wordWithoutFirstLetter.all { it.isUpperCase() }
        }
    }