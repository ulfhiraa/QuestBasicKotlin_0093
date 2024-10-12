package com.example.basickotlin

/* NULL SAFETY
Mendeteksi potensi masalah dengan nilai null pada saat kompilasi,
bukan saat dijalankan.

Null safety adalah kombinasi dari fitur-fitur yang memungkinkan Anda untuk:
-	secara eksplisit menyatakan kapan nilai null diperbolehkan dalam program Anda.
-	memeriksa nilai null.
-	menggunakan pemanggilan yang aman ke properti atau fungsi yang mungkin berisi nilai null.
-	mendeklarasikan tindakan yang harus diambil jika nilai null terdeteksi.

    Dengan mendeklarasikan variabel sebagai String?, kamu bisa menyimpannya dengan nilai null,
    yang sangat berguna dalam situasi di mana data mungkin tidak tersedia.
*/

fun nullSafety(){
    // neverNull has string type
    var neverNull: String = "This can't be null"

    // var neverNull yang tidak boleh bernilai null
    // Throws a compiler error
    // neverNull = null

    // nullable has nullable String type
    var nullable: String? = "You can keep a null here"
    //  var nullable yang boleh bernilai null karena ada tanda tanya '?'
    // This is OK
    nullable = null

    // Check for null in conditions
    if (neverNull == null){
        println("inferredNonNull is null")
    } else {
        println("inferredNonNull is not null")
    } // menampilkan inferredNonNull is not null
}