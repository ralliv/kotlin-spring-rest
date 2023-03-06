package com.ralliv.kotlinspringrest.datasource.mock

import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test

class MockObDataSourceTest {
    private val mockDataSource = MockObDataSource()
   @Test
    fun `should provide a collection of Obs`() {
        val obs = mockDataSource.getObs()
       assertNotNull(obs)
   }

    @Test
    fun `should provide some mock data`() {
        val obs = mockDataSource.getObs()
        assert(obs.contains(obs.elementAt(0)))
    }

    @Test
    fun `should have defined id`() {
        val obs = mockDataSource.getObs()
        assert(obs.elementAt(0).id == "es")
    }

}