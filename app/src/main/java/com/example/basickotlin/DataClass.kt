package com.example.basickotlin

/* DATA CLASS
digunakan untuk menyimpan data. Seluruh data yang diolah akan disimpan didalam Data Class.
menyediakan fungsi untuk meng-override
fungsi equals() or ==, hashCode(), dan toString().
juga fungsi copy() untuk membuat salinan objek dengan beberapa perubahan.

Instance adalah objek yang dibuat berdasarkan class tersebut, masing-masing bisa
memiliki nilai yang berbeda untuk atribut-atributnya.
*/

// kelas data DataClass dengan atribut id dan email
data class DataClass( // data class (nama kelas data)
    val id: Int,
    var email: String
)

fun main(){
    /* Fungsi toString : Mencetak string yang dapat dibaca dari instance kelas dan propertinya.
    menggunakan fungsi cetak (println() dan print()) yang secara otomatis memanggil .toString() */
    val data = DataClass(1, "ulfah@gmail.com")
    println(data)

    // Fungsi Equals or == : Membandingkan instance dari suatu kelas dengan operator ==
    val data2 = DataClass(1, "ayam@gmail.com") // false karena idnya sama tapi emailnya beda
    println(data == data2)

    /* Fungsi Copy : Membuat contoh kelas dengan menyalin kelas lain, yang mungkin memiliki beberapa properti berbeda.
    membuat salinan (copy) dari suatu objek dengan kemampuan mengubah nilai beberapa atribut tanpa mengubah objek aslinya.*/
    val data3 = data.copy()
    println(data3)

    // Fungsi Copy dengan perubahan
    val data4 = data.copy(email = "nanana@gmail.com") // mengganti data email, id nya tetap karena copy
    println(data4)
}