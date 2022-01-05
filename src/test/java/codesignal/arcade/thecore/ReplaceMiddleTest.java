package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceMiddleTest {

    @Test
    void solution() {
        assertArrayEquals(new int[]{7, 2, 7, 10, 7}, ReplaceMiddle.solution(new int[]{7, 2, 2, 5, 10, 7}));
    }

    @Test
    void solution2() {
        assertArrayEquals(new int[]{7, 2, 7, 10, 7}, ReplaceMiddle.solution2(new int[]{7, 2, 2, 5, 10, 7}));
    }
}