package br.com.minerva.car;

import java.time.Year;

public class Car {
    private Make make;
    private String model;
    private double price;
    private Year year;

    public Car(Make make, String model, double price, Year year) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.year = year;
    }

    public String getMake() {
        return make.getName();
    }

    public double getPrice() {
        return price;
    }

    public Year getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }
}
