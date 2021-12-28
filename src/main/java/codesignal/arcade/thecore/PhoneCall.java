package codesignal.arcade.thecore;

public class PhoneCall {
    static int solution(int min1, int min2_10, int min11, int s) {
        int m;
        for (m = 1; s >= 0; m++) {
            //System.out.println("saldo = " + s);
            if (m == 1) {
                s -= min1;
            } else if (m <= 10) {
                s -= min2_10;
            } else {
                s -= min11;
            }
        }
        System.out.println("saldo final = " + s);
        System.out.println("m = " + m);
        return m - 2;
    }
}
