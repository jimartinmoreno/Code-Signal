package codesignal.arcade.intro;

import java.util.Arrays;
import java.util.Objects;

public class IsIPv4Address {
    static boolean solution2(String inputString) {
        String[] ipSegments = inputString.split("\\.");
        if (inputString != null && ipSegments.length == 4) {
            long counter = Arrays.stream(ipSegments)
                    .filter(s -> Objects.nonNull(s) && !s.isEmpty())
                    .filter(s -> s.matches("-?\\d+(\\.\\d+)?"))
                    //.filter(s -> !"00".equals(s))
                    .filter(s -> s.length() == 1 || s.length() > 1 && s.indexOf("0") != 0)
                    .mapToLong(Long::valueOf)
                    .filter(value -> 0 <= value && value <= 255)
                    .count();
            return counter == 4 ? true : false;
        } else {
            return false;
        }
    }

    static boolean solution(String inputString) {
        return inputString.matches("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$");
    }

    public static void main(String[] args) {

        System.out.println("true = " + solution("172.16.254.1"));
        System.out.println("false = " + solution("172.316.254.1"));
        System.out.println("false = " + solution(".254.255.0"));
        System.out.println("false = " + solution("1.1.1.1a"));
        System.out.println("false = " + solution("01.233.161.131"));
        System.out.println("false = " + solution("64.233.161.00"));
        System.out.println("false = " + solution("129380129831213981.255.255.255"));
        System.out.println("false = " + solution("7283728"));
        System.out.println("false = " + solution("255.255.255.255abcdekjhf"));
        System.out.println("true = " + solution("0.254.255.0"));


    }
}
