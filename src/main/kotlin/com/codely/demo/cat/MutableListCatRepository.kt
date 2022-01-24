package com.codely.demo.cat

class MutableListCatRepository() : CatRepository {

    private var persistance: MutableList<Cat> = mutableListOf()

    override fun save(cat: Cat) {
        persistance.add(cat)
    }
}