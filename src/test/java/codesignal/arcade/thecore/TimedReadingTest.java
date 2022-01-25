package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimedReadingTest {

    @Test
    void solution() {
        assertEquals(7, TimedReading.solution(4, "The Fox asked the stork, 'How is the soup?'"));
        assertEquals(0, TimedReading.solution(1, "..."));
        assertEquals(3, TimedReading.solution(3, "This play was good for us."));
    }
}