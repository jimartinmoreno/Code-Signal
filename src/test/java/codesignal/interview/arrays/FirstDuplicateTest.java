package codesignal.interview.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstDuplicateTest {

    @Test
    void solution() {
        assertEquals(3, FirstDuplicate.solution(new int[]{2, 1, 3, 5, 3, 2}));
        assertEquals(-1, FirstDuplicate.solution(new int[]{2, 4, 3, 5, 1}));
        assertEquals(2, FirstDuplicate.solution(new int[]{2, 2}));
    }
}