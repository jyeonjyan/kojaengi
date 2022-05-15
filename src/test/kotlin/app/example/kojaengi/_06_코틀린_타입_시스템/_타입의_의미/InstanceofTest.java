package app.example.kojaengi._06_코틀린_타입_시스템._타입의_의미;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InstanceofTest {

    @Test
    @DisplayName("javac 는 null을 String으로 취급하지 않는다.")
    void javacDoNotClassificationNullAsString(){
        String isNull = null;
        final String result = isNull instanceof String ? "correct" : "wrong";
        System.out.println(result);
    }
}
