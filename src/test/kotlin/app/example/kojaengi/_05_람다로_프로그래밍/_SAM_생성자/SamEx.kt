package app.example.kojaengi._05_람다로_프로그래밍._SAM_생성자

import org.junit.jupiter.api.Test

/**
 * 컴파일러가 자동으로 람다를 함수형 인터페이스 무명 클래스로 바꾸지 못하는 경우 SAM 생성자를 사용할 수 있다.
 * SAM은 Single Abstract Method 의 약자다.
 */
class SamEx {

    private fun createAllDoneRunnable(): Runnable {
        return Runnable { println("running") }
    }

    @Test
    fun call(){
        createAllDoneRunnable().run()
    }
}