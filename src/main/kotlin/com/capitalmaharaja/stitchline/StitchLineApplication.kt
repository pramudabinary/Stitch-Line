package com.capitalmaharaja.stitchline

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class StitchLineApplication

fun main(args: Array<String>) {
    runApplication<StitchLineApplication>(*args)
}
