package codesignal.arcade.intro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DifferentSquaresTest {

    @Test
    void solution() {
        assertEquals(6, DifferentSquares.solution(new int[][]{{1, 2, 1}, {2, 2, 2}, {2, 2, 2}, {1, 2, 3}, {2, 2, 1}}));
    }
}