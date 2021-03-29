package me.right42.study.basic

fun main() {
    val person = Person("Right", 23)

    person.run {
        println("이름 $name")
    }

    person.let {
        println("이름 : ${it.name}")
    }
}

class Person(val name: String, val age: Int)