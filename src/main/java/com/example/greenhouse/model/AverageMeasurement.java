package com.example.greenhouse.model;

import java.util.Date;

public class AverageMeasurement {

    double measurement;
    Date date;

    public AverageMeasurement(double temp, Date date) {
        this.measurement = temp;
        this.date = date;
    }

    public AverageMeasurement() {

    }

    public double getMeasurement() {
        return measurement;
    }

    public void setMeasurement(double measurement) {
        this.measurement = measurement;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
