package app.example.kojaengi._03_함수_정의와_호출.topLevelFun

import app.example.kojaengi._03_함수_정의와_호출.getUtilFunContent
import org.junit.jupiter.api.Test

class Test {

    @Test
    fun callTopLevelFun(){
        println(getUtilFunContent("jyeonjyan"))
    }
}