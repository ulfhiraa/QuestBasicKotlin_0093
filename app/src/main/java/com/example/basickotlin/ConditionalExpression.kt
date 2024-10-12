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
    /*
    ekspresi If-Else. menampilkan Positive Number apabila angka lebih besar dari 0
    dan menampilkan Negative Number apabila angka kurang dari 0
    */
    val number = 10
    if (number > 0) {
        println("Positive Number")
    } else {
        println("Negative Number")
    }

    // when
    /*ekspresi When digunakan ketika memiliki beberapa cabang dan menggunakan tanda panah ->
    untuk memisahkan setiap kondisi dari setiap tindakan.
    */
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
    /* Ekspresi try-catch untuk mencegah program berhenti tiba-tiba karena error.*/
    val value = "10"
    try {
        val result = value.toInt()
        println("Result: $result")
    } catch (e: NumberFormatException){
        println("Invalid Number")
    }
}

fun Perulangan() {
    println()
    println("=== PERULANGAN ===")

    //FOR
    /* untuk mengulang serangkaian nilai dan suatu tindakan
    $i berarti nilai dari variabel i akan disisipkan ke dalam string "Perulangan ke-".
    Jadi, pada setiap iterasi dari loop, i akan memiliki nilai yang berbeda, dan
    string tersebut akan menampilkan hasil dengan nilai dari i yang dimasukkan secara dinamis.

    1..5 berarti dari angka 1 hingga 5
    */
    for (i in 1..5){
        println("Perulangan ke-$i")
    }

}