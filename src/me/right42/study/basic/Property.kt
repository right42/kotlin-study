package me.right42.study.basic

class Rectangle(var height: Int, var width: Int) {
    val isSquare: Boolean
    get() = height == width

    fun isSquareFun(): Boolean = height == width

}

fun main() {
    val rectangle = Rectangle(100, 200)

    rectangle.width = 100
    println("height : ${rectangle.height}, width : ${rectangle.width}")
    println(rectangle.isSquare)
    println(rectangle.isSquareFun())

}