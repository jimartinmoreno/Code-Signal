package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Cipher26Test {

    @Test
    void solution() {
        assertEquals("thisisencryptedmessage", Cipher26.solution("taiaiaertkixquxjnfxxdh"));
    }
}