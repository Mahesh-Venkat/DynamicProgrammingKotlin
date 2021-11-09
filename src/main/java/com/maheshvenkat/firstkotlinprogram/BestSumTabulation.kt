package com.maheshvenkat.firstkotlinprogram

fun main() {
    println(bestSum(7, arrayOf<Int>(5, 3, 4, 7))?.contentToString())
    println(bestSum(8, arrayOf<Int>(2, 3, 5))?.contentToString())
    println(bestSum(8, arrayOf<Int>(1, 4, 5))?.contentToString())
    println(bestSum(100, arrayOf<Int>(1, 2, 5, 25))?.contentToString())
}

private fun bestSum(targetSum: Int, numbers: Array<Int>): Array<Int>? {
    val array = arrayOfNulls<Array<Int>>(targetSum + 1)
    array[0] = emptyArray<Int>()

    for (index in 0..targetSum) {

        if (array[index] != null) {
            for (number in numbers) {
                val newIndex = index + number

                if ((newIndex <= targetSum && array[newIndex] == null) || (newIndex <= targetSum && (array[index]!!.size < array[newIndex]!!.size))) {
                    array[newIndex] = copy(array[index]!!, number)
                }
            }
        }
    }

    return array[targetSum]
}

private fun copy(array: Array<Int>, element: Int): Array<Int> {
    val destSize = array.size + 1
    val destArray = Array(destSize) { 0 }

    if (array.isEmpty()) {
        destArray[0] = element
    } else {
        for (index in 0 until destSize - 1)
            destArray[index] = array[index]

        destArray[destSize-1] = element
    }

    return destArray
}