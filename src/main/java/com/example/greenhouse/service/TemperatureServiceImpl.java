package com.example.greenhouse.service;

import com.example.greenhouse.model.Temperature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemperatureServiceImpl {

    private final TemperatureService temperatureService;

    @Autowired
    public TemperatureServiceImpl(TemperatureService temperatureService) {
        this.temperatureService = temperatureService;
    }


    Temperature findByGreenhouseID(long id) {
        return temperatureService.findTopByGreenhouseID(id);
    }
}
