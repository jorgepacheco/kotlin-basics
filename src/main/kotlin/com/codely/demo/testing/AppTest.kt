package com.codely.demo.testing

import java.time.LocalDate

// Es la forma de 'heredar'

class AppTest(reader: Reader, writer: Writer, clock: Clock) : App(reader, writer, clock) {

    override fun currentDate(): LocalDate = LocalDate.parse("2021-08-31")
}