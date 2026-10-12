package com.example.week_1.day_2;

public class Exercise10 {

    public static void printVehicle(Vehicle vehicle){
        switch (vehicle){
            case Car c -> System.out.println("This is a car");
            case Bike b -> System.out.println("This is a bike");
            default -> throw new IllegalStateException("Unexpected value: " + vehicle);
        }
    }

    public static void main(String[] args){
        Vehicle v1 = new Bike();
        Vehicle v2 = new Car();

        printVehicle(v1);
        printVehicle(v2);

    }
}
