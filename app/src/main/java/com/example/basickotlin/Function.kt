package com.example.basickotlin

// FUNCTION
// fungsi tanpa parameter
fun withoutParameter() {
    println("FUNCTION")
    println("")
    println("== WITHOUT PARAMETER ==")
    println("Hello, World!")
}

// fungsi dengan parameter
/*
 Fungsi dengan parameter yang akan menampilkan Hello,
 (nama yang diisi pada parameter)
* */
fun withParameter(name: String) {
    println()
    println("== WITH PARAMETER ==")
    println("Hello, $name!")
}

/* NAMED ARGUMENT
Cara untuk memanggil fungsi dengan menyebutkan nama parameter
menyertakan nama parameter akan membuat kode Anda lebih mudah dibaca. Ini disebut menggunakan ARGUMEN BERNAMA.
Jika menyertakan nama parameter, maka kita dapat menulis parameter dalam urutan apa pun.
*/

fun withNamedArgument(name: String, age: Int) {
    println()
    println("== with NAMED ARGUMENT ==")
    println("Hello, name$! You are $age years old")
}
