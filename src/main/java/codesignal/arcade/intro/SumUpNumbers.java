package codesignal.arcade.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumUpNumbers {
    static int solution(String inputString) {
        System.out.println("inputString = " + inputString);
        Pattern PATTERN = Pattern.compile("[0-9]+");
        Matcher matcher = PATTERN.matcher(inputString);
        List<Integer> numberList = new ArrayList<>();
        while (matcher.find()) numberList.add(Integer.parseInt(matcher.group()));
        return numberList.stream().mapToInt(Integer::intValue).sum();
    }

    static int solution2(String inputString) {
        return Arrays.stream(inputString.split("\\D+"))
                .filter(s -> !s.isEmpty())
                .mapToInt(Integer::parseInt).sum();
    }

    static int solution3(String inputString) {
        Matcher m = Pattern.compile("\\d+").matcher(inputString);
        int sum = 0;
        while( m.find() ){
            sum += Integer.parseInt(m.group(0));
        }
        return sum;
    }
}
