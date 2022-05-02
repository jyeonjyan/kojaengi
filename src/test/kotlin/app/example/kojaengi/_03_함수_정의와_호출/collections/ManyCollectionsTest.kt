package app.example.kojaengi._03_함수_정의와_호출.collections

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ManyCollectionsTest {

    @Test
    @DisplayName("코틀린은 자신만의 컬렉션 기능을 제공하지 않는다. 완전히 자바와 일치하다.")
    fun hashSetDS(){
        val hashSet = hashSetOf(1, 3, 5, 7)
        hashSet.add(3)

        // because. hashing
        val expected = 4

        assertThat(hashSet.size).isEqualTo(expected)
    }

    @Test
    @DisplayName("코틀린 컬렉션을 print 한다면 디폴트 toString()이 기본적으로 붙는다.")
    fun printArrWithToString(){
        val arrayList = arrayListOf(1, 2, 3, 4)

        // [1, 2, 3, 4]
        println(arrayList)
    }
}