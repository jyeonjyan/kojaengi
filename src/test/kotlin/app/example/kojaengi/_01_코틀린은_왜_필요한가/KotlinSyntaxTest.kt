package app.example.kojaengi._01_코틀린은_왜_필요한가

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow

class KotlinSyntaxTest {


    /**
     * 어떤 객체를 다른 타입으로 캐스트 하기 전에 타입을 미리 검사하지 않으면..
     * 검사 할 수 있는 expression (x is T)
     *
     * @see ClassCastException 타입을 미리 검사하지 않으면 발생한다.
     */
    @Test
    fun classCastExTest(){
        val s = "lowercase"

        assertDoesNotThrow {
            if (s is String) {
                s.uppercase()
            }
        }
    }


}