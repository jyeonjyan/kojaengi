package app.example.kojaengi._06_코틀린_타입_시스템._let_함수

import java.time.LocalDateTime

/**
 * @param msg nullable
 * @param timestamp not-null
 */
class Log(private val msg: String?, private val timestamp: LocalDateTime = LocalDateTime.now()) {

    fun checker() : String? {
        var result: String? = null

        if (msg == null){
            return result
        }

        result = "[warn] msg: $msg occur at: $timestamp"
        return result
    }


    fun sysoutLogging(loggingMsg: String?){
        loggingMsg ?: throw NullPointerException("msg가 null이기에 logging을 console에 출력할 수 없음")
        println("jyeonjyan's kotlin app $loggingMsg")
    }
}