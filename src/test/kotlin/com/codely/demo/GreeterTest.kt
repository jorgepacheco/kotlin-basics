package com.codely.demo

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class GreeterTest{

    @Test
    internal fun `should return greeter`() {
        val expectedGreeter = "Hello caracola ...."
        assertEquals(expectedGreeter, Greeter().hello())
    }
}