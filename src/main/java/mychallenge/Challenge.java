package mychallenge;

import java.util.Optional;
import java.util.function.Predicate;

class Challenge {
    // Complete this function to return either
    // "Hello, [name]!" or "Hello there!"
    // based on the input

    public static String sayHello(String name) {
        // You can print to STDOUT for debugging if you need to:
        StringBuilder sb = new StringBuilder("Hello");

        Optional<String> greeting = Optional.ofNullable(name)
                .filter(Predicate.not(String::isEmpty))
                .map(s -> String.format("Hello, %s!", s));

        // but you need to return the correct value in order to pass the challenge
        return greeting.orElse("Hello there!"); // TODO: return the correct value
    }

//    public static void main(String[] args) {
//        System.out.println("sayHello = " + Challenge.sayHello("Qualified"));
//        System.out.println("sayHello = " + Challenge.sayHello(null));
//    }
}
