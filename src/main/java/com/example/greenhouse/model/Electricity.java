package com.example.greenhouse.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "electricity_price")
public class Electricity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "price")
    private double price;

    @Column(name="date", insertable = false, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public Electricity() {}

    public Electricity(long id, double price, Date date) {
        this.id = id;
        this.price = price;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
