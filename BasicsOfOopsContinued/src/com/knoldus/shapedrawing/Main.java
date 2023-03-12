package com.knoldus.shapedrawing;
public class Main {
    public static void main(String[] args) {
        Shape shapeCircle = new Circle();
        Shape shapeRectangle = new Rectangle();
        Shape shapeTriangle = new Triangle();

        shapeCircle.draw();
        shapeRectangle.draw();
        shapeTriangle.draw();
        System.out.println("Hence a draw() is used many times for circle, rectangle and triangle,which shows polymorphism.");
    }
}
