package codesignal.arcade.intro;

import codesignal.arcade.intro.CircleOfNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleOfNumbersTest {

    @Test
    void solution() {
        assertEquals(7, CircleOfNumbers.solution(10, 2));
    }

    @Test
    void solution2() {
        assertEquals(7, CircleOfNumbers.solution2(10, 2));
    }

    @Test
    void solution3() {
        assertEquals(7, CircleOfNumbers.solution3(10, 2));
    }
}