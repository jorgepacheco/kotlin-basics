package com.codely.demo

class Greeter {
    fun hello(): String {
        return "Hello caracola ...."
    }

    fun helloInline(): String = "Hello caracola Inline"
}


fun main() {

    val greeter = Greeter()

    println(" Vamos ${greeter.hello()}")
    println(" Vamos ${greeter.helloInline()}")

}