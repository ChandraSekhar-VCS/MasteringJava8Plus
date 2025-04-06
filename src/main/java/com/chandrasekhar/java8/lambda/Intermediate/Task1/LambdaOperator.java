package com.chandrasekhar.java8.lambda.Intermediate.Task1;

public class LambdaOperator {
    public void performOperation(int a, int b, Operator op) {
        System.out.println(op.operate(a, b));
    }
}
