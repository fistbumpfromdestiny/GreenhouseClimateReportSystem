package com.example.greenhouse.service;

import com.example.greenhouse.model.AverageMeasurement;
import com.example.greenhouse.model.Temperature;
import com.example.greenhouse.repository.TemperatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemperatureServiceImpl implements TemperatureService {

    private final TemperatureRepository temperatureRepository;

    @Autowired
    public TemperatureServiceImpl(TemperatureRepository temperatureRepository) {
        this.temperatureRepository = temperatureRepository;
    }

    @Override
    public Temperature findTop1ByGreenhouseID(long id) {
        return temperatureRepository.findTop1ByGreenhouse_IdOrderByDateDesc(id);
    }

    @Override
    public double findAveragePerGH(long id) {
        return temperatureRepository.averageTempByGreenhouseID(id);
    }

    @Override
    public List<AverageMeasurement> findDailyAveragePerGH(long id) {
        return temperatureRepository.avgTempPerDays(id);
    }
}
