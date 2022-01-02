package ArraysAndStrings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class URLifyTest {
    private URLify underTest;

    @BeforeEach
    void setUp(){
        underTest = new URLify();
    }

    @Test
    void canCheckEmptyString() {
        // Given
        String string = "";
        int trueLength = underTest.getTrueLength(string);

        // When
        String actual = underTest.makeURL(string, trueLength);
        String expected = string.replace(" ", "%20");

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canHandleStringWithNoSpaces() {
        // Given
        String string = "stringstringstringstring";
        int trueLength = underTest.getTrueLength(string);

        // When
        String actual = underTest.makeURL(string, trueLength);
        String expected = string.replace(" ", "%20");

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canHandleStringWithOneSpace() {
        // Given
        String string = "this stringhasaspace";
        int trueLength = underTest.getTrueLength(string);

        // When
        String actual = underTest.makeURL(string, trueLength);
        String expected = string.replace(" ", "%20");

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canHandleTwoSpaces() {
        // Given
        String string = "string two spaces";
        int trueLength = underTest.getTrueLength(string);

        // When
        String actual = underTest.makeURL(string, trueLength);
        String expected = string.replace(" ", "%20");

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canHandleManySpaces() {
        // Given
        String string = "this is a string with many spaces let us see what happens when the method is run on it ok here we go";
        int trueLength = underTest.getTrueLength(string);

        // When
        String actual = underTest.makeURL(string, trueLength);
        String expected = string.replace(" ", "%20");

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canHandleMixedCase() {
        // Given
        String string = "This StrINg hAS a cOMbinAtion Of Upper And LoweCase";
        int trueLength = underTest.getTrueLength(string);

        // When
        String actual = underTest.makeURL(string, trueLength);
        String expected = string.replace(" ", "%20");

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canHandleNumbersInString() {
        // Given
        String string = "1 2 3 urlify this string for me";
        int trueLength = underTest.getTrueLength(string);

        // When
        String actual = underTest.makeURL(string, trueLength);
        String expected = string.replace(" ", "%20");

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canHandleStringWithSpecialCharacters() {
        // Given
        String string = "Now, I! Know a rhyme? Excelling;:@,,";
        int trueLength = underTest.getTrueLength(string);

        // When
        String actual = underTest.makeURL(string, trueLength);
        String expected = string.replace(" ", "%20");

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canHandleLongComplexString() {
        // Given
        String string = """
                1 2 a word or two, 3 4 throw in some more?!
                5 6 the r1v3r styx, 7 8 ..... minutes late;;;; $%^ &8 *9 0
                9 10 start over ag41n.. 
                11 12 lords a leaping, 13 14 dragons sleeping ! 9857 13 45
                15 16 the chapel sistine, 17 18 school debate team
                19 20 spaces aplenty
                """;
        int trueLength = underTest.getTrueLength(string);

        // When
        String actual = underTest.makeURL(string, trueLength);
        String expected = string.replace(" ", "%20");

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canHandleMultipleSpacesInARow() {
        // Given
        String string = "hidden words  and     Magic   spelling  ";
        int trueLength = underTest.getTrueLength(string);

        // When
        String actual = underTest.makeURL(string, trueLength);
        String expected = string.replace(" ", "%20");

        // Then
        assertThat(actual).isEqualTo(expected);
    }
    
}
