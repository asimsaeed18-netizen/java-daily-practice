package com.example.week_1.day_4;

public class Product {

    private String name;
    private String category;
    private int stock;
    private double price;

    public Product(String name, String category, int stock, double price) {
        this.name = name;
        this.category = category;
        this.stock = stock;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }
}