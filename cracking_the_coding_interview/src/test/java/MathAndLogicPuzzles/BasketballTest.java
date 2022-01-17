package MathAndLogicPuzzles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.assertj.core.api.Assertions.assertThat;

//cutoff finding method suggests it is always better to take one shot
//expect where they are equally likely for zero and one chance
//test are more symbolic to use a more official test format

public class BasketballTest {
    private Basketball underTest;

    @BeforeEach
    void setUp(){
        underTest = new Basketball();
    }

    @Test
    void zeroReturnsEqual() {
        // Given
        float chance = 0f;

        // When
        String actual = underTest.isOneShotBetter(chance);
        String expected = "Equal";

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void oneReturnsEqual() {
        // Given
        float chance = 1f;

        // When
        String actual = underTest.isOneShotBetter(chance);
        String expected = "Equal";

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void halfReturnsOneShot() {
        // Given
        float chance = 0.5f;

        // When
        String actual = underTest.isOneShotBetter(chance);
        String expected = "One Shot";

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void quarterReturnsOneShot() {
        // Given
        float chance = 0.25f;

        // When
        String actual = underTest.isOneShotBetter(chance);
        String expected = "One Shot";

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void point75ReturnsOneShot() {
        // Given
        float chance = 0.75f;

        // When
        String actual = underTest.isOneShotBetter(chance);
        String expected = "One Shot";

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void verySmallChanceReturnsOneShot() {
        // Given
        float chance = 0.000001f;

        // When
        String actual = underTest.isOneShotBetter(chance);
        String expected = "One Shot";

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void veryHighChanceReturnsOneShot() {
        // Given
        float chance = 0.999999f;

        // When
        String actual = underTest.isOneShotBetter(chance);
        String expected = "One Shot";

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void point666ReturnsOneShot() {
        // Given
        float chance = 0.666f;

        // When
        String actual = underTest.isOneShotBetter(chance);
        String expected = "One Shot";

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void point1ReturnsOneShot() {
        // Given
        float chance = 0.1f;

        // When
        String actual = underTest.isOneShotBetter(chance);
        String expected = "One Shot";

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void point2ReturnsOneShot() {
        // Given
        float chance = 0.2f;

        // When
        String actual = underTest.isOneShotBetter(chance);
        String expected = "One Shot";

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void point3ReturnsOneShot() {
        // Given
        float chance = 0.3f;

        // When
        String actual = underTest.isOneShotBetter(chance);
        String expected = "One Shot";

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void point4ReturnsOneShot() {
        // Given
        float chance = 0.4f;

        // When
        String actual = underTest.isOneShotBetter(chance);
        String expected = "One Shot";

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void point6ReturnsOneShot() {
        // Given
        float chance = 0.6f;

        // When
        String actual = underTest.isOneShotBetter(chance);
        String expected = "One Shot";

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void point7ReturnsOneShot() {
        // Given
        float chance = 0.7f;

        // When
        String actual = underTest.isOneShotBetter(chance);
        String expected = "One Shot";

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void point8ReturnsOneShot() {
        // Given
        float chance = 0.8f;

        // When
        String actual = underTest.isOneShotBetter(chance);
        String expected = "One Shot";

        // Then
        assertThat(actual).isEqualTo(expected);
    }
}
