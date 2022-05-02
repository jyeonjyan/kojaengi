package app.example.kojaengi._03_함수_정의와_호출.topLevelFun

import app.example.kojaengi._03_함수_정의와_호출.getUtilFunContent
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class Test {

    /**
     * package의 최상위 fun()을 호출한다.
     * @see ../Util.kt
     */
    @Test
    @DisplayName("최상위 함수를 호출한다.")
    fun callTopLevelFun(){
        println(getUtilFunContent("jyeonjyan"))
    }
}