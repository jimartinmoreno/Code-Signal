package codesignal.arcade.thecore;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://app.codesignal.com/arcade/code-arcade/well-of-integration/fzsCQGYbxaEcTr2bL
 */
public class AllLongestStrings {
    static String[] solution(String[] inputArray) {
        return Arrays.stream(inputArray)
                .filter(s -> s.length() == Arrays.stream(inputArray)
                        .max(Comparator.comparingInt(String::length)).orElse("").length())
                .toArray(String[]::new);
    }
}
