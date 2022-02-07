package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class NewNumeralSystemTest {

    @Test
    void solution() {
        assertArrayEquals(new String[]{"A + G", "B + F", "C + E", "D + D"}, NewNumeralSystem.solution('G'));
    }
}