package app.example.kojaengi._04_클래스_객체_인터페이스._싱글턴을_쉽게_만들기

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow

class SingletonTest {

    @Test
    @DisplayName("object 키워드는 객체 선언과 동시에 단일 인스턴스를 보장한다.")
    fun objectKeywordProvideSingleton(){

        assertDoesNotThrow {
            println(MySQLDataConfig.dataVendor)
            println(MySQLDataConfig.configSerialNum)
        }
    }

    @Test
    @DisplayName("객체 선언은 클래스나 인터페이스를 상속 받을 수 있다.")
    fun objectKeywordCanInheritanceClass(){

        val dataConfigList = listOf(MySQLDataConfig, RedisDataConfig)
        dataConfigList.sortedWith(DataConfig.DataConfigComparator)

        println(dataConfigList)
    }
}