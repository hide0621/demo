package com.example.hello_app.demo

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Hello {

    @RequestMapping("/")
    fun index(): String {
        return "Hello World!"
    }
}