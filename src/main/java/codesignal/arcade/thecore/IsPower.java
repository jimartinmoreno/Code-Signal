package codesignal.arcade.thecore;

public class IsPower {
    static boolean solution(int n) {
        if (n == 1) return true;
        if (n<4) return false;
        for (int i = 2; i*i <= n; i++) {
            int pow = i*i;
            while (pow <= n) {
                if (pow==n) return true;
                else pow *= i;
            }
        }
        return false;
    }
}
