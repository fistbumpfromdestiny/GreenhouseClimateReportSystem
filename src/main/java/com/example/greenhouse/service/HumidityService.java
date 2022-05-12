package com.example.greenhouse.service;

import com.example.greenhouse.model.Humidity;

public interface HumidityService {

    Humidity findByGreenhouseID(long id);
}
