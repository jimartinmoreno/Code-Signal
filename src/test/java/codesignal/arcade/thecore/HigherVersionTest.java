package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HigherVersionTest {

    @Test
    void solution() {
        assertEquals(true, HigherVersion.solution("1.2.2", "1.2.0"));
        assertEquals(false, HigherVersion.solution("1.0.5", "1.1.0"));
        assertEquals(false, HigherVersion.solution("0", "0"));
        assertEquals(false, HigherVersion.solution("4.3.22.1", "4.3.22.1"));
    }
}