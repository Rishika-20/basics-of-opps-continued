package com.knoldus.methodoverridingusinganimals;
public class Main
 {
    public static void main(String[] args)
    {

        Animals animals = new Animals();
        animals.speak();
        Animals dogs = new Dogs();
        dogs.speak();
        Animals cats = new Cats();
        cats.speak();
    }
}
