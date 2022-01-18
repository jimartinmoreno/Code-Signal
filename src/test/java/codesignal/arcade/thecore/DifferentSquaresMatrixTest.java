package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DifferentSquaresMatrixTest {

    @Test
    void solution() {
        assertEquals(6, DifferentSquaresMatrix.solution(new int[][]{
                {1, 2, 1},
                {2, 2, 2},
                {2, 2, 2},
                {1, 2, 3},
                {2, 2, 1}}));
    }

    @Test
    void solution2() {
        assertEquals(6, DifferentSquaresMatrix.solution2(new int[][]{
                {1, 2, 1},
                {2, 2, 2},
                {2, 2, 2},
                {1, 2, 3},
                {2, 2, 1}}));
    }
}