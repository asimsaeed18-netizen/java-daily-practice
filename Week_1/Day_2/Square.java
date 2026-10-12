
package com.example.week_1.day_2;

public class Square extends Shape {
    private double side;
    public Square(double side) {
        this.side = side;
    }
    @Override
    public double area() {
        return side * side;
    }
    public static void main(String[] args){
        Square square = new Square(4);

        System.out.println("Square area: " + square.area());
    }
}