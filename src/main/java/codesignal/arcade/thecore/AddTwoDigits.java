package codesignal.arcade.thecore;

import java.util.Arrays;

public class AddTwoDigits {
    static int solution(int n) {
        return Arrays.stream(String.valueOf(n).split("")).map(Integer::parseInt).reduce(0, Integer::sum);
    }
}
