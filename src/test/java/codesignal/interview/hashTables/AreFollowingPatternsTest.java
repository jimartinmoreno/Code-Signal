package codesignal.interview.hashTables;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AreFollowingPatternsTest {

    @Test
    void solution() {
        assertEquals(true,
                AreFollowingPatterns.solution(List.of("cat", "dog", "dog").toArray(String[]::new),
                List.of("a", "b", "b").toArray(String[]::new)));

        assertEquals(false,
                AreFollowingPatterns.solution(List.of("cat", "dog", "doggy").toArray(String[]::new),
                        List.of("a", "b", "b").toArray(String[]::new)));
    }

    @Test
    void solution2() {
        assertEquals(true,
                AreFollowingPatterns.solution2(List.of("cat", "dog", "dog").toArray(String[]::new),
                        List.of("a", "b", "b").toArray(String[]::new)));
        assertEquals(false,
                AreFollowingPatterns.solution2(List.of("cat", "dog", "doggy").toArray(String[]::new),
                        List.of("a", "b", "b").toArray(String[]::new)));
    }
}