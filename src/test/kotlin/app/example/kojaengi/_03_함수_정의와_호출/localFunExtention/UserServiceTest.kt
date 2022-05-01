package app.example.kojaengi._03_함수_정의와_호출.localFunExtention

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.IllegalArgumentException


class UserServiceTest {

    @Test
    @DisplayName("확장 함수로 validate 로직을 빼서 DRY 원칙을 만족시킴")
    fun userSave() {
        val user = User("jyeonjyan")

        assertThrows<IllegalArgumentException> { user.validate() }
        // save user
    }

}

class User(val name: String? = null, val age: Int? = null)

/**
 * 확장 함수를 사용해서 더 쉽게 코드를 파악할 수 있도록 함.
 */
private fun User.validate() {

    if (name.isNullOrEmpty()) {
        throw IllegalArgumentException("user의 name이 비어있어 처리할 수 없음. name: $name")
    } else if (age == null) {
        throw IllegalArgumentException("user의 name이 비어있어 처리할 수 없음. age: $age")
    }
}