package ArraysAndStrings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class OneAwayTest {
    private OneAway underTest;

    @BeforeEach
    void setUp(){
        underTest = new OneAway();
    }

//    may want to make one or both empty strings false depending on brief/irl context
    @Test
    void canCheckBothEmptyStrings() {
        // Given
        String string1 = "";
        String string2 = "";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckOneEmptyStringValid() {
        // Given
        String string1 = "";
        String string2 = "s";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckOneEmptyStringInvalid() {
        // Given
        String string1 = "";
        String string2 = "str";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckExactMatchStrings() {
        // Given
        String string1 = "string";
        String string2 = "string";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckSameLettersDifferentCase() {
        // Given
        String string1 = "STRing";
        String string2 = "strING";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckUppercaseExactMatch() {
        // Given
        String string1 = "STRING";
        String string2 = "STRING";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckOneReplacement() {
        // Given
        String string1 = "stringstringstringstring";
        String string2 = "stringstringstringspring";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckTwoReplacements() {
        // Given
        String string1 = "stringstringstringstring";
        String string2 = "stringstringspringspring";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckSameNumberOfCharsDifferentString() {
        // Given
        String string1 = "derfgtyhnbvcdsw";
        String string2 = "poikjuytgfredcx";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckOneRemovalEndOfString() {
        // Given
        String string1 = "stringstringstringstring";
        String string2 = "stringstringstringstrin";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckOneRemovalStartOfString() {
        // Given
        String string1 = "stringstringstringstring";
        String string2 = "tringstringstringstring";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckTwoRemovalsEndOfString() {
        // Given
        String string1 = "stringstringstringstring";
        String string2 = "stringstringstringstri";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckTwoRemovalsStartOfString() {
        // Given
        String string1 = "stringstringstringstring";
        String string2 = "ringstringstringstring";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckValidStringWithNumbers() {
        // Given
        String string1 = "stringstringstringstring123";
        String string2 = "stringstringstringstrig123";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckInvalidStringWithNumbers() {
        // Given
        String string1 = "stringstringstringstring123";
        String string2 = "stringstringstringsyreng123";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckDifferentLengths() {
        // Given
        String string1 = "stringstring";
        String string2 = "stringstringstringstring";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckLongValidString() {
        // Given
        String string1 = "wordsinastringinquotemarksinthetestintheideonthescreeninmylaptoponthetablewordsinastringinquotemarksinthetestintheideonthescreeninmylaptoponthetable";
        String string2 = "wordsinastringinquotemarksinthetestintheideonthescreenonmylaptoponthetablewordsinastringinquotemarksinthetestintheideonthescreeninmylaptoponthetable";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckLongInvalidString() {
        // Given
        String string1 = "wordsinastringinquotemarksinthetestintheideonthescreeninmylaptoponthetablewordsinastringinquotemarksinthetestintheideonthescreeninmylaptoponthetable";
        String string2 = "wordsinastringinquotemarksinthetestintheideonthescreenonmylaptoponthetablewordsinastringinquotemarksinthetestintheideonthescreenonmylaptoponthetable";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }
}
