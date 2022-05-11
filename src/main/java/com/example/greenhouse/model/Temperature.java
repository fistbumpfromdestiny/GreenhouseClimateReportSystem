package com.example.greenhouse.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "temperature_readings")
public class Temperature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "temperature")
    private double temp;

    @Column(name="date", insertable = false, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "greenhouse_id", referencedColumnName = "id")
    private Greenhouse greenhouse;

    public Temperature() {}

    public Temperature(long id, double temp, Date date, Greenhouse greenhouse) {
        this.id = id;
        this.temp = temp;
        this.date = date;
        this.greenhouse = greenhouse;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double rh) {
        this.temp = temp;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Greenhouse getGreenhouse() {
        return greenhouse;
    }

    public void setGreenhouse(Greenhouse greenhouse) {
        this.greenhouse = greenhouse;
    }
}
