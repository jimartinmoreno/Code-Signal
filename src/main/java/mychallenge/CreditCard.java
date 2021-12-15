package mychallenge;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCard {

    public static final String HYBRID = "Hybrid";
    public static final String NUMERIC = "Numeric";
    public static final String LETTERS = "Letters";
    public static final String SKIPPY = "Skippy";


    public static String maskify(String creditCardNumber) {
        Optional<String> maskifyCreditCardNumberOptional = Optional.ofNullable(creditCardNumber)
                .filter(Predicate.not(String::isEmpty)).map(CreditCard::maskifyCC);
        return maskifyCreditCardNumberOptional.orElse("");
    }

    private static String maskifyCC(String creditCardNumber) {
        if (creditCardNumber.length() > 5 && !SKIPPY.equals(creditCardNumber)) {
            String firstCharacters = creditCardNumber.substring(0, 1);
            String lastCharacters = creditCardNumber.substring(creditCardNumber.length() - 4);
            StringBuilder sb = new StringBuilder(firstCharacters);

            final String subStringToMaskyfy = creditCardNumber.substring(1, creditCardNumber.length() - 4);
            switch (getType(creditCardNumber)) {
                case HYBRID:
                    subStringToMaskyfy.chars().mapToObj(c -> (char) c).forEach(character -> {
                        if (Character.isLetter(character) || Character.getType(character) > Character.OTHER_NUMBER) {
                            sb.append(character);
                        } else {
                            sb.append("#");
                        }
                    });
                    break;
                case NUMERIC:
                    subStringToMaskyfy.chars().mapToObj(c -> (char) c).forEach(character -> {
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
        }
        return LETTERS;
    }

    public static void main(String[] args) {
        System.out.println(CreditCard.maskify("A1!2/(3)[4]^%56789"));
        System.out.println(CreditCard.maskify("1234-2345-3456-4567"));
        System.out.println(CreditCard.maskify("12345"));
    }
}
