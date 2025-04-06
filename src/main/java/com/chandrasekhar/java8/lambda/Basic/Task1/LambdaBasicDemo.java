package com.chandrasekhar.java8.lambda.Basic.Task1;

public class LambdaBasicDemo {
    public static void main(String[] args) {
        SimplePrinter simplePrinter = ()->{
            System.out.println("Lambda executed");
        };
        simplePrinter.printMessage();
    }
}
