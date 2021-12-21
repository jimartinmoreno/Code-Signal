package codesignal.interview.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {
    static int solution(int[] a) {
        Set<Integer> set = new HashSet<>(a.length);
        int i = 0;
        for (i = 0; i < a.length; i++) {
            if (set.contains(Integer.valueOf(a[i])))
                return a[i];
            else
                set.add(Integer.valueOf(a[i]));
        }
        System.out.println("i = " + i);
        return -1;
    }
}
