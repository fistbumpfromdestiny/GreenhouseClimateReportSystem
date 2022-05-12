package com.example.greenhouse.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "humidity_readings")
public class Humidity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "humidity")
    private double rh;

    @Column(name="date", insertable = false, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "greenhouse_id", referencedColumnName = "id")
    private Greenhouse greenhouse;

    public Humidity() {}

    public Humidity(long id, double rh, Date date, Greenhouse greenhouse) {
        this.id = id;
        this.rh = rh;
        this.date = date;
        this.greenhouse = greenhouse;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getRh() {
        return rh;
    }

    public void setRh(double rh) {
        this.rh = rh;
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
