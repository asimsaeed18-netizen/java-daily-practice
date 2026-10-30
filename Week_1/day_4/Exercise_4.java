/*package com.example.week_1.day_4;

import java.util.List;
import java.util.Optional;
import java.util.Comparator;

public class Exercise_4 {
    //this exercise is used to check the cheapest product
    //concepts used: Optional<Product>, stream(), min(), Comparator.comparingDouble(), ifPresentOrElse()

    public static void main(String[] args) {

        List<Product> products = List.of(
                new Product("Laptop", 5, 1000.0),
                new Product("CPU", 0, 500.0),
                new Product("Mouse", 10, 20.0),
                new Product("RAM", 0, 50.0),
                new Product("Monitor", 3, 200.0),
                new Product("Hard disk", 7, 80.0)
        );

        Optional<Product> cheapestProduct = products.stream()
                .min(Comparator.comparingDouble(Product::getPrice));

        cheapestProduct.ifPresentOrElse(
                product -> System.out.println("Cheapest product: " + product.getName()
                        + ", Price: " + product.getPrice()),
                () -> System.out.println("none")
        );
    }
    }


 */