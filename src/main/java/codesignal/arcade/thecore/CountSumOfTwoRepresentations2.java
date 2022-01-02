package codesignal.arcade.thecore;

/**
 * https://app.codesignal.com/arcade/code-arcade/loop-tunnel/hBw5BJiZ4LmXcy92u
 */
public class CountSumOfTwoRepresentations2 {
    static int solution(int n, int l, int r) {
        int t = 0;
        for (; l <= r; l++) {
            if (n - l >= l && n - l <= r)
                t++;
        }
        return t;
    }
}
