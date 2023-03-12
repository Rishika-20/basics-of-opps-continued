package com.knoldus.methodoverloading;

public class MethodOverloadingWithDifferentNumberOfParameters {

    public int add (int firstNumber,int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int add (int firstNumber,int secondNumber,int thirdNumber) {
        return firstNumber + secondNumber + thirdNumber;
    }
}
