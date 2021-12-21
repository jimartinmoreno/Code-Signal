package codesignal.arcade.thecore;

public class LargestNumber {
    static int solution(int n) {
        return (int) Math.pow(10, n) - 1;
    }

    static int solution2(int n) {
        String f = "";
        for (int i = 0; i < n; i++)
            f += "9";
        return Integer.valueOf(f);
    }
}
