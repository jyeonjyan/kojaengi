package app.example.kojaengi._05_람다로_프로그래밍._멤버_참조.nullSafety;

import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class Test {

    @org.junit.jupiter.api.Test
    @DisplayName("자바에서는 .equals()가 null-safety 하지 않다.")
    void equalsInJava(){
        // Given
        List<User> userList = new ArrayList<>();

        for (int i=0; i<2; i++){
            final String prefixName = "nullable object" + i;
            userList.add(new User(prefixName));
        }

        // When
        final List<User> findByUserName = userList.stream()
                .filter(f -> f.getName().equals("nullable object1"))
                .collect(Collectors.toList());

        // Then
        assertThat(findByUserName.size()).isEqualTo(1);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("equals() 때문에 NPE가 발생한다")
    void equalsCauseNPE(){
        // Given
        List<User> userList = new ArrayList<>();

        for (int i=0; i<2; i++){
            final String prefixName = null;
            userList.add(new User(prefixName));
        }

        assertThrows(NullPointerException.class, () -> runnableLogic(userList));
    }

    void runnableLogic(List<User> userList){
        final List<User> findByUserName = userList.stream()
                .filter(f -> f.getName().equals("nullable object1"))
                .collect(Collectors.toList());
    }
}

