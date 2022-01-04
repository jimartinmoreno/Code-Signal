package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountBlackCellsTest {

    @Test
    void solution() {
        assertEquals(6, CountBlackCells.solution(3, 4));
        assertEquals(1, CountBlackCells.solution(1, 1));
        assertEquals(7, CountBlackCells.solution(3, 3));
        assertEquals(6, CountBlackCells.solution(2, 5));
    }
}