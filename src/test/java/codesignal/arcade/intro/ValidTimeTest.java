package codesignal.arcade.intro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidTimeTest {

    @Test
    void solution() {
        assertEquals(true, ValidTime.solution("13:58"));
        assertEquals(false, ValidTime.solution("25:51"));
        assertEquals(false, ValidTime.solution("02:76"));
    }
}