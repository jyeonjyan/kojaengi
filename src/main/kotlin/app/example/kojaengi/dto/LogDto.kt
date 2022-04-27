package app.example.kojaengi.dto

data class LogDto(val id: Long? = null){

    var memberName: String = ""
    var occurrenceTime: String = ""

    val description = "log를 찍기 위한 dataClass"
}
