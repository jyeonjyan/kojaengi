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
}