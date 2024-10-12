package com.example.basickotlin

/*
Conditional Expression adalah ekspresi yang mengembalikan nilai berdasarkan kondisi tertentu
menggunakan :
a) if-else
b) when
c) try-catch
*/

fun ConditionalStatement() {
    println("=== CONDITIONAL EXPRESSION ===")

    // if-else
    val number = 10
    if (number > 0) {
        println("Positive Number")
    } else {
        println("Negative Number")
    }

    // when
    val day = 1
    when (day){
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Invalid Day")
    }

    // try-catch
    val value = "10"
    try {
        val result = value.toInt()
        println("Result: $result")
    } catch (e: NumberFormatException){
        println("Invalid Number")
    }
}