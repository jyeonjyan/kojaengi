package app.example.kojaengi._04_클래스_객체_인터페이스.innerNestedClass

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.time.LocalDateTime

class Test {

    @Test
    @DisplayName("nested-class inner-class 어떤 부분에서의 차이가 있는지")
    fun accessTest(){

        /**
         * @see InnerClassEx.MyInnerClass 는 inner-class로 외부 클래스 객체 생성 없이 직접 객체를 생성할 수 없습니다.
         * @see InnerClassEx.MyNestedClass 는 nested-class로 바로 객체를 생성할 수 있습니다.
         */
        InnerClassEx().MyInnerClass(LocalDateTime.now()).executor()
        InnerClassEx.MyNestedClass(LocalDateTime.now()).executor()
    }
}