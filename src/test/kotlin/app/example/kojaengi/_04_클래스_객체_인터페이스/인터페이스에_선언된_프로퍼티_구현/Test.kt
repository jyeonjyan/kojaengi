package app.example.kojaengi._04_클래스_객체_인터페이스.인터페이스에_선언된_프로퍼티_구현

import org.junit.jupiter.api.Test

interface User {

    /* 코틀린에서는 추상 프로퍼티를 선언할 수 있다. */
    val nickname: String
    val email: String


    /**
     * 게터 세터가 뒷받침하는 프로퍼티를 만들 수 있다.
     * 무조건 override 하지 않아도 된다. (default 확장판 느낌)
     */
    val platformDomainName: String
        get() = email.substringAfter('@')
}

class UserParser(override val email: String): User{
    override val nickname: String
        get() = email.substringBefore("@")
}

class Test{

    @Test
    fun test() {
        val userParser = UserParser("s20062@gsm.hs.kr")

        print("email: ${userParser.email} " +
                "nickname(gen by override fun): ${userParser.nickname} " +
                "platform: ${userParser.platformDomainName}")
    }
}