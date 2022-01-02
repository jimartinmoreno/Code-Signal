package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicalWellTest {

    @Test
    void solution() {
        assertEquals(8, MagicalWell.solution(1, 2, 2));
    }

    @Test
    void solution2() {
        assertEquals(8, MagicalWell.solution2(1, 2, 2));
    }
}