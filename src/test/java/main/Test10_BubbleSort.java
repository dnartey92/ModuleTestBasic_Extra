package main;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Test10_BubbleSort {

    @Test
    void bubbleSort() {
        int[] array = {1};
        Practice.bubbleSort(array);
        assertEquals("[1]", Arrays.toString(array));

        array = new int[]{1, 2};
        Practice.bubbleSort(array);
        assertEquals("[2, 1]", Arrays.toString(array));

        array = new int[]{1, 2, 3};
        Practice.bubbleSort(array);
        assertEquals("[3, 2, 1]", Arrays.toString(array));

        array = new int[]{1, 4, 3, 1, 0, 5};
        Practice.bubbleSort(array);
        assertEquals("[5, 4, 3, 1, 1, 0]", Arrays.toString(array));
    }

}