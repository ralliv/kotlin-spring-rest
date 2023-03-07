package com.ralliv.kotlinspringrest.datasource.mock

import com.ralliv.kotlinspringrest.datasource.ObDataSource
import com.ralliv.kotlinspringrest.model.Ob
import org.springframework.stereotype.Repository

@Repository
class MockObDataSource: ObDataSource {
    val obsList = listOf<Ob>(Ob("es", "spain", "Ob spain"))
    override fun getObs(): Collection<Ob> {
        return obsList
    }

    override fun getOb(id: String): Ob {
        return obsList.first { it.id == id }
    }
}