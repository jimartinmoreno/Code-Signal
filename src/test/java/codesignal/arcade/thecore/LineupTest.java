package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineupTest {

    @Test
    void solution() {
        assertEquals(3, Lineup.solution("LLARL"));
        assertEquals(5, Lineup.solution("AALAAALARAR"));
    }

    @Test
    void solution2() {
        assertEquals(3, Lineup.solution2("LLARL"));
        assertEquals(5, Lineup.solution2("AALAAALARAR"));
    }
}