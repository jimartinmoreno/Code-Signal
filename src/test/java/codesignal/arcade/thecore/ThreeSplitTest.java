package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeSplitTest {

    @Test
    void solution() {
        assertEquals(0, ThreeSplit.solution(new int[]{7, 8, 2, 25, -9, 12, 12}));
        assertEquals(3, ThreeSplit.solution(new int[]{-1, 1, -1, 1, -1, 1, -1, 1}));
        assertEquals(4, ThreeSplit.solution(new int[]{0, -1, 0, -1, 0, -1}));
    }

    @Test
    void solution2() {
        assertEquals(0, ThreeSplit.solution(new int[]{7, 8, 2, 25, -9, 12, 12}));
        assertEquals(3, ThreeSplit.solution(new int[]{-1, 1, -1, 1, -1, 1, -1, 1}));
        assertEquals(4, ThreeSplit.solution(new int[]{0, -1, 0, -1, 0, -1}));
    }
}