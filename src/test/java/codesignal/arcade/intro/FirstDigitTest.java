package codesignal.arcade.intro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstDigitTest {

    @Test
    void solution() {
        assertEquals('1', FirstDigit.solution("var_1__Int"));
        assertEquals('2', FirstDigit.solution("q2q-q"));
        assertEquals('0', FirstDigit.solution("0ss"));
    }
}