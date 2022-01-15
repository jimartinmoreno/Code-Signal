package codesignal.arcade.thecore;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://app.codesignal.com/arcade/code-arcade/book-market/TXFLopNcCNbJLQivP
 */
public class FindEmailDomain {
    static String solution(String address) {
        System.out.println("address = " + address);
        System.out.println("address.lastIndexOf(\"@\") = " + address.lastIndexOf("@"));

        return address.substring(address.lastIndexOf("@") + 1);
    }

    static String solution2(String address) {

        Pattern pattern = Pattern.compile("@[a-z|\\[]+(.)+");
        Matcher matcher = pattern.matcher(address);
        if (matcher.find())
            return matcher.group(0).substring(1);
        return "";
    }
}
