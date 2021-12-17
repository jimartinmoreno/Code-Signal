package codesignal.arcade;

import java.util.Arrays;

public class IsLucky {
    static boolean solution(int n) {
        String s = String.valueOf(n);
        if (s.length() > 1 && s.length() % 2 == 0) {
            int suma1 = Arrays.asList(s.substring(0, s.length() / 2).split("")).stream()
                    .map(Integer::valueOf)
                    .reduce((i, i2) -> i + i2).get();
            int suma2 = Arrays.asList(s.substring(s.length() / 2).split("")).stream()
                    .map(Integer::valueOf)
                    .reduce((i, i2) -> i + i2).get();

            if (suma1 == suma2)
                return true;
            else
                return false;
        }
        return false;
    }

    static boolean solution2(int n) {
        String s = String.valueOf(n);
        var suma1 = Arrays.asList(s.substring(0, s.length() / 2).split("")).stream().mapToInt(Integer::valueOf).sum();
        var suma2 = Arrays.asList(s.substring(s.length() / 2).split("")).stream().mapToInt(Integer::valueOf).sum();
        if (suma1 == suma2)
            return true;
        else
            return false;
    }

    static boolean solution3(int n) {
        String s = Integer.toString(n);
        return s.substring(0, s.length() / 2).chars().sum() == s.substring(s.length() / 2).chars().sum();
    }


    public static void main(String[] args) {
        System.out.println("true = " + solution(1230));

        System.out.println("false = " + solution(239017));
    }
}
