package ArraysAndStrings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class StringCompressionTest {
    private StringCompression underTest;

    @BeforeEach
    void setUp(){
        underTest = new StringCompression();
    }

    @Test
    void canRunWithEmptyString() {
        // Given
        String string = "";

        // When
        String actual = underTest.compress(string);
        String expected = "";

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canCompressShortCompressibleString() {
        // Given
        String string = "aaa";

        // When
        String actual = underTest.compress(string);
        String expected = "a3";

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canReturnShortNonCompressibleString() {
        // Given
        String string = "aabb";

        // When
        String actual = underTest.compress(string);
        String expected = string;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canReturnStringShorterThan3Chars() {
        // Given
        String string = "ab";

        // When
        String actual = underTest.compress(string);
        String expected = string;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canCorrectlyCompressLongerString() {
        // Given
        String string = "aabbbccccccccccttttooooooooggg";

        // When
        String actual = underTest.compress(string);
        String expected = "a2b3c10t4o8g3";

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canReturnLongerNonCompressibleString() {
        // Given
        String string = "aabbcddeeffghijjkklmmlmmlmmllmlmlmlm";

        // When
        String actual = underTest.compress(string);
        String expected = string;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canCompressStringWithSeveralNonRepeatedCharacters() {
        // Given
        String string = "fghjkilmopyyyyyyyyyggghhhhhhhhhhhhrrrrrrr";

        // When
        String actual = underTest.compress(string);
        String expected = "f1g1h1j1k1i1l1m1o1p1y9g3h12r7";

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canCompressLongMultilineString() {
        // Given
        String string = """
                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb
                hhhhhhhhhhhhhhhhhhhhhhhhhffffffffffffffggggggggggggggyyyyyybbbb
                kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkuuuuuuuuuuuuuuuuuu
                uuuuuuuuuuuuuuuuuuuuuuuuuuccccccccccccccccccccccccc
                """;

        // When
        String actual = underTest.compress(string);
        String expected = "a33b31h25f14g14y6b4k48u44c25";

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canCompressMixedCaseString() {
        // Given
        String string = "AAAaaBBbbbeeeffGg";

        // When
        String actual = underTest.compress(string);
        String expected = "a5b5e3f2g2";

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canReturnNonCompressibleMixedCaseString() {
        // Given
        String string = "AaaBbbeffGghYuJkInghewRf";

        // When
        String actual = underTest.compress(string);
        String expected = string;

        // Then
        assertThat(actual).isEqualTo(expected);
    }
}
