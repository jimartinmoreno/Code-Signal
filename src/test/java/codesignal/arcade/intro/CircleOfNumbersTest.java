package codesignal.arcade.intro;

import codesignal.arcade.intro.CircleOfNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleOfNumbersTest {

    @Test
    void solution() {
        assertEquals(7, CircleOfNumbers.solution(10, 2));
    }
}