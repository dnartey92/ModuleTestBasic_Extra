package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test05_FindMaxIndex {

    @Test
    void findMaxIndex() {
        int[] array = {1};
        int result = Practice.findMaxIndex(array);
        assertEquals(0, result);

        array = new int[]{1, 2};
        result = Practice.findMaxIndex(array);
        assertEquals(1, result);

        array = new int[]{1, 3, 2};
        result = Practice.findMaxIndex(array);
        assertEquals(1, result);

        array = new int[]{33, 66, 42, 88, 19, 43, 56, 65};
        result = Practice.findMaxIndex(array);
        assertEquals(3, result);
    }

}