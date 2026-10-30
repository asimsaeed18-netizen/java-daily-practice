/*package com.example.week_1.day_4;

import java.util.List;

public class Exercise_3 {

    // This exercise calculates the total inventory value.
    // Total inventory value = price * stock
    // Concepts used: mapToDouble(), sum(), stream()

    public static void main(String[] args) {

        List<Product> products = List.of(
                new Product("Laptop", 5, 1000.0),
                new Product("CPU", 0, 500.0),
                new Product("Mouse", 10, 20.0),
                new Product("RAM", 0, 50.0),
                new Product("Monitor", 3, 200.0),
                new Product("Hard disk", 7, 80.0)
        );

        double totalInventoryValue = products.stream()
                .mapToDouble(product -> product.getPrice() * product.getStock())
                .sum();

        System.out.println("Total inventory value: " + totalInventoryValue);
    }
}

 */