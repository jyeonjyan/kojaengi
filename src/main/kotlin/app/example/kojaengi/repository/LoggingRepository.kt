package app.example.kojaengi.repository

import app.example.kojaengi.entity.LoggingEntity
import org.springframework.data.jpa.repository.JpaRepository

interface LoggingRepository : JpaRepository<LoggingEntity, Long>{
}