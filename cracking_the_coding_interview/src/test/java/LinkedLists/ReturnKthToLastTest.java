package LinkedLists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ReturnKthToLastTest {
    private ReturnKthToLast underTest;

    @BeforeEach
    void setUp(){
        underTest = new ReturnKthToLast();
    }

    @Test
    void zeroKReturnsLastElement() {
        // Given
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4));
        int k = 0;

        // When
        int actual = underTest.returnKth(list, k);
        int expected = 4;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void negativeKThrowsException() {
        // Given
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4));

        //When
        int k = -5;

        // Then
        assertThatThrownBy(() -> underTest.returnKth(list, k)).isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("K cannot be negative");
    }

    @Test
    void kGreaterThanListLengthThrowsException() {
        // Given
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4));

        // When
        int k = 5;

        // Then
        assertThatThrownBy(() -> underTest.returnKth(list, k)).isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("Element does not exist");
    }

    @Test
    void smallValidKReturnsCorrectElement() {
        // Given
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11));
        int k = 3;

        // When
        int actual = underTest.returnKth(list, k);
        int expected = 8;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void largerValidKReturnsCorrectElement() {
        // Given
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11));
        int k = 9;

        // When
        int actual = underTest.returnKth(list, k);
        int expected = 2;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void returnsCorrectElementInLongerList() {
        // Given
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,
                20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50));
        int k = 22;

        // When
        int actual = underTest.returnKth(list, k);
        int expected = 28;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void returnsCorrectElementInListWithRepeatedElements() {
        // Given
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,2,2,3,3,3,4,4,4,4,5,6,7,8,9,10,11,12,12,12,12));
        int k = 4;

        // When
        int actual = underTest.returnKth(list, k);
        int expected = 11;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void returnsCorrectElementInListWithNegativeElements() {
        // Given
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(-1,-2,-2,-2,-3,-3,-5,-6,-7,-8,-9,-10,-11,-12,-12));
        int k = 4;

        // When
        int actual = underTest.returnKth(list, k);
        int expected = -9;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void returnsCorrectElementInListWithNegativeAndPositiveElements() {
        // Given
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(-1,2,2,-2,-3,3,-5,6,-7,8,-9,10,11,12,-12));
        int k = 7;

        // When
        int actual = underTest.returnKth(list, k);
        int expected = 6;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void returnsCorrectElementInLongListWithNegativeAndPositiveElements() {
        // Given
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(-1,2,2,-2,-3,3,-5,6,-7,8,-9,10,11,12,-12,
                55,-10,33,67,988,100,-3,29,1111,29,-45,26,108,-34,-100,39,11,234,5555, 109,-123,-100,-2,109,12,32,100,
                24,89,100,90,1000000001,25,8999,-3,-90,1,2,3,4,5,6,7,12,13,14,200,300,400,460,50,1002,1));
        int k = 21;

        // When
        int actual = underTest.returnKth(list, k);
        int expected = 1000000001;

        // Then
        assertThat(actual).isEqualTo(expected);
    }
}
