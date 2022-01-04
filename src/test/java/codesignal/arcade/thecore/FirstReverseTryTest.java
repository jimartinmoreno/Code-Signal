package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstReverseTryTest {

    @Test
    void solution() {
        assertArrayEquals(new int []{5, 2, 3, 4, 1}, FirstReverseTry.solution(new int []{1, 2, 3, 4, 5}));
        assertArrayEquals(new int [0], FirstReverseTry.solution(new int [0]));
    }
}