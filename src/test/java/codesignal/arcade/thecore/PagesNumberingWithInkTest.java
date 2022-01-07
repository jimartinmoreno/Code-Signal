package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagesNumberingWithInkTest {

    @Test
    void solution() {
        assertEquals(5, PagesNumberingWithInk.solution(1, 5));
        assertEquals(22, PagesNumberingWithInk.solution(21, 5));
        assertEquals(10, PagesNumberingWithInk.solution(8, 4));
    }
}