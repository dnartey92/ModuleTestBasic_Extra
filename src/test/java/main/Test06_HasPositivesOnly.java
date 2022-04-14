package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test06_HasPositivesOnly {

    @Test
    void hasPositivesOnly() {
        int[] array = {1};
        boolean result = Practice.hasPositivesOnly(array);
        assertTrue(result);

        array = new int[]{0};
        result = Practice.hasPositivesOnly(array);
        assertFalse(result);

        array = new int[]{-1};
        result = Practice.hasPositivesOnly(array);
        assertFalse(result);

        array = new int[]{42, 33, 66, 69, 0, -66, -33, -42};
        result = Practice.hasPositivesOnly(array);
        assertFalse(result);

        array = new int[]{42, 66, 66, 42, 50, 10, 98, 2};
        result = Practice.hasPositivesOnly(array);
        assertTrue(result);

        array = new int[]{42, 66, 66, 42, 50, 10, 98, 2, 0};
        result = Practice.hasPositivesOnly(array);
        assertFalse(result);
    }

}