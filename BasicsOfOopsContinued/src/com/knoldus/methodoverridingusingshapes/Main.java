package com.knoldus.methodoverridingusingshapes;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // This process gives the result of circle operations.
        Circles circle = new Circles();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        double radius = scan.nextDouble();
        circle.area(radius);

        // This process gives the result of  rectangle operations.
        System.out.println("Enter the length of rectangle: ");
        double length = scan.nextDouble();
        System.out.println("Enter the breadth of rectangle: ");
        double breadth = scan.nextDouble();
        Rectangles rectangles = new Rectangles();
        rectangles.area(length, breadth);





    }
}
