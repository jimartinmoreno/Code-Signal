package codesignal.arcade.intro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteDigitTest {

    @Test
    void solution() {
        assertEquals(52, DeleteDigit.solution(152));
        assertEquals(101, DeleteDigit.solution(1001));
    }

    @Test
    void solution2() {
        assertEquals(52, DeleteDigit.solution2(152));
        assertEquals(101, DeleteDigit.solution2(1001));
    }

    @Test
    void solution3() {
        assertEquals(52, DeleteDigit.solution3(152));
        assertEquals(101, DeleteDigit.solution3(1001));
    }
}