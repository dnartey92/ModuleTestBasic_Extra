package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test01_GetLastNumber {

    @Test
    void getLastNumber() {
        int[] array = {1};
        int result = Practice.getLastNumber(array);
        assertEquals(1, result);

        array = new int[]{1, 2};
        result = Practice.getLastNumber(array);
        assertEquals(2, result);

        array = new int[]{1, 2, 4, 1, 0, -42, 66, 42};
        result = Practice.getLastNumber(array);
        assertEquals(42, result);
    }

}