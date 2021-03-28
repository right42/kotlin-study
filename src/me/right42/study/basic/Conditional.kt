package me.right42.study.basic

fun main() {

    fun maxOf(a: Int, b: Int) = if(a > b) a else b
}

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}