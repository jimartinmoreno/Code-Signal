package codesignal.challenge;

import java.util.stream.IntStream;

public class IsAdmissibleOverpayment {
    static boolean solution(double[] prices, String[] notes, double x) {
        double sensitivity = IntStream.rangeClosed(0, prices.length - 1)
                .mapToDouble(i -> {
                    double percentage = notes[i].indexOf("%") != -1 ? Double.parseDouble(notes[i].split("%")[0]) : 0;
                    if (notes[i].contains("lower"))
                        percentage *= -1;
                    if (notes[i].indexOf("Same") != -1)
                        return 0;
                    else
                        return prices[i] - (prices[i] * 100) / (100 + percentage);
                }).sum();
        System.out.println("sensitivity = " + sensitivity);
        return x >= sensitivity;
    }

    static boolean solution2(double[] P, String[] N, double x) {
        double D = 0;
        int i = 0;
        for (String n : N) {
            double d = (n.contains("Same")) ? 0 : Double.valueOf(n.split("%")[0]);
            if (n.contains("l"))
                d *= -1;
            D += P[i] * (d / (100 + d));
            i++;
        }
        return x >= D;
    }
}
