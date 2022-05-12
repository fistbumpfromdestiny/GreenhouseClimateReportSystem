package com.example.greenhouse.service;

import com.example.greenhouse.model.Temperature;
import com.example.greenhouse.repository.TemperatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemperatureServiceImpl implements TemperatureService {

    private final TemperatureRepository temperatureRepository;

    @Autowired
    public TemperatureServiceImpl(TemperatureRepository temperatureRepository) {
        this.temperatureRepository = temperatureRepository;
    }

    @Override
    public Temperature findTopByGreenhouseID(long id) {
        return temperatureRepository.findTop1ByGreenhouse_IdOrderByDateDesc(id);
    }
}
