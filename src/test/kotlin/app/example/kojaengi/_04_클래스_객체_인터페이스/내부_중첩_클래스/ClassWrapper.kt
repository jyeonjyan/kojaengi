package app.example.kojaengi._04_클래스_객체_인터페이스.내부_중첩_클래스

import java.time.LocalDateTime

class ClassWrapper {

    /**
     * 내부 클래스
     * outer-class 접근에 대해 this@outer-class
     */
    inner class MyInnerClass(private val callDateTime: LocalDateTime) : Execute{
        private val name: String = "inner-class"
        private fun getOuterClassReference(): ClassWrapper = this@ClassWrapper

        override fun executor() {
            println("$name is execute with outer-class: ${getOuterClassReference()} in: $callDateTime")
        }
    }

    /**
     * 중첩 클래스
     * outer-class 에 대해 바로 접근 가능하다.
     */
    class MyNestedClass(private val callDateTime: LocalDateTime) : Execute{
        private val name: String = "nested-class"
        private fun getOuterClassReference(): ClassWrapper = ClassWrapper()

        override fun executor() {
            println("$name is execute with outer-class: ${getOuterClassReference()} in: $callDateTime")
        }
    }

    interface Execute{
        fun executor()
    }
}