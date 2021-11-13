package com.maheshvenkat.firstkotlinprogram

fun main() {
    println(canSum(7, arrayOf<Int>(2, 3)))
    println(canSum(7, arrayOf<Int>(5, 3, 4,7)))
    println(canSum(7, arrayOf<Int>(2, 4)))
    println(canSum(8, arrayOf<Int>(2, 3, 5)))
    println(canSum(300, arrayOf<Int>(7, 14)))
}

private fun canSum(targetSum: Int, numbers: Array<Int>): Boolean {
    val table: BooleanArray = BooleanArray(targetSum + 1)
    table.fill(false)
    table[0] = true

    for (indexI in 0..table.size-1) {
        if (table[indexI]) {
            for (number in numbers) {
                val indexToBeUpdated = indexI + number
                if (indexToBeUpdated < table.size)
                    table[indexToBeUpdated] = true
            }
        }
    }

    return table[targetSum]
}
