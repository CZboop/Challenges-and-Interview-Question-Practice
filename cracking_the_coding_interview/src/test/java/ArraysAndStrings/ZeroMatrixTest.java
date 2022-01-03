package ArraysAndStrings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ZeroMatrixTest {
    private ZeroMatrix underTest;

    @BeforeEach
    void setUp(){
        underTest = new ZeroMatrix();
    }

    @Test
    void emptyMatrixReturnsEmptyMatrix() {
        // Given
        int[][] matrix = new int[][] {
                new int[2],
                new int[2]};

        // When
        int[][] actual = underTest.zero(matrix);
        int[][] expected = matrix;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void returnsMatrixWithNoZerosUnchanged() {
        // Given
        int[][] matrix = new int[][] {
                new int[]{10,8,30,40,33},
                new int[]{1,5,4,6,67},
                new int[]{100,200,6,400,222},
                new int[]{55,77,66,88,10}};

        // When
        int[][] actual = underTest.zero(matrix);
        int[][] expected = matrix;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canHandleOneByOneMatrixWithNoZeros() {
        // Given
        int[][] matrix = new int[][] {
                new int[]{7}};

        // When
        int[][] actual = underTest.zero(matrix);
        int[][] expected = matrix;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canHandleOneByOneMatrixWithZero() {
        // Given
        int[][] matrix = new int[][] {
                new int[]{0}};

        // When
        int[][] actual = underTest.zero(matrix);
        int[][] expected = matrix;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canHandleTwoByTwoMatrixWithNoZeros() {
        // Given
        int[][] matrix = new int[][] {
                new int[]{18,47},
                new int[]{61,6}};

        // When
        int[][] actual = underTest.zero(matrix);
        int[][] expected = matrix;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canHandleTwoByTwoMatrixWithAZero() {
        // Given
        int[][] matrix = new int[][] {
                new int[]{18,47},
                new int[]{61,0}};

        // When
        int[][] actual = underTest.zero(matrix);
        int[][] expected = new int[][] {
                new int[]{18,0},
                new int[]{0,0}};

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canHandleTwoByTwoMatrixBecomesAllZeros() {
        // Given
        int[][] matrix = new int[][] {
                new int[]{0,47},
                new int[]{61,0}};

        // When
        int[][] actual = underTest.zero(matrix);
        int[][] expected = new int[][] {
                new int[]{0,0},
                new int[]{0,0}};

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canHandleTwoByTwoMatrixAlreadyAllZeros() {
        // Given
        int[][] matrix = new int[][] {
                new int[]{0,0},
                new int[]{0,0}};

        // When
        int[][] actual = underTest.zero(matrix);
        int[][] expected = matrix;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canConvertTwoByFourMatrix() {
        // Given
        int[][] matrix = new int[][] {
                new int[]{10,8},
                new int[]{1,8},
                new int[]{0,200},
                new int[]{55,77}};

        // When
        int[][] actual = underTest.zero(matrix);
        int[][] expected = new int[][] {
                new int[]{0,8},
                new int[]{0,8},
                new int[]{0,0},
                new int[]{0,77}};

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canConvertThreeByFourMatrix() {
        // Given
        int[][] matrix = new int[][] {
                new int[]{10,8,0},
                new int[]{1,66,4},
                new int[]{100,200,53},
                new int[]{55,0,66}};

        // When
        int[][] actual = underTest.zero(matrix);
        int[][] expected = new int[][] {
                new int[]{0,0,0},
                new int[]{1,0,0},
                new int[]{100,0,0},
                new int[]{0,0,0}};

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canConvertFourBySixMatrix() {
        // Given
        int[][] matrix = new int[][] {
                new int[]{55,8,38,49},
                new int[]{1,9,4,6},
                new int[]{100,26,0,400},
                new int[]{55,77,66,33},
                new int[]{0,907,36,65},
                new int[]{75,87,16,88}};

        // When
        int[][] actual = underTest.zero(matrix);
        int[][] expected = new int[][] {
                new int[]{0,8,0,49},
                new int[]{0,9,0,6},
                new int[]{0,0,0,0},
                new int[]{0,77,0,33},
                new int[]{0,0,0,0},
                new int[]{0,87,0,88}};

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canConvertTenByTenMatrix() {
        // Given
        int[][] matrix = new int[][] {
                new int[]{65, 75, 36, 47, 263, 44, 68, 99, 0, 144},
                new int[]{34, 66, 36, 40, 273, 54, 138, 35, 122, 14},
                new int[]{10, 24, 0, 78, 21, 49, 333, 59, 39, 54},
                new int[]{15, 78, 25, 68, 186, 440, 27, 23, 0, 78},
                new int[]{18, 123, 78, 243, 164, 75, 64, 758, 57, 28},
                new int[]{14, 48, 111, 406, 79, 0, 122, 14, 35, 60},
                new int[]{106, 87, 143, 410, 66, 13, 36, 276, 29, 534},
                new int[]{111, 28, 675, 122, 214, 37, 68, 154, 12, 6},
                new int[]{180, 68, 21, 176, 613, 48, 8, 99, 57, 2},
                new int[]{90, 84, 37, 189, 693, 176, 123, 99, 79, 7},
                };

        // When
        int[][] actual = underTest.zero(matrix);
        int[][] expected = new int[][] {
                new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                new int[]{34, 66, 0, 40, 273, 0, 138, 35, 0, 14},
                new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                new int[]{18, 123, 0, 243, 164, 0, 64, 758, 0, 28},
                new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                new int[]{106, 87, 0, 410, 66, 0, 36, 276, 0, 534},
                new int[]{111, 28, 0, 122, 214, 0, 68, 154, 0, 6},
                new int[]{180, 68, 0, 176, 613, 0, 8, 99, 0, 2},
                new int[]{90, 84, 0, 189, 693, 0, 123, 99, 0, 7},
        };

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canConvertTenByFifteenMatrix() {
        // Given
        int[][] matrix = new int[][] {
                new int[]{65, 75, 36, 47, 263, 44, 68, 99, 5, 144, 24, 68, 59, 22, 0},
                new int[]{34, 66, 36, 40, 273, 54, 138, 35, 0, 14, 64, 68, 99, 8, 144},
                new int[]{10, 24, 99, 78, 21, 49, 333, 59, 39, 54, 44, 68, 89, 0, 334},
                new int[]{15, 78, 25, 68, 186, 440, 27, 23, 8, 78, 44, 78, 99, 7, 14},
                new int[]{18, 123, 78, 243, 164, 75, 64, 758, 57, 28, 44, 68, 79, 88, 74},
                new int[]{14, 48, 111, 406, 79, 33, 0, 14, 35, 60, 44, 5, 99, 23, 7},
                new int[]{106, 87, 143, 410, 66, 13, 36, 276, 29, 534, 24, 68, 99, 57, 12},
                new int[]{111, 28, 675, 122, 214, 37, 68, 154, 12, 6, 74, 68, 49, 8, 87},
                new int[]{0, 68, 21, 176, 613, 48, 8, 99, 57, 2, 4, 68, 39, 12, 20},
                new int[]{90, 84, 37, 189, 693, 176, 123, 99, 79, 7, 449, 68, 9, 6, 87},
        };

        // When
        int[][] actual = underTest.zero(matrix);
        int[][] expected = new int[][] {
                new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                new int[]{0, 78, 25, 68, 186, 440, 0, 23, 0, 78, 44, 78, 99, 0, 0},
                new int[]{0, 123, 78, 243, 164, 75, 0, 758, 0, 28, 44, 68, 79, 0, 0},
                new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                new int[]{0, 87, 143, 410, 66, 13, 0, 276, 0, 534, 24, 68, 99, 0, 0},
                new int[]{0, 28, 675, 122, 214, 37, 0, 154, 0, 6, 74, 68, 49, 0, 0},
                new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                new int[]{0, 84, 37, 189, 693, 176, 0, 99, 0, 7, 449, 68, 9, 0, 0},
        };

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canHandleLargeMatrixWithNoZeros() {
        // Given
        int[][] matrix = new int[][] {
                new int[]{65, 75, 36, 47, 263, 44, 68, 99, 5, 144, 24, 68, 59, 22, 544},
                new int[]{34, 66, 36, 40, 273, 54, 138, 35, 4, 14, 64, 68, 99, 8, 144},
                new int[]{10, 24, 99, 78, 21, 49, 333, 59, 39, 54, 44, 68, 89, 43, 334},
                new int[]{15, 78, 25, 68, 186, 440, 27, 23, 8, 78, 44, 78, 99, 7, 14},
                new int[]{18, 123, 78, 243, 164, 75, 64, 758, 57, 28, 44, 68, 79, 88, 74},
                new int[]{14, 48, 111, 406, 79, 33, 5, 14, 35, 60, 44, 5, 99, 23, 7},
                new int[]{106, 87, 143, 410, 66, 13, 36, 276, 29, 534, 24, 68, 99, 57, 12},
                new int[]{111, 28, 675, 122, 214, 37, 68, 154, 12, 6, 74, 68, 49, 8, 87},
                new int[]{675, 68, 21, 176, 613, 48, 8, 99, 57, 2, 4, 68, 39, 12, 20},
                new int[]{90, 84, 37, 189, 693, 176, 123, 99, 79, 7, 449, 68, 9, 6, 87},
        };

        // When
        int[][] actual = underTest.zero(matrix);
        int[][] expected = matrix;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canConvertFourByFourMatrix() {
        // Given
        int[][] matrix = new int[][] {
                new int[]{10,8,30,40},
                new int[]{1,0,4,6},
                new int[]{100,200,0,400},
                new int[]{55,77,66,88}};

        // When
        int[][] actual = underTest.zero(matrix);
        int[][] expected = new int[][] {
                new int[]{10,0,0,40},
                new int[]{0,0,0,0},
                new int[]{0,0,0,0},
                new int[]{55,0,0,88}};

        // Then
        assertThat(actual).isEqualTo(expected);
    }
}
