package codesignal.arcade.thecore;

/**
 * https://app.codesignal.com/arcade/code-arcade/labyrinth-of-nested-loops/EQSjA5PRfyHueeNkj
 */
public class IsSumOfConsecutive2 {
    static int solution(int n) {
        System.out.println("n = " + n);
        int count = 0, sum = 0;
        for (int i = 1; i < n; i++) {
            sum = i;
            for (int j = i + 1; sum < n; j++) {
                sum += j;
                if (sum == n) {
                    count++;
                    break;
                }
            }
        }
        System.out.println("count = " + count);
        return count;
    }

    static int solution2(int n) {
        int count = 0, i, m;

        for (i = 1, m = i; m < n; i++, m += i) {
            if ((n - m) % (i + 1) == 0) {
                count++;
            }
        }
        return count;
    }
}
