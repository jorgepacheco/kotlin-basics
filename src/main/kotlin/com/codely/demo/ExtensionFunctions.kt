package com.codely.demo

import java.time.LocalDate
import java.time.Period
import kotlin.system.exitProcess

fun main() {
    println("Thirt: Please enter a date with the format <yyyy-MM-dd>")
    supportNullableString(readLine())
        .takeUnless {
            it.isNullOrEmpty() || it.isBlank()
        }?.let {
            LocalDate.parse(it)
        }.apply {
            // If ya que solo hay 2 caminos
            if (this == null) {
                println("The introduced date <$this> is not valid")
                exitProcess(1)
            }
        }?.also {
            println("You wrote the date $it")
        }?.run {
            this.calculateDifference()
        }

    println("Bye!")
}


private fun supportNullableString(line: String?) = line


private fun LocalDate.calculateDifference() = with(Period.between(this, LocalDate.now())) {
    when{
        years > 0 -> println("The difference between the date you wrote an today is $years years")
        months > 0 -> println("The difference between the date you wrote an today is $months month")
        days > 0 -> println("The difference between the date you wrote an today is $days days")
    }

}