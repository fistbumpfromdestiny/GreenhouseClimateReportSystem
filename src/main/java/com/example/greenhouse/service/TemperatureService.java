package com.example.greenhouse.service;

import com.example.greenhouse.model.Temperature;

import java.util.List;

public interface TemperatureService {
    Temperature findTop1ByGreenhouseID(long id);
    double findAveragePerGH(long id);
    List<?> findDailyAveragePerGH(long id);
}
