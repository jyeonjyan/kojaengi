package app.example.kojaengi._04_클래스_객체_인터페이스._접근자의_가시성_변경

import net.bytebuddy.utility.RandomString
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class PrivateSetterTest {

    @Test
    @DisplayName("접근자의 가시성을 변경했다:: private set")
    fun addSignatureTest(){
        val macBook = MacBook()
        println("device: $macBook")

//        macBook.serialNumber = "abcd" // cause compile error

        val rentPk = macBook.addSerialNumberSignature("user.jyeonjyan")
        println("rent: $rentPk")
    }
}

class MacBook {

    // setter 의 가시성을 private
    var serialNumber: String = RandomString.make(5)
        private set

    fun addSerialNumberSignature(signature: String): String{
        val sb = StringBuilder()
        return sb.append(serialNumber).append(signature).toString()
    }

    override fun toString(): String {
        return "MacBook(serialNumber='$serialNumber')"
    }

}