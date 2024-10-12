package com.example.basickotlin

/* CLASS
Objek berguna untuk menyimpan data dalam program.
Class memungkinkan kita untuk mendeklarasikan sekumpulan karakteristik untuk sebuah objek
*/

// class kosong yang tidak memiliki atribut.
class Motor() // class dengan objek Motor

/* Class yang didefinisikan dan memiliki paremeter
class dengan objek Contact, dengan 2 parameter : id dan email.
val : data tidak dapat diubah | var : data dapat diubah */
class Contact(val id: Int, var email: String)

fun main() {
    // properti id dan email
    val contact = Contact(1, "jooniera@gmai.com")

    // Prints the value of the property: email | menampilkan properti email
    println(contact.email)

    // Updates the value of the property: email | mengganti email
    contact.email = "lalala@gmail.com"
    // nama objek.namaproperti

    // Prints the new value of the property: email | menampilkan properti email yang baru
    println(contact.email)
}