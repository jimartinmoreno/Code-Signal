package codesignal.arcade.intro;

public class FindEmailDomain {
    static String solution(String address) {
        return address.split("@")[address.split("@").length - 1];
    }
}
