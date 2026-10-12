package com.example.week_1.day_2;

public class SalariedEmployee implements Payable{
        private double salary;

    public SalariedEmployee(double salary) {
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return salary;
    }
}
