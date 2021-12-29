package codesignal.arcade.intro;

public class DepositProfit {
    static int solution(int deposit, int rate, int threshold) {
        //double sum = deposit;
        int i;
        for (i = 0; threshold > deposit; i++) {
            deposit += deposit * rate / 100;
        }
        System.out.println("deposit = " + deposit);
        System.out.println("i = " + i);
        return i;
    }
}
