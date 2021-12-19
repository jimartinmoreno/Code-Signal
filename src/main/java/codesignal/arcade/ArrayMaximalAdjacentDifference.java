package codesignal.arcade;

import java.util.stream.IntStream;

public class ArrayMaximalAdjacentDifference {
    static int solution(int[] inputArray) {
        var max = 0;
        for (int i = 1; i < inputArray.length; i++) {
            max = Math.max(max, Math.abs(inputArray[i - 1] - inputArray[i]));
        }
        System.out.println("max = " + max);
        return max;
    }

    static int solution2(int[] inputArray) {
        return IntStream.range(0, inputArray.length - 1)
                .map(i -> Math.abs(inputArray[i] - inputArray[i + 1])).max().getAsInt();
    }


    public static void main(String[] args) {
        solution(new int[]{2, 4, 1, 0});
        solution(new int[]{10, 11, 13});
        solution(new int[]{-1, 1, -3, -4});

    }
}
