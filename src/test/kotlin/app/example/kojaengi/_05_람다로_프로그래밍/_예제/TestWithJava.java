package app.example.kojaengi._05_람다로_프로그래밍._예제;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWithJava {

    @Test
    @DisplayName("결재에 따른 동작을 정의하고 싶다.")
    void pay(){
        final Pay pay = new Pay();

        pay.processPay(new PayListener() {
            @Override
            public void PaymentsMethodIsValid() {
                System.out.println("is ok");
            }
        });

    }
}
