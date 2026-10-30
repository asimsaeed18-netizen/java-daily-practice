package com.example.week_1.day_4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise_5 {
    //this exercise divides the products into categories
    //concepts used: stream(), collect(), Collectors.groupingBy(), Collectors.counting(), Map

    public static void main(String[] args) {

        List<Product> products = List.of(
                new Product("Laptop", "Electronics", 5, 1000.0),
                new Product("CPU", "Electronics", 0, 500.0),
                new Product("Mouse", "Accessories", 10, 20.0),
                new Product("RAM", "Electronics", 0, 50.0),
                new Product("Monitor", "Electronics", 3, 200.0),
                new Product("Hard disk", "Storage", 7, 80.0)
        );

        Map<String, Long> categoryCount = products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.counting()
                ));

        categoryCount.forEach((category, count) ->
                System.out.println(category + ": " + count));

    }
}

