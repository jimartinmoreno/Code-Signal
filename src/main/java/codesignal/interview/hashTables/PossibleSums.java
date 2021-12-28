package codesignal.interview.hashTables;

import java.util.HashSet;

/**
 * https://app.codesignal.com/interview-practice/task/rMe9ypPJkXgk3MHhZ/solutions?solutionId=wJBvafGg2hqonC98D
 * 1 + 2 + 1 + 2 + 1 + 1
 */
public class PossibleSums {
    static int solution(int[] coins, int[] quantity) {
        HashSet<Integer> sums = new HashSet();
        sums.add(0);

        for (int i = 0; i < coins.length; i++) {
            int coin = coins[i];
            HashSet<Integer> currentSums = new HashSet();
            for (Integer sum : sums) {
                for (int j = 1; j <= quantity[i]; j++) {
                    currentSums.add(sum + coin * j);
                }
            }
            sums.addAll(currentSums);
        }

        return sums.size() - 1; //don't count 0
    }
}
