package com.example.basickotlin

// TIPE DATA DASAR

fun main() {
// INTEGER : Byte, Short, Int, Long
    // Byte
    val byteValue: Byte = 10
    println("Byte: $byteValue")

    // Short
    val shortValue: Short = 20
    println("Short: $shortValue")

    // Int
    val intValue: Int = 30
    println("Int: $intValue")

    // Long
    val longValue: Long = 40
    println("Long: $longValue")

    //FLOATING POINT NUMBERS : Float, Double
    // Float
    val floatValue: Float = 50.6f
    println("Float: $floatValue")

    // Double
    val doubleValue: Double = 60.6
    println("Double: $doubleValue")

    //CHARACTERS : Char
    // Char
    val charValue: Char = 'A'
    println("Char: $charValue")

    //BOOLEANS
    // Boolean
    val booleanValue: Boolean = true
    println("Boolean: $booleanValue")

    //STRINGS
    // String
    var stringValue: String = "Halo Dunia!"
    println("String: $stringValue")

    stringValue = "Hello, Kotlin!"
    println("String: $stringValue")
}