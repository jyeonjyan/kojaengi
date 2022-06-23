package app.example.kojaengi._00_코루틴._첫번째코루틴

import kotlinx.coroutines.*
import net.bytebuddy.utility.RandomString
import org.assertj.core.api.AbstractDoubleAssert
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.util.StopWatch

class CoroutinesTest {

    @Test
    fun functionRunner(){
        test1()
    }

    fun test1 () = runBlocking {
        launch {
            delay(1000L) // 1 sec
            println("world")
        }
        println("hello")
    } // method 가 최종 모든 처리를 마치고 종료 함.


    @Test
    fun suspendFunRunner() = runBlocking {
        launch {
            doWorld()
        }
        println("Hello ~ ")
    }

    suspend fun doWorld(){
        delay(1000L)
        println("world!!")
    } // 일시 정지 함수 delay() 존재해야 함.

    @Test
    fun main() = runBlocking {
        twoWorldPrintln()
        println("Process All Done")
    }

    suspend fun twoWorldPrintln() = coroutineScope {
        // 1
        launch {
            delay(1000L)
            println("World! 11")
        }
        // 2
        launch {
            delay(1000L)
            println("World! 22")
        }

        // 1 && 2 가 동시에 실행되어 1sec 에 거의 똑같이 끝난다.
        println("Hello")
    }

    /**
     * suspend fun 을 실행시키려면 runBlocking scope 가 필요하다.
     * runBlocking 은 코루틴 함수에서 사용되서는 안되며, 기능 및 테스트에 사용하도록 설계 됐다.
     */
    @Test
    fun launching() = runBlocking{
        launcher()
    }

    private suspend fun launcher() = coroutineScope{
        val job = launch {
            repeat(1000) { i ->
                println("job: I'm sleeping $i ...")
                delay(500L) // 0,5 sec delay
            }
        }

        delay(1300L) // delay a bit
        println("main: I'm tired of waiting!")
        job.cancelAndJoin() // cancels the job, complete the job
        println("main: Now I can quit.")
    }

    class Request(
        val id: Long,
        val content: String
    )

    /**
     * ****************************************
     */
    private suspend fun makeSESRequest(): Request {
        println("now make a request")
        delay(1500) // 1.5 sec

        return Request(
            1L,
            RandomString.make(5)
        )
    }

    suspend fun doProcessSESRequest(sesRequest: Request){
        delay(1000L) // 1 sec
        println("now processing... id: ${sesRequest.id} content: ${sesRequest.content}")
    }

    @Test
    fun runSESApi(): AbstractDoubleAssert<*> = runBlocking{
        val stopWatch = StopWatch()
        stopWatch.start()

        async {
            doProcessSESRequest(makeSESRequest())
        }.await()

        stopWatch.stop()
        assertThat(stopWatch.totalTimeSeconds).isGreaterThanOrEqualTo(2.5)
    }
}