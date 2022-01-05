package codesignal.arcade.thecore;

import java.util.Arrays;
import java.util.stream.Stream;

public class ReplaceMiddle {
    static int[] solution(int[] arr) {
        System.out.println("arr = " + Arrays.toString(arr));

        if (arr.length % 2 == 0) {
            int[] middle = new int[]{(arr[arr.length / 2 - 1] + arr[arr.length / 2])};
            return Stream.of(Arrays.stream(Arrays.copyOfRange(arr, 0, arr.length / 2 - 1)),
                            Arrays.stream(middle),
                            Arrays.stream(Arrays.copyOfRange(arr, arr.length / 2 + 1, arr.length)))
                    .flatMapToInt(intStream -> intStream)
                    .toArray();
        } else {
            return arr;
        }
    }

    static int[] solution2(int[] arr) {
        if (arr.length % 2 == 1)
            return arr;
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < arr.length / 2; i++) {
            newArr[i] += arr[i];
            newArr[newArr.length - 1 - i] += arr[arr.length - 1 - i];
        }
        return newArr;
    }

}
