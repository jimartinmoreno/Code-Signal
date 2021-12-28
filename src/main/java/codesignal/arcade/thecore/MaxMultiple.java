package codesignal.arcade.thecore;

import java.util.stream.IntStream;

public class MaxMultiple {
    static int solution(int divisor, int bound) {
        return IntStream.rangeClosed(1, bound)
                .filter(value -> value % divisor == 0)
                .max().orElse(0);
    }

    static int solution2(int divisor, int bound) {
        //int quotient = bound / divisor;
        System.out.println("(bound / divisor) = " + (bound / divisor));
        System.out.println("result = " + ((bound / divisor) * divisor));
        return (bound / divisor) * divisor;
    }

    static int solution3(int divisor, int bound) {
        System.out.println("result = " + (bound - bound % divisor));
        System.out.println("bound % divisor = " + (bound % divisor));
        return bound - bound % divisor;
    }
}
