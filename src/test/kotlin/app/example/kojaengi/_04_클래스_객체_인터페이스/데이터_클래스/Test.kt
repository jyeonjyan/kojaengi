package app.example.kojaengi._04_클래스_객체_인터페이스.데이터_클래스

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow

class Test {

    @Test
    @DisplayName("데이터 클래스를 사용한다면 오브젝트 메소드를 재정의 할 필요 없다.")
    fun dataClassProvideManyMethod(){
        val airFlow = AirFlow("jyeonjyan", "ab180")

        /**
         * val 로 선언했지만 내부적으로 getter 를 지원 해주었다.
         */
        assertDoesNotThrow {
            println(airFlow.toString())
            println(airFlow.requester)
            println(airFlow.manager)
        }
    }
}