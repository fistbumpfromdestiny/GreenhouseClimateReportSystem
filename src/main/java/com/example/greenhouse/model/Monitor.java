package com.example.greenhouse.model;

public class Monitor {

    private String name;
    private double rh;
    private double temp;

    public Monitor() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRh() {
        return rh;
    }

    public void setRh(double rh) {
        this.rh = rh;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
}
