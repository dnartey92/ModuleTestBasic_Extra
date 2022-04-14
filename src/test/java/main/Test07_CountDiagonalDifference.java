package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test07_CountDiagonalDifference {

    @Test
    void countDiagonalDifference() {
        int[][] matrix = { {1} };
        int result = Practice.countDiagonalDifference(matrix);
        assertEquals(0, result);

        matrix = new int[][]{ {5, 5}, {7, 9} };
        result = Practice.countDiagonalDifference(matrix);
        assertEquals(2, result);

        matrix = new int[][]{ {5, 5}, {9, 7} };
        result = Practice.countDiagonalDifference(matrix);
        assertEquals(2, result);

        matrix = new int[][]{ {-1, 2, 3}, {4, -5, 6}, {7, 8, -9} };
        result = Practice.countDiagonalDifference(matrix);
        assertEquals(20, result);

    }

}