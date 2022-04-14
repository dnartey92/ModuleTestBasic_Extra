package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test04_FindNumber {

    @Test
    void findNumber() {
        int[] array = {1};
        int result = Practice.findNumber(array, 2);
        assertEquals(-1, result);

        array = new int[]{2};
        result = Practice.findNumber(array, 2);
        assertEquals(0, result);

        array = new int[]{1, 2};
        result = Practice.findNumber(array, 2);
        assertEquals(1, result);

        array = new int[]{1, 2, 3, 3, 2, 1};
        result = Practice.findNumber(array, 3);
        assertEquals(2, result);

        array = new int[]{10, -42, 33, -3, 2, 111, 42};
        result = Practice.findNumber(array, 42);
        assertEquals(6, result);
    }

}