package app.example.kojaengi._05_람다로_프로그래밍._컬렉션_함수형_API

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class Test {

    @Test
    @DisplayName("5.2.1. 필수적인 함수: filter 와 map")
    fun test(){
        val userList = initUser()

        val expression = userList.filter { f -> f.name.equals("name1") }.map { it.age }
        assertThat(expression).isEqualTo(listOf(14))
    }

    @Test
    @DisplayName("5.2.2. all, any, count, find: 컬렉션에 술어 적용")
    fun allAnyCountFindTest(){
        val userList = initUser()

        // all, any
        val isFourteenExist = userList.any { f -> f.age == 14 }
        val isAllUserFourteen = userList.all { f -> f.age == 14 }

        assertThat(isFourteenExist).isTrue
        assertThat(isAllUserFourteen).isFalse

        // count, find
        val userAgeFourteen = userList.count { f -> f.age == 14 }
        val findByUserAge = userList.find { f -> f.age == 14 } // first or null

        assertThat(userAgeFourteen).isEqualTo(1)
        assertThat(findByUserAge).isNotNull
    }

    @Test
    @DisplayName("함수를 적재적소에 사용하라")
    fun funUseBeNice(){
        val userList = initUser()

        val size = userList.filter { f -> f.age == 15 }.size
        val count = userList.count { f -> f.age == 15 }
    }

    @Test
    @DisplayName("5.2.3 groupBy: 리스트를 여러 그룹으로 이뤄진 맵으로 변경")
    fun groupByTest(){
        val userList = initUser()
        // 안전한 호출 연산자 ? it.name == null 이면 .get() 하지 않음
        val groupBy = userList.groupBy { it.name?.get(0) }

        println(groupBy)
    }

    @Test
    @DisplayName("5.2.4. flatMap과 flatten: 중첩된 컬렉션 안의 원소 처리")
    fun flatMapFlattenTest(){
        val stringList = listOf("abcd", "efgh", "abcd")
        // it 을 toList화 한것을 하나의 리스트로 모은다는.
        println(stringList.flatMap { it.toList() }.toSet())
    }


    private fun initUser(): List<User> {
        val user1 = User("name1", 14)
        val user2 = User("name2", 15)
        val user3 = User("anonymous", 16)

        return listOf(user1, user2, user3)
    }
}