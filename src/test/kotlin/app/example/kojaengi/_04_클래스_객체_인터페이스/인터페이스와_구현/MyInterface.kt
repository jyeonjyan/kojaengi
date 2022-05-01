package app.example.kojaengi._04_클래스_객체_인터페이스.인터페이스와_구현

interface MyInterface {

    fun sayHello()

    fun defaultMethod(){
        println("hello defaultMethod you can override too ! ")
    }
}