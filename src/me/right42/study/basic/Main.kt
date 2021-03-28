package me.right42.study.basic

fun main(args: Array<String>) {
    fun sumExpression(a: Int, b: Int) = a + b

    println(sum(1, 4))
    println(sumExpression(5, 3))
    printSum(2, 5)

    defaultMessageWithPrefix("hello")

    val button = Button("test")
    button.printMessage()

}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun printSum(a: Int, b: Int) {
    printSum(a = 1, b= 4, prefix = "test")
}

fun printSum(a: Int, b: Int, prefix: String = "prefix") {
    println("$prefix sum of $a and $b is ${a + b}")
}

fun defaultMessageWithPrefix(message: String, prefix: String = "prefix") {
    println("$prefix $message")
}

class Button(
    private val message: String
    ){

    init {
        println("button class init!")
    }


    fun printMessage(){
        println(message)
    }
}