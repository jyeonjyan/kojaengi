package app.example.kojaengi._04_클래스_객체_인터페이스.주_생성자와_초기화_블록

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class Client {

    @Test
    @DisplayName("내 이름을 붙여 테슬라를 구입한다:: 생성자 파라미터가 프로퍼티 초기화 역할까지 한다.")
    fun buyTesla(){

        /**
         * 일반적으로 생성자 파라미터 값으로 프로퍼티를 초기화 할 때.
         * @see Tesla
         */
        val myTesla = Tesla("tesla.com")
        println(myTesla.toString())

        /**
         * 주 생성자의 파라미터로 초기화 한다.
         * @See Teslam
         */
        val myTeslam = Teslam("jyeonjyan의 model3")
        println(myTesla.toString())

        /**
         * 생성자에 디폴트 값을 제공한다.
         * @see TeslaModel3
         */
        val teslaModel3 = TeslaModel3("흰둥이 teslaModel3!!")
        println(teslaModel3.isLongRange) // false :: default
    }
}