package app.example.kojaengi._02_코틀린_기초.iteration

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.util.*

class IterationEx {

    /**
     * 수에 대한 다양한 iteration 조건
     */
    @Test
    fun hundredToOne(){
        var array = ArrayList<Int>()

        for (i in 100 downTo 1 step 2){
            array.add(i)
        }

        val expected = 100 / 2
        assertEquals(expected, array.size)
    }

    /**
     * 맵에 대한 iteration 조건들
     * 인덱스를 유지하면서 컬렉션을 이터레이션 할 수 있다.
     */
    @Test
    fun mapIterationTest(){
        var treeMap = TreeMap<Char, Int>()

        for(c in 'A'..'G'){
            treeMap[c] = treeMap.getOrDefault(c, 0) + 1
        }

        for((k, v) in treeMap){
            println("key: $k, value $v")
        }
    }

}