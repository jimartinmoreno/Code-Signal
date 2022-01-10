package codesignal.arcade.intro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestWordTest {

    @Test
    void solution() {
        assertEquals("steady", LongestWord.solution("Ready, steady, go!"));
        assertEquals("steady", LongestWord.solution("Ready[[[, steady, go!"));
    }

    @Test
    void solution2() {
        assertEquals("steady", LongestWord.solution2("Ready, steady, go!"));
        assertEquals("steady", LongestWord.solution2("Ready[[[, steady, go!"));
    }

    @Test
    void solution3() {
        assertEquals("steady", LongestWord.solution3("Ready, steady, go!"));
        assertEquals("steady", LongestWord.solution3("Ready[[[, steady, go!"));
    }
}