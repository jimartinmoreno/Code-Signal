package mychallenge;

import java.util.Arrays;
import java.util.Optional;
import java.util.Stack;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Calc {
    public double evaluate(String expr) {

        Optional<Double> doubleOptional = Optional.ofNullable(expr)
                .filter(Predicate.not(String::isEmpty))
                .map(Calc::getCalculation);
        System.out.println(doubleOptional);
        return doubleOptional.orElse(0.0);
    }

    private static Double getCalculation(String expr) {
        Stack<Double> values = new Stack<Double>();
        int lastSpace = 0;
        double secondValue = 0;

        Stream exprStream = Arrays.stream(expr.split(" "));
        exprStream.forEach(System.out::println);

        String item;
        for (int i = 0; i < expr.length(); ++i) {
            if (expr.charAt(i) == ' ') {
                item = expr.substring(lastSpace, i);
                item = item.replaceAll("\\s+", "");
                if (item.equals("+")) {
                    values.push(values.pop() + values.pop());
                } else if (item.equals("-")) {
                    secondValue = values.pop();
                    values.push(values.pop() - secondValue);
                } else if (item.equals("*")) {
                    values.push(values.pop() * values.pop());
                } else if (item.equals("/")) {
                    secondValue = values.pop();
                    values.push(values.pop() / secondValue);
                } else if (item.equals("sqrt")) {
                    values.push(Math.sqrt(values.pop()));
                } else {
                    values.push(Double.parseDouble(item));
                }
                lastSpace = i;
            }
        }
        return values.pop();
    }

    public static void main(String[] args) {
        String expression = "5 4 + sqrt ";
        new Calc().evaluate(expression);
    }
}
