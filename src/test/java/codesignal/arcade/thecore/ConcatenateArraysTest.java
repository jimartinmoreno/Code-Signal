package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenateArraysTest {

    @Test
    void solution() {
        assertArrayEquals(new int[]{2, 2, 1, 10, 11}, ConcatenateArrays.solution(new int[]{2, 2, 1}, new int[]{10, 11}));
    }

    @Test
    void solution2() {
        assertArrayEquals(new int[]{2, 2, 1, 10, 11}, ConcatenateArrays.solution2(new int[]{2, 2, 1}, new int[]{10, 11}));
    }

    @Test
    void solution3() {
        assertArrayEquals(new int[]{2, 2, 1, 10, 11}, ConcatenateArrays.solution3(new int[]{2, 2, 1}, new int[]{10, 11}));
    }
}