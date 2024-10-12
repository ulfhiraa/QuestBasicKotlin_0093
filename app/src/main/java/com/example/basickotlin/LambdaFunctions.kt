package com.example.basickotlin

/* LAMBDA FUNCTIONS
Fungsi sederhana yang tidak memiliki nama.
ini digunakan untuk menulis kode yang lebih ringkas.
Menggunakan tanda panah (->) untuk memisahkan parameter dan body fungsi
*/

// fungsi uppercaseString menerima input berupa String dan mengembalikannya dalam bentuk huruf KAPITAL.
fun uppercaseString(string: String): String {
    return string.uppercase()
}