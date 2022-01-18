package codesignal.arcade.thecore;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://app.codesignal.com/arcade/code-arcade/mirror-lake/kGeuCkJNbqczCCqgg
 */
public class NumbersGrouping {

    static int solution(int[] a) {
        return a.length + IntStream.of(a)
                .mapToObj(i -> (i - 1) / 10000)
                .collect(Collectors.groupingBy(i -> i)).size();
    }

    static int solution2(int[] a) {
        Set<Integer> groups = new HashSet<>();
        for (int num : a) {
            groups.add((num - 1) / 10000);
        }
        return a.length + groups.size();
    }

    static int solution3(int[] a) {
        Set<Integer> groups = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 10000 == 0)
                groups.add((a[i] / 10000) - 1);
            else
                groups.add(a[i] / 10000);
        }
        System.out.println("groups = " + groups);
        return a.length + groups.size();
    }
}
