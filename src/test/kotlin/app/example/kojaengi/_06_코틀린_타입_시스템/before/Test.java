package app.example.kojaengi._06_코틀린_타입_시스템.before;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test {

    @org.junit.jupiter.api.Test
    @DisplayName("java 메소드 파라미터 타입은 안전하지 않다.")
    void javaTypeIsNotNullSafety(){
        NullableModules modules = new NullableModules();
        assertThrows(NullPointerException.class, () -> modules.changeToUpperCase(null));
    }
}
