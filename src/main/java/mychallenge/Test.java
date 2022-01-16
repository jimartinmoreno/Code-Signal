package mychallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {

        IntStream.iterate(20, n -> n - 2)
//                .skip(Integer.parseInt(args[0]))
                .limit(12)
                .filter(value -> value < 10)
                .forEach(System.out::println);


//        String code = "A1234567BCDEFG89HI";
//        String code = "4556364607935616";
//        String code = "4556-3646-0793-5616";
//        String code = "ABCD-EFGH-IJKLM-NOPQ";
//
//        String type = getType(code);
//        if ("Hibrid".equals(type)) {
//            // System.out.println(m.start());
//            System.out.println("result = " + processHibrid(code));
//        }
//        System.out.println("result = " + code);
    }

    private static String getType(String code) {
        // ^(?=.*[A-Z])(?=.*[0-9])[A-Z0-9]+$
        Pattern lettersPattern = Pattern.compile("\\p{L}");
        Pattern numericPattern = Pattern.compile("[0-9]+");
        Matcher lettersMatcher = lettersPattern.matcher(code);
        Matcher numericMatcher = numericPattern.matcher(code);

        if (numericMatcher.find()) {
            if (lettersMatcher.find()) {
                System.out.println("Hibrid");
                return "Hibrid";
            }
            System.out.println("Numeric");
            return "Numeric";
        }
        System.out.println("Letters");
        return "Letters";
    }

    private static String processHibrid(String creditCardNumber) {
        // A1234567BCDEFG89HI ->  A#######BCDEFG89HI

        String firstCharacters = creditCardNumber.substring(0, 1);
        StringBuilder stringBuilder = new StringBuilder(firstCharacters);

        String other = creditCardNumber.substring(1);
        System.out.println("other = " + other);

        var flag = false;
        for (char character : other.toCharArray()) {
            if (Character.isLetter(character) || flag) {
                stringBuilder.append(character);
                flag = true;
            } else if (!flag) {
                stringBuilder.append("#");
            }
        }

        System.out.println("result = " + stringBuilder);
        return stringBuilder.toString();
    }
}
