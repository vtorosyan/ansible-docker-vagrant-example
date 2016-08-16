package com.example

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloController {

    @RequestMapping("/{name}")
    fun hello(@PathVariable name: String): String {
        return "Hello ".plus(name)
    }

}