package com.maheshvenkat.firstkotlinprogram

fun main() {
    var x = arrayListOf<Int>()
    x.add(6)
    x.add(10)
    x.add(2, 20)
    x.add(3, 40)
    x.removeAt(2)

    println(x)

//    var y = ArrayList<Int>()
//    y.add(10)
//    y.add(20)
//    y.add(30)
//    y.remove(30)
//
//    for(i in 0 until y.size)
//        println("index = $i value = ${y[i]}" )
//
//    //println(y)

    var cars = arrayListOf<String>("Opel", "BMW", "Merc", "Ford")

    cars.add(2, "Chevy")
    cars.set(2, "BMW")

    for((index, value) in cars.withIndex())
        println( "index = $index and value = $value")

    var filteredCars = cars.filter { it.startsWith('O') }
    filteredCars.forEachIndexed {index, value ->  println("Index = $index Value = $value" )}
}