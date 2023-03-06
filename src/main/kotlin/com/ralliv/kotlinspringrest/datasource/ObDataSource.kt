package com.ralliv.kotlinspringrest.datasource

import com.ralliv.kotlinspringrest.model.Ob

interface ObDataSource {
    fun getObs(): Collection<Ob>
}