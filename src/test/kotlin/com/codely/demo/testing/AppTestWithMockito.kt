package com.codely.demo.testing

import org.junit.jupiter.api.Test
import org.mockito.kotlin.*
import java.time.LocalDate

internal class AppTestWithMockito {

    @Test
    fun `should calculate the difference and return 31 years`() {


        val reader = mock<Reader>()
        val writer = mock<Writer>()
        val clock = mock<Clock>()

        whenever(reader.read()).thenReturn("1990-08-31")
        whenever(clock.now()).thenReturn(LocalDate.parse("2021-08-31"))
        doNothing().`when`(writer).write(any())

        AppTest(reader, writer, clock).execute()

        verify(writer).write("The difference between the date you wrote an today is 31 years")
    }
}

