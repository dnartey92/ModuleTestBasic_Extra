package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test09_FindTheOneSock {

    @Test
    void findLonelySock1() {
        int[] socks = {42};
        int result = Practice.findTheOneSock(socks);
        assertEquals(42, result);

        socks = new int[]{1, 2, 2};
        result = Practice.findTheOneSock(socks);
        assertEquals(1, result);

        socks = new int[]{10, 2, 3, 2, 3, 4, 4};
        result = Practice.findTheOneSock(socks);
        assertEquals(10, result);

        socks = new int[]{1, 4, 2, 4, 3, 3, 1, 3, 2, 3, 4, 4, 5};
        result = Practice.findTheOneSock(socks);
        assertEquals(5, result);

        socks = new int[]{4, 2, 4, 3, 5, 3, 13, 3, 2, 3, 4, 5, 4};
        result = Practice.findTheOneSock(socks);
        assertEquals(13, result);
    }

}