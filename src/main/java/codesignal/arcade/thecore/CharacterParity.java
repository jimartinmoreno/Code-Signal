package codesignal.arcade.thecore;

import java.util.Optional;

public class CharacterParity {
    static String solution(char symbol) {
        return Optional.ofNullable(symbol)
                .filter(Character::isDigit)
                .map(value -> value % 2 == 0 ? "even" : "odd")
                .orElse("not a digit");
    }
}