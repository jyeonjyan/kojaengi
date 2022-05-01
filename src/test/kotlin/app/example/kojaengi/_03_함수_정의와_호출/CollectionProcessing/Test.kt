package app.example.kojaengi._03_함수_정의와_호출.CollectionProcessing

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class Test {

    @Test
    @DisplayName("vararg 키워드를 사용하면 호출 시 인자가 달라질 수 있는 함수를 정의할 수 있다.")
    fun varargTest(){
        println(myFun("hello", "world"))
    }

    private fun<T> myFun(vararg element: T): CharSequence {
        val stringBuilder = StringBuilder()

        for (i in element.indices){
            if (element[i] is String) {
                stringBuilder.append(element[i]).append(" ")
            }
        }

        return stringBuilder.trim()
    }

    @Test
    @DisplayName("infix call:: 중위 호출")
    fun infixCallTest(){
        // to는 확장함수다 to를 사용하면 타입과 상관없이 임의의 순서쌍을 만들 수 있다.
        println(mapOf("key" to "value", "k" to "v"))
    }
}