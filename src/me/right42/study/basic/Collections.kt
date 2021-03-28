package me.right42.study.basic

fun main() {
    val items = listOf("apple", "banana", "orange")

    when {
        "kiwi" in items -> println("juicy")
        "apple" in items -> println("applie is fine too")
    }

}