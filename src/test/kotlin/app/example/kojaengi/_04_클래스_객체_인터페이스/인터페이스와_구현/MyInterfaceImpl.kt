package app.example.kojaengi._04_클래스_객체_인터페이스.인터페이스와_구현

import org.junit.jupiter.api.Test

class MyInterfaceImpl: MyInterface {

    private val className: String = "MyInterfaceImpl"

    override fun sayHello() {
        println("welcome $className !!")
    }

    @Test
    fun callSayHello(){
        /*
        output

        welcome MyInterfaceImpl !!
        hello defaultMethod you can override too !
         */
        sayHello()
        defaultMethod()
    }
}