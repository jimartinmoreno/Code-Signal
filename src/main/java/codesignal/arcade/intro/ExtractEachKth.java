package codesignal.arcade.intro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * https://app.codesignal.com/arcade/intro/level-8/3AgqcKrxbwFhd3Z3R
 */

public class ExtractEachKth {
    static int[] solution(int[] inputArray, int k) {
        List<Integer> solution = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            if ((i + 1) % k != 0)
                solution.add(inputArray[i]);
        }
        System.out.println("solution = " + solution);
        return solution.stream().mapToInt(value -> value).toArray();
    }

    static int[] solution2(int[] inputArray, int k) {
        return IntStream.range(0, inputArray.length)
                .filter(i -> ((i + 1) % k) != 0)
                .map(i -> inputArray[i])
                .toArray();
    }
}
