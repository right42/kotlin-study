package me.right42.study.basic

open class Book(protected val title: String, protected var price: Int) {
    open fun printInfo() {
        println("Title is $title price is $price")
    }
}

class EBook(title: String, price: Int, private val url: String): Book(title, price) {
    final override fun printInfo() {
        println("Title is $title, Price : $price, URL : $url")
    }
}

class EBookChild

fun main() {
    val book = Book("test", 100)
    val ebook = EBook("test", 1000, "www.naver.com")

    book.printInfo()
    ebook.printInfo()

}