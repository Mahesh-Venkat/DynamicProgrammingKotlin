package com.maheshvenkat.firstkotlinprogram

fun main() {
   // O(n to the power of m) O(m)
    // After Memoization O(m*n), O(m)
    println(canSum(7, arrayOf<Int>(2,3)))
    println(canSum(7, arrayOf<Int>(5,3,4,7)))
    println(canSum(7, arrayOf<Int>(2,4)))
    println(canSum(8, arrayOf<Int>(2,3,5)))
    println(canSum(300, arrayOf<Int>(7,14)))

}

private fun canSum(total:Int, array: Array<Int>, map: HashMap<Int, Boolean> = HashMap()) : Boolean {
    if(map.containsKey(total)) return map[total]!!
    if(total == 0 ) return true
    if(total < 0 ) return false

    for(i in array) {
        val remainder = total - i

        if(canSum(remainder, array, map)) {
            map[total] = true
            return true
        }

    }
    map[total] = false
    return false
}