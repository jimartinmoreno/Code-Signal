package codesignal.arcade.intro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChessBoardCellColorTest {

    @Test
    void solution() {
        assertEquals(true, ChessBoardCellColor.solution("A1", "C3"));
        assertEquals(true, ChessBoardCellColor.solution("B1", "B3"));
        assertEquals(false, ChessBoardCellColor.solution("A1", "B3"));
    }

    @Test
    void solution2() {
       assertEquals(true, ChessBoardCellColor.solution("A1", "B2"));
    }
}