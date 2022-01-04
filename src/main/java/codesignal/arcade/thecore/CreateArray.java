package codesignal.arcade.thecore;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CreateArray {

    static int[] solution(int size) {
        return IntStream.range(0, size).map(i -> 1).toArray();
    }

    static int[] solution2(int size) {
        int[] a = new int[size];
        Arrays.fill(a, 1);
        return a;
    }
}
