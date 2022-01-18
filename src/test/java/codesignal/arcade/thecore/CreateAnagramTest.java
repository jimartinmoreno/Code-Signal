package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreateAnagramTest {

    @Test
    public void testSolution() {
        assertEquals(1, CreateAnagram.solution("AABAA", "BBAAA"));
        assertEquals(4, CreateAnagram.solution("OVGHK", "RPGUC"));
        assertEquals(1, CreateAnagram.solution("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAB", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAC"));
        assertEquals(4, CreateAnagram.solution("HDFFVR", "FEDDEE"));
    }
}