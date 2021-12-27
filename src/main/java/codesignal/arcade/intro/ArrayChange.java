package codesignal.arcade.intro;

import java.util.Arrays;
import java.util.List;

public class ArrayChange {

    static int solution(int[] inputArray) {
        int sumMoves = 0;

        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] <= inputArray[i - 1]) {
                var moves = inputArray[i - 1] - inputArray[i] + 1;
                inputArray[i] = inputArray[i] + moves;
                sumMoves += moves;
            }
        }
        System.out.println(" Arrays.asList(inputArray) = " + List.of(inputArray));
        System.out.println("sumMoves = " + sumMoves);
        return sumMoves;
    }

    public static void main(String[] args) {
        solution(new int[]{1, 1, 1});
    }

}
