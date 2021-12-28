package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxMultipleTest {

    @Test
    void solution() {
        assertEquals(9, MaxMultiple.solution(3, 10));
        assertEquals(6, MaxMultiple.solution(3, 8));
    }

    @Test
    void solution2() {
        assertEquals(9, MaxMultiple.solution2(3, 10));
        assertEquals(6, MaxMultiple.solution2(3, 8));
    }

    @Test
    void solution3() {
        assertEquals(9, MaxMultiple.solution3(3, 10));
        assertEquals(6, MaxMultiple.solution3(3, 8));
    }
}