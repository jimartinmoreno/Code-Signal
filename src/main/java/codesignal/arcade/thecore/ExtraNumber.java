package codesignal.arcade.thecore;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

/**
 * https://app.codesignal.com/arcade/code-arcade/at-the-crossroads/sgDWKCFQHHi5D3Szj
 */
public class ExtraNumber {
    static int solution(int a, int b, int c) {
        return Stream.of(a, b, c)
                .collect(groupingBy(o -> o, HashMap::new, toList()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() == 1)
                .map(entry -> entry.getValue().get(0))
                .mapToInt(Integer::intValue)
                .peek(System.out::println)
                .findFirst().getAsInt();
    }

    static int solution2(int a, int b, int c) {
        List<Integer> integerList = Stream.of(a, b, c).toList();
        Set<Integer> integerSet = new HashSet<>();
        integerList.stream()
                .forEach(integer -> {
                    if (integerSet.contains(integer))
                        integerSet.remove(integer);
                    else integerSet.add(integer);
                });

        return integerSet.stream().mapToInt(Integer::intValue).findFirst().getAsInt();
    }

    static int solution3(int a, int b, int c) {
        return a == b ? c : a == c ? b : a;
    }

    static int solution4(int a, int b, int c) {
        return a ^ b ^ c;
    }

}
