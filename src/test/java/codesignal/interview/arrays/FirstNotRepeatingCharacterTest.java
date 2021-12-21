package codesignal.interview.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstNotRepeatingCharacterTest {

    @Test
    void solution() {
        assertEquals('c', FirstNotRepeatingCharacter.solution("abacabad"));
        assertEquals('_', FirstNotRepeatingCharacter.solution("abacabaabacaba"));
    }

    @Test
    void solution2() {
        assertEquals('c', FirstNotRepeatingCharacter.solution2("abacabad"));
        assertEquals('_', FirstNotRepeatingCharacter.solution2("abacabaabacaba"));
    }
}