package com.maheshvenkat.firstkotlinprogram

import java.lang.NullPointerException

fun main() {

    //printArray(howSum(7, intArrayOf(2,3))!!)

   // printArray(howSum(7, intArrayOf(5,3,4,7))!!)
//    printArray(howSum(7, intArrayOf(2,4))!!)
    //printArray(howSum(8, intArrayOf(2,3,5))!!)
    printArray(howSum(300, intArrayOf(7,14))!!)

}

private fun printArray(array : IntArray) {
    for (i in array)
        print(i)
}

private fun howSum(targetSum : Int, array: IntArray, map : HashMap<Int,IntArray?> = HashMap()) : IntArray? {
    if(map.containsKey(targetSum))
        return map[targetSum]

    if(targetSum == 0)
        return IntArray(0)

    if(targetSum < 0)
        return null

    for (i in array) {
        val remainder = targetSum - i
        val remainderResult = howSum(remainder, array, map)

        if(remainderResult != null) {
            //remainderResult.set(remainderResult.size-1, i)
            map[targetSum] =  copyArray(remainderResult, i)

            return map[targetSum]
        }
    }

    map[targetSum] = null
    return map[targetSum]
}

//private fun append(arr: Array<Int>, element: Int): Array<Int> {
//    val array: Array<Int?> = arrayOfNulls<Int>(arr.size+1)
//
//
//    array[arr.size] = element
//    return array
//}

fun copyArray(source: IntArray, element: Int): IntArray {
    val n = source.size+1
    val dest = IntArray(n)
    for (i in 0 until n-1) {
        dest[i] = source[i]
    }
    dest[n-1] = element
    return dest
}
