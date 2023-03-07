package com.ralliv.kotlinspringrest.datasource.mock

import com.ralliv.kotlinspringrest.datasource.ObDataSource
import com.ralliv.kotlinspringrest.model.Ob
import org.springframework.stereotype.Repository

@Repository
class MockObDataSource: ObDataSource {
    var obsList = mutableListOf<Ob>(Ob("es", "spain", "Ob spain"))
    override fun getObs(): Collection<Ob> {
        return obsList
    }

    override fun getOb(id: String): Ob {
        return obsList.firstOrNull{ it.id == id } ?: throw NoSuchElementException("Could not find OB with id $id")
    }

    override fun addOb(ob: Ob): Ob {
        obsList.add(ob)
        return ob
    }
}