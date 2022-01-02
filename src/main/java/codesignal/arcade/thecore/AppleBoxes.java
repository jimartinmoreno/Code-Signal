package codesignal.arcade.thecore;

import java.util.stream.IntStream;

/**
 * https://app.codesignal.com/arcade/code-arcade/loop-tunnel/scG8AFsPuqQGx8Qjf
 */
public class AppleBoxes {
    static int solution(int k) {
        int yellows = IntStream.rangeClosed(1, k)
                .filter(value -> value % 2 != 0)
                .map(value -> value * value)
                .peek(System.out::println)
                .sum();
        int reds = IntStream.rangeClosed(1, k)
                .filter(value -> value % 2 == 0)
                .map(value -> value * value)
                .sum();
        System.out.println("reds = " + reds);
        System.out.println("yellows = " + yellows);
        return reds - yellows;
    }

    static int solution2(int k) {
        return ((int) Math.pow(-1, k)) * k * (k + 1) / 2;
    }

    static int solution3(int k) {
        return ((int) Math.pow(-1, k)) * k * (k + 1) / 2;
    }
}
