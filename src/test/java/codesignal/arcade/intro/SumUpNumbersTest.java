package codesignal.arcade.intro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumUpNumbersTest {

    @Test
    void solution() {
        assertEquals(14, SumUpNumbers.solution("2 apples, 12 oranges"));
    }

    @Test
    void solution2() {
        assertEquals(14, SumUpNumbers.solution2("2 apples, 12 oranges"));
    }

    @Test
    void solution3() {
        assertEquals(14, SumUpNumbers.solution3("2 apples, 12 oranges"));
    }
}