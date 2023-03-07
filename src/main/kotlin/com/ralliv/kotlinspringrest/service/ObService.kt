package com.ralliv.kotlinspringrest.service

import com.ralliv.kotlinspringrest.datasource.ObDataSource
import com.ralliv.kotlinspringrest.model.Ob
import org.springframework.stereotype.Service

@Service
class ObService (private val dataSource: ObDataSource) {
    fun getObs(): Collection<Ob> {
        return dataSource.getObs()
    }

    fun getOb(id: String): Ob {
        return dataSource.getOb(id)
    }

    fun addOb(ob: Ob): Ob {
        return dataSource.addOb(ob)
    }
}