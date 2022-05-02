package app.example.kojaengi._02_코틀린_기초.ifExpression

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ifExTest {

    @Test
    @DisplayName("Kotlin에서 if는 문(statement)가 아닌 식(expression)이다.")
    fun ifExTest(){
        println(statusMessage())
    }

    private fun statusMessage(): String{
        val isStatusGood = true
        return if (isStatusGood) "yes keep going" else "broken"
    }
}