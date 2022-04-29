package app.example.kojaengi._02_코틀린_기초.smartCast

import org.junit.jupiter.api.Test

class SmartCastTest {

    @Test
    fun smartCastIsWorkingTest() {
        println(Sum(Sum(Num(5), Num(6)), Num(4)))
    }

}