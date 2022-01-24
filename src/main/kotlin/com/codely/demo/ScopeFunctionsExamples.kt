package com.codely.demo

import java.time.LocalDate
import java.time.Period
import kotlin.system.exitProcess

fun thirdtExample() {
    println("Thirt: Please enter a date with the format <yyyy-MM-dd>")
    supportNullableString(readLine())
        .takeUnless {
            it.isNullOrEmpty() || it.isNullOrBlank()
        }?.let {
            LocalDate.parse(it)
        }.apply {
            if (this == null) {
                println("The introduced date <$this> is not valid")
                exitProcess(1)
            }
        }?.also {
            println("You wrote the date $it")
        }?.run {
            val currentDate = LocalDate.now()
            with(Period.between(this, currentDate).years) {
                println("The difference between the date you wrote an today is $this years")
            }
            // run devuelve el body de la funcion y apply devuelve la misma entrada
        }

    println("Bye!")
}


fun secondVersion() {

    println("Introduce date with format 'yyyy-MM-dd'")

    // takeUnless recibe un Predicate sino lo cumple devuelve el objeto sino null
    supportNullableString(readLine()).takeUnless {
        it.isNullOrEmpty() || it.isNullOrBlank()
    }?.let { line -> // El ?.let -> Se ejecutará sólo si es no nulo. Recive la parte de la izq y devuelve la ultima instruccion del body

        // also devuelve la parte de la izquierda (LocalDate.parse(line)) y ejecuta el body del scope, es como el foreach ejecuta side-effects
        val input = LocalDate.parse(line).also {
            println("You wrote $it")
        }
        // with creamos un scope sobre una var o func (en este caso sobre LocalDate.now()) en el cuerpo del nuevo scope
        // accedemos por medio de this
        with(LocalDate.now()){
            val difference = Period.between(input, this).years
            println("The difference between the date you wrote an today is $difference years")
        }

    }

}

fun firstVersion() {

    println("Introduce date with format 'yyyy-MM-dd'")

    val line = supportNullableString(readLine())

    if (line.isNullOrEmpty()) {
        println("Date format is not valid")
        exitProcess(1)
    }

    val date = LocalDate.parse(line)
    val currentDate = LocalDate.now()

    val difference = Period.between(date, currentDate).years

    println("The difference between the date you wrote an today is $difference years")
}

fun main() {
    // firstVersion()
    thirdtExample()
}

private fun supportNullableString(line: String?) = line