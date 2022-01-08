package codesignal.arcade.intro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * https://app.codesignal.com/arcade/intro/level-10/HJ2thsvjL25iCvvdm
 */
class IsMAC48AddressTest {

    @Test
    void solution() {
        assertEquals(true, IsMAC48Address.solution("00-1B-63-84-45-E6"));
        assertEquals(false, IsMAC48Address.solution("Z1-1B-63-84-45-E6"));
        assertEquals(false, IsMAC48Address.solution("not a MAC-48 address"));
        assertEquals(false, IsMAC48Address.solution("02-03-04-05-06-07-"));
    }

    @Test
    void solution2() {
        assertEquals(true, IsMAC48Address.solution2("00-1B-63-84-45-E6"));
        assertEquals(false, IsMAC48Address.solution2("Z1-1B-63-84-45-E6"));
        assertEquals(false, IsMAC48Address.solution2("not a MAC-48 address"));
        assertEquals(false, IsMAC48Address.solution2("02-03-04-05-06-07-"));
    }
}