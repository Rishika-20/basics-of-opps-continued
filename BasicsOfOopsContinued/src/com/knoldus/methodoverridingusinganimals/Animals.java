package com.knoldus.methodoverridingusinganimals;

public class Animals {
    public void speak() {
        System.out.println("Yes! Animals speak too.");
    }
}
class Dogs extends Animals {
    public void speak() {
        System.out.println("Dog barks...");
    }
}
class Cats extends Animals {
    public void speak() {
        System.out.println("Cat says Meow....");
    }
}
