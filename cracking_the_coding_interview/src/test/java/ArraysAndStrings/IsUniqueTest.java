package ArraysAndStrings;

import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class IsUniqueTest {
    private IsUnique underTest;

    @BeforeEach
    void setUp(){
        underTest = new IsUnique();
    }

    @Test
    void canCheckEmptyString() {
        // Given
        String string = "";

        // When
        boolean actual = underTest.check(string);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckOneLetterString() {
        // Given
        String string = "a";

        // When
        boolean actual = underTest.check(string);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckShortUniqueString() {
        // Given
        String string = "abcd";

        // When
        boolean actual = underTest.check(string);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckLongUniqueString() {
        // Given
        String string = "abcdefghijklmnopqrstuvwxyz";

        // When
        boolean actual = underTest.check(string);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckLongNonUniqueString() {
        // Given
        String string = "abcdefghijklmnopqrstuvwxyzz";

        // When
        boolean actual = underTest.check(string);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckShortUniqueStringOfNumbers() {
        // Given
        String string = "321";

        // When
        boolean actual = underTest.check(string);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckShortNonUniqueStringOfNumbers() {
        // Given
        String string = "322";

        // When
        boolean actual = underTest.check(string);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckLongUniqueStringOfNumbers() {
        // Given
        String string = "0987654321";

        // When
        boolean actual = underTest.check(string);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckLongNonUniqueStringOfNumbers() {
        // Given
        String string = "098776543211";

        // When
        boolean actual = underTest.check(string);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckUniqueStringOfPunctuation() {
        // Given
        String string = "!?*;'";

        // When
        boolean actual = underTest.check(string);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckNonUniqueStringOfPunctuation() {
        // Given
        String string = "?!?*;:";

        // When
        boolean actual = underTest.check(string);

        // Then
        assertThat(actual).isFalse();
    }

    //    Same tests for alternate version of the method, that doesn't use additional data structures


    @Test
    void canCheckEmptyStringNoDS() {
        // Given
        String string = "";

        // When
        boolean actual = underTest.checkNoDataStructure(string);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckOneLetterStringNoDS() {
        // Given
        String string = "a";

        // When
        boolean actual = underTest.checkNoDataStructure(string);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckShortUniqueStringNoDS() {
        // Given
        String string = "abcd";

        // When
        boolean actual = underTest.checkNoDataStructure(string);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckLongUniqueStringNoDS() {
        // Given
        String string = "abcdefghijklmnopqrstuvwxyz";

        // When
        boolean actual = underTest.checkNoDataStructure(string);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckLongNonUniqueStringNoDS() {
        // Given
        String string = "abcdefghijklmnopqrstuvwxyzz";

        // When
        boolean actual = underTest.checkNoDataStructure(string);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckShortUniqueStringOfNumbersNoDS() {
        // Given
        String string = "321";

        // When
        boolean actual = underTest.checkNoDataStructure(string);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckShortNonUniqueStringOfNumbersNoDS() {
        // Given
        String string = "322";

        // When
        boolean actual = underTest.checkNoDataStructure(string);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckLongUniqueStringOfNumbersNoDS() {
        // Given
        String string = "0987654321";

        // When
        boolean actual = underTest.checkNoDataStructure(string);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckLongNonUniqueStringOfNumbersNoDS() {
        // Given
        String string = "098776543211";

        // When
        boolean actual = underTest.checkNoDataStructure(string);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckUniqueStringOfPunctuationNoDS() {
        // Given
        String string = "!?*;'";

        // When
        boolean actual = underTest.checkNoDataStructure(string);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckNonUniqueStringOfPunctuationNoDS() {
        // Given
        String string = "?!?*;:";

        // When
        boolean actual = underTest.checkNoDataStructure(string);

        // Then
        assertThat(actual).isFalse();
    }
}
