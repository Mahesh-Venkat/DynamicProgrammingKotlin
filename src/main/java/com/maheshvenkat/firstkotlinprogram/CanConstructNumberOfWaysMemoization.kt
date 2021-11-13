package com.maheshvenkat.firstkotlinprogram

fun main() {
    println(canConstruct("purple", arrayOf("purp", "p", "ur", "le", "purpl")))
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

private fun canConstruct(target: String, wordBank: Array<String>, map: HashMap<String, Int> = HashMap()) : Int {
    if(target in map)
        return map[target]!!

    if(target.isEmpty())
        return 1

    var totalCount = 0

    for (word in wordBank) {
        if (target.startsWith(word)) {
            var suffix: String = target.removePrefix(word)
            val numOfWays = canConstruct(suffix, wordBank, map)
            totalCount += numOfWays
        }
    }

    map[target] = totalCount
    return map[target]!!
}