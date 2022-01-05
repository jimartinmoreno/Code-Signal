package codesignal.arcade.thecore;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveArrayPart {
    static int[] solution(int[] inputArray, int l, int r) {
        return IntStream.concat(Arrays.stream(Arrays.copyOfRange(inputArray, 0, l)),
                        Arrays.stream(Arrays.copyOfRange(inputArray, r + 1, inputArray.length)))
                .toArray();
    }

    static int[] solution2(int[] inputArray, int l, int r) {
        return IntStream.range(0, inputArray.length)
                .filter(i -> i < l || i > r)
                .map(i -> inputArray[i])
                .toArray();
    }
}
