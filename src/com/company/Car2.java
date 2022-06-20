package com.company;

public class Car2 {
    private int year;
    private String color;
    private int price;
    private String model;

    public Car2(int year, String color, int price, String model) {
        this.year = year;
        this.color = color;
        this.price = price;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car2{" +
                "year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", model='" + model + '\'' +
                '}';
    }
}
