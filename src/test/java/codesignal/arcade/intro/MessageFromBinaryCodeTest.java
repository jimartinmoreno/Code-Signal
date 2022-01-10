package codesignal.arcade.intro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageFromBinaryCodeTest {

    @Test
    void solution() {
        assertEquals("Hello!", MessageFromBinaryCode.solution("010010000110010101101100011011000110111100100001"));
    }

    @Test
    void solution2() {
        assertEquals("Hello!", MessageFromBinaryCode.solution2("010010000110010101101100011011000110111100100001"));
    }

    @Test
    void solution3() {
        assertEquals("Hello!", MessageFromBinaryCode.solution3("010010000110010101101100011011000110111100100001"));
    }
}