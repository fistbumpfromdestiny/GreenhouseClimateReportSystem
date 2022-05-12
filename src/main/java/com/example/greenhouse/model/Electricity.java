package com.example.greenhouse.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "electricity_price")
public class Electricity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "price")
    private double rh;

    @Column(name="date", insertable = false, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDate date;
}
