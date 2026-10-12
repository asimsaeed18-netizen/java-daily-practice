//day2 exercise 1:
package com.example.week_1.day_2;

public class Rectangle {

    private int length = 10;
    private int height = 20;

    public int areaOfRectangle() {
        return length * height;
    }

    public int perimeterOfRectangle() {
        return 2 * (length + height);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Area of rectangle: " + rectangle.areaOfRectangle());
        System.out.println("Perimeter of rectangle: " + rectangle.perimeterOfRectangle());
    }
}