package codesignal.arcade.intro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildPalindromeTest {

    @Test
    void solution() {
        assertEquals("abcdcba", BuildPalindrome.solution("abcdc"));
        assertEquals("abababa", BuildPalindrome.solution("ababab"));
    }
}