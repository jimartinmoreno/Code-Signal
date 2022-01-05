package codesignal.arcade.thecore;

import java.util.Arrays;

public class IsSmooth {
    static boolean solution(int[] arr) {
        if (arr[0] != arr[arr.length - 1])
            return false;

        if (arr.length % 2 == 0)
            return (arr[arr.length / 2 - 1] + arr[arr.length / 2]) == arr[0];
        else
            return arr[arr.length / 2] == arr[0];
    }

    static boolean solution2(int[] arr) {
        int smooth = (arr.length % 2 == 0) ? arr[arr.length / 2 - 1] + arr[arr.length / 2] : arr[arr.length / 2];
        return (arr[0] == smooth && smooth == arr[arr.length - 1]);
    }

}
