package com.codely.demo.cat

import com.codely.demo.shared.Clock
import com.codely.demo.shared.Reader
import com.codely.demo.shared.Writer
import java.time.LocalDate
import java.util.*

class CatCreator(val reader: Reader, val writer: Writer, val clock: Clock, val repository: CatRepository) {
    fun create(): Cat {

        val id = obtainInput("Please enter an id for your cat")
        val name = Name.from(obtainInput("Please enter the name of your cat"))
        val origin = obtainInput("Please enter where your cat came from")
        val vaccinated = obtainInput("Is your cat vaccinated?")
        val color = obtainInput("What is the color of your cat?")
        val birthDate = obtainInput("When did your cat birth?")
        val dewormed = obtainInput("Is your cat dewormed?")


        if (origin.isNullOrEmpty() || origin.isNullOrBlank()) {
            throw InvalidOrigin(origin)
        }


        val cat = Cat(
            id = UUID.fromString(id),
            name = name.value,
            origin = origin,
            vaccinated = vaccinated.toBoolean(),
            dewormed = dewormed.toBoolean(),
            birthDate = LocalDate.parse(birthDate),
            createdAt = clock.now(),
            color = Cat.Color.from(color)
        )
        repository.save(cat)
        return cat
    }

    private fun obtainInput(message: String) = writer.write(message).run { reader.read() }
}