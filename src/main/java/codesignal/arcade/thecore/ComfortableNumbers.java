package codesignal.arcade.thecore;

/**
 * https://app.codesignal.com/arcade/code-arcade/labyrinth-of-nested-loops/pNfGgNk46YZ4c4RW5/solutions?solutionId=sTGTjp7Y5uidYfvCc
 */
public class ComfortableNumbers {

    static int solution(int l, int r) {
        int total = 0;
        for (int i = l; i <= r; i++) {
            for (int j = i + 1; j <= r; j++) {
                int sumA = String.valueOf(i).chars().map(Character::getNumericValue).sum();
                int sumB = String.valueOf(j).chars().map(Character::getNumericValue).sum();
                if (j >= (i - sumA) && j <= (i + sumA) && i >= (j - sumB) && i <= (j + sumB)) {
                    total++;
                }
            }
        }
        return total;
    }
}
