package app.example.kojaengi.entity

import app.example.kojaengi.dto.LogDto
import java.time.LocalDateTime
import javax.persistence.*

@Entity
open class LoggingEntity() {

    constructor(logDto: LogDto) : this(){
        this.id = null
        this.memberName = logDto.memberName
        this.occurrenceTime = logDto.occurrenceTime
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "logging_id")
    var id: Long? = null

    @Column(name = "member_name", nullable = false)
    var memberName: String? = null
    protected set

    @Column(name = "occurrence_time", nullable = false)
    var occurrenceTime: LocalDateTime? = null
    protected set

}