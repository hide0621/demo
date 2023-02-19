package com.example.hello_app.demo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class Hello {

    @RequestMapping("/")
    fun index(model: Model): String {
        model.addAttribute("Greeting", "Hello World!")
        return "index"
    }
}