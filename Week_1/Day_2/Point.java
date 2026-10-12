package com.example.week_1.day_2;

public record Point(int x, int y) {
    public Point {
        if( x <= 0 || y <= 0 ){
            throw new IllegalArgumentException("All coordinates must be positive");
        }
    }

    public static void main(String[] args){
        Point p1 = new Point(2,5);
        Point p2 = new Point(3, 5);
        System.out.println(p1);
        System.out.println(p2);
    }
}
