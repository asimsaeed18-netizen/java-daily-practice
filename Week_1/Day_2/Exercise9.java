package com.example.week_1.day_2;

public class Exercise9 {
    public static void main(String[] args) {

        // Testing method overloading
        Calculator calculator = new Calculator();

        System.out.println("Overloading:");
        System.out.println(calculator.add(10, 20));
        System.out.println(calculator.add(10, 20, 30));

        // Testing method overriding
        Animal animal = new Animal();
        Animal dog = new Dog();

        System.out.println("\nOverriding:");
        animal.sound();
        dog.sound();
    }
}
