package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtraNumberTest {

    @Test
    void solution() {
        assertEquals(7, ExtraNumber.solution(2, 7, 2));
        assertEquals(2, ExtraNumber.solution(3, 3, 2));
    }

    @Test
    void solution2() {
        assertEquals(7, ExtraNumber.solution2(2, 7, 2));
        assertEquals(2, ExtraNumber.solution2(3, 3, 2));
    }
}