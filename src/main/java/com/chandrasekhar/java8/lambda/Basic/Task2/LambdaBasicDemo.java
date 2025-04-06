package com.chandrasekhar.java8.lambda.Basic.Task2;

import java.util.Scanner;

public class LambdaBasicDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        NameGreeter nameGreeter = (a) -> {
            System.out.println("Hi " + a);
        };
        nameGreeter.greet(name);

        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();

        Adder adder = (a,b) -> a+b;
        System.out.println("The sum of the 2 numbers is : " + adder.add(num1, num2));

    }
}
