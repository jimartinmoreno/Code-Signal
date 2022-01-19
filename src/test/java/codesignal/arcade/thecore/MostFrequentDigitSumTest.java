package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MostFrequentDigitSumTest {

    @Test
    void solution() {
        assertEquals(9, MostFrequentDigitSum.solution(88));
        assertEquals(9, MostFrequentDigitSum.solution(17));
    }
}