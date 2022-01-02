package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsInfiniteProcessTest {

    @Test
    void solution() {
        assertEquals(false, IsInfiniteProcess.solution(2, 6));
        assertEquals(true, IsInfiniteProcess.solution(2, 5));
        assertEquals(true, IsInfiniteProcess.solution(3, 2));
        assertEquals(true, IsInfiniteProcess.solution(10, 5));
    }
}