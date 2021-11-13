package com.maheshvenkat.firstkotlinprogram

fun main() {
    printArray(allConstruct("purple", arrayOf("purp", "p", "ur", "le", "purpl")))
    printArray(allConstruct("abcdef", arrayOf("ab", "abc", "cd", "def", "abcd", "ef", "c")))
    printArray(allConstruct("skateboard", arrayOf("bo", "rd", "ate", "t", "ska", "sk", "boar")))
    printArray(
        allConstruct(
            "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",
            arrayOf("e", "ee", "eee", "eeee", "eeeee", "eeeeee")
        )
    )
}

private fun printArray(arrays: Array<Array<String>?>) {
    for(array in arrays) {
        println(array?.contentDeepToString())
    }
}

private fun allConstruct(target: String, wordBank: Array<String>, map : HashMap<String, Array<Array<String>?>> = HashMap()): Array<Array<String>?> {
    var result = emptyArray<Array<String>?>()

    if(target in map)
        return map[target]!!

    if (target.isEmpty())
        return arrayOf(emptyArray())

    for (word in wordBank) {
        if (target.startsWith(word)) {
            val suffix = target.removePrefix(word)

            val suffixWays = allConstruct(suffix, wordBank, map)

            val targetWays = copyArrays(word, suffixWays)

            result += targetWays
        }
    }

    map[target] = result
    return map[target]!!
}

private fun copyArrays(
    element: String,
    targetWays: Array<Array<String>?>
): Array<Array<String>?> {
    val destArray = arrayOfNulls<Array<String>>(targetWays.size)

    for ((index, array) in targetWays.withIndex()) {
        val list: MutableList<String> = array?.toMutableList()!!
        list.add(0, element)
        destArray[index] = list.toTypedArray()
    }

    return destArray
}

private fun addStringToArrays(
    result: Array<Array<String>?>,
    targetWays: Array<Array<String>?>
) : Array<Array<String>?> {

    for (array in targetWays) {
        result.plus(array?.clone())
    }

    return result
}