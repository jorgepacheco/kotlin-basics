package com.codely.demo.cat

sealed class CatCreatedException(msg: String) : IllegalArgumentException(msg)

class InvalidName(name: String?) : CatCreatedException("<$name> is not a valid name")
class InvalidBirthDate(name: String?) : CatCreatedException("<$name> is not a valid name")
class InvalidOrigin(origin: String?) : CatCreatedException("<$origin> is not a valid origin")
class InvalidColor(color: String?) : CatCreatedException("<$color> is not a valid color")
class InvalidVaccinated(vaccinated: String?) : CatCreatedException("<$vaccinated> is not a valid name")
class InvalidId(id: String?) : CatCreatedException("<$id> is not a valid name")
