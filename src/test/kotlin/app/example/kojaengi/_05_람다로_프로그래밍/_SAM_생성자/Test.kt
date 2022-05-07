package app.example.kojaengi._05_람다로_프로그래밍._SAM_생성자

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class Test {

    @Test
    @DisplayName("SAM:: 메소드를 핵심 로직으로 미리 만들어두고 사용할 수 있다.")
    fun methodByUnit(){
        val unitByFISayHello = FI { println("hello functional interface") }
        // console.log: println() ⬆️
        unitByFISayHello.doCreate()
    }

    @Test
    @DisplayName("Kotlin에서는 람다를 명시적인 object 선언을 통해 사용할 수 있다.")
    fun kotlinLambdaProperty(){
        /**
         * objectMethod 를 사용해서 인스턴스를 재사용 할 수 있다.
         */
        val objectMethod = Runnable { println("expect this sentence execute") }

        objectMethod.run()
    }

    @Test
    @DisplayName("Kotlin 람다를 함수형 인터페이스로 명시적으로 할 수 있다.")
    fun moreExplicit(){
        willReturnRunnableMethod().run()
    }

    private fun willReturnRunnableMethod(): Runnable {
        return Runnable { println("method call") }
    }

    @Test
    @DisplayName("SAM 장점은 이렇게 정리할 수 있겠다.")
    fun teslaModel3SystemTest(){
        isTeslaWarrantyOK().checkTripLog(12314)
    }

    private fun isTeslaWarrantyOK(): TeslaTrip {
        // object 를 사용해서 단일 인스턴스를 보장한다.
        return object : TeslaTrip {
            override fun checkTripLog(teslaSerialNumber: Number) {
                println("$teslaSerialNumber tesla warranty ok")
            }
        }
    }
}