package com.maheshvenkat.firstkotlinprogram

fun main() {
    val a =6
    val b = 5
    val c : Int

    try {
        c=a/b
    }catch (exception: Exception) {
        println("Exception is handled")
    }
}