package app.example.kojaengi._06_코틀린_타입_시스템._안전한_캐스트

import org.junit.jupiter.api.DisplayName

class Test {

    @org.junit.jupiter.api.Test
    @DisplayName("안전한 캐스트 as? 실습")
    fun safetyCastTest(){
        val person = Person("jyeonjyan")
        println(getIfNameExistOrElse(person))
    }

    /**
     * person으로 cast 하지 못하면 undefined를, cast 가능하면 그 person.name을 리턴한다.
     */
    private fun getIfNameExistOrElse(any: Any?) : String {
        val result: String = "undefined"

        /* Any? 는 Nullable 하기 때문에 elvis로 추가적으로 handling 해준다. */
        val person = any as? Person ?: return result
        return person.name
    }
}