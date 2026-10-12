
package com.example.week_1.day_2;

public class PriorityTest {

    public static void main(String[] args) {

        Priority p1 = Priority.LOW;
        Priority p2 = Priority.MEDIUM;
        Priority p3 = Priority.HIGH;

        System.out.println("Priority: " + p1);
        System.out.println("Label: " + p1.getLabel());
        System.out.println("Weight: " + p1.getWeight());
        System.out.println();

        System.out.println("Priority: " + p2);
        System.out.println("Label: " + p2.getLabel());
        System.out.println("Weight: " + p2.getWeight());
        System.out.println();

        System.out.println("Priority: " + p3);
        System.out.println("Label: " + p3.getLabel());
        System.out.println("Weight: " + p3.getWeight());
    }
}