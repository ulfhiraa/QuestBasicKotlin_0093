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

    // Menambahkan data ke dalam List Mutable (.add)
    shape.add("Circle")
    println(shape)

    // Menghapus data dari List Mutable (.remove)
    shape.remove("Triangle")
    println(shape)

    println(shape.first()) //element pertama
    println(shape.last()) // elemet terakhir
    println(shape.count()) // jumlah elemen dalam shape

    shape.removeAt(1) // menghapus data index ke-1 atau elemen ke-2 (karena dimulai dari 0)
    println(shape)

    // Mengubah data di dalam List Mutable
    shape[0] = "Oval" // mengubah data pada index ke-0 (circle menjadi oval).
    println(shape)

    // List Read-Only
    val shapesLocked: List<String> = shape // Agar list Read-Only, tidak dapat diubah (namaObjek+Locked)
    println(shapesLocked)
}

// SET
/*
SET adalah kumpulan data yang tidak memiliki posisi atau urutan tertentu dan
hanya menyimpan data UNIK (tidak ada duplikasi data).
bersifat :
a) Unordered -> data yang dimasukkan tidak memiliki posisi tertentu (tidak urut)
b)  - Mutable : data dapat diubah (mutableSetOf)
    - Read Only : data tidak dapat diubah (setOf)
*/

fun ContohSet() {
    println()
    println("=== SET ===")

    // SET Read-Only, Data tidak dapat diubah
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    // SET Mutable, Data dapat diubah
    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)
}