package app.example.kojaengi._05_람다로_프로그래밍._컬렉션_함수형_API.filterAndMap

import app.example.kojaengi._05_람다로_프로그래밍._컬렉션_함수형_API.User
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class Test {

    @Test
    @DisplayName("5.2.1. 필수적인 함수: filter 와 map")
    fun test(){
        val user1 = User("name1", 14)
        val user2 = User("name2", 15)
        val userList = listOf(user1, user2)

        val expression = userList.filter { f -> f.name.equals("name1") }.map { it.age }
        assertThat(expression).isEqualTo(listOf(14))
    }
}