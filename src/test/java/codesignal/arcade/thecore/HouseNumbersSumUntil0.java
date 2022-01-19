package codesignal.arcade.thecore;

import java.util.Arrays;

/**
 * https://app.codesignal.com/arcade/code-arcade/well-of-integration/3QMXNwGfvLMoQwed7
 */
public class HouseNumbersSumUntil0 {
    static int solution(int[] inputArray) {
        return Arrays.stream(inputArray).takeWhile(value -> value != 0).sum();
    }
}
