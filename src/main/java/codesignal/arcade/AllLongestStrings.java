package codesignal.arcade;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AllLongestStrings {

    static String[] solution(String[] inputArray) {
        Optional<Integer> s = Arrays.stream(inputArray)
                .reduce((o1, o2) -> o1.length() > o2.length() ? o1 : o2)
                .map(String::length);

        return s.isPresent() ? Arrays.stream(inputArray)
                .filter(s1 -> s1.length() == s.get())
                .toArray(String[]::new) : new String[0];
    }

    public static void main(String[] args) {
        System.out.println("solucion = " + Arrays.stream(solution(List.of("aba", "aa", "ad", "vcd", "aba").toArray(new String[5]))).toList());
    }
}
