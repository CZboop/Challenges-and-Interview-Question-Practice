package LinkedLists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoveDupsTest {
    private RemoveDups underTest;

    @BeforeEach
    void setUp(){
        underTest = new RemoveDups();
    }

    @Test
    void noRepeatsReturnsInput() {
        // Given
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4));

        // When
        LinkedList<Integer> actual = underTest.removeWithBuffer(list);
        LinkedList<Integer> expected = list;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void oneRepeatIsRemoved() {
        // Given
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,1,2,3,4));

        // When
        LinkedList<Integer> actual = underTest.removeWithBuffer(list);
        LinkedList<Integer> expected = new LinkedList<>(Arrays.asList(1,2,3,4));

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void multipleElementsAppearingTwiceAreRemoved() {
        // Given
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,1,2,2,3,3,4,4));

        // When
        LinkedList<Integer> actual = underTest.removeWithBuffer(list);
        LinkedList<Integer> expected = new LinkedList<>(Arrays.asList(1,2,3,4));

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canRemoveLotsOfDuplicationOfSameValue() {
        // Given
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,3,4));

        // When
        LinkedList<Integer> actual = underTest.removeWithBuffer(list);
        LinkedList<Integer> expected = new LinkedList<>(Arrays.asList(1,2,3,4));

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void doesNotRemoveDifferentNumberContainingSomeDigitsOfDuplicate() {
        // Given
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,1,1,1,1,1,1,11,2,2,22,3,4));

        // When
        LinkedList<Integer> actual = underTest.removeWithBuffer(list);
        LinkedList<Integer> expected = new LinkedList<>(Arrays.asList(1,11,2,22,3,4));

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canRemoveDuplicatesWithTwoDigits() {
        // Given
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,11,11,11,2,2,22,22,3,4));

        // When
        LinkedList<Integer> actual = underTest.removeWithBuffer(list);
        LinkedList<Integer> expected = new LinkedList<>(Arrays.asList(1,11,2,22,3,4));

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canRemoveDuplicatesWithThreeDigits() {
        // Given
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(555,555,123,1,11,11,11,2,2,22,22,3,4));

        // When
        LinkedList<Integer> actual = underTest.removeWithBuffer(list);
        LinkedList<Integer> expected = new LinkedList<>(Arrays.asList(555,123,1,11,2,22,3,4));

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canRemoveDuplicatesNotNextToEachOtherInList() {
        // Given
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(555,555,123,1,11,11,11,2,2,22,22,3,4,555,1));

        // When
        LinkedList<Integer> actual = underTest.removeWithBuffer(list);
        LinkedList<Integer> expected = new LinkedList<>(Arrays.asList(555,123,1,11,2,22,3,4));

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canRemoveDuplicatesWithManyDigits() {
        // Given
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(555,555,2000568972,123,1,11,800975647,11,11,2000568972,
                2,22,22,3,4,2000568972,555,1,800975647));

        // When
        LinkedList<Integer> actual = underTest.removeWithBuffer(list);
        LinkedList<Integer> expected = new LinkedList<>(Arrays.asList(555,2000568972,123,1,11,800975647,
                2,22,3,4));

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canRemoveFromListOfOnlyDuplicates() {
        // Given
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7));

        // When
        LinkedList<Integer> actual = underTest.removeWithBuffer(list);
        LinkedList<Integer> expected = new LinkedList<>(Arrays.asList(7));

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canHandleLongList() {
        // Given
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,6,6,6,6,7,7,7,7,7,7,7,7,7,7,7,7,
                7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,100,100,100,200,200,200,200,200,31,31,31,31,1,2,3,4,5,6,1,2,3,4,5,6,
                20,20,20,20,20,20,20,20,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,
                900,999,888,888,888,888,888,888,888,888,100000000,100000000));

        // When
        LinkedList<Integer> actual = underTest.removeWithBuffer(list);
        LinkedList<Integer> expected = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,100,200,31,
                20,67,900,999,888,100000000));

        // Then
        assertThat(actual).isEqualTo(expected);
    }
}
