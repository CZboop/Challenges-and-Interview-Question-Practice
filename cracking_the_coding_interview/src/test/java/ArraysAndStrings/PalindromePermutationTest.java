package ArraysAndStrings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromePermutationTest {
    private PalindromePermutation underTest;

    @BeforeEach
    void setUp(){
        underTest = new PalindromePermutation();
    }

    @Test
    void canCheckEmptyString() {
        // Given
        String string = "";

        // When
        boolean actual = underTest.checkPermutation(string);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckOneLetterString() {
        // Given
        String string = "e";

        // When
        boolean actual = underTest.checkPermutation(string);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canRejectNonAlphabeticalString() {
        // Given
        String string = "123@?£4";

        // When
        boolean actual = underTest.checkPermutation(string);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckStringWithOneLetterButOtherCharacters() {
        // Given
        String string = "1234e888";

        // When
        boolean actual = underTest.checkPermutation(string);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckValidOddLengthWithSpaces() {
        // Given
        String string = "eee ef ee";

        // When
        boolean actual = underTest.checkPermutation(string);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckValidEvenLengthWithSpaces() {
        // Given
        String string = "e ee effhh ee";

        // When
        boolean actual = underTest.checkPermutation(string);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckInvalidOddLengthWithSpaces() {
        // Given
        String string = "e ea dde ef eee";

        // When
        boolean actual = underTest.checkPermutation(string);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckInvalidEvenLengthWithSpaces() {
        // Given
        String string = "aa abbba afe";

        // When
        boolean actual = underTest.checkPermutation(string);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckValidEvenLengthNoSpaces() {
        // Given
        String string = "teetdeffed";

        // When
        boolean actual = underTest.checkPermutation(string);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckValidOddLengthNoSpaces() {
        // Given
        String string = "teexxxtdeffed";

        // When
        boolean actual = underTest.checkPermutation(string);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckInvalidEvenLengthNoSpaces() {
        // Given
        String string = "rederr";

        // When
        boolean actual = underTest.checkPermutation(string);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckInvalidOddLengthNoSpaces() {
        // Given
        String string = "rederrt";

        // When
        boolean actual = underTest.checkPermutation(string);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckInvalidLongString() {
        // Given
        String string = "qwertygyfhrugnjgurhsidijgurbghfjguhgyrhnabcgdhnfheyfgdhfyrhfgdhfyrbfhyfbvhfyfh";

        // When
        boolean actual = underTest.checkPermutation(string);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckValidLongStringEvenLength() {
        // Given
        String string = "asgfdsaasdfghjklkjhgfdsaasdfghjklkdsajhjhgfdsaasdfghjklkjhgfdfghjklk";

        // When
        boolean actual = underTest.checkPermutation(string);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckValidLongStringOddLength() {
        // Given
        String string = "asgfdsaasdxfghjklkjhgfdsaasdfghjklkdsajhjhgfdsaasdfghjklkjhgfdfghjklk";

        // When
        boolean actual = underTest.checkPermutation(string);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckInvalidLongStringEvenLength() {
        // Given
        String string = "asgfdsaasdfghjklkjhgfdaaasdfghjklkdsajhjhgfdsaasdfghjklkjhgfdfghjklk";

        // When
        boolean actual = underTest.checkPermutation(string);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckInvalidLongStringOddLength() {
        // Given
        String string = "qdfeeezzzkkkqdfgbhytrefdrfdrazzzkkkqdfgbhytreehhheedehhhegbhytrefdradadehhheeezzzkkk";

        // When
        boolean actual = underTest.checkPermutation(string);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckInvalidUpperCase() {
        // Given
        String string = "EEERRREE";

        // When
        boolean actual = underTest.checkPermutation(string);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckValidUpperCase() {
        // Given
        String string = "EERERRREE";

        // When
        boolean actual = underTest.checkPermutation(string);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckInvalidMixedCase() {
        // Given
        String string = "ttccctFFfaafTTtt";

        // When
        boolean actual = underTest.checkPermutation(string);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckValidMixedCase() {
        // Given
        String string = "aaAahAAAahyhyhyyhyhydfd";

        // When
        boolean actual = underTest.checkPermutation(string);

        // Then
        assertThat(actual).isTrue();
    }

}
