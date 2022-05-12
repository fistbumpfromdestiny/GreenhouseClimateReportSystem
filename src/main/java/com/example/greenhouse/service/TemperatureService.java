package com.example.greenhouse.service;

import com.example.greenhouse.model.Temperature;
import org.springframework.stereotype.Service;

@Service
public interface TemperatureService {
    Temperature findTopByGreenhouseID(long id);
}
