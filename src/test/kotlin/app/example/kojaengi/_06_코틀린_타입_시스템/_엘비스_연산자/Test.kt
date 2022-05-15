package app.example.kojaengi._06_코틀린_타입_시스템._엘비스_연산자

import org.junit.jupiter.api.DisplayName

class Test {

    @org.junit.jupiter.api.Test
    @DisplayName("엘비스 연산자의 사용")
    fun usingElvisOperator(){
        var s1: String?
        var s2: String?

        s1 = null
        s2 = "world"

        howManyNullIn(s1, s2)
    }

    private fun howManyNullIn(vararg s: String?) {

        for (i in s.indices){
            s[i] ?: print("it's null index: $i")
        }
    }
}