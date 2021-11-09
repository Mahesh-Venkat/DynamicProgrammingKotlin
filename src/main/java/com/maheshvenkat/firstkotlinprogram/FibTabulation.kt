package com.maheshvenkat.firstkotlinprogram

fun main() {
    println(fib(6))
    println(fib(7))
    println(fib(8))
    println(fib(50))
}

private fun fib(n: Int) : Int {
    val array = IntArray(n + 2)
    array.fill(0)
    array[1] = 1


    for(index in 0..n-1) {
        array[index+1] += array[index]
        array[index+2] += array[index]
    }

    return array[n]
}