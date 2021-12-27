package codesignal.arcade.intro;

import codesignal.arcade.intro.AlphabeticShift;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlphabeticShiftTest {

    @Test
    void solution() {
        assertEquals("dsbaz", AlphabeticShift.solution("crazy"));
//        assertEquals("dsbaz", AlphabeticShift.solution("crazy"));
    }

    @Test
    void solution2() {
        assertEquals("dsbaz", AlphabeticShift.solution2("crazy"));
//        assertEquals("dsbaz", AlphabeticShift.solution("crazy"));
    }
}