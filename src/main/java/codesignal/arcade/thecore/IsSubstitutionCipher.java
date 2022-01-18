package codesignal.arcade.thecore;

import java.util.HashMap;
import java.util.Map;

public class IsSubstitutionCipher {
    static boolean solution(String string1, String string2) {
        // once a letter is assigned, must be used for same
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < string1.length(); i++) {
            String key = string1.substring(i, i + 1);
            String val = string2.substring(i, i + 1);
            if (!map.containsKey(key)) {
                // already mapped to a different key
                if (map.containsValue(val)) return false;
                map.put(key, val);
            } else {
                if (!map.get(key).equals(val)) return false;
            }
        }
        return true;
    }

    static boolean solution2(String string1, String string2) {
        Map<Character, Character> substitution = new HashMap<Character, Character>();
        //We go through each character of our string1
        for (int i = 0; i < string1.length(); i++) {
            char c1 = string1.charAt(i);
            char c2 = string2.charAt(i);

            if (substitution.containsKey(c1)) { //We check if it already has been substituted
                //Check it's the same substitution as before
                if (substitution.get(c1) != c2) return false;
                //then we ensure the cipher letter hasnt been used before, cause if it has for a different key its a invalid cipher
            } else if (substitution.containsValue(c2))
                return false; //then we ensure the cipher letter hasnt been used before,
                // cause if it has for a different key its a invalid cipher
            else substitution.put(c1, c2); //if it hasnt been used before we can just put it into our Hashtable
        }
        //if there hasnt been an invalid entry we can return true.
        return true;
    }
}
