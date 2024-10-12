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
data class DataClass(
    val id: Int,
    var email: String
)