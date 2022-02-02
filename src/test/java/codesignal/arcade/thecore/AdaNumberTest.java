package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdaNumberTest {

    @Test
    void solution() {
        assertEquals(true, AdaNumber.solution("123_456_789"));
        assertEquals(true, AdaNumber.solution("16#123abc#"));
        assertEquals(false, AdaNumber.solution("10#123abc#"));
        assertEquals(false, AdaNumber.solution("10#10#123ABC#"));
        assertEquals(true, AdaNumber.solution("10#0#"));
        assertEquals(false, AdaNumber.solution("10##"));
    }
}