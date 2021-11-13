package com.maheshvenkat.firstkotlinprogram

fun main() {
    printPrimeNumbers(100)
}

private fun printPrimeNumbers(n: Int) {
    for (i in 1..n ) {
        if(isItaPrime(i))
            println(i)
    }
}

private fun isItaPrime(n : Int) : Boolean {
    for(i in 2 until n) {
        if(n%i ==0 )
            return false
    }

    return true
}