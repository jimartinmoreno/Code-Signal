package codesignal.arcade.intro;

import java.util.*;

public class BuildPalindrome {
    static String solution(String st) {
        String rs = new StringBuffer(st).reverse().toString();
        for (int i = 0; i < st.length(); i++) {
            if (rs.startsWith(st.substring(i))) {
                System.out.println(rs + " :: " + st.substring(i));
                return st.substring(0, i) + rs;
            }
        }

        return "?";
    }
    static String solution2(String st) {
        System.out.println("st = " + st);
        if(st.equals(new StringBuilder(st).reverse().toString()))
            return st;

        List<String> p = new ArrayList<>();

        Arrays.stream(st.split(""))
                .forEach(char_ -> {
                    if (p.contains(char_)) {
                        p.remove(char_);
                    } else {
                        p.add(char_);
                    }
                });
        p.sort(Comparator.reverseOrder());
        return st.concat(p.subList(1, p.size()).stream().reduce("", (s, s2) -> s + s2));
    }
}
