package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test02_GetTopLeftNumber {

    @Test
    void getTopLeftNumber() {
        int[][] matrix = {{1}};
        int result = Practice.getTopLeftNumber(matrix);
        assertEquals(1, result);

        matrix = new int[][]{ {10, 20} };
        result = Practice.getTopLeftNumber(matrix);
        assertEquals(10, result);

        matrix = new int[][]{ {50, 10, 20}, {30, 40}, {60} };
        result = Practice.getTopLeftNumber(matrix);
        assertEquals(50, result);
    }

}