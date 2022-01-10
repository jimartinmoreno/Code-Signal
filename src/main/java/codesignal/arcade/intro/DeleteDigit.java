package codesignal.arcade.intro;

import java.util.stream.IntStream;

public class DeleteDigit {
    static int solution(int n) {
        int max = 0;
        String input = String.valueOf(n);
        for (int i = 0; i < input.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < input.length(); j++) {
                if (j != i)
                    sb.append(input.charAt(j));
            }
            max = Math.max(max, Integer.parseInt(sb.toString()));
        }
        System.out.println("max = " + max);
        return max;
    }

    static int solution3(int n) {

        int max = 0;
        String num = String.valueOf(n);
        StringBuilder sb;

        for (int i = 0; i < num.length(); i++) {
            sb = new StringBuilder(num);
            max = Math.max(max, Integer.parseInt(sb.deleteCharAt(i).toString()));
        }

        return max;
    }

    static int solution2(int n) {
        String input = String.valueOf(n);

        return IntStream.range(0, input.length())
                .map(i ->Integer.parseInt(String.valueOf(new StringBuilder(input).deleteCharAt(i))))
                .peek(System.out::println)
                .max()
                .orElse(0);
    }

}
