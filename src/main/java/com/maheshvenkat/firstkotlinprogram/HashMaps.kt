package com.maheshvenkat.firstkotlinprogram

fun main() {
    var map = mapOf<String, Int>( "Rolando" to 23, "Ram" to 45, "Jim" to 35,
        "Rol" to 32, "Rm" to 54, "Jm" to 12,
        "oldo" to 22, "Rma" to 30, "Jam" to 39
    )

    //map.forEach {(key,value) -> println("Key = $key and value = $value")}

//    for((key, value) in map)
//        println("Key = $key and value = $value")

//    var filteredKeysMap = map.filterKeys { it.startsWith('R') || it.startsWith('r') }
//    filteredKeysMap.forEach{(key, value) -> println("Key = $key and value = $value")}
//
//    var filteredValuesMap = map.filterValues { it <= 35 }
//    filteredValuesMap.forEach{(key, value) -> println("Key = $key and value = $value")}

    var filteredMap = map.filter { it.value <= 35 && it.key.startsWith('R') }
    filteredMap.forEach{(key, value) -> println("Key = $key and value = $value")}

}