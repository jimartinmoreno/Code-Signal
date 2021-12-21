package codesignal.arcade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinesweeperTest {

    @Test
    void solution() {
        assertArrayEquals(new int[][] {{1, 2, 1},{2, 1, 1},{1, 1, 1}}, Minesweeper.solution(new boolean[][] {{true, false, false},{false, true, false},{false, false, false}}));
    }
    @Test
    void solution2() {
        assertArrayEquals(new int[][] {{1, 2, 1},{2, 1, 1},{1, 1, 1}}, Minesweeper.solution2(new boolean[][] {{true, false, false},{false, true, false},{false, false, false}}));
    }
}