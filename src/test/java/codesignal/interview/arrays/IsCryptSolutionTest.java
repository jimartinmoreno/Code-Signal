package codesignal.interview.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsCryptSolutionTest {

    @Test
    void solution() {
        assertEquals(true, IsCryptSolution
                .solution(
                        new String[]{"SEND", "MORE", "MONEY"},
                        new char[][]{{'O', '0'}, {'M', '1'},{'Y', '2'}, {'E', '5'}, {'N', '6'}, {'D', '7'}, {'R', '8'}, {'S', '9'}})
        );

        assertEquals(false, IsCryptSolution
                .solution(
                        new String[]{"TEN", "TWO", "ONE"},
                        new char[][]{{'O', '1'}, {'T', '0'},{'W', '9'}, {'E', '5'}, {'N', '4'}})
        );

        assertEquals(true, IsCryptSolution
                .solution(
                        new String[]{"A", "A", "A"},
                        new char[][]{{'A', '0'}})
        );

        assertEquals(true, IsCryptSolution
                .solution(
                        new String[]{"AAAAAAAAAAAAAA", "BBBBBBBBBBBBBB", "CCCCCCCCCCCCCC"},
                        new char[][]{{'A', '1'}, {'B', '2'}, {'C', '3'}})
        );
    }

    @Test
    void solution2() {
        assertEquals(true, IsCryptSolution
                .solution2(
                        new String[]{"SEND", "MORE", "MONEY"},
                        new char[][]{{'O', '0'}, {'M', '1'},{'Y', '2'}, {'E', '5'}, {'N', '6'}, {'D', '7'}, {'R', '8'}, {'S', '9'}})
        );

        assertEquals(false, IsCryptSolution
                .solution2(
                        new String[]{"TEN", "TWO", "ONE"},
                        new char[][]{{'O', '1'}, {'T', '0'},{'W', '9'}, {'E', '5'}, {'N', '4'}})
        );

        assertEquals(true, IsCryptSolution
                .solution2(
                        new String[]{"A", "A", "A"},
                        new char[][]{{'A', '0'}})
        );

        assertEquals(true, IsCryptSolution
                .solution2(
                        new String[]{"AAAAAAAAAAAAAA", "BBBBBBBBBBBBBB", "CCCCCCCCCCCCCC"},
                        new char[][]{{'A', '1'}, {'B', '2'}, {'C', '3'}})
        );
    }
}