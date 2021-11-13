package com.maheshvenkat.firstkotlinprogram

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

private fun canConstruct(target: String, wordBank: Array<String>, map: HashMap<String, Boolean> = HashMap()) : Boolean {
    if (target in map)
        return map[target]!!

    if(target.isEmpty())
        return true

    for (word in wordBank) {
        if (target.startsWith(word)) {
            var suffix: String = target.removePrefix(word)
            if(canConstruct(suffix, wordBank, map)) {
                map[target] = true
                return map[target]!!
            }
        }
    }
    map[target] = false
    return map[target]!!
}