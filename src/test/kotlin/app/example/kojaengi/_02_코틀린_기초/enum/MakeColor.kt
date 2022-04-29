package app.example.kojaengi._02_코틀린_기초.enum

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MakeColor {

    @Test
    fun useColorTest(){
        assertEquals("#F1024", ColorType.ORANGE.code)
        assertEquals("orange", ColorType.ORANGE.colorName)
    }

    /**
     * enum 에 생성자와 프로퍼티를 만들고 접근했다.
     * @see ColorType.sayYourColor 문자열 템플릿을 사용했다.
     */
    @Test
    fun viewSayColorTest(){
        println(ColorType.ORANGE.sayYourColor())
        println(ColorType.BROKEN_GREEN.sayYourColor())
    }
}