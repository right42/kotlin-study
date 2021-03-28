package me.right42.study.basic

fun main() {
    val x = 10
    val y = 9

    if(x in 1..y+1) {
        println("fits in range")
    }

    for(i in 1..4 step 2) {
        println(i)
    }

    for(i in 10 downTo 0 step 2) {
        println(i)
    }

    for(i in -10..0 step 2) {
        println(i)
    }

}