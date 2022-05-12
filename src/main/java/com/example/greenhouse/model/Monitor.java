package com.example.greenhouse.model;

public class Monitor {

    private long id;
    private String name;
    private double rh;
    private double avg_rh;
    private double temp;
    private double avg_temp;


    public Monitor() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public double getAvg_rh() {
        return avg_rh;
    }

    public void setAvg_rh(double avg_rh) {
        this.avg_rh = avg_rh;
    }

    public double getAvg_temp() {
        return avg_temp;
    }

    public void setAvg_temp(double avg_temp) {
        this.avg_temp = avg_temp;
    }
}
