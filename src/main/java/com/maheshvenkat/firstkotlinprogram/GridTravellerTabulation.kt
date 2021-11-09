package com.maheshvenkat.firstkotlinprogram

fun main() {
    println(gridTraveller(1, 1))
    println(gridTraveller(2, 3))
    println(gridTraveller(3, 2))
    println(gridTraveller(3, 3))
    println(gridTraveller(18, 18))
}

private fun gridTraveller(m: Int, n: Int): Long {
    val twoDArray = Array(m + 1) { LongArray(n + 1) }
    twoDArray[1][1] = 1

    for (indexI in 0..m) {
        for (indexJ in 0..n) {
            val current = twoDArray[indexI][indexJ]

            if (indexI + 1 <= m) twoDArray[indexI + 1][indexJ] += current
            if (indexJ + 1 <= n) twoDArray[indexI][indexJ + 1] += current
        }
    }

    //println(twoDArray.contentDeepToString())

    return twoDArray[m][n]
}

