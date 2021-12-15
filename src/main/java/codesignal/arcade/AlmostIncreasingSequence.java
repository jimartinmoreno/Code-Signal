package codesignal.arcade;

public class AlmostIncreasingSequence {

    static boolean solution(int[] array) {
        int last = Integer.MIN_VALUE;
        int lastPrev = Integer.MIN_VALUE;
        int c = 0;

        for (int current : array) {
            if (current <= last) {
                c++;
                if (current > lastPrev)
                    last = current;
            } else {
                lastPrev = last;
                last = current;
            }
        }
        return c <= 1;
    }

    public static void main(String[] args) {
        System.out.println("result = " + solution(new int[]{3, 2, 1}));
        System.out.println("result = " + solution(new int[]{1}));
        System.out.println("result = " + solution(new int[]{1, 3, 2, 1}));
        System.out.println("result = " + solution(new int[]{1, 2, 3, 5}));
        System.out.println("result = " + solution(new int[]{1, 2, 5, 3}));

    }
}
