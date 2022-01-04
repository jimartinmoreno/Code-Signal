package codesignal.arcade.thecore;

import java.util.*;

public class FirstReverseTry {
    static int[] solution(int[] arr) {
        if (arr == null || arr.length == 0)
            return arr;
        List<Integer> l2 = new ArrayList<>(Arrays.stream(arr).boxed().toList());
        Collections.swap(l2, 0, arr.length-1);
        return l2.stream().mapToInt(Integer::intValue).toArray();
    }

    static int[] solution2(int[] a) {
        int n = a.length - 1;
        if (n > 0)
            a[0] = a[0] ^ a[n] ^ (a[n] = a[0]);
        return a;
    }

}
