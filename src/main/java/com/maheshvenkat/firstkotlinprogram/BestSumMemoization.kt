package com.maheshvenkat.firstkotlinprogram

//O(n^m *m) time complexity for Brute force
// O(m^2) Space Complexity

//After Memoization
// O(m^2n) Time
// Space O(m^2)
fun main() {
    println(bestSum(7, arrayOf<Int>(5, 3, 4, 7))?.contentToString())
    println(bestSum(8, arrayOf<Int>(2, 3, 5))?.contentToString())
    println(bestSum(8, arrayOf<Int>(1, 4, 5))?.contentToString())
    println(bestSum(100, arrayOf<Int>(1, 2, 5, 25))?.contentToString())
}

private fun bestSum(
    targetSum: Int, numbers: Array<Int>, map: HashMap<Int, Array<Int>?> = HashMap()
): Array<Int>? {

    if (map.containsKey(targetSum))
        return map[targetSum]

    if (targetSum == 0)
        return emptyArray<Int>()

    if (targetSum < 0)
        return null

    var shortestCombination: Array<Int>? = null

    for (number in numbers) {
        val remainder = targetSum - number
        val remainderCombination = bestSum(remainder, numbers, map)

        if (remainderCombination != null) {
            val combination = copy(remainderCombination, number)

            if (shortestCombination == null || (combination.size < shortestCombination.size))
                shortestCombination = combination
        }
    }

    map[targetSum] = shortestCombination
    return shortestCombination
}

private fun copy(
    array: Array<Int>,
    element: Int
): Array<Int> {
    val dest = Array<Int>(array.size + 1) { 0 }

    if (array.isEmpty())
        dest[0] = element
    else {
        for (index in 0..array.size - 1)
            dest[index] = array[index]

        dest[array.size] = element
    }

    return dest
}