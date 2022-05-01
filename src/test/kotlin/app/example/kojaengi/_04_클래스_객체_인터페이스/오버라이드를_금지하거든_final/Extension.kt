package app.example.kojaengi._04_클래스_객체_인터페이스.오버라이드를_금지하거든_final

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow

open class Extension : Module{

    @Test
    @DisplayName("override method is normally working")
    fun executor(){
        assertDoesNotThrow { safeMethod() }
    }

    /**
     * 기본적으로 override method는 open이다.
     * 캡슐화 하고자 한다면 final로 선언해줘야 한다.
     *
     * @see Module.safeMethod
     */
    final override fun safeMethod() {
        println("===== last override method ====")
    }
}