package com.maheshvenkat.firstkotlinprogram

fun main(){
    var intArray = arrayOf(1,2,3)
    var stringArray = arrayOf("Hello", "World", "Kotlin")

//    for(i in intArray.iterator())
//        println(intArray[])

    //intArray.forEachIndexed{index, element - > println("index" + index + "Value" + element) }

    intArray.forEachIndexed{index, element -> println("index = $index, element = $element")}


    for ((index, value) in intArray.withIndex()){
        println("index" + index + "Value" + value)
    }


    for(i in stringArray)
        println(i)

    for (i in stringArray.indices)
        println(stringArray[i])
}