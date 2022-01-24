package com.codely.demo.cat

class ListCatRepository() : CatRepository {

    private var persistance: List<Cat> = listOf()

    override fun save(cat: Cat) {
        persistance.toMutableList().apply {
            add(cat)
            persistance = toList()
        }

    }
}