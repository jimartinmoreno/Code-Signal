package codesignal.arcade.intro;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

public class IsBeautifulString {
    static boolean solution(String inputString) {
        System.out.println("inputString = " + Arrays.toString(inputString.toCharArray()));
        Map<Integer, Integer> inputMap = IntStream.rangeClosed(97, 122)
                .boxed()
                .collect(groupingBy(Function.identity(), summingInt(value -> 0)));

        inputString.chars().boxed().forEach(key -> {
            if (inputMap.containsKey(key))
                inputMap.replace(key, inputMap.get(key) + 1);
        });

        System.out.println("inputMap = " + inputMap);
        List<Integer> timesList = inputMap.values().stream()
                .toList();

        return IntStream.range(1, timesList.size())
                .allMatch(i -> timesList.get(i) <= timesList.get(i - 1));
    }

    static boolean solution2(String s) {
        int[] c = new int[26];

        for (int i : s.getBytes()) c[i - 'a']++;

        for (int i = 1; i < 26; i++)
            if (c[i] > c[i - 1]) return false;

        return true;
    }
}
