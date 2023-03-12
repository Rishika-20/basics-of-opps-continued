package com.knoldus.methodoverloadingdifferentdatatypes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MethodOverloadingUsingDifferentDatatypes differentDatatypes = new MethodOverloadingUsingDifferentDatatypes();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any number: ");
        int number = scan.nextInt();
        System.out.println("Please enter any name: ");
        String name = scan.next();
        differentDatatypes.print(number);
        differentDatatypes.print(name);
    }
}
