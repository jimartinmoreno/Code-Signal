package codesignal.arcade.thecore;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * https://app.codesignal.com/arcade/code-arcade/mirror-lake/chW9F8bCgxYJBcgj3
 */

public class StringsConstruction {
    static int solution(String a, String b) {

        Map<String, Integer> bMap = Arrays.stream(b.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(value -> 1)));
        Map<String, Integer> aMap = Arrays.stream(a.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(value -> 1)));

        System.out.println("bMap = " + bMap);
        System.out.println("aMap = " + aMap);
        return Arrays.stream(a.split(""))
                .map(s -> bMap.getOrDefault(s, 0) / aMap.getOrDefault(s, 0))
                .mapToInt(Integer::intValue)
                .min().orElse(0);
    }

    static int solution2(String a, String b) {
        List<Integer> bChars = b.chars()
                .boxed()
                .collect(Collectors.collectingAndThen(Collectors.toList(), LinkedList::new));
        System.out.println("bChars = " + bChars);

        int count = 0;
        while (a.chars().boxed().allMatch(bChars::remove)) {
            count++;
        }
        return count;
    }
}
