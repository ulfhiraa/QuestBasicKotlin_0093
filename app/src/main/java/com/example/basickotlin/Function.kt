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
