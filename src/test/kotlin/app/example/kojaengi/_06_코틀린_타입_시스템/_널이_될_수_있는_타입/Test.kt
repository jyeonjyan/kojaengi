package app.example.kojaengi._06_코틀린_타입_시스템._널이_될_수_있는_타입

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.assertThrows

class Test {

    @org.junit.jupiter.api.Test
    @DisplayName("Kotlin은 파라미터에서 nullable, not-null Type을 체크한다.")
    fun ktCheckNullPointer(){
        assertThrows<java.lang.Exception> { NullSafety().paramCanNotBeNull(null) }
    }
}