package app.example.kojaengi._04_클래스_객체_인터페이스._팩토리_메소드

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class Test {

    @Test
    @DisplayName("동반객체:: 팩토리 메소드를 이용한 객체 생성")
    fun makeOwnTesla(){

        val myTesla = Tesla.makeTesla("model3")
        println(myTesla.toString())
    }
}