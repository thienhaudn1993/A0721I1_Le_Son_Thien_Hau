package com.codegym.controller.model;

public class Product {
    private int id;
    private String name;
    private double price;
    private String brandName;

    public Product() {
    }

    public Product(int id, String name, double price, String brandName) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brandName = brandName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
