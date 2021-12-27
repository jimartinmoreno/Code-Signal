package codesignal.arcade.intro;

import codesignal.arcade.intro.EvenDigitsOnly;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenDigitsOnlyTest {

    @Test
    void solution() {
        assertEquals(true, EvenDigitsOnly.solution2(248622));
        assertEquals(false, EvenDigitsOnly.solution2(642386));
    }
}