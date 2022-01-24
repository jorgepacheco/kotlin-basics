package com.codely.demo.cat

import java.time.LocalDate
import java.util.*

data class Cat(
    val id: UUID,
    val name: String,
    val origin: String,
    val vaccinated: Boolean,
    val dewormed: Boolean = true,
    val color: Color,
    val birthDate: LocalDate,
    val createdAt: LocalDate
) {

    enum class Color {
        BLACK, RED, CINNAMON, BLUE, CREAM, LILAC, FAWN, WHITE
    }

    companion object {
        fun vaccinatedWith(
            id: UUID,
            name: String,
            origin: String,
            birthDate: LocalDate,
            color: String,
            createdAt: LocalDate
        ) = Cat(
            id = id,
            name = name,
            origin = origin,
            vaccinated = true,
            birthDate = birthDate,
            createdAt = createdAt,
            color = Color.valueOf(color)
        )

        fun notVaccinatedWith(
            id: UUID,
            name: String,
            origin: String,
            birthDate: LocalDate,
            color: String,
            createdAt: LocalDate
        ) = Cat(
            id = id,
            name = name,
            origin = origin,
            vaccinated = false,
            birthDate = birthDate,
            createdAt = createdAt,
            color = Color.valueOf(color)
        )
    }
}
