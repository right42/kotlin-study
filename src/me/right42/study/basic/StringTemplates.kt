package me.right42.study.basic

fun main() {
    var a = 1
    val str1 = "a is $a"

    a = 2

    val str2 = "${str1.replace("is", "was")}, " +
            "but now is $a"

    println(str2)
}