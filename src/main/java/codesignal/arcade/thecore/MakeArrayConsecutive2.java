package codesignal.arcade.thecore;

import java.util.Arrays;

public class MakeArrayConsecutive2 {
    static int solution(int[] statues) {
        Arrays.sort(statues);
        System.out.println((statues[statues.length - 1] - statues[0] + 1) + " - " + statues.length);
        return statues[statues.length - 1] + 1 - statues[0] - statues.length;
    }
}
