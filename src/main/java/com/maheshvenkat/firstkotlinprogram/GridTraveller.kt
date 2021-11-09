package com.maheshvenkat.firstkotlinprogram

fun main() {
    val noOfRoutes = gridTraveller(10, 10)

    println(noOfRoutes)
}

private fun gridTraveller(m : Int, n: Int, map: HashMap<String,Int> = HashMap()): Int {
    val key = "$m,$n"

    if(map.containsKey(key)) return map[key]!!

    if(m==0 || n==0)
        return 0
    if(m==1 && n==1)
        return 1

    map[key] = gridTraveller(m-1, n, map) + gridTraveller(m, n-1, map)
    return map[key]!!
}