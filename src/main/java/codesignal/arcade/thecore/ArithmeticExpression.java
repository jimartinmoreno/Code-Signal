package codesignal.arcade.thecore;

/**
 * https://app.codesignal.com/arcade/code-arcade/at-the-crossroads/QrCSNQWhnQoaK9KgK/solutions?solutionId=CTZsRG2yntDYjb3BS
 */
public class ArithmeticExpression {
    static boolean solution(int a, int b, int c) {
        return a + b == c || a - b == c || a * b == c || (a / b == c && a % b == 0);
    }

    static boolean solution2(int A, int B, int C) {
        return A+B==C || A-B==C || A*B==C || A == B*C;
    }
}
