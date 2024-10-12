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


    /* SAFE CALL OPERATOR
 untuk mengembalikan nilai null jika properti objek bernilai null.
 Hal ini berguna jika Anda ingin menghindari adanya nilai null yang memicu kesalahan dalam kode Anda.*/

    println(neverNull.length) // 18
    /* Pada baris ini, kita mencetak panjang dari string yang ada di variabel neverNull.
    Karena neverNull adalah variabel non-nullable (dideklarasikan sebagai String tanpa tanda tanya),
    kita bisa langsung mengakses propertinya.
    neverNull memiliki nilai "This can't be null", maka panjang string tersebut adalah 18 karakter
    */

    println(nullable?.length) // null
    /* nullable?.length menggunakan safe call operator untuk menghindari error saat variabel bernilai null.
    Jika nullable memang null, maka panjangnya tidak dapat diakses, dan hasilnya akan null.

    disini mencetak panjang dari string yang ada di variabel nullable.
    Karena nullable dideklarasikan sebagai nullable (String?), kita menggunakan safe call operator (?.)
    untuk menghindari NullPointerException.
    Jika nullable memiliki nilai null, maka pemanggilan nullable?.length juga akan menghasilkan null.
    */

    /* notNull doesn't accept null values
    Kode ini membuat fungsi untuk menghitung berapa banyak karakter yang ada dalam sebuah string,
    tapi hanya jika string tersebut tidak bernilai null. */
    fun strLength(notNull: String): Int {
        return notNull.length
    }
    /*Fungsi strLength yang menerima satu input (disebut notNull) yang harus berupa String
    dan tidak boleh bernilai null. Jika kamu mencoba mengirim nilai null, program akan error.
    return notNull.length: Ini mengembalikan jumlah karakter dalam string yang diberikan.
    Properti length menghitung berapa banyak karakter dalam string itu.
    println(strLength(neverNull)): Fungsi strLength dipanggil dengan variabel neverNull
    (yang diasumsikan sebagai sebuah string dengan 18 karakter), dan hasilnya dicetak, yaitu 18.
    */

    println(strLength(neverNull)) // 18
}