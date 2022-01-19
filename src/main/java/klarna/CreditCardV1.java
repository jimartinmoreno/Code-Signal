package klarna;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardV1 {

    //    private  Enum CreditCardType{
    //        HYBRID, NUMERIC, LETTERS, SKIPPY, INVALID
    //    };

    private CreditCardV1() {
    }

    public static final String HYBRID = "Hybrid";
    public static final String NUMERIC = "Numeric";
    public static final String LETTERS = "Letters";
    public static final String SKIPPY = "Skippy";
    public static final String INVALID = "invalid";


    public static String maskify(String creditCardNumber) {
        Optional<String> maskifyCreditCardNumberOptional = Optional.ofNullable(creditCardNumber)
                .filter(Predicate.not(String::isEmpty))
                .map(CreditCardV1::maskifyCC);
        return maskifyCreditCardNumberOptional.orElse("");
    }

    private static String maskifyCC(String creditCardNumber) {
        if (creditCardNumber.length() > 5 && !SKIPPY.equals(creditCardNumber)) {
            String firstCharacters = creditCardNumber.substring(0, 1);
            String lastCharacters = creditCardNumber.substring(creditCardNumber.length() - 4);
            StringBuilder sb = new StringBuilder(firstCharacters);

            final String subStringToMaskify = creditCardNumber.substring(1, creditCardNumber.length() - 4);

            switch (getType(creditCardNumber)) {
                case HYBRID:
                    maskify(subStringToMaskify, character -> {
                        if (Character.isLetter(character) || Character.getType(character) > Character.OTHER_NUMBER) {
                            sb.append(character);
                        } else {
                            sb.append("#");
                        }
                    });
                    break;
                case NUMERIC:
                    subStringToMaskify.chars()
                            .mapToObj(c -> (char) c)
                            .forEach(character -> {
                                if (Character.getType(character) < Character.OTHER_NUMBER)
                                    sb.append('#');
                                else
                                    sb.append(character);
                            });
                    break;
                case LETTERS:
                    return creditCardNumber;
                default:
                    return "Invalid Format";
            }
            sb.append(lastCharacters);
            return sb.toString();
        }
        return creditCardNumber;
    }

    private static void maskify(String subStringToMaskify, Consumer<Character> consumer) {
        subStringToMaskify.chars()
                .mapToObj(c -> (char) c)
                .forEach(consumer);
    }

    private static String getType(String creditCardNumber) {
        Pattern lettersPattern = Pattern.compile("\\p{L}");
        Pattern numericPattern = Pattern.compile("[0-9]+");
        Matcher lettersMatcher = lettersPattern.matcher(creditCardNumber);
        Matcher numericMatcher = numericPattern.matcher(creditCardNumber);

        if (numericMatcher.find()) {
            if (lettersMatcher.find()) {
                return HYBRID;
            }
            return NUMERIC;
        } else if (lettersMatcher.find()) {
            return LETTERS;
        } else {
            return INVALID;
        }
    }
}
