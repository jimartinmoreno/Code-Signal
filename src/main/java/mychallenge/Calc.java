package mychallenge;

import java.util.Arrays;
import java.util.Optional;
import java.util.Stack;
import java.util.function.Predicate;

public class Calc {

    public double evaluate(String expr) {
        Optional<Double> finalResultOptional = Optional.ofNullable(expr)
                .filter(Predicate.not(String::isEmpty)).map(Calc::compute);

        return finalResultOptional.orElse(0.0);
    }

    private static double compute(String expr) {
        Stack<Double> stack = new Stack<>();

        System.out.println(expr);
        System.out.println("Input\tOperation\tStack after");

        String[] expStrings = expr.split("\\s+"); // matches one or many whitespaces.
        Arrays.stream(expStrings).forEach(s -> {
            System.out.print(s + "\t");
            switch (s) {
                case "+":
                    System.out.print("Operation (+) \t\t");
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    System.out.print("Operation (-) \t\t");
                    stack.push(-stack.pop() + stack.pop());
                    break;
                case "*":
                    System.out.print("Operation (*) \t\t");
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    System.out.print("Operation (/) \t\t");
                    double divisor = stack.pop();
                    stack.push(stack.pop() / divisor);
                    break;
                case "^":
                    System.out.print("Operation (^) \t\t");
                    double exponent = stack.pop();
                    stack.push(Math.pow(stack.pop(), exponent));
                    break;
                default:
                    System.out.print("Push \t\t");
                    stack.push(Double.parseDouble(s));
                    break;
            }
            System.out.println(stack);
        });

        double finalAnswer = stack.pop();
        System.out.println("Final Answer: " + finalAnswer);
        return finalAnswer;
    }

    /**
     * Runs the calculation for the RPN expression in args[0].
     */
    public static void main(String[] args) {
        // "1 2 3.5"	3.5
        // "10000 123 +"	10123
        // "5 1 2 + 4 * + 3 -"	14
        Calc calc = new Calc();
        try {
            calc.evaluate("3 5 +");
            calc.evaluate("1 2 3.5");
            calc.evaluate("10000 123 +");
            calc.evaluate("5 1 2 + 4 * + 3 -");
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
    }
}
