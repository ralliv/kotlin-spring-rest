package com.ralliv.kotlinspringrest.controller

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@SpringBootTest
@AutoConfigureMockMvc
internal class ObControllerTest {
    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun `should return all obs`() {
        //integration test
        mockMvc.get("/obs").andDo { print() }.andExpect { status { isOk()
        jsonPath("$[0].id"){
            content { contentType(MediaType.APPLICATION_JSON) }
            value("es")
        }} }
    }
}