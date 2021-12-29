package codesignal.arcade.intro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DifferentSymbolsNaiveTest {

    @Test
    void solution() {
        assertEquals(3, DifferentSymbolsNaive.solution("cabca"));
        assertEquals(1, DifferentSymbolsNaive.solution("aa"));
        assertEquals(5, DifferentSymbolsNaive.solution("abcde"));
        assertEquals(1, DifferentSymbolsNaive.solution("22222"));
    }

    @Test
    void solution2() {
        assertEquals(3, DifferentSymbolsNaive.solution2("cabca"));
        assertEquals(1, DifferentSymbolsNaive.solution2("aa"));
        assertEquals(5, DifferentSymbolsNaive.solution2("abcde"));
        assertEquals(1, DifferentSymbolsNaive.solution2("22222"));
    }
}