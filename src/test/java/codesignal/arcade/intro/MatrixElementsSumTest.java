package codesignal.arcade.intro;

import codesignal.arcade.intro.MatrixElementsSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatrixElementsSumTest {

    /**
     * solution2(new int[][]{{1, 1, 1, 0}, {0, 5, 0, 1}, {2, 1, 3, 10}}); // 9
     *         solution2(new int[][]{{0, 1, 1, 2}, {0, 5, 0, 0}, {2, 0, 3, 3}}); // 9
     * //        solution(new int[][]{{0, 1, 1}, {0, 5, 0}, {2, 0, 3}}); // 7
     * //        solution(new int[][]{{0, 0, 1}, {0, 5, 1}, {2, 0, 3}}); // 5
     * //        solution(new int[][]{{0, 1}, {0, 5}, {2, 0}}); // 6
     * //        solution(new int[][]{{0}, {0}, {2}}); // 0
     * //        solution(new int[][]{{0}}); // 0
     */
    @Test
    void solution() {
        assertEquals(9, MatrixElementsSum.solution(new int[][]{{0, 1, 1, 2}, {0, 5, 0, 0}, {2, 0, 3, 3}}));
        assertEquals(7, MatrixElementsSum.solution(new int[][]{{0, 1, 1}, {0, 5, 0}, {2, 0, 3}}));
        assertEquals(5, MatrixElementsSum.solution(new int[][]{{0, 0, 1}, {0, 5, 1}, {2, 0, 3}}));
        assertEquals(6, MatrixElementsSum.solution(new int[][]{{0, 1}, {0, 5}, {2, 0}}));
        assertEquals(0, MatrixElementsSum.solution(new int[][]{{0}, {0}, {2}}));
        assertEquals(0, MatrixElementsSum.solution(new int[][]{{0}}));
    }

    @Test
    void solution2() {
        assertEquals(9, MatrixElementsSum.solution2(new int[][]{{0, 1, 1, 2}, {0, 5, 0, 0}, {2, 0, 3, 3}}));
        assertEquals(7, MatrixElementsSum.solution2(new int[][]{{0, 1, 1}, {0, 5, 0}, {2, 0, 3}}));
        assertEquals(5, MatrixElementsSum.solution2(new int[][]{{0, 0, 1}, {0, 5, 1}, {2, 0, 3}}));
        assertEquals(6, MatrixElementsSum.solution2(new int[][]{{0, 1}, {0, 5}, {2, 0}}));
        assertEquals(0, MatrixElementsSum.solution2(new int[][]{{0}, {0}, {2}}));
        assertEquals(0, MatrixElementsSum.solution2(new int[][]{{0}}));
    }
}