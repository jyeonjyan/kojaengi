package app.example.kojaengi._04_클래스_객체_인터페이스._팩토리_메소드._동반객체도_일반객체

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow

class Test {

    @Test
    @DisplayName("동반객체도 일반객체다 이름을 부여할 수 있고 인터페이스를 구현할 수 있다.")
    fun companionObjectIsBasicObject(){
        val TMX = Tesla.TeslaFactory.orderTeslaModelX("myTeslaModelX")

        assertDoesNotThrow {
            println(TMX.toString())
            println(Tesla.getWarrantyPeriod())
        }
    }
}