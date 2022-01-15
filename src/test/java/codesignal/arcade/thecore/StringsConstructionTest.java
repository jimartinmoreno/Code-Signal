package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringsConstructionTest {

    @Test
    void solution() {
        assertEquals(2, StringsConstruction.solution("abc", "abccba"));
        assertEquals(1, StringsConstruction.solution("ab", "abcbcb"));
        assertEquals(0, StringsConstruction.solution("z", "y"));
        assertEquals(0, StringsConstruction.solution("za", "bzc"));
        assertEquals(3, StringsConstruction.solution("zzz", "zzzzzzzzzzz"));
        assertEquals(3, StringsConstruction.solution("abcabcabc", "aaaaaaaaaaabbbbbbbbbbcccccccccc"));
    }

    @Test
    void solution2() {
        assertEquals(2, StringsConstruction.solution2("abc", "abccba"));
        assertEquals(1, StringsConstruction.solution2("ab", "abcbcb"));
        assertEquals(0, StringsConstruction.solution2("z", "y"));
        assertEquals(0, StringsConstruction.solution2("za", "bzc"));
        assertEquals(3, StringsConstruction.solution2("zzz", "zzzzzzzzzzz"));
        assertEquals(3, StringsConstruction.solution2("abcabcabc", "aaaaaaaaaaabbbbbbbbbbcccccccccc"));
    }
}