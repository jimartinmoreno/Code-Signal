package klarna;

import java.util.Optional;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCard {
    public static final String SKIPPY = "Skippy";

    private enum CreditCardType {
        HYBRID, NUMERIC, LETTERS, INVALID
    }

    private CreditCard() {
    }

    public static String maskify(String creditCardNumber) {
        Optional<String> maskifyCreditCardNumberOptional = Optional.ofNullable(creditCardNumber)
                .filter(Predicate.not(String::isEmpty))
                .map(CreditCard::maskifyCC);
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
                    final IntFunction<String> hybridFunction = character ->
                            Character.isLetter((char) character) || Character.getType((char) character) > Character.OTHER_NUMBER ?
                                    String.valueOf((char) character) : "#";

                    sb.append(maskify(subStringToMaskify, hybridFunction));
                    break;
                case NUMERIC:
                    final IntFunction<String> numericFunction = character ->
                            (Character.getType((char) character) < Character.OTHER_NUMBER) ? "#" : String.valueOf((char) character);
                    // result = subStringToMaskify.chars().mapToObj(numericFunction).reduce("", (c1, c2) -> c1 + c2);
                    sb.append(maskify(subStringToMaskify, numericFunction));
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

    private static String maskify(String subStringToMaskify, IntFunction<String> function) {
        return subStringToMaskify.chars()
                .mapToObj(function)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
        //.reduce("", (c1, c2) -> c1 + c2);
    }

    private static CreditCardType getType(String creditCardNumber) {
        Pattern lettersPattern = Pattern.compile("\\p{L}");
        Pattern numericPattern = Pattern.compile("[0-9]+");
        Matcher lettersMatcher = lettersPattern.matcher(creditCardNumber);
        Matcher numericMatcher = numericPattern.matcher(creditCardNumber);

        if (numericMatcher.find()) {
            if (lettersMatcher.find()) {
                return CreditCardType.HYBRID;
            }
            return CreditCardType.NUMERIC;
        } else if (lettersMatcher.find()) {
            return CreditCardType.LETTERS;
        } else {
            return CreditCardType.INVALID;
        }
    }
}
