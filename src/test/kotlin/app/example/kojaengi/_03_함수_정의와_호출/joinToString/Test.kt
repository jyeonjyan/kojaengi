package app.example.kojaengi._03_함수_정의와_호출.joinToString

import org.junit.jupiter.api.Test

class Test {
    @Test
    fun implJoinToString(){
        val arrList = arrayListOf(1, 2, 4)
        // result: [1, 2, 4]
        println(joinToString(arrList))
    }

    /**
     * java 와 다르게 디폴트 파라미터를 정의할 수 있다.
     */
    private fun<T> joinToString(
        collection: Collection<T>,
        separator: String = ", ",
        prefix: String = "result: [",
        postfix: String = "]"
    ): String {
        val result = StringBuilder(prefix)

        for ((index, element) in collection.withIndex()) {
            if (index > 0) result.append(separator)
            result.append(element)
        }

        result.append(postfix)
        return result.toString()
    }
}