package com.maheshvenkat.firstkotlinprogram

fun main() {
    var testArray2 = arrayOf(1,2,3,4,5,6)
    var testArray3 = emptyArray<Int>()
    for((index,value) in testArray3.withIndex())
        println("index = " + index + "value = " + value)


//
    var testArray : Array<Int> = Array<Int>(6){-1}
    testArray.set(3,4)
    testArray.set(4,5)
    testArray.set(5,6)
//
    for((index,value) in testArray.withIndex())
        println("index = $index, value = $value")

    for(index in testArray.indices)
        println("index = $index, value = " + testArray[index])

}