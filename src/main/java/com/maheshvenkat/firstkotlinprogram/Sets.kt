package com.maheshvenkat.firstkotlinprogram

fun main() {
    var set = setOf<Int>(1,2,2,3)

   set.forEach { println(it) }

    var mySetArray = mutableSetOf<Int>()
    mySetArray.add(2)
    mySetArray.add(2)
    mySetArray.add(3)
    mySetArray.add(4)
    mySetArray.add(5)

    for(index in 0 until  mySetArray.size)
        println(mySetArray.elementAt(index))
}