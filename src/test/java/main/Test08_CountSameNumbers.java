package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test08_CountSameNumbers {

    @Test
    void countSameNumbers() {
        int[] first = {1};
        int[] second = {2};
        int result = Practice.countSameNumbers(first, second);
        assertEquals(0, result);

        first = new int[]{1, 2, 3};
        second = new int[]{2};
        result = Practice.countSameNumbers(first, second);
        assertEquals(1, result);

        first = new int[]{1, 2, 3};
        second = new int[]{2, 2};
        result = Practice.countSameNumbers(first, second);
        assertEquals(1, result);

        first = new int[]{1, 2, 3, 5, 4, 0};
        second = new int[]{4, 5, 4, 4, 1, 2, 2, 3, 2, 4, 5, 0, 4, 4, 3};
        result = Practice.countSameNumbers(first, second);
        assertEquals(6, result);

        first = new int[]{1, 2, 3, 10, 9, 8};
        second = new int[]{1, 2, 1, 11, 89, 1, 9, -1, 9, 9, 1};
        result = Practice.countSameNumbers(first, second);
        assertEquals(3, result);
    }

}