package app.example.kojaengi._06_코틀린_타입_시스템._안전한_호출_연산자

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.assertDoesNotThrow

class Test {

    @org.junit.jupiter.api.Test
    @DisplayName("안전한 호출 연산자는 null, not-null에 따라 다른 operation을 취한다.")
    fun safeCallOperator(){
        assertDoesNotThrow { Foo(null).getFooValLength() }
    }
}