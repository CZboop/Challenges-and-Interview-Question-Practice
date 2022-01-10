package MathAndLogicPuzzles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class HundredLockersTest {
    private HundredLockers underTest;

    @BeforeEach
    void setUp(){
        underTest = new HundredLockers();
    }

    @Test
    void bruteForceCheck() {
        // Given
        int expected = 0;
        boolean[] lockers = new boolean[100];
        Arrays.fill(lockers, Boolean.FALSE);
        for (int i=1; i<=100; i++){
            for (int j=0; j<100; j++){
                if ((j+1)%i==0){
                    lockers[j] = !lockers[j];
                }
            }
        }
        for (int i=0; i<100; i++){
            if (lockers[i]==true){
                expected +=1;
            }
        }

        // When
        int actual = underTest.getOpen();

        // Then
        assertThat(actual).isEqualTo(expected);
    }
}
