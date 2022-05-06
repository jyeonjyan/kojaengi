package app.example.kojaengi._05_람다로_프로그래밍._시퀀스_연산_실행

import java.time.LocalDateTime

class Logging(val msg: String, val localDateTime: LocalDateTime) {

    override fun toString(): String {
        return "Logging(msg='$msg', localDateTime=$localDateTime)"
    }
}