package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SwitchCandlesTest {

    @Test
    void solution() {
        assertArrayEquals(new int[]{0, 1, 0, 1, 0}, SwitchCandles.solution(new int[]{1, 1, 1, 1, 1}));
        assertArrayEquals(new int[]{0, 0}, SwitchCandles.solution(new int[]{0, 0}));
        assertArrayEquals(new int[]{1, 1, 1, 0, 0, 1, 1, 0}, SwitchCandles.solution(new int[]{1, 0, 0, 1, 0, 1, 0, 1}));
    }
}