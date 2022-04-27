package app.example.kojaengi.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class LoggingEntity(memberName: String, occurrenceTime: String) {

    @Id
    @Column(name = "logging_id")
    var id: Long? = null

    @Column(name = "occurrence_time")
    var occurrenceTime: String? = null
}