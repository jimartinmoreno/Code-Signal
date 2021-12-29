package codesignal.arcade.intro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BishopAndPawnTest {

    @Test
    void solution() {
        assertEquals(true, BishopAndPawn.solution("a1", "c3"));
        assertEquals(true, BishopAndPawn.solution("b1", "c2"));
        assertEquals(true, BishopAndPawn.solution("c1", "d2"));
        assertEquals(true, BishopAndPawn.solution("d1", "e2"));
        assertEquals(true, BishopAndPawn.solution("c3", "d4"));
        assertEquals(false, BishopAndPawn.solution("d1", "e3"));
        assertEquals(true, BishopAndPawn.solution("a2", "b3"));
        assertEquals(true, BishopAndPawn.solution("a3", "b4"));
        assertEquals(false, BishopAndPawn.solution("a2", "b4"));
        assertEquals(true, BishopAndPawn.solution("e3", "a7"));

        assertEquals(true, BishopAndPawn.solution("a2", "b1"));
        assertEquals(true, BishopAndPawn.solution("b2", "c1"));
        assertEquals(true, BishopAndPawn.solution("c2", "d1"));
        assertEquals(true, BishopAndPawn.solution("d4", "e3"));

        assertEquals(false, BishopAndPawn.solution("h1", "h3"));

        assertEquals(true, BishopAndPawn.solution("h1", "f3"));
        assertEquals(false, BishopAndPawn.solution("g1", "f3"));
        assertEquals(true, BishopAndPawn.solution("e7", "d6"));
        assertEquals(true, BishopAndPawn.solution("h1", "a8"));
        assertEquals(true, BishopAndPawn.solution("g1", "a7"));

        assertEquals(true, BishopAndPawn.solution("e7", "a3"));
        assertEquals(true, BishopAndPawn.solution("h1", "a8"));
        assertEquals(true, BishopAndPawn.solution("b1", "a2"));
    }
}