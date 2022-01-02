package ArraysAndStrings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckPermutationTest {
    private CheckPermutation underTest;

    @BeforeEach
    void setUp(){
        underTest = new CheckPermutation();
    }

    @Test
    void canCheckOneEmptyString() {
        // Given
        String string1 = "";
        String string2 = "aa";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckBothEmptyStrings() {
        // Given
        String string1 = "";
        String string2 = "";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckOneLetterString() {
        // Given
        String string1 = "aa";
        String string2 = "a";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckBothOneLetterStrings() {
        // Given
        String string1 = "a";
        String string2 = "a";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckExactMatch() {
        // Given
        String string1 = "abcdefghi";
        String string2 = "abcdefghi";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckShortPermutation() {
        // Given
        String string1 = "gefhi";
        String string2 = "hefgi";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckLongPermutation() {
        // Given
        String string1 = "qwerqazthhhhhhbyuiopaaasslkjhmnbvcgfdsazxcvbnm";
        String string2 = "asdfhhhhhhbghjklmnbvcxzqwzaqcvbnmertyuiopaaass";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckShortNonPermutation() {
        // Given
        String string1 = "err";
        String string2 = "wer";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckLongNonPermutation() {
        // Given
        String string1 = "jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj";
        String string2 = "jjjjjjjjjjjjjjjjjjjijjjjjjjjjjjjjjjj";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckSameLettersDifferentQuantity() {
        // Given
        String string1 = "aaaabbb";
        String string2 = "aaabbbb";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckStringPermutationOfDigits() {
        // Given
        String string1 = "1234444445678900";
        String string2 = "0044444412356789";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckStringOfDigitsNonPermutation() {
        // Given
        String string1 = "12345555678909876";
        String string2 = "12345678890976532";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckStringOfSpecialCharsPermutation() {
        // Given
        String string1 = "?????@!!!!;::**::::...,,";
        String string2 = "?::@!;:??..,?!?*:*.!!::,";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckStringOfSpecialCharsNonPermutation() {
        // Given
        String string1 = "@@@@????!!!!::::;;;;;;****";
        String string2 = "@@****@??@!::::;;;;;??!!!*";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    //    add string capitalisation tests
    @Test
    void canCheckStringWithDifferentCasesIsNotPermutation() {
        // Given
        String string1 = "AaabbcdefGGH";
        String string2 = "aAABBCDEFggH";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }


    @Test
    void canCheckLongMixedStringPermutation() {
        // Given
        String string1 = "aewr1234876ujereigjEEERUngh????!!;;;***TREWebb765423wretBgretebh??:::,,,,,Wew";
        String string2 = "a23gh???***utebh??:::,,je1etBgre,,,Wereigj5423wreETRE4876EE?!!;;;RUnWebb76wrw";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckLongMixedStringNonPermutation() {
        // Given
        String string1 = "aaaeeeennnHHHHWWWYY1112227778888****????!!!!!;;;;;::::EEEYYRhhhhggbvnfdhdgrtf";
        String string2 = "aaa::EEE;;778nHgHHdYYRh;;::27hh11rWWYY***?gbvnfdh1??8eeeNN?!88*hg22e!!!!;grtf";

        // When
        boolean actual = underTest.check(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

// testing alternative method that does not use streams, using the same tests

    @Test
    void canCheckOneEmptyStringNoStream() {
        // Given
        String string1 = "";
        String string2 = "aa";

        // When
        boolean actual = underTest.checkNoStream(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckBothEmptyStringsNoStream() {
        // Given
        String string1 = "";
        String string2 = "";

        // When
        boolean actual = underTest.checkNoStream(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckOneLetterStringNoStream() {
        // Given
        String string1 = "aa";
        String string2 = "a";

        // When
        boolean actual = underTest.checkNoStream(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckBothOneLetterStringsNoStream() {
        // Given
        String string1 = "a";
        String string2 = "a";

        // When
        boolean actual = underTest.checkNoStream(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckExactMatchNoStream() {
        // Given
        String string1 = "abcdefghi";
        String string2 = "abcdefghi";

        // When
        boolean actual = underTest.checkNoStream(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckShortPermutationNoStream() {
        // Given
        String string1 = "gefhi";
        String string2 = "hefgi";

        // When
        boolean actual = underTest.checkNoStream(string1, string2);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckLongPermutationNoStream() {
        // Given
        String string1 = "qwerqazthhhhhhbyuiopaaasslkjhmnbvcgfdsazxcvbnm";
        String string2 = "asdfhhhhhhbghjklmnbvcxzqwzaqcvbnmertyuiopaaass";

        // When
        boolean actual = underTest.checkNoStream(string1, string2);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckShortNonPermutationNoStream() {
        // Given
        String string1 = "err";
        String string2 = "wer";

        // When
        boolean actual = underTest.checkNoStream(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckLongNonPermutationNoStream() {
        // Given
        String string1 = "jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj";
        String string2 = "jjjjjjjjjjjjjjjjjjjijjjjjjjjjjjjjjjj";

        // When
        boolean actual = underTest.checkNoStream(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckSameLettersDifferentQuantityNoStream() {
        // Given
        String string1 = "aaaabbb";
        String string2 = "aaabbbb";

        // When
        boolean actual = underTest.checkNoStream(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckStringPermutationOfDigitsNoStream() {
        // Given
        String string1 = "1234444445678900";
        String string2 = "0044444412356789";

        // When
        boolean actual = underTest.checkNoStream(string1, string2);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckStringOfDigitsNonPermutationNoStream() {
        // Given
        String string1 = "12345555678909876";
        String string2 = "12345678890976532";

        // When
        boolean actual = underTest.checkNoStream(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckStringOfSpecialCharsPermutationNoStream() {
        // Given
        String string1 = "?????@!!!!;::**::::...,,";
        String string2 = "?::@!;:??..,?!?*:*.!!::,";

        // When
        boolean actual = underTest.checkNoStream(string1, string2);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckStringOfSpecialCharsNonPermutationNoStream() {
        // Given
        String string1 = "@@@@????!!!!::::;;;;;;****";
        String string2 = "@@****@??@!::::;;;;;??!!!*";

        // When
        boolean actual = underTest.checkNoStream(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }

    //    add string capitalisation tests
    @Test
    void canCheckStringWithDifferentCasesIsNotPermutationNoStream() {
        // Given
        String string1 = "AaabbcdefGGH";
        String string2 = "aAABBCDEFggH";

        // When
        boolean actual = underTest.checkNoStream(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }


    @Test
    void canCheckLongMixedStringPermutationNoStream() {
        // Given
        String string1 = "aewr1234876ujereigjEEERUngh????!!;;;***TREWebb765423wretBgretebh??:::,,,,,Wew";
        String string2 = "a23gh???***utebh??:::,,je1etBgre,,,Wereigj5423wreETRE4876EE?!!;;;RUnWebb76wrw";

        // When
        boolean actual = underTest.checkNoStream(string1, string2);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckLongMixedStringNonPermutationNoStream() {
        // Given
        String string1 = "aaaeeeennnHHHHWWWYY1112227778888****????!!!!!;;;;;::::EEEYYRhhhhggbvnfdhdgrtf";
        String string2 = "aaa::EEE;;778nHgHHdYYRh;;::27hh11rWWYY***?gbvnfdh1??8eeeNN?!88*hg22e!!!!;grtf";

        // When
        boolean actual = underTest.checkNoStream(string1, string2);

        // Then
        assertThat(actual).isFalse();
    }
}
