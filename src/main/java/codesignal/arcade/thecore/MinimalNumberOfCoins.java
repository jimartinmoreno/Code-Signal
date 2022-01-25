package codesignal.arcade.thecore;

import java.util.Arrays;

/**
 * https://app.codesignal.com/arcade/code-arcade/well-of-integration/sGwCfM5FzX7LhLcdk
 */
public class MinimalNumberOfCoins {

    static int solution(int[] coins, int price) {
        System.out.println("coins = " + Arrays.toString(coins));
        int numberCoins = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            numberCoins += price / coins[i];
            if (price % coins[i] == 0) {
                break;
            } else {
                price = price % coins[i];
            }
        }
        System.out.println("numberCoins = " + numberCoins);
        return numberCoins;
    }

    static int solution2(int[] coins, int price) {
        int t = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            t += price / coins[i];
            price %= coins[i];
        }
        return t;
    }
}
