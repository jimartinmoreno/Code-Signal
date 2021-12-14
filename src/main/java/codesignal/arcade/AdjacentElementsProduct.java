package codesignal.arcade;

import java.util.stream.IntStream;

public class AdjacentElementsProduct {
    int solution(int[] inputArray) {

        int result = inputArray[0] * inputArray[1];
        for (int i = 0; i < inputArray.length - 1; i++) {
            var i1 = inputArray[i] * inputArray[i + 1];
            if (i1 > result)
                result = i1;
        }

        return result;
    }

    int solution2(int[] inputArray) {
        return IntStream
                .range(0, inputArray.length)
                .map(i -> inputArray[i] * inputArray[i - 1])
                .max().getAsInt();
    }

    int solution3(int[] inputArray) {
        return IntStream
                .range(0, inputArray.length - 1)
                .map(i -> inputArray[i] * inputArray[i + 1])
                .max().getAsInt();
    }

}
