package ArraysAndStrings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringRotationTest {
    private StringRotation underTest;

    @BeforeEach
    void setUp(){
        underTest = new StringRotation();
    }

//    testing method with queues

    @Test
    void canCheckEmptyString() {
        // Given
        String string1 = "";
        String string2 = "";

        // When
        boolean actual = underTest.isRotation(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckExactMatch() {
        // Given
        String string1 = "rotate";
        String string2 = "rotate";

        // When
        boolean actual = underTest.isRotation(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckShortRotation() {
        // Given
        String string1 = "rotate";
        String string2 = "aterot";

        // When
        boolean actual = underTest.isRotation(string1, string2);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckShortNonRotation() {
        // Given
        String string1 = "rotate";
        String string2 = "atetor";

        // When
        boolean actual = underTest.isRotation(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckLongRotation() {
        // Given
        String string1 = "thisisthelongrotationoflongrotacitywillthetestknowthatitisrotatedletusfindout";
        String string2 = "citywillthetestknowthatitisrotatedletusfindoutthisisthelongrotationoflongrota";

        // When
        boolean actual = underTest.isRotation(string1, string2);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckLongNonRotation() {
        // Given
        String string1 = "thisisthelongrotationoflongrotacitywillthetestknowthatitisrotatedletusfindout";
        String string2 = "thisisthelongrotationoflongrotknowthatitisrotatedletusfindouttacitywillthetes";

        // When
        boolean actual = underTest.isRotation(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckRotationWithNumbers() {
        // Given
        String string1 = "r0t4t10n";
        String string2 = "t10nr0t4";

        // When
        boolean actual = underTest.isRotation(string1, string2);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckNonRotationWithNumbers() {
        // Given
        String string1 = "n0tar0t4tion";
        String string2 = "n0tar0t4iton";

        // When
        boolean actual = underTest.isRotation(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckRotationWithSpecialChars() {
        // Given
        String string1 = "arotationwithspecialch@r@cters";
        String string2 = "ch@r@ctersarotationwithspecial";

        // When
        boolean actual = underTest.isRotation(string1, string2);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckNonRotationWithSpecialChars() {
        // Given
        String string1 = "not@rotat!*n?";
        String string2 = "otat*!n?not@r";

        // When
        boolean actual = underTest.isRotation(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckCloseToMatchNonRotation() {
        // Given
        String string1 = "almostarotationbutnotquite";
        String string2 = "atationbutnotquitelmostaro";

        // When
        boolean actual = underTest.isRotation(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckStringsWithDifferentLengthsSameCharacters() {
        // Given
        String string1 = "rotatioon";
        String string2 = "ationrot";

        // When
        boolean actual = underTest.isRotation(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckSameCharactersWrongOrder() {
        // Given
        String string1 = "samecharacterswrongorder";
        String string2 = "swrongordesamecharacterr";

        // When
        boolean actual = underTest.isRotation(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckReversedString() {
        // Given
        String string1 = "isareversalarotation";
        String string2 = "noitatoralasreverasi";

        // When
        boolean actual = underTest.isRotation(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

//    testing method with contains

    @Test
    void canCheckEmptyStringWithContains() {
        // Given
        String string1 = "";
        String string2 = "";

        // When
        boolean actual = underTest.isRotationWithContains(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckExactMatchWithContains() {
        // Given
        String string1 = "rotate";
        String string2 = "rotate";

        // When
        boolean actual = underTest.isRotationWithContains(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckShortRotationWithContains() {
        // Given
        String string1 = "rotate";
        String string2 = "aterot";

        // When
        boolean actual = underTest.isRotationWithContains(string1, string2);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckShortNonRotationWithContains() {
        // Given
        String string1 = "rotate";
        String string2 = "atetor";

        // When
        boolean actual = underTest.isRotationWithContains(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckLongRotationWithContains() {
        // Given
        String string1 = "thisisthelongrotationoflongrotacitywillthetestknowthatitisrotatedletusfindout";
        String string2 = "citywillthetestknowthatitisrotatedletusfindoutthisisthelongrotationoflongrota";

        // When
        boolean actual = underTest.isRotationWithContains(string1, string2);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckLongNonRotationWithContains() {
        // Given
        String string1 = "thisisthelongrotationoflongrotacitywillthetestknowthatitisrotatedletusfindout";
        String string2 = "thisisthelongrotationoflongrotknowthatitisrotatedletusfindouttacitywillthetes";

        // When
        boolean actual = underTest.isRotationWithContains(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckRotationWithNumbersWithContains() {
        // Given
        String string1 = "r0t4t10n";
        String string2 = "t10nr0t4";

        // When
        boolean actual = underTest.isRotationWithContains(string1, string2);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckNonRotationWithNumbersWithContains() {
        // Given
        String string1 = "n0tar0t4tion";
        String string2 = "n0tar0t4iton";

        // When
        boolean actual = underTest.isRotationWithContains(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckRotationWithSpecialCharsWithContains() {
        // Given
        String string1 = "arotationwithspecialch@r@cters";
        String string2 = "ch@r@ctersarotationwithspecial";

        // When
        boolean actual = underTest.isRotationWithContains(string1, string2);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckNonRotationWithSpecialCharsWithContains() {
        // Given
        String string1 = "not@rotat!*n?";
        String string2 = "otat*!n?not@r";

        // When
        boolean actual = underTest.isRotationWithContains(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckCloseToMatchNonRotationWithContains() {
        // Given
        String string1 = "almostarotationbutnotquite";
        String string2 = "atationbutnotquitelmostaro";

        // When
        boolean actual = underTest.isRotationWithContains(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckStringsWithDifferentLengthsSameCharactersWithContains() {
        // Given
        String string1 = "rotatioon";
        String string2 = "ationrot";

        // When
        boolean actual = underTest.isRotationWithContains(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckSameCharactersWrongOrderWithContains() {
        // Given
        String string1 = "samecharacterswrongorder";
        String string2 = "swrongordesamecharacterr";

        // When
        boolean actual = underTest.isRotationWithContains(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckReversedStringContains() {
        // Given
        String string1 = "isareversalarotation";
        String string2 = "noitatoralasreverasi";

        // When
        boolean actual = underTest.isRotationWithContains(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }
}
