package codesignal.arcade.thecore;

import java.math.BigInteger;

public class AdaNumber {
    static boolean solution(String line) {
        line = line.replaceAll("_", "");
        if (line.matches("^\\d+$")) {
            return true;
        }
        if (line.matches("^\\d+#[0-9a-fA-F]+#")) {
            String[] parts = line.split("#");
            try {
                int base = Integer.parseInt(parts[0]);
                if (base < 2 || base > 16) {
                    return false;
                }
                new BigInteger(parts[1], base);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return false;
    }
}
