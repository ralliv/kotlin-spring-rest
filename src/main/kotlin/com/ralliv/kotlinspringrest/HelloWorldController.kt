package com.ralliv.kotlinspringrest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("hello")
class HelloWorldController {

    @GetMapping
    fun helloWorld(): String {
        return "welcome to my new endpoint"
    }

    @GetMapping("outro")
    fun outro(): String {
        return "welcome to my other endpoint"
    }
}