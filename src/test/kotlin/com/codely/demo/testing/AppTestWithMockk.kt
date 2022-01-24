package com.codely.demo.testing

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test
import java.time.LocalDate

class AppTestWithMockk {

    @Test
    fun `should calculate the difference and return 31 years`() {
        val reader = mockk<Reader>()
        val writer = mockk<Writer>(relaxed = true)
        val clock = mockk<Clock>()
        val app = App(reader, writer, clock)
        every { reader.read() } returns "1990-08-31"
        every { clock.now() } returns LocalDate.parse("2021-08-31")

        app.execute()

        verify { writer.write("The difference between the date you wrote an today is 31 years") }
    }

}

