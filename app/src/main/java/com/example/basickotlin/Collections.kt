package com.example.basickotlin

// LIST
/* list adalah Kumpulan data yang disusun secara berurutan
* a) bersifat ORDERED -> data yang dimasukkan akan memiliki posisi yang urut
* MUTEABLE -> data yang dimasukkan dapat diubah (listof)
* READ-ONLY -> data tidak dapat diubah (mutableListof)
*/

fun ContohList(){
    println("=== LIST ===")
    // LIST Read-Only, data tidak bisa diubah
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    // LIST Mutable, data dapat diubah
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    // Menambahkan data ke dalam List Mutable
    shape.add("Circle")
    println(shape)
}