package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionWithoutCarryingTest {
    @Test
    void solution() {
        assertEquals(1180, AdditionWithoutCarrying.solution(456, 1734));
    }

    @Test
    void solution2() {
        assertEquals(1180, AdditionWithoutCarrying.solution2(456, 1734));
    }
}