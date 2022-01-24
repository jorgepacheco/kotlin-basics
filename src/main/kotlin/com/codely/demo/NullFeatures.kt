package com.codely.demo

import java.time.LocalDate

fun nullDeclarationThrowExceptionFormatDate() {

    println("Introduce date with format 'yyyy-MM-dd'")

    val input = null

    val localDate = LocalDate.parse(input)

    println("the date is $localDate and day week is ${localDate.dayOfWeek}")

}

fun forceNotNullInFunction() {

    println("Introduce date with format 'yyyy-MM-dd'")

    val input = null

    // Fuerza que para llamar a la fucncion sea distinto de null sino lanza NullPointer antes de entrar en la funcion.

    val localDate = LocalDate.parse(input!!)

    println("the date is $localDate and day week is ${localDate.dayOfWeek}")
}

fun elvisOperator() {

    println("elvisOperator, Introduce date with format 'yyyy-MM-dd'")

    val input = null

    val localDate = LocalDate.parse(input ?: "1974-06-24")

    println("elvisOperator, the date is $localDate and day week is ${localDate.dayOfWeek}")
}

fun main() {
    //forceNotNullInFunction()
    elvisOperator()
    letOperator(null)
    letOperator("2010-11-27")
}

fun letOperator(input: String?) {

    println("letOperator, Introduce date with format 'yyyy-MM-dd'")


    input?.let {
        val localDate = LocalDate.parse(input)
        println("letOperator, the date is $localDate and day week is ${localDate.dayOfWeek}")

    }

    println()


}
