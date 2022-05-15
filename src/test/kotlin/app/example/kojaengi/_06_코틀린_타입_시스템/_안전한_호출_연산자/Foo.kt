package app.example.kojaengi._06_코틀린_타입_시스템._안전한_호출_연산자

class Foo(private val fooVal: String?) {

    fun getFooValLength(){
        println("fooVal length: ${fooVal?.length}")
    }
}