package app.example.kojaengi._05_람다로_프로그래밍._로컬_변수_접근

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow

class LoggingSystem {

    @Test
    @DisplayName("람다식에서 바깥 변수를 변경할 수 있다")
    fun changeOuterObjectInLambda(){
        var damage = 0
        var rangeOfRecover = 0
        val priority = listOf(3, 5, 2, 5, 2, 9, 6)

        assertDoesNotThrow {

            priority.forEach {
                if (it > 4){
                    damage += it
                } else {
                    rangeOfRecover += it
                }
            }
        }

        println("damage = $damage rangeOfRecover = $rangeOfRecover")
    }
}