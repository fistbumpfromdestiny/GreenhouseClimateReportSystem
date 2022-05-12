package com.example.greenhouse.service;

import com.example.greenhouse.model.Temperature;

public interface TemperatureService {
    Temperature findTopByGreenhouseID(long id);
}
