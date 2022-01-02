package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CandlesTest {

    @Test
    void solution() {
        assertEquals(9, Candles.solution(5, 2));
        assertEquals(1, Candles.solution(1, 2));

        assertEquals(4, Candles.solution(3, 3));
        assertEquals(16, Candles.solution(11, 3));
    }

    @Test
    void solution2() {
        assertEquals(9, Candles.solution2(5, 2));
        assertEquals(1, Candles.solution2(1, 2));

        assertEquals(4, Candles.solution2(3, 3));
        assertEquals(16, Candles.solution2(11, 3));
    }
}