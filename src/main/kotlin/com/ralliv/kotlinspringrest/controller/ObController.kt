package com.ralliv.kotlinspringrest.controller

import com.ralliv.kotlinspringrest.model.Ob
import com.ralliv.kotlinspringrest.service.ObService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

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
}
