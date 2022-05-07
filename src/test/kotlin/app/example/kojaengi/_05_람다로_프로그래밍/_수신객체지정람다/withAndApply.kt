package app.example.kojaengi._05_람다로_프로그래밍._수신객체지정람다

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class withAndApply {

    @Test
    @DisplayName("자바에서는 이런 느낌으로 코딩 할 것이다.")
    fun origin(){
        assertThat(getStringCombinationTypeA())
            .isEqualTo(getStringCombinationTypeB())
            .isEqualTo(getStringCombinationTypeC())
    }

    private fun getStringCombinationTypeA(): String{
        val sb = StringBuilder()
        sb.append("hello ")

        for (i in 1..10){
            sb.append(i)
        }

        sb.append(" world")

        return sb.toString()
    }

    private fun getStringCombinationTypeB(): String {
        val sb = StringBuilder()

        return with(sb) {
            sb.append("hello ")
            for (i in 1..10){
                sb.append(i)
            }
            sb.append(" world")

            this.toString()
        }
    }

    private fun getStringCombinationTypeC() = with(StringBuilder()){
        this.append("hello ")
        for (i in 1..10){
            append(i)
        }
        this.append(" world")

        toString()
    }
}