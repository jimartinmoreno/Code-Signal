package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSmoothTest {

    @Test
    void solution() {
        assertEquals(true, IsSmooth.solution(new int[]{7, 2, 2, 5, 10, 7}));
        assertEquals(true, IsSmooth.solution(new int[]{7, 2, 2, 7, 2, 10, 7}));
        assertEquals(false, IsSmooth.solution(new int[]{-5, -5, 10}));
    }

    @Test
    void solution2() {
        assertEquals(true, IsSmooth.solution2(new int[]{7, 2, 2, 5, 10, 7}));
        assertEquals(true, IsSmooth.solution2(new int[]{7, 2, 2, 7, 2, 10, 7}));
        assertEquals(false, IsSmooth.solution2(new int[]{-5, -5, 10}));
    }
}