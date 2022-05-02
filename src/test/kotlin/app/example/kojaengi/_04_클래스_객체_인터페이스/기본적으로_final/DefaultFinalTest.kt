package app.example.kojaengi._04_클래스_객체_인터페이스

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class DefaultFinalTest {

    @Test
    @DisplayName("Kotlin의 클래스, 프로퍼티는 기본적으로 final 이다")
    fun cannotExtendsTest(){
        var msg: String = "hello msg"
        executor(msg)
    }

    // 메소드 파라미터는 기본적으로 final
    private fun executor(msg: String){
//        msg = "it's changed!"  -> is not work because:: local msg is final
        println(msg)
    }
}

// Kotlin 은 기본적으로 final 클래스 open 키워드로 외부에서의 접근을 열어줘야 함
open class OpenClass
class ClosedClass