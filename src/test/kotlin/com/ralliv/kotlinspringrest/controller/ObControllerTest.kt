package com.ralliv.kotlinspringrest.controller

import com.fasterxml.jackson.databind.ObjectMapper
import com.ralliv.kotlinspringrest.model.Ob
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import org.springframework.test.web.servlet.post

@SpringBootTest
@AutoConfigureMockMvc
internal class ObControllerTest @Autowired constructor( val mockMvc: MockMvc, val objectMapper: ObjectMapper) {

    private val baseUrl = "/obs"
    @Test
    fun `GET all obs - should return all obs`() {
        //integration test
        mockMvc.get("/obs").andDo { print() }.andExpect { status { isOk()
        jsonPath("$[0].id"){
            content { contentType(MediaType.APPLICATION_JSON) }
            value("es")
        }} }
    }

    @Test
    fun `GET obs by id - should return single ob`() {
        val obId = "es"
        //integration test
        mockMvc.get("/obs/$obId")
            .andDo { print() }
            .andExpect {
                status { isOk() }
            }
    }

    @Test
    fun `GET obs by id - should return  not  found if not exists`() {
        val obId = "test"
        //integration test
        mockMvc.get("/obs/$obId")
            .andDo { print() }
            .andExpect {
                status { isNotFound() }
            }
    }

    @Test
    fun `POST obs`() {
        val ob = Ob("pt", "brazil", "Ob brazil")
        //integration test
        mockMvc.post(baseUrl){
            contentType = MediaType.APPLICATION_JSON
            content = objectMapper.writeValueAsString(ob)
        }
            .andDo { print() }
            .andExpect {
                status { isCreated() }
            }
    }
}