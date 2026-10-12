package com.example.week_1.day_2;

public class HourlyEmployee implements Payable{
        private double hourlyRate;
        private int hoursWorked;

    public HourlyEmployee(int hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
