package app.example.kojaengi._02_코틀린_기초.`when`

import org.junit.jupiter.api.Test

class WhenExTest {

    @Test
    fun executor(){
        val myCash = 10000
        val yourCash = 2000

        /**
         * ==== expected console ====
         *
         * gold spoon !
         * ordinary person
         */
        println(wealthAssessment(myCash))
        println(wealthAssessment(yourCash))
    }

    /**
     * Kotlin 에서의 When 개념을 적용시켰고.
     * 범위 이터레이션 (in, ..) 을 사용하였다.
     */
    private fun wealthAssessment(cash: Int) = when{
        cash in 1000..9999 -> "ordinary person !"
        10000 <= cash -> "gold spoon !"

        else -> {"undefined"}
    }
}