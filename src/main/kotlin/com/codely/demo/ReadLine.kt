package com.codely.demo

import java.time.LocalDate


fun main() {

    println("Introduce date with format 'yyyy-MM-dd'")

    val input = readLine()

    val localDate = LocalDate.parse(input)

    println("the date is $localDate and day week is ${localDate.dayOfWeek}")
}