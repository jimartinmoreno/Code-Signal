package codesignal.arcade.intro;

/**
 * https://app.codesignal.com/arcade/intro/level-9/xHvruDnQCx7mYom3T
 */
public class GrowingPlant {
    static int solution(int upSpeed, int downSpeed, int desiredHeight) {
        int currentHeight = 0, numberDays = 0;
        while (desiredHeight > currentHeight) {
            numberDays++;
            currentHeight += upSpeed;
            if (currentHeight >= desiredHeight)
                break;
            currentHeight -= downSpeed;
        }
        System.out.println("numberDays = " + numberDays);
        System.out.println("currentHeight = " + currentHeight);
        return numberDays;
    }

    static int solution2(int upSpeed, int downSpeed, int desiredHeight) {
        // The height after x days (up - down) * (x - 1) + up
        // We want dh <= (u - d) * (x - 1) + u
        // (dh - u) / (u - d) + 1 <= x
        return Math.max(0, (int) Math.ceil((double) (desiredHeight - upSpeed) / (upSpeed - downSpeed))) + 1;
    }
}
