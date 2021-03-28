package me.right42.study.basic

fun main() {

    class Rectangle(height: Double, length: Double) {
        val perimeter = (height + length) * 2
    }

    val rectangle = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")
}
