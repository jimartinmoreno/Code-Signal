package codesignal.arcade;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AlternatingSums {
    static int[] solution2(int[] a) {
        return new int[]{
                IntStream.range(0, a.length).map(i -> i % 2 == 0 ? a[i] : 0).sum(),
                IntStream.range(0, a.length).map(i -> i % 2 == 1 ? a[i] : 0).sum()
        };
    }

    static int[] solution3(int[] a) {
        int []niz = new int[2];
        for(int i=0; i<a.length; i++)
            niz[i%2]+=a[i];
        return niz;
    }

    static int[] solution(int[] a) {

        int[] result = new int[2];
        for (int i = 0; i < a.length; i++) {
            System.out.println("i%2 = " + i%2);
            if (i % 2 != 0)
                result[1] += a[i];
            else
                result[0] += a[i];
        }
        return result;
    }


    public static void main(String[] args) {
        int[] weighs = {50, 60, 60, 45, 70};
        System.out.println("weighs = " + solution(weighs));
        Arrays.stream(solution(weighs)).forEach(System.out::println);
        /**
         * For a = [50, 60, 60, 45, 70], the output should be
         * solution(a) = [180, 105]
         */
    }
}
