package com.chandrasekhar.java8.lambda.Basic.Task3;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaBasicDemo {
    public static void main(String[] args) {
        Predicate<String> predicate = (s) -> {
            char c = s.charAt(0);
            return c == 'J';
        };

        Function<String, Integer> function =  (s) -> s.length();

        Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());

        Supplier<Double> supplier = () -> Math.random();


        System.out.println(predicate.test("Chandra"));
        System.out.println(predicate.test("sekhar"));
        System.out.println(predicate.test("John"));

        function.apply("Chandra");
        function.apply("sekhar");

        consumer.accept("Chandra");
        consumer.accept("sekhar");

        System.out.println(" The first random number is " + supplier.get());
        System.out.println(" The second random number is " + supplier.get());
    }
}
