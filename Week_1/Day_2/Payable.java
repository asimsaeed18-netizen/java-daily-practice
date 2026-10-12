//day 2 exercise 6
package com.example.week_1.day_2;

public interface Payable {
    double calculatePay();

    public static void main(String[] args){
        SalariedEmployee employee1 = new SalariedEmployee(80000);
        HourlyEmployee employee2 = new HourlyEmployee(40, 500);

        System.out.println("Salaried employee pay: "
                + employee1.calculatePay());

        System.out.println("Hourly employee pay: "
                + employee2.calculatePay());
    }
}
