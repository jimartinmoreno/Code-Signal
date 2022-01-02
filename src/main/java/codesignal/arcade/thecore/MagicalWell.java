package codesignal.arcade.thecore;

import java.util.stream.IntStream;

/**
 * https://app.codesignal.com/arcade/code-arcade/loop-tunnel/LbuWRHnMoJH9SAo4o
 */
public class MagicalWell {
    static int solution(int a, int b, int n) {
        int solution = 0;
        for (int i = 0; i < n; i++, a++, b++) {
            System.out.println("i = " + i);
            solution += a * b;
        }
        System.out.println("solution = " + solution);
        return solution;
    }

    static int solution2(int a, int b, int n) {
        return IntStream.range(0, n)
                .map(i -> (a + i) * (b + i))
                .sum();
    }

    static int solution3(int a, int b, int n) {
        int solution = 0;
        for (int i = 0; i < n; i++) {
            solution += (a + i) * (b + i);
        }
        System.out.println("solution = " + solution);
        return solution;
    }

}
