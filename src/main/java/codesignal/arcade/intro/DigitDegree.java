package codesignal.arcade.intro;

import java.util.Arrays;

public class DigitDegree {
    static int solution(int n) {
        int count = 0;
        if(n < 10)
            return 0;
        else{
            count++;
            int sum = Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::valueOf).sum();
            if(sum >= 10)
                count += solution(sum);
        }
        System.out.println("count = " + count);
        return count;
    }
}
