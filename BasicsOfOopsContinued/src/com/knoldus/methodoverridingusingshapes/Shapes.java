package com.knoldus.methodoverridingusingshapes;

public class Shapes {
            public void area() {
            System.out.println("Yes! Animals speak too.");
        }
    }
    class Circles extends Shapes {
         static final double pi = 3.14;
        public void area(double radius) {
            double areaOfCircle = pi * radius * radius;
            System.out.println("Area of circle is: "+areaOfCircle);
        }
    }
    class Rectangles extends Shapes {
        public void area(double length, double breadth) {
            double areaOfRectangle = length * breadth;
            System.out.println("Area of rectangle is: "+areaOfRectangle);
        }
}
