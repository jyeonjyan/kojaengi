package app.example.kojaengi._04_클래스_객체_인터페이스.clone_메소드

import net.bytebuddy.utility.RandomString
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.time.LocalDateTime

class Test {

    @Test
    @DisplayName("clone 메소드:: Kotlin은 위임을 쉽게 사용할 수 있게 해주는 기능을 제공한다.")
    fun deepCopyTest(){
        val origin = CopyTarget(LocalDateTime.now(), RandomString.make(5))
    }
}