package com.example.demo.home

import org.slf4j.LoggerFactory
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {
    private val log = LoggerFactory.getLogger(HomeController::class.java)

    @GetMapping("/")
    fun home() : String {
        return "Hello World!"
    }

    @PostMapping("/", consumes = [ MediaType.APPLICATION_JSON_VALUE ])
    fun handleMessage(@RequestBody json: String) {
        log.info(json)
    }
}