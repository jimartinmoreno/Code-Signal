package codesignal.arcade.intro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * https://app.codesignal.com/arcade/intro/level-10/HJ2thsvjL25iCvvdm
 */
class IsMAC48AddressTest {

    @Test
    void solution() {
        assertTrue(IsMAC48Address.solution3("00-1B-63-84-45-E6"));
        assertFalse(IsMAC48Address.solution3("Z1-1B-63-84-45-E6"));
        assertFalse(IsMAC48Address.solution3("not a MAC-48 address"));
        assertFalse(IsMAC48Address.solution3("02-03-04-05-06-07-"));
    }

    @Test
    void solution2() {
        assertTrue(IsMAC48Address.solution2("00-1B-63-84-45-E6"));
        assertFalse(IsMAC48Address.solution2("Z1-1B-63-84-45-E6"));
        assertFalse(IsMAC48Address.solution2("not a MAC-48 address"));
        assertFalse(IsMAC48Address.solution2("02-03-04-05-06-07-"));
    }

    @Test
    void solution3() {
        assertTrue(IsMAC48Address.solution3("00-1B-63-84-45-E6"));
        assertFalse(IsMAC48Address.solution3("Z1-1B-63-84-45-E6"));
        assertFalse(IsMAC48Address.solution3("not a MAC-48 address"));
        assertFalse(IsMAC48Address.solution3("02-03-04-05-06-07-"));
    }
}