package app.example.kojaengi._06_코틀린_타입_시스템._널_아님_단언

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.assertThrows
import java.util.*

class Test {

    @org.junit.jupiter.api.Test
    @DisplayName("널 아님 단언, 그럼에도 불구하고 null이라면 NPE 발생을 감수하겠다.")
    fun notNullAssertionTest(){
        val targetStr: String? = null
        assertThrows<NullPointerException> { forceToUppercase(targetStr) }
    }

    /**
     * 문자열을 모두 대문자화 시켜주는 메소드
     *
     * @param str - nullable String
     * @throws NullPointerException - str에 null이 값으로 들어왔을 때.
     */
    private fun forceToUppercase(str: String?) : String{
        // 널 아님 단언문을 통해 Exception 발생 리소스를 감수 함.
        return str!!.uppercase(Locale.ROOT)
    }
}