package app.example.kojaengi.service

import app.example.kojaengi.dto.LogDto
import app.example.kojaengi.entity.LoggingEntity
import app.example.kojaengi.repository.LoggingRepository
import org.springframework.stereotype.Service
import java.sql.DriverManager.println

@Service
class LoggingService(private val loggingRepository: LoggingRepository) {

    fun addLogging(logDto: LogDto){
        val loggingEntity = LoggingEntity(logDto)
        val save = loggingRepository.save(loggingEntity)

        println(save.toString())
    }
}