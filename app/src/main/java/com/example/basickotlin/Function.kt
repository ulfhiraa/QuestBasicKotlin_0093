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

// with Named Argument : menyertakan nama parameter yang membuat kode lebih mudah dibaca.
fun withNamedArgument(name: String, age: Int) {
    println()
    println("== with NAMED ARGUMENT ==")
    println("Hello, name$! You are $age years old")
}


/* DEFAULT PARAMETER VALUE
 cara untuk memberikan nilai default pada parameter fungsi.
 with Default Parameter : memberikan nilai default untuk parameter fungsi
*/
fun withDefaultParameter(name: String = "Ulfah", age: Int){
    println()
    println("== with DEFAULT PARAMETER ==")
    println("Hello, $name! You are $age years old.")
}

/* fungsi withReturn : mengembalikan nilai
fungsi mengembalikan hasil perkalian dari panjang dan lebar, dan kita bisa menyimpan
atau menggunakan hasil tersebut di tempat lain.

 println adalah fungsi untuk mencetak nilai ke layar, dan tidak mengembalikan nilai apa pun.
*/

fun withReturn(panjang : Int, lebar : Int) {
    return println ( panjang * lebar)
}

fun main(){
    withoutParameter()
    withParameter("Namjoon")
    withNamedArgument(name = "Namjoon", age = 30)
    withDefaultParameter(age = 20)
}
