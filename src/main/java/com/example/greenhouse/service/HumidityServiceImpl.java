package com.example.greenhouse.service;

import com.example.greenhouse.model.AverageMeasurement;
import com.example.greenhouse.model.Humidity;
import com.example.greenhouse.repository.HumidityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HumidityServiceImpl implements HumidityService {

    private final HumidityRepository humidityRepository;

    @Autowired
    public HumidityServiceImpl(HumidityRepository humidityRepository) {
        this.humidityRepository = humidityRepository;
    }

    @Override
    public Humidity findTop1ByGreenhouseID(long id) {
        return humidityRepository.findTop1ByGreenhouse_IdOrderByDateDesc(id);
    }

    @Override
    public double findAveragePerGH(long id) {
        return humidityRepository.averageRHbyGreenhouseID(id);
    }

    @Override
    public List<AverageMeasurement> findDailyAveragePerGH(long id) {
        return humidityRepository.avgHumidityPerDays(id);
    }


}
