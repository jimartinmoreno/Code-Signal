package codesignal.interview.arrays;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FirstNotRepeatingCharacter {
    static char solution(String s) {
        Map<String, Integer> map = new LinkedHashMap<>();
        Arrays.stream(s.split("")).forEach(s1 -> {
            if (map.get(s1) != null)
                map.put(s1, map.get(s1) + 1);
            else
                map.put(s1, 1);
        });
        Optional<Map.Entry<String, Integer>> optionalEntry = map.entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst();
        System.out.println("map = " + map);
        System.out.println("optionalEntry = " + optionalEntry);
        return optionalEntry.isPresent() ? optionalEntry.get().getKey().charAt(0) : '_';
    }

    static char solution2(String s) {
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(c[i]) == s.lastIndexOf(c[i]))
                return c[i];
        }
        return '_';
    }
}
