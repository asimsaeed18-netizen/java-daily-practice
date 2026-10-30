/*
package com.example.week_1.day_4;

import java.util.List;

public class Exercise_2 {
    public static void main(String[] args) {

        List<Product> products = List.of(
                new Product("Laptop", 5),
                new Product("CPU", 0),
                new Product("Mouse", 10),
                new Product("RAM", 0),
                new Product("Monitor", 3),
                new Product("Hard disk", 7)
        );

        List<Product> inStockProducts = products.stream()
                .filter(product -> product.getStock() > 0)
                .toList();

        System.out.println("Products in stock:");

        inStockProducts.forEach(product ->
                System.out.println(product.getName())
        );
    }
}

 */