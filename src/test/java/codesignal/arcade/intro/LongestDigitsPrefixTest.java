package codesignal.arcade.intro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestDigitsPrefixTest {

    @Test
    void solution() {
        assertEquals("123", LongestDigitsPrefix.solution("123aa1"));
    }

    @Test
    void solution2() {
        assertEquals("123", LongestDigitsPrefix.solution2("123aa1"));
    }

    @Test
    void solution3() {
        assertEquals("123", LongestDigitsPrefix.solution3("123aa1"));
    }
}