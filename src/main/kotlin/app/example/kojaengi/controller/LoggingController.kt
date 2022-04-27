package app.example.kojaengi.controller

import app.example.kojaengi.dto.LogDto
import app.example.kojaengi.service.LoggingService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class LoggingController(private val loggingService: LoggingService) {

    @PostMapping("/api/logging")
    fun addLogging(@RequestBody logDto: LogDto){
        loggingService.addLogging(logDto)
    }

}