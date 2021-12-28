package codesignal.interview.hashTables;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsCloseNumsTest {

    @Test
    void solution() {
//        assertEquals(true, ContainsCloseNums.solution(new int[]{0, 1, 2, 3, 5, 2}, 3));
//        assertEquals(false, ContainsCloseNums.solution(new int[]{0, 1, 2, 3, 5, 2}, 2));
//        assertEquals(true, ContainsCloseNums.solution(new int[]{0, 1, 2, 3, 4, 0, 0, 7, 8, 9, 10, 11, 12, 0}, 1));
//        assertEquals(false, ContainsCloseNums.solution(new int[0], 0));
        assertEquals(false, ContainsCloseNums.solution(new int[]{1, 2, 3, 1, 2, 3}, 2));

    }

    @Test
    void solution2() {
//        assertEquals(true, ContainsCloseNums.solution(new int[]{0, 1, 2, 3, 5, 2}, 3));
//        assertEquals(false, ContainsCloseNums.solution(new int[]{0, 1, 2, 3, 5, 2}, 2));
        assertEquals(true, ContainsCloseNums.solution3(new int[]{0, 1, 2, 3, 4, 0, 0, 7, 8, 9, 10, 11, 12, 0}, 1));
    }
}