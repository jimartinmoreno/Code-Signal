package codesignal.arcade.intro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LineEncodingTest {

    @Test
    void solution() {
        assertEquals("2a3bc", LineEncoding.solution("aabbbc"));
    }

    @Test
    void solution2() {
        assertEquals("2a3bc", LineEncoding.solution2("aabbbc"));
    }

    @Test
    void solution3() {
        assertEquals("2a3bc", LineEncoding.solution3("aabbbc"));
    }
}