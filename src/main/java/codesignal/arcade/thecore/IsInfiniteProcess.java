package codesignal.arcade.thecore;

/**
 * https://app.codesignal.com/arcade/code-arcade/at-the-crossroads/aFF9HDm2Rsti9j5kc
 */

public class IsInfiniteProcess {
    static boolean solution(int a, int b) {
        return a != b && (a > b || b - a == 1 || (b - a) % 2 != 0);
    }

    static boolean solution2(int a, int b) {
        return a > b || a % 2 != b % 2;
    }

    static boolean solution3(int a, int b) {
        return !(b >= a && (b - a) % 2 == 0);
    }

    static boolean solution4(int a, int b) {
        return a > b || (b - a) % 2 != 0;
    }
}
