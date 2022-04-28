package app.example.kojaengi.dto

import java.time.LocalDateTime

data class LogDto(
    val id: Long? = null,
    val localDateTime: LocalDateTime = LocalDateTime.now()
){

    var memberName: String = ""
    var occurrenceTime: LocalDateTime = localDateTime

    val description = "log를 찍기 위한 dataClass"
}
