package com.maheshvenkat.firstkotlinprogram

// O(m^2n) Time O(m) Space
fun main() {
    println(canConstruct("abcdef", arrayOf("ab", "abc", "cd", "def", "abcd")))
    println(canConstruct("skateboard", arrayOf("bo", "rd", "ate", "t", "ska", "sk", "boar")))
    println(canConstruct("enterapotentpot", arrayOf("a", "p", "ent", "enter", "ot", "o", "t")))
    println(
        canConstruct(
            "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",
            arrayOf("e", "ee", "eee", "eeee", "eeeee", "eeeeee")
        )
    )
}

private fun canConstruct(target: String, wordBank: Array<String>): Boolean {
    val array = BooleanArray(target.length + 1) { false }
    array[0] = true

    for (i in target.indices) {
        if (array[i]) {
            for (word in wordBank) {
                if(target.startsWith(word, i)) {
                    array[i+word.length] = true
                }
            }
        }
    }

    return array[target.length]
}