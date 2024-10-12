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

    /*perulangan FOR untuk mengulang data yang ada pada variabel Cars.
    dan menggunakan fungsi liftOf agar menjadi Read-Only, data tidak dapat diubah.
    fungsi listOf untuk membuat List Read-Only (data tidak bisa diubah) */

    val cars = listOf("BMW", "Toyota", "Honda", "Audi")
    // perulangan pada daftar cars dan disimpan pada variabel car
    for (car in cars) {
        println("Car type: $car")
    }

    /* WHILE
    mengeksikusi blok kode selama ekspresi kondisional bernilai benar (while)
    perulangan WHILE untuk melanjutkan tindakan hingga kondisi tertentu terpenuhi. */
    var x = 1
    while (x <= 5) {
        println("Perulangan ke-$x")
        x++
    }

    /* DO-WHILE
    mengeksekusi blok kode terlebih dahulu dan kemudian memeriksa ekspresi kondisional (do-while)
    */
    var y = 1
    do {
        println("Perulangan ke-$y")
        y++
    } while ( y <= 5)
}

fun main(){
    ConditionalStatement()
    Perulangan()
}