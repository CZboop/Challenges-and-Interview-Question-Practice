package MathAndLogicPuzzles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TheHeavyPillTest {
    private TheHeavyPill underTest;

    @BeforeEach
    void setUp(){
        underTest = new TheHeavyPill();
    }

    @Test
    void findsAtZeroIndex() {
        // Given
        float[] bottles = new float[]{1.1f,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};

        // When
        int actual = underTest.findHeavierInd(bottles);
        int expected = 0;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void findsAtFirstIndex() {
        // Given
        float[] bottles = new float[]{1,1.1f,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};

        // When
        int actual = underTest.findHeavierInd(bottles);
        int expected = 1;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void findsAtSecondIndex() {
        // Given
        float[] bottles = new float[]{1,1,1.1f,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};

        // When
        int actual = underTest.findHeavierInd(bottles);
        int expected = 2;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void findsAtThreeIndex() {
        // Given
        float[] bottles = new float[]{1,1,1,1.1f,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};

        // When
        int actual = underTest.findHeavierInd(bottles);
        int expected = 3;

        // Then
        assertThat(actual).isEqualTo(expected);
    }
//
    @Test
    void findsAtFourthIndex() {
        // Given
        float[] bottles = new float[]{1,1,1,1,1.1f,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};

        // When
        int actual = underTest.findHeavierInd(bottles);
        int expected = 4;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void findsAtFifthIndex() {
        // Given
        float[] bottles = new float[]{1,1,1,1,1,1.1f,1,1,1,1,1,1,1,1,1,1,1,1,1,1};

        // When
        int actual = underTest.findHeavierInd(bottles);
        int expected = 5;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void findsAtSixthIndex() {
        // Given
        float[] bottles = new float[]{1,1,1,1,1,1,1.1f,1,1,1,1,1,1,1,1,1,1,1,1,1};

        // When
        int actual = underTest.findHeavierInd(bottles);
        int expected = 6;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void findsAtSeventhIndex() {
        // Given
        float[] bottles = new float[]{1,1,1,1,1,1,1,1.1f,1,1,1,1,1,1,1,1,1,1,1,1};

        // When
        int actual = underTest.findHeavierInd(bottles);
        int expected = 7;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void findsAtEighthIndex() {
        // Given
        float[] bottles = new float[]{1,1,1,1,1,1,1,1,1.1f,1,1,1,1,1,1,1,1,1,1,1};

        // When
        int actual = underTest.findHeavierInd(bottles);
        int expected = 8;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void findsAtNinthIndex() {
        // Given
        float[] bottles = new float[]{1,1,1,1,1,1,1,1,1,1.1f,1,1,1,1,1,1,1,1,1,1};

        // When
        int actual = underTest.findHeavierInd(bottles);
        int expected = 9;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void findsAtTenthIndex() {
        // Given
        float[] bottles = new float[]{1,1,1,1,1,1,1,1,1,1,1.1f,1,1,1,1,1,1,1,1,1};

        // When
        int actual = underTest.findHeavierInd(bottles);
        int expected = 10;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void findsAtEleventhIndex() {
        // Given
        float[] bottles = new float[]{1,1,1,1,1,1,1,1,1,1,1,1.1f,1,1,1,1,1,1,1,1};

        // When
        int actual = underTest.findHeavierInd(bottles);
        int expected = 11;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void findsAtTwelfthIndex() {
        // Given
        float[] bottles = new float[]{1,1,1,1,1,1,1,1,1,1,1,1,1.1f,1,1,1,1,1,1,1};

        // When
        int actual = underTest.findHeavierInd(bottles);
        int expected = 12;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void findsAtThirteenthIndex() {
        // Given
        float[] bottles = new float[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1.1f,1,1,1,1,1,1};

        // When
        int actual = underTest.findHeavierInd(bottles);
        int expected = 13;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void findsAtFourteenthIndex() {
        // Given
        float[] bottles = new float[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1.1f,1,1,1,1,1};

        // When
        int actual = underTest.findHeavierInd(bottles);
        int expected = 14;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void findsAtFifteenthIndex() {
        // Given
        float[] bottles = new float[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1.1f,1,1,1,1};

        // When
        int actual = underTest.findHeavierInd(bottles);
        int expected = 15;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void findsAtSixteenthIndex() {
        // Given
        float[] bottles = new float[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1.1f,1,1,1};

        // When
        int actual = underTest.findHeavierInd(bottles);
        int expected = 16;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void findsAtSeventeenthIndex() {
        // Given
        float[] bottles = new float[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1.1f,1,1};

        // When
        int actual = underTest.findHeavierInd(bottles);
        int expected = 17;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void findsAtEighteenthIndex() {
        // Given
        float[] bottles = new float[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1.1f,1};

        // When
        int actual = underTest.findHeavierInd(bottles);
        int expected = 18;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void findsAtNineteenthIndex() {
        // Given
        float[] bottles = new float[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1.1f};

        // When
        int actual = underTest.findHeavierInd(bottles);
        int expected = 19;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

}
