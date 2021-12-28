package codesignal.interview.hashTables;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.IntStream;

public class AreFollowingPatterns {

    static boolean solution(String[] strings, String[] patterns) {
        Map<String, String> patternCache = new HashMap<>();
        Map<String, String> valueCache = new HashMap<>();

        for (int i = 0; i < patterns.length; ++i) {
            String pattern = patterns[i];
            String value = strings[i];
            if (patternCache.containsKey(pattern) && !patternCache.get(pattern).equals(value)) {
                return false;
            } else if (valueCache.containsKey(value) && !valueCache.get(value).equals(pattern)) {
                return false;
            } else {
                patternCache.put(pattern, value);
                valueCache.put(value, pattern);
            }
        }
        return true;
    }

    static boolean solution2(String[] strings, String[] patterns) {
        Map<String, String> ps = new HashMap<>();
        return IntStream.range(0, strings.length).allMatch(i -> ps.computeIfAbsent(patterns[i], p -> strings[i]).equals(strings[i]))
                && ps.size() == new HashSet<>(ps.values()).size();
    }
}
