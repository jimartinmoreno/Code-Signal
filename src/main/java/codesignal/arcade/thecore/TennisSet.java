package codesignal.arcade.thecore;

/**
 * https://app.codesignal.com/arcade/code-arcade/at-the-crossroads/7jaup9HprdJno2diw
 */
public class TennisSet {

    static boolean solution(int score1, int score2) {
        int max = Math.max(score1, score2), min = Math.min(score1, score2);
        return max == 6 && min < 5 || max == 7 && (min == 5 || min == 6);
    }

    static boolean solution2(int score1, int score2) {
        return (score1 == 6 && score2 < 5) ||
                (score2 == 6 && score1 < 5) ||
                (score1 == 7 && score2 >= 5 && score2 < 7) ||
                (score2 == 7 && score1 >= 5 && score1 < 7);
    }

}
