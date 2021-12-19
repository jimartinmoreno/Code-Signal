package codesignal.arcade;

import java.util.Arrays;

public class AreSimilar {
    static boolean solution(int[] a, int[] b) {
        var count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                count++;
            }
            if (count > 2)
                break;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println("is count < 3: " + (count < 3));
        return count < 3 && Arrays.equals(a, b);
    }

    boolean solution2(int[] a, int[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                count++;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b) && count < 3;
    }

    boolean solution3(int[] a, int[] b) {
        int rs = 0, s1 = 1, s2 = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                rs++;
            s1 *= a[i];
            s2 *= b[i];
        }
        return rs <= 2 && s1 == s2;
    }


    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {2, 2, 1};
        int[] d = {1, 1, 2};
        int[] e = {3, 1, 2};

        System.out.println("true = " + solution(a, a));
        System.out.println("false = " + solution(new int[]{1, 2, 3}, new int[]{3, 1, 2}));
        System.out.println("true = " + solution(new int[]{1, 2, 3}, new int[]{2, 1, 3}));
        System.out.println("false = " + solution(new int[]{4, 6, 3}, new int[]{3, 4, 6}));
        System.out.println("false = " + solution(a, b));
        System.out.println("false = " + solution(a, c));
        System.out.println("false = " + solution(c, d));
    }
}
