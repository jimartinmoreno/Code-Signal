package mychallenge;

import java.util.Optional;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCard {

    //    private  Enum CreditCardType{
    //        HYBRID, NUMERIC, LETTERS, SKIPPY, INVALID
    //    };

    private CreditCard() {
    }

    public static final String HYBRID = "Hybrid";
    public static final String NUMERIC = "Numeric";
    public static final String LETTERS = "Letters";
    public static final String SKIPPY = "Skippy";
    public static final String INVALID = "invalid";


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

            String result = null;
            switch (getType(creditCardNumber)) {
                case HYBRID:
                    final IntFunction<String> stringIntFunctionHybrid = character ->
                            Character.isLetter((char) character) || Character.getType((char) character) > Character.OTHER_NUMBER ? String.valueOf((char) character) : "#";
                    result = maskify(subStringToMaskify, stringIntFunctionHybrid);
                    sb.append(result);
                    break;
                case NUMERIC:
                    final IntFunction<String> stringIntFunctionNumeric = character ->
                            (Character.getType((char) character) < Character.OTHER_NUMBER) ? "#" : String.valueOf((char) character);
                    result = maskify(subStringToMaskify, stringIntFunctionNumeric);
//                    result = subStringToMaskify.chars()
//                            .mapToObj(stringIntFunctionNumeric)
//                            .reduce("", (c1, c2) -> c1 + c2);
                    sb.append(result);
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

    private static String maskify(String subStringToMaskify, IntFunction<String> stringIntFunction) {
        return subStringToMaskify.chars()
                .mapToObj(stringIntFunction)
                .reduce("", (c1, c2) -> c1 + c2);
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
