package me.right42.study.basic

fun main() {

    whileLoop()
}

fun forLoop() {
    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }

    for(index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}

fun whileLoop(){
    val items = listOf("apple", "banana", "kiwi")
    var index = 0

    while(index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
}