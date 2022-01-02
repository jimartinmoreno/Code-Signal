package codesignal.arcade.thecore;

import java.util.Map;
import java.util.OptionalInt;

/**
 * https://app.codesignal.com/arcade/code-arcade/at-the-crossroads/r9azLYp2BDZPyzaG2
 */

public class KnapsackLight {
    static int solution2(int value1, int weight1, int value2, int weight2, int maxW) {
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;

        if(maxW >= weight1)
            max1 = value1;
        if(maxW >= weight2)
            max2 = value2;
        if(maxW >= weight1 + weight2)
            max3 = value1 + value2;

        System.out.println("max1 = " + max1);
        System.out.println("max2 = " + max2);
        System.out.println("max3 = " + max3);
        return Math.max(max3, Math.max(max1, max2));
    }

    static int solution3(int value1, int weight1, int value2, int weight2, int maxW) {
        if(weight1 > maxW && weight2 > maxW) return 0;
        if(weight1 + weight2 <= maxW) return value1 + value2;
        if(weight1 > maxW) return value2;
        if(weight2 > maxW) return value1;
        return Math.max(value1, value2);
    }

    static int solution(int value1, int weight1, int value2, int weight2, int maxW) {
        Map<Integer, Integer> options = Map.of(weight1, value1, weight2, value2, (weight1 + weight2),  (value1 + value2));
        OptionalInt max = options.entrySet().stream()
                .filter(entry -> entry.getKey() <= maxW)
                .mapToInt(entry -> entry.getValue())
                .max();
        System.out.println("max = " + max);
        return max.orElse(0);
    }
}
