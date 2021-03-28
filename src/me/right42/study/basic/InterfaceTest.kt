package me.right42.study.basic

interface Clickable {
    fun click()
    fun showOff() {
        println("I was clicked")
    }
}

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus")
    fun showOff() = println("I am focusable")
}

class ClickButton: Clickable, Focusable {
    override fun click() = println("click")
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

interface User {
    val userName: String
}

class PrivateUser(override val userName: String): User {
    val email: String = "test"
}

fun main() {
    val button = ClickButton()

    button.click()
    button.showOff()
}