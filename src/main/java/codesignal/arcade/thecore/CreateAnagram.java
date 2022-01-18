package codesignal.arcade.thecore;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * https://app.codesignal.com/arcade/code-arcade/mirror-lake/BsShkFDfbkWxozmMN
 */
public class CreateAnagram {
    static int solution(String s, String t) {
        Map<Integer, Long> map1 = s.chars()
                .boxed()
                .collect(Collectors.groupingBy(o -> o, Collectors.counting()));

        Map<Integer, Long> map2 = t.chars()
                .boxed()
                .collect(Collectors.groupingBy(o -> o, Collectors.counting()));

        return map1.entrySet().stream()
                .map(entry -> {
                    int diff = entry.getValue().intValue() - map2.getOrDefault(entry.getKey(), 0L).intValue();
                    return Math.max(diff, 0);
                })
                .mapToInt(Integer::intValue)
                .sum();
    }

    static int solution2(String s, String t) {
        ArrayList<Character> tList = new ArrayList<>();
        int count = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            tList.add(t.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (tList.contains(c))
                tList.remove(tList.indexOf(c));
            else
                count++;
        }
        return count;
    }
}
