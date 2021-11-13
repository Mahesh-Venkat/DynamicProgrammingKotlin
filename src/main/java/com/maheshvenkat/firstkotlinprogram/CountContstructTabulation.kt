package com.maheshvenkat.firstkotlinprogram

// O(m^2n) Time O(m) Space
fun main() {
    println(countConstruct("purple", arrayOf("purp", "p", "ur", "le", "purpl")))

    println(countConstruct("abcdef", arrayOf("ab", "abc", "cd", "def", "abcd")))
    println(countConstruct("skateboard", arrayOf("bo", "rd", "ate", "t", "ska", "sk", "boar")))
    println(countConstruct("enterapotentpot", arrayOf("a", "p", "ent", "enter", "ot", "o", "t")))
    println(
        countConstruct(
            "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",
            arrayOf("e", "ee", "eee", "eeee", "eeeee", "eeeeee")
        )
    )
}

private fun countConstruct(target: String, wordBank: Array<String>): Int {
    val array = IntArray(target.length+1) {0}

    array[0] = 1

    for(i in target.indices) {
        if (array[i] != 0) {
            for (word in wordBank) {
                if(target.startsWith(word, i )) {
                    array[i+word.length] += array[i]
                }
            }
        }
    }

    return array[target.length]
}