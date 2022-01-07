package codesignal.arcade.intro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectionsWinnersTest {

    @Test
    void solution() {
        assertEquals(2, ElectionsWinners.solution(new int[]{2, 3, 5, 2}, 3));
        assertEquals(1, ElectionsWinners.solution(new int[]{5, 1, 3, 4, 1}, 0));
        assertEquals(0, ElectionsWinners.solution(new int[]{1, 3, 3, 1, 1}, 0));
        assertEquals(4, ElectionsWinners.solution(new int[]{1, 1, 1, 1}, 1));
    }

    @Test
    void solution2() {
        assertEquals(2, ElectionsWinners.solution2(new int[]{2, 3, 5, 2}, 3));
        assertEquals(1, ElectionsWinners.solution2(new int[]{5, 1, 3, 4, 1}, 0));
        assertEquals(0, ElectionsWinners.solution2(new int[]{1, 3, 3, 1, 1}, 0));
        assertEquals(4, ElectionsWinners.solution2(new int[]{1, 1, 1, 1}, 1));
    }
}