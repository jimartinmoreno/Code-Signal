package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSumOfConsecutive2Test {

    @Test
    void solution() {
        assertEquals(2, IsSumOfConsecutive2.solution(9));
        assertEquals(0, IsSumOfConsecutive2.solution(8));
        assertEquals(3, IsSumOfConsecutive2.solution(15));
    }

    @Test
    void solution2() {
        assertEquals(2, IsSumOfConsecutive2.solution2(9));
        assertEquals(0, IsSumOfConsecutive2.solution2(8));
        assertEquals(3, IsSumOfConsecutive2.solution2(15));
    }
}