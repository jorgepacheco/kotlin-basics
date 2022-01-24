package com.codely.demo.cat

import java.util.*

class MutableMapCatRepository : CatRepository {
    private var persistance: MutableMap<UUID, Cat> = mutableMapOf()

    override fun save(cat: Cat) {
        persistance[cat.id] = cat
    }

}