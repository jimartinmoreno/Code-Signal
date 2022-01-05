package codesignal.arcade.thecore;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConcatenateArrays {
    static int[] solution(int[] a, int[] b) {
        return Stream.of(a, b).flatMapToInt(ints -> Arrays.stream(ints)).toArray();
    }

    static int[] solution2(int[] a, int[] b) {
        int[] out = new int[a.length + b.length];
        System.arraycopy(a, 0, out, 0, a.length);
        System.arraycopy(b, 0, out, a.length, b.length);
        return out;
    }

    static int[] solution3(int[] a, int[] b) {
        return IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
    }
}
