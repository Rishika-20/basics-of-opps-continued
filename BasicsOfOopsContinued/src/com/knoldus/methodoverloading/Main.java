package com.knoldus.methodoverloading;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MethodOverloadingWithDifferentNumberOfParameters differentNumberOfParameters = new MethodOverloadingWithDifferentNumberOfParameters();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the three numbers to calculate sum: ");
        int firstNumber = scan.nextInt();
        int SecondNumber = scan.nextInt();
        int thirdNumber = scan.nextInt();
        int firstResult = differentNumberOfParameters.add(firstNumber,SecondNumber);
        int secondResult = differentNumberOfParameters.add(firstNumber,SecondNumber,thirdNumber);
        System.out.println("Addition of number using two numbers: "+firstResult);
        System.out.println("Addition of number using three numbers: "+secondResult);

    }
}
