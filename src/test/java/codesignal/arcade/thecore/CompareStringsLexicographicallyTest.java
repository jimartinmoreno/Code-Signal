package codesignal.arcade.thecore;

import codesignal.arcade.thecore.CompareStringsLexicographically;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareStringsLexicographicallyTest {

    @Test
    void solution() {
        assertTrue(CompareStringsLexicographically.solution("aa", "AAB"));
        assertFalse(CompareStringsLexicographically.solution("A", "z"));
    }
}