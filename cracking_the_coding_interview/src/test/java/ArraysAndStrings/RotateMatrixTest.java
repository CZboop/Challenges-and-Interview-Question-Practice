package ArraysAndStrings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RotateMatrixTest {
    private RotateMatrix underTest;

    @BeforeEach
    void setUp(){
        underTest = new RotateMatrix();
    }

    @Test
    void emptyMatrixReturnsEmptyMatrix() {
        // Given
        int[][] matrix = new int[2][2];

        // When
        int[][] actual = underTest.rotate(matrix);

        int[][] expected = matrix;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void oneByOneMatrixReturnsInput() {
        // Given
        int[][] matrix = new int[][]{new int[]{1}};

        // When
        int[][] actual = underTest.rotate(matrix);

        int[][] expected = matrix;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void twoByTwoMatrixRotatesCorrectly() {
        // Given
        int[][] matrix = new int[][]{new int[]{1,2}, new int[]{4,5}};

        // When
        int[][] actual = underTest.rotate(matrix);

        int[][] expected = new int[][]{new int[]{2,5}, new int[]{1,4}};

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void threeByThreeMatrixRotatesCorrectly() {
        // Given
        int[][] matrix = new int[][]{new int[]{10, 20, 30}, new int[]{4, 5, 6}, new int[]{10, 15, 20}};

        // When
        int[][] actual = underTest.rotate(matrix);

        int[][] expected = new int[][]{new int[]{30, 6, 20}, new int[]{20, 5, 15}, new int[]{10, 4, 10}};

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void fourByFourMatrixRotatesCorrectly() {
        // Given
        int[][] matrix = new int[][]{new int[]{12, 20, 30, 10}, new int[]{4, 5, 6, 9},
                new int[]{16, 17, 25, 100}, new int[]{102, 15, 29, 50}};

        // When
        int[][] actual = underTest.rotate(matrix);

        int[][] expected = new int[][]{new int[]{10, 9, 100, 50}, new int[]{30, 6, 25, 29},
                new int[]{20, 5, 17, 15}, new int[]{12, 4, 16, 102}};

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void fiveByFiveMatrixRotatesCorrectly() {
        // Given
        int[][] matrix = new int[][]{new int[]{12, 20, 30, 10, 139}, new int[]{4, 5, 6, 9, 1},
                new int[]{16, 17, 25, 100, 88}, new int[]{102, 15, 29, 50, 44}, new int[]{105, 45, 79, 55, 222}};

        // When
        int[][] actual = underTest.rotate(matrix);

        int[][] expected = new int[][]{new int[]{139, 1, 88, 44, 222}, new int[]{10, 9, 100, 50, 55},
                new int[]{30, 6, 25, 29, 79}, new int[]{20, 5, 17, 15, 45}, new int[]{12, 4, 16, 102, 105}};

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void sixBySixMatrixRotatesCorrectly() {
        // Given
        int[][] matrix = new int[][]{new int[]{139, 1, 88, 44, 222, 444}, new int[]{10, 9, 100, 50, 55, 555},
                new int[]{30, 6, 25, 29, 79, 666}, new int[]{20, 5, 17, 15, 45, 777}, new int[]{12, 4, 16, 102, 105, 888},
                new int[]{32, 54, 66, 152, 175, 999}};

        // When
        int[][] actual = underTest.rotate(matrix);

        int[][] expected = new int[][]{new int[]{444, 555, 666, 777, 888, 999}, new int[]{222, 55, 79, 45, 105, 175},
                new int[]{44, 50, 29, 15, 102, 152},
                new int[]{88, 100, 25, 17, 16, 66}, new int[]{1, 9, 6, 5, 4, 54}, new int[]{139, 10, 30, 20, 12, 32}};

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void sevenBySevenMatrixRotatesCorrectly() {
        // Given
        int[][] matrix = new int[][]{
                new int[]{139, 1, 88, 44, 222, 444, 1},
                new int[]{10, 9, 100, 50, 55, 555, 2},
                new int[]{30, 6, 25, 29, 79, 666, 3},
                new int[]{20, 5, 17, 15, 45, 777, 4},
                new int[]{12, 4, 16, 102, 105, 888, 5},
                new int[]{32, 54, 66, 152, 175, 999, 6},
                new int[]{90, 89, 88, 87, 86, 85, 7}};

        // When
        int[][] actual = underTest.rotate(matrix);

        int[][] expected = new int[][]{
                new int[]{1, 2, 3, 4, 5, 6, 7},
                new int[]{444, 555, 666, 777, 888, 999, 85},
                new int[]{222, 55, 79, 45, 105, 175, 86},
                new int[]{44, 50, 29, 15, 102, 152, 87},
                new int[]{88, 100, 25, 17, 16, 66, 88},
                new int[]{1, 9, 6, 5, 4, 54, 89},
                new int[]{139, 10, 30, 20, 12, 32, 90}};

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void tenByTenMatrixRotatesCorrectly() {
        // Given
        int[][] matrix = new int[][]{
                new int[]{139, 1, 88, 44, 222, 444, 1, 2, 3, 4},
                new int[]{10, 9, 100, 50, 55, 555, 2, 4, 6, 8},
                new int[]{30, 6, 25, 29, 79, 666, 3, 6, 9, 12},
                new int[]{20, 5, 17, 15, 45, 777, 4, 8, 12, 16},
                new int[]{12, 4, 16, 102, 105, 888, 5, 10, 15, 20},
                new int[]{32, 54, 66, 152, 175, 999, 6, 12, 18, 24},
                new int[]{90, 89, 88, 87, 86, 85, 7, 14, 21, 28},
                new int[]{990, 859, 868, 877, 886, 805, 47, 74, 77, 41},
                new int[]{910, 849, 858, 867, 896, 825, 337, 303, 224, 111},
                new int[]{2, 35, 15, 81, 87, 101, 242, 454, 64, 500}};

        // When
        int[][] actual = underTest.rotate(matrix);

        int[][] expected = new int[][]{
                new int[]{4, 8, 12, 16, 20, 24, 28, 41, 111, 500},
                new int[]{3, 6, 9, 12, 15, 18, 21, 77, 224, 64},
                new int[]{2, 4, 6, 8, 10, 12, 14, 74, 303, 454},
                new int[]{1, 2, 3, 4, 5, 6, 7, 47, 337, 242},
                new int[]{444, 555, 666, 777, 888, 999, 85, 805, 825, 101},
                new int[]{222, 55, 79, 45, 105, 175, 86, 886, 896, 87},
                new int[]{44, 50, 29, 15, 102, 152, 87, 877, 867, 81},
                new int[]{88, 100, 25, 17, 16, 66, 88, 868, 858, 15},
                new int[]{1, 9, 6, 5, 4, 54, 89, 859, 849, 35},
                new int[]{139, 10, 30, 20, 12, 32, 90, 990, 910, 2}
        };

        // Then
        assertThat(actual).isEqualTo(expected);
    }

}
