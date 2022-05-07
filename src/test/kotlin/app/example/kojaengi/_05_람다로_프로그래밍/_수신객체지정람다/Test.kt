package app.example.kojaengi._05_람다로_프로그래밍._수신객체지정람다

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class Test {

    @Test
    @DisplayName("자바에 있는 기능 + 수신 객체 지정 람다(with(), apply())")
    fun originIsEqualsTo(){
        /**
         * 리팩토링이 되었다고 느끼나 ?
         * Kotlin 이해도에 따라 유지보수 하기 어려운 코드가 될 수도 있다.
         */
        assertThat(getStringCombinationTypeA())
            .isEqualTo(getStringCombinationTypeB())
            .isEqualTo(getStringCombinationTypeC())
            .isEqualTo(getStringCombinationTypeD())
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

    /**
     * with()
     */
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

    /**
     * when()
     */
    private fun getStringCombinationTypeC() = with(StringBuilder()){
        this.append("hello ")
        for (i in 1..10){
            append(i)
        }
        this.append(" world")

        toString()
    }

    /**
     * apply() :: 수신 객체 == 반환 객체
     * 1. 즉시 프로퍼티 중 일부를 일정 값으로 초기화해야 하는 경우 유용하다.
     * 2. Java 의 Builder 객체 없이 초기화 부분을 apply()로 활용할 수 있다.
     */
    private fun getStringCombinationTypeD() = StringBuilder().apply {
        this.append("hello ")
        for (i in 1..10){
            append(i)
        }
        this.append(" world")
    }.toString()
}