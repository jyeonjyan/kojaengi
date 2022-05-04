package app.example.kojaengi._05_람다로_프로그래밍._컬렉션_검색

import net.bytebuddy.utility.RandomString
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class Person(val age: Int, val name: String)

class Test{

    @Test
    @DisplayName("코틀린은 .maxByOrNull() 함수를 제공한다.")
    fun lambdaWithKotlin(){

        val p1 = Person(12, RandomString.make(5))
        val p2 = Person(15, RandomString.make(5))

        val personList = listOf(p1, p2)
        val olderPerson = personList.maxByOrNull { it.age }

        assertThat(olderPerson).isEqualTo(p2)
    }
}