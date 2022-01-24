package com.codely.demo.cat

import java.util.*

class MapCatRepository : CatRepository {
    private var persistance: Map<UUID, Cat> = mapOf()

    override fun save(cat: Cat) {
        persistance.toMutableMap().apply {
            this[cat.id] = cat
            persistance = toMap()
        }
    }
}