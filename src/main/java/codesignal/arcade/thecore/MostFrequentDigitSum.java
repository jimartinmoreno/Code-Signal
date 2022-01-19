package codesignal.arcade.thecore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * https://app.codesignal.com/arcade/code-arcade/mirror-lake/RpoP4Aqa5mbmC8koC
 */
public class MostFrequentDigitSum {
    static int solution(int n) {
        List<Integer> sums = new ArrayList<>();
        int sum;
        while (n != 0) {
            sum = Arrays.stream(String.valueOf(n).split(""))
                    .mapToInt(Integer::valueOf)
                    .sum();
            sums.add(sum);
            n -= sum;
        }
        System.out.println("sums = " + sums);
        return sums.stream()
                .collect(Collectors.groupingBy(integer -> integer, Collectors.counting()))
                .entrySet().stream()
                .max((o1, o2) -> (int) (o1.getValue() - o2.getValue() == 0 ? o1.getKey() - o2.getKey() : o1.getValue() - o2.getValue()))
                .map(Map.Entry::getKey)
                .orElse(0);

    }

    static int solution2(int n) {
        return n >= 999 ? 18 : n >= 9 ? 9 : n;
    }


}
