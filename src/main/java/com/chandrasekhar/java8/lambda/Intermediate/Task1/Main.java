package com.chandrasekhar.java8.lambda.Intermediate.Task1;

public class Main {
    public static void main(String[] args) {
        Operator addition =  (a, b) -> a + b;
        Operator subtraction =  (a, b) -> a - b;
        Operator multiplication =  (a, b) -> a * b;

        LambdaOperator lambda = new LambdaOperator();
        lambda.performOperation(1, 2, addition);
        lambda.performOperation(1, 2, subtraction);
        lambda.performOperation(1, 2, multiplication);
    }

}
