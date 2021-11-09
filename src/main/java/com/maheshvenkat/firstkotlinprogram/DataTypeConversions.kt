package com.maheshvenkat.firstkotlinprogram

fun main(args: Array<String>) {

//    toByte()
//    toShort()
//    toInt()
//    toLong()
//    toFloat()
//    toDouble()

    var x:Byte = 127
    var y:Int = x.toInt()
    var z:Double = y.toDouble()

    println(x)
    println(y)
    println(z)

    var a: Double = 132.132
    var b: Int = a.toInt()
    var c : Byte = b.toByte()

    println(a)
    println(b)
    println(c)
}