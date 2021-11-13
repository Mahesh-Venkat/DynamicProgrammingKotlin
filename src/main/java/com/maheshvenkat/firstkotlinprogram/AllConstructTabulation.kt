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
    for (array in arrays) {
        println(array?.contentDeepToString())
    }
}


private fun allConstruct(target: String, wordBank: Array<String>): Array<Array<String>?> {
    val targetWays = Array<Array<Array<String>?>>(target.length + 1) { emptyArray() }
    targetWays[0] = arrayOf(emptyArray<String>())

    for (i in 0..target.length) {
        for (word in wordBank) {
            if (target.startsWith(word, i)) {
                val newCombinations = copyArrayAndAddWord(targetWays[i], word)

                targetWays[i+word.length] += newCombinations
            }
        }
    }


    return targetWays[target.length]
}

private fun copyArrayAndAddWord(newCombinations: Array<Array<String>?>, word: String) : Array<Array<String>?> {

    val destinationArray = arrayOfNulls<Array<String>?>(newCombinations.size)

   for((index, value) in newCombinations.withIndex()) {
       val list = newCombinations[index]?.toMutableList()
       list?.add(word)
       destinationArray[index] = list?.toTypedArray()
   }

    return destinationArray

}

