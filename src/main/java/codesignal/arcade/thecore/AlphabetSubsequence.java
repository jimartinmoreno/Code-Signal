package codesignal.arcade.thecore;

import java.util.Arrays;

public class AlphabetSubsequence {
    static boolean solution(String s) {
        return s.equals(Arrays.stream(s.split(""))
                .distinct()
                .sorted(String::compareTo)
                .reduce(String::concat)
                .orElse(""));
    }
}
