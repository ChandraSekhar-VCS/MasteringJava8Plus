package com.chandrasekhar.java8.lambda.Intermediate.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for(int i=1;i<100;i++){
            numbers.add(i);
        }

        Predicate<Integer> evenPredicate = (i) -> i%2==0;
        Predicate<Integer> threshholdPredicate = (i) -> (i>50);
        System.out.println("The even numbers in the list are: ");
        customListPrinter(numbers,evenPredicate);
        System.out.println();
        System.out.println("The threshold (>50) numbers in the list are: ");
        customListPrinter(numbers,threshholdPredicate);
    }

    public static void customListPrinter(List<Integer> numberList, Predicate<Integer> predicate){
        for(Integer number : numberList){
            if(predicate.test(number)){
                System.out.print(number + " ");
            }
        }
    }
}
