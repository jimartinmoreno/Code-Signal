package codesignal.arcade.thecore;

import java.util.Arrays;

/**
 *
 */
public class TimedReading {
    static int solution(int maxLength, String text) {
        return (int) Arrays.stream(text.replaceAll("[^a-zA-Z0-9\\s+]", "").split(" "))
                .filter(s -> s.length() <= maxLength && s.length() != 0)
                .count();
    }

}
