package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlphabetSubsequenceTest {

    @Test
    void solution() {
        assertEquals(false, AlphabetSubsequence.solution("effg"));
        assertEquals(false, AlphabetSubsequence.solution("cdce"));
        assertEquals(true, AlphabetSubsequence.solution("ace"));
        assertEquals(true, AlphabetSubsequence.solution("bxz"));
    }
}