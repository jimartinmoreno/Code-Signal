package codesignal.arcade.intro;

import java.util.Arrays;

public class EvenDigitsOnly {
    static boolean solution(int n) {
        return Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(Integer::valueOf)
                .allMatch(value -> value % 2 == 0);
    }

    static boolean solution2(int n) {
        return Integer.toString(n).matches("[02468]+");
    }
}
