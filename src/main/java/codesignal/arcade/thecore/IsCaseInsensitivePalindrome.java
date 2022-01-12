package codesignal.arcade.thecore;

import java.util.Locale;

public class IsCaseInsensitivePalindrome {
    static boolean solution(String inputString) {
        return inputString.equalsIgnoreCase(new StringBuilder(inputString).reverse().toString());
    }
}
