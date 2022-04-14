package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test03_CountEvenNumbers {

    @Test
    void countEvenNumbers() {
        int[] array = {1};
        int result = Practice.countEvenNumbers(array);
        assertEquals(0, result);

        array = new int[]{2};
        result = Practice.countEvenNumbers(array);
        assertEquals(1, result);

        array = new int[]{1, 2, 3, 4, 5};
        result = Practice.countEvenNumbers(array);
        assertEquals(2, result);

        array = new int[]{42, 33, 66, 69, 0, -66, -33, -42};
        result = Practice.countEvenNumbers(array);
        assertEquals(5, result);

        array = new int[]{42, 66, 0, 66, 42, -50, 10, 0, 98, -2};
        result = Practice.countEvenNumbers(array);
        assertEquals(10, result);
    }

}