package codesignal.arcade.thecore;

/**
 * https://app.codesignal.com/arcade/code-arcade/loop-tunnel/8rqs3BLpdKePhouQM
 */
public class Lineup {
    static int solution(String commands) {
        String[] commandsArr = commands.split("");
        int total = 0;
        for (int i = 0; i < commands.length(); i++) {
            String command = commandsArr[i];
            if ("A".equals(command) && total % 2 == 0) {
                total += 2;
            } else if ("L".equals(command) || "R".equals(command)) {
                total += 1;
            }
        }
        return commands.length() == 0 ? 0 : total / 2;
    }

    static int solution2(String commands) {
        int t = 0;
        boolean s = true;
        for (char c : commands.toCharArray()) {
            if (c == 'L' || c == 'R')
                s = !s;
            if (s)
                t++;
        }
        return t;
    }
}
