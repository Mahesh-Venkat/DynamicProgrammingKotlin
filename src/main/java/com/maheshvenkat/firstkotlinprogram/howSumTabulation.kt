package com.maheshvenkat.firstkotlinprogram

fun main() {
    //println(copy(arrayOf<Int>(1,2,3), 7).contentDeepToString())
    println(howSum(7, intArrayOf(2, 3))?.contentDeepToString())
    println(howSum(7, intArrayOf(5, 3, 4, 7))?.contentDeepToString())
    println(howSum(7, intArrayOf(2, 4))?.contentDeepToString())
    println(howSum(8, intArrayOf(2, 3, 5))?.contentDeepToString())
    println(howSum(300, intArrayOf(7, 14))?.contentDeepToString())
}

private fun howSum(targetSum: Int, numbers: IntArray): Array<Int>? {
    val array = arrayOfNulls<Array<Int>>(targetSum + 1)
    array[0] = emptyArray<Int>()

    for (indexI in 0..targetSum) {
        if (array[indexI] != null) {
            for (number in numbers) {
                val indexToBeCalculated = indexI + number
                if (indexToBeCalculated <= targetSum)
                    array[indexToBeCalculated] = copy(array[indexI]!!, number)
            }
        }
    }

    return array[targetSum]
}

private fun copy(array: Array<Int>, element: Int): Array<Int> {
    val destinationArray = Array(array.size + 1) { 0 }


    if (array.isEmpty())
        destinationArray[0] = element
    else {
        for (i in 0 until destinationArray.size - 1) {
            destinationArray[i] = array[i]
        }
    }

    destinationArray[destinationArray.size - 1] = element

    return destinationArray
}

