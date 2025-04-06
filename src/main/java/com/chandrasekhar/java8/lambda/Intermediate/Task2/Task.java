package com.chandrasekhar.java8.lambda.Intermediate.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Task {
    public static void main(String[] args) {
        List<String> names  = new ArrayList<>();
        names.add("Chandra");
        names.add("Daniel");
        names.add("John");
        names.add("Michael");
        names.add("Jonathan");
        names.add("Julie");
        names.add("Alice");
        names.add("Robert");
        names.add("Richard");
        names.add("Richardson");
        names.add("sekhar");

        Predicate<String> predicate = (s) -> s.startsWith("A");
        Function<String, String> function = (s) -> s.toUpperCase();
        Consumer consumer = System.out::println;

        for(String name : names){
            if(predicate.test(name)){
                consumer.accept(function.apply(name));
            }
        }
    }
}
