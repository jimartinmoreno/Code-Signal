package codesignal.arcade.intro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsDigitTest {

    @Test
    void solution() {
        assertEquals(true, IsDigit.solution('0'));
        assertEquals(false, IsDigit.solution('-'));
        assertEquals(false, IsDigit.solution('a'));
    }
}