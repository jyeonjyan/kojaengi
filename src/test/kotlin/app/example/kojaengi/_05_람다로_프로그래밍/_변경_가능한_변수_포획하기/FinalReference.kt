package app.example.kojaengi._05_람다로_프로그래밍._변경_가능한_변수_포획하기

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class FinalReference {

    @Test
    @Disabled
    @DisplayName("변경 가능한 변수 포획하기")
    fun captureVariable(){
        val listOf = listOf(0, 2, 4, 6, 8, 10)
        val nextInteger = {(listOf.maxOf { it }) + 1}

        println(nextInteger)
        assertTrue(nextInteger.equals(11))
    }
}