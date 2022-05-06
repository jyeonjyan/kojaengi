package app.example.kojaengi._05_람다로_프로그래밍._시퀀스_연산_실행

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.time.LocalDateTime
import java.util.stream.Stream
import kotlin.streams.toList

class Test {

    @Test
    @DisplayName("시퀀스 연산의 중간 연산은 항상 지연된다.")
    fun sequenceOperationAlwaysLazy(){
        val loggingList = generateLogging()
        val loggingSequence = loggingList.asSequence().filter { it.msg.split(" ")[1] == "2" }

        // 중간연산:: sequence 반환
        println(loggingSequence)
        // 최종연산:: toList()
        println(loggingSequence.toList())
    }


    private fun generateLogging(): List<Logging> {
        var size = 5 // init

        // 일반 generate()를 사용했을 때.
        val loggingList = Stream
            .generate { Logging("msg ${size--}", LocalDateTime.now()) }
            .limit(5)
            .toList()

        size = 5 // init

        // generateSequence를 사용했을 때.
        return generateSequence {
            Logging("msg ${size--}", LocalDateTime.now())
        }.takeWhile { size > 0 }.toList()
    }

}