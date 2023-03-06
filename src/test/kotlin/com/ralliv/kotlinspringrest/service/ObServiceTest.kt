package com.ralliv.kotlinspringrest.service

import com.ralliv.kotlinspringrest.datasource.ObDataSource
import com.ralliv.kotlinspringrest.model.Ob
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

internal class ObServiceTest {
    //le indicamos que sea un mock
    private val dataSource: ObDataSource = mockk()
    private val obService = ObService(dataSource)
    @Test
    fun `should call datasource to retrieve obs`() {
        //mock de la funcion getObs
        every { dataSource.getObs() } returns listOf<Ob>(Ob("es", "spain", "Ob spain"))
        obService.getObs()
        //comprueba que se está llamando a dataSource.getObs al menos una vez
        verify (exactly = 1) { dataSource.getObs() }
    }
}