package mychallenge;

import javax.management.InvalidAttributeValueException;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class CreditCard {
    public static String maskify(String creditCardNumber) {
        Optional<String> maskifyCreditCardNumberOptional = Optional.ofNullable(creditCardNumber)
                .filter(Predicate.not(String::isEmpty)).map(CreditCard::maskifyCC);
        return maskifyCreditCardNumberOptional.orElse("");
    }

    private static String maskifyCC(String creditCardNumber) {
        if(creditCardNumber.length() > 5) {
            //System.out.println("creditCard: " + creditCardNumber);
            String firstCharacters = creditCardNumber.substring(0, 1);
            String lastCharacters = creditCardNumber.substring(creditCardNumber.length() - 4);

            StringBuilder stringBuilder = new StringBuilder(firstCharacters);
            IntStream
                    .rangeClosed(1, creditCardNumber.length() - lastCharacters.length() - 1)
                    .forEach(num -> stringBuilder.append('#'));
            stringBuilder.append(lastCharacters);

            //System.out.println(stringBuilder);
            return stringBuilder.toString();
        }else{
            return creditCardNumber;
        }
    }

    public static void main(String[] args) throws InvalidAttributeValueException {
        System.out.println(CreditCard.maskify("5512103073210694"));
        System.out.println(CreditCard.maskify("64607935616"));
        System.out.println(CreditCard.maskify("12345"));
    }
}
