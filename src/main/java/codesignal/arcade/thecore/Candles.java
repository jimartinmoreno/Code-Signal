package codesignal.arcade.thecore;

/**
 * https://app.codesignal.com/arcade/code-arcade/loop-tunnel/LAKReA3CR9EwkZGSz
 */
public class Candles {
    static int solution(int candlesNumber, int makeNew) {
        int leftovers = candlesNumber;
        int solution = candlesNumber;
        while (leftovers / makeNew > 0) {
            solution += leftovers / makeNew;
            leftovers = (leftovers / makeNew) + (leftovers % makeNew);
        }
        return solution;
    }

    static int solution2(int solutionNumber, int makeNew) {
        return solutionNumber + (solutionNumber - 1) / (makeNew - 1);
    }
}
