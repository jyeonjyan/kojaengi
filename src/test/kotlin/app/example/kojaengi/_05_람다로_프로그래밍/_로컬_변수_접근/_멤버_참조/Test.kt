package app.example.kojaengi._05_람다로_프로그래밍._로컬_변수_접근._멤버_참조

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class Test {

    @Test
    @DisplayName("멤버 참조 문법:: 그림 5.2")
    fun memberReferenceSyntax(){
        val user1 = User("blackListUser")
        val user2 = User("whiteListUser")

        val userList = listOf(user1, user2)
        val findUser = userList.filter { targetUser: User -> targetUser.name.equals("whiteListUser") }

        assertEquals(user2, findUser.getOrNull(0))
    }
}