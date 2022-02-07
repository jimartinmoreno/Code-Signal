package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharacterParityTest {

    @Test
    void solution() {
        assertEquals("odd", CharacterParity.solution('5'));
        assertEquals("even", CharacterParity.solution('8'));
        assertEquals("not a digit", CharacterParity.solution('p'));
    }
}