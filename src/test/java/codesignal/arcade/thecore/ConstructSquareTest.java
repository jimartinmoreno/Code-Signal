package codesignal.arcade.thecore;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ConstructSquareTest {

    @Test
    public void testSolution() {
        assertEquals(81, ConstructSquare.solution("ab"));
        assertEquals(-1, ConstructSquare.solution("zzz"));
        assertEquals(900, ConstructSquare.solution("aba"));
        assertEquals(810000, ConstructSquare.solution("abcbbb"));
        assertEquals(999950884, ConstructSquare.solution("aaaabbcde"));
    }
}