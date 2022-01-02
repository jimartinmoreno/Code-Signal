package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeastFactorialTest {

    @Test
    void solution() {
        assertEquals(24, LeastFactorial.solution(17));
    }

    @Test
    void solution2() {
        assertEquals(24, LeastFactorial.solution2(17));
    }
}