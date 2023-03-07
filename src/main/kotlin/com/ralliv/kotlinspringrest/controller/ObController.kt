package com.ralliv.kotlinspringrest.controller

import com.ralliv.kotlinspringrest.model.Ob
import com.ralliv.kotlinspringrest.service.ObService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("obs")
class ObController(private val service: ObService) {
    @GetMapping
    fun getObs(): Collection<Ob> {
        return service.getObs()
    }

    @GetMapping("/{id}")
    fun getOb(@PathVariable id: String): Ob {
        return service.getOb(id)
    }
    //map internal exception coming from kotlin
    @ExceptionHandler(NoSuchElementException::class)
    fun handleNotFound(e: NoSuchElementException): ResponseEntity<String> {
        return ResponseEntity(e.message, HttpStatus.NOT_FOUND) //return http response
    }
}
