package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegerToStringOfFixedWidthTest {

    @Test
    void solution() {
        assertEquals("34", IntegerToStringOfFixedWidth.solution(1234, 2));
        assertEquals("1234", IntegerToStringOfFixedWidth.solution(1234, 4));
        assertEquals("01234", IntegerToStringOfFixedWidth.solution(1234, 5));
        assertEquals("0089", IntegerToStringOfFixedWidth.solution(89, 4));
    }

    @Test
    void solution2() {
        assertEquals("34", IntegerToStringOfFixedWidth.solution2(1234, 2));
        assertEquals("1234", IntegerToStringOfFixedWidth.solution2(1234, 4));
        assertEquals("01234", IntegerToStringOfFixedWidth.solution2(1234, 5));
        assertEquals("0089", IntegerToStringOfFixedWidth.solution2(89, 4));
    }
}